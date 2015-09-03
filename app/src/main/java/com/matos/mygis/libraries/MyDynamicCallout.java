package com.matos.mygis.libraries;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.esri.android.map.Callout;
import com.esri.core.geometry.Point;
import com.matos.mygis.R;

public class MyDynamicCallout {

    private static final String TAG = "MyDynamicCallout";

    public static final boolean SHOWN = true;
    public static final boolean HIDDEN = false;

    private Point mAnchorPt;
    private Context mContext;
    private Callout mCallout;
    private boolean mCalloutStatus;

    private LinearLayout mCalloutLayout, mAttributeLayout;

    public MyDynamicCallout(Context pContext, Callout pCallout
            , int pLayoutCalloutId, int pLayoutAttributeId) {
        this.mContext = pContext;
        this.mCallout = pCallout;
        this.setupCalloutLayout(pLayoutCalloutId, pLayoutAttributeId);
    }

    public void setupCalloutLayout(int pLayoutCalloutId, int pLayoutAttributeId) {
        LayoutInflater inflater = (LayoutInflater) this.mContext.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.mCalloutLayout = (LinearLayout) inflater.inflate(pLayoutCalloutId, null);
        this.mAttributeLayout = (LinearLayout) this.mCalloutLayout.findViewById(pLayoutAttributeId);
    }

    public void setCalloutStatus(boolean pCalloutStatus) {
        this.mCalloutStatus = pCalloutStatus;
    }

    public boolean getCalloutStatus() {
        return this.mCalloutStatus;
    }

    public void setAnchorPoint(Point pAnchorPoint) {
        this.mAnchorPt = pAnchorPoint;
    }

    public Point getAnchorPoint() {
        return this.mAnchorPt;
    }

    public void showCallout() {
        this.mCalloutStatus = SHOWN;
        this.mCallout.show(this.getAnchorPoint(), createLayout(this.getAnchorPoint()));
    }

    public void showCallout(Point pAnchorPoint) {
        this.mAnchorPt = pAnchorPoint;
        this.mCalloutStatus = SHOWN;
        this.mCallout.show(pAnchorPoint, createLayout(pAnchorPoint));
    }

    public void hideCallout() {
        this.mCalloutStatus = HIDDEN;
        this.mCallout.hide();
    }

    public void setJudul(String pJudul) {
        TextView tvJudul = (TextView) this.mCalloutLayout.findViewById(R.id.tvJudul);
        if (pJudul != null) {
            tvJudul.setText(pJudul);
        }
        else {
            tvJudul.setText("Data tidak ditemukan");
        }
    }

    public String getJudul() {
        TextView tvJudul = (TextView) this.mCalloutLayout.findViewById(R.id.tvJudul);
        return tvJudul.getText().toString();
    }

    public void setLabel(String pLabel) {
        TextView tvLabel = (TextView) this.mCalloutLayout.findViewById(R.id.tvLabel);
        if (pLabel != null) {
            tvLabel.setText(pLabel);
        }
        else {
            tvLabel.setText("Data tidak ditemukan");
        }
    }

    public String getLabel() {
        TextView tvLabel = (TextView) this.mCalloutLayout.findViewById(R.id.tvLabel);
        return tvLabel.getText().toString();
    }

    public void clearAttributes() {
        this.mAttributeLayout.removeAllViews();
    }

    public void setAttributes(String fieldname, String fieldvalue) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT
                , LinearLayout.LayoutParams.WRAP_CONTENT);

        TextView tvFieldName = new TextView(this.mContext);
        TextView tvFieldValue = new TextView(this.mContext);
        tvFieldName.setLayoutParams(params);
        tvFieldValue.setLayoutParams(params);
        tvFieldName.setText(fieldname);
        tvFieldValue.setText(": " + fieldvalue);

        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setLayoutParams(params);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(tvFieldName);
        linearLayout.addView(tvFieldValue);

        this.mAttributeLayout.addView(linearLayout);
    }

    public View createLayout(Point pAnchorPoint) {
        Log.i(TAG, "create Layout");

        String longitude = String.format("%.4f ", pAnchorPoint.getX());
        String latitude = String.format("%.4f ", pAnchorPoint.getY());
        TextView tvLong = (TextView) this.mCalloutLayout.findViewById(R.id.tvLong);
        TextView tvLat = (TextView) this.mCalloutLayout.findViewById(R.id.tvLat);
        tvLong.setText(longitude);
        tvLat.setText(latitude);
        setJudul("Info");
        setLabel("Sedang proses...");

        return this.mCalloutLayout;
    }

}
