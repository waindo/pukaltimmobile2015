package com.matos.mygis.libraries;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;

import com.esri.android.map.MapView;
import com.matos.mygis.R;

/**
 * Created by matOS on 8/22/2015.
 */
public class Magnifier extends View {

    private float x, y;
    private MapView mMapView;
    private Bitmap background;
    private int vertOffset = 20;
    private boolean draw = false;
    private int lensWinW, lensWinH;
    private final Bitmap lens, mask;
    private static final float magnifyRatio = 2.0f;

    private final static int canvasop = Canvas.MATRIX_SAVE_FLAG | Canvas.CLIP_SAVE_FLAG
            | Canvas.HAS_ALPHA_LAYER_SAVE_FLAG | Canvas.FULL_COLOR_LAYER_SAVE_FLAG
            | Canvas.CLIP_TO_LAYER_SAVE_FLAG;

    public Magnifier(Context pContext, MapView pMapView) {
        super(pContext);

        this.mMapView = pMapView;

        // lens
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        lens = BitmapFactory.decodeResource(getResources(), R.drawable.lens, options);
        lensWinW = lens.getWidth();
        lensWinH = lens.getHeight();

        // mask
        mask = Bitmap.createBitmap(lensWinW, lensWinH, Bitmap.Config.ARGB_8888);
        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        p.setColor(0xFFFF0000);

        new Canvas(mask).drawOval(new RectF(8, 8, lensWinW - 9, lensWinH - 9), p);
    }

    public void prepareDrawingCacheAt(float sx, float sy) {
        draw = true;
        float w = lensWinW / magnifyRatio;
        float h = lensWinH / magnifyRatio;

        Bitmap snapshot = mMapView.getDrawingMapCache(sx - w / 2, sy - h / 2, (int) w, (int) h);
        try {
            background = Bitmap.createScaledBitmap(snapshot, (int) (snapshot.getWidth() * magnifyRatio)
                    , (int) (snapshot.getHeight() * magnifyRatio), false);
        } catch (Exception e) {
        }

        this.x = (sx - lensWinW / 2);
        this.y = (sy - vertOffset - lensWinH);

        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (!draw) {
            return;
        }

        Paint paint = new Paint();
        paint.setFilterBitmap(false);
        paint.setStyle(Paint.Style.FILL);

        int sc = canvas.saveLayer(x + 2, y + 2
                , x + lens.getWidth() - 2, y + lens.getHeight() - 2, null, canvasop);
        canvas.translate(x, y);

        try {
            if (background != null && !background.isRecycled()) {
                canvas.drawBitmap(background, 0, 0, paint);
            }
        } catch (Exception e) {
        }

        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(mask, 0, 0, paint);
        paint.setXfermode(null);
        canvas.drawBitmap(lens, 0, 0, paint);
        canvas.restoreToCount(sc);
    }

    public void hide() {
        draw = false;
        try {
            background.recycle();
        } catch (Exception e) {
        }
        invalidate();
    }
}
