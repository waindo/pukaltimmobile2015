package com.matos.mygis.libraries;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;

import com.esri.android.map.MapOnTouchListener;
import com.esri.android.map.MapView;
import com.esri.core.geometry.Point;
import com.esri.core.tasks.identify.IdentifyParameters;
import com.matos.mygis.database.models.Layer;

/**
 * Created by matOS on 8/22/2015.
 */
public class MyTouchListener extends MapOnTouchListener {

    private final static String TAG = "MyTouchListener";

    private Context mContext;
    private MapView mMapView;
    private Layer mSelectedLayer;
    private Magnifier mMagnifier;
    private boolean mShowMag = false;
    private MyDynamicCallout mCallout;
    private boolean mRedrawCache = true;

    public MyTouchListener(Context pContext, MapView pMapView) {
        super(pContext, pMapView);
        this.mContext = pContext;
        this.mMapView = pMapView;
        mSelectedLayer = null;
    }

    public MyTouchListener(Context pContext, MapView pMapView, MyDynamicCallout pCallout) {
        super(pContext, pMapView);
        this.mContext = pContext;
        this.mMapView = pMapView;
        this.mCallout = pCallout;
        mSelectedLayer = null;
    }

    @Override
    public boolean onSingleTap(MotionEvent point) {
        Log.i(TAG, "Single Tap");
        this.mCallout.hideCallout();
        this.mRedrawCache = true;
        return super.onSingleTap(point);
    }

    @Override
    public void onLongPress(MotionEvent point) {
        super.onLongPress(point);
        this.magnify(point);
        this.mShowMag = true;
    }

    @Override
    public boolean onDragPointerMove(MotionEvent from, MotionEvent to) {
        if (this.mShowMag) {
            this.magnify(to);
            return true;
        }
        return super.onDragPointerMove(from, to);
    }

    @Override
    public boolean onDragPointerUp(MotionEvent from, MotionEvent to) {
        Log.i(TAG, "onDragPointerUp");
        if (this.mShowMag) {
            if (this.mMagnifier != null) {
                this.mMagnifier.hide();
            }
            this.mMagnifier.postInvalidate();
            this.mShowMag = false;
            this.mRedrawCache = true;
            Point p = this.mMapView.toMapPoint(new Point(to.getX(), to.getY()));

            //proses identify
            identify(p);

            return true;
        }
        return super.onDragPointerUp(from, to);
    }

    private void identify(Point p) {
        if (!this.mCallout.getCalloutStatus()) {
            if (this.mSelectedLayer != null) {
                int[] layers = MyUtils.toIntArray(this.mSelectedLayer.getIdentify_layer().split(","));
                MyIdentify identify = new MyIdentify(this.mMapView, p
                        , this.mCallout, this.mSelectedLayer.getIdentify_url());
                IdentifyParameters iParams = identify.createParameters(p);
                iParams.setLayers(layers);
                identify.execute(iParams);
            }
        }
        else {
            this.mCallout.hideCallout();
        }
    }

    private void magnify(MotionEvent to) {
        if (this.mMagnifier == null) {
            Log.i(TAG, "buat kaca pembesar");
            this.mMagnifier = new Magnifier(this.mContext, this.mMapView);
            this.mMapView.addView(this.mMagnifier);
        }
        this.mMagnifier.prepareDrawingCacheAt(to.getX(), to.getY());
    }

    public void setSelectedLayer(Layer pLayer) {
        this.mSelectedLayer = pLayer;
    }
}
