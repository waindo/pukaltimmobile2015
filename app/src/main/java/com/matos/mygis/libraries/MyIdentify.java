package com.matos.mygis.libraries;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.esri.android.map.MapView;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Point;
import com.esri.core.tasks.identify.IdentifyParameters;
import com.esri.core.tasks.identify.IdentifyResult;
import com.esri.core.tasks.identify.IdentifyTask;

/**
 * Created by matOS on 9/2/2015.
 */
public class MyIdentify extends AsyncTask<IdentifyParameters, Void, IdentifyResult[]> {

    private static final String TAG = "MyIdentfy";

    private MapView mMapView;
    private String mURLService;
    private Point mAnchorPoint;
    private MyDynamicCallout mCallout;
    private IdentifyTask mIdentifyTask;

    public MyIdentify(MapView pMapView, Point pAnchorPoint, MyDynamicCallout pCallout
            , String pURLService) {
        this.mMapView = pMapView;
        this.mURLService = pURLService;
        this.mAnchorPoint = pAnchorPoint;
        this.mCallout = pCallout;
    }

    @Override
    protected void onPreExecute() {
        Log.i(TAG, "onPreExecute");
        this.mIdentifyTask = new IdentifyTask(this.mURLService);
        this.mCallout.setJudul("Info");
        this.mCallout.setLabel("Proses identify...");
        this.mCallout.clearAttributes();
        this.mCallout.setAnchorPoint(this.mAnchorPoint);
        this.mCallout.showCallout();
    }

    @Override
    protected IdentifyResult[] doInBackground(IdentifyParameters... params) {
        Log.i(TAG, "doInBackground");

        IdentifyResult[] results = null;

        try {
            if (params != null && params.length > 0) {
                IdentifyParameters iParams = params[0];
                results = this.mIdentifyTask.execute(iParams);
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }

        return results;
    }

    @Override
    protected void onPostExecute(IdentifyResult[] results) {
        Log.i(TAG, "onPostExecute mulai : " + results.length);

        try {
            if (!isCancelled()) {
                if (results.length > 0) {
                    if (results[0].getAttributes().get("OBJECTID") != null) {
                        this.mCallout.clearAttributes();

                        for (String key : results[0].getAttributes().keySet()) {
                            this.mCallout.setAttributes(key, results[0].getAttributes()
                                    .get(key).toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }

        Log.i(TAG, "onPostExecute selesai");
    }

    public IdentifyParameters createParameters(Point p) {
        IdentifyParameters iParams = new IdentifyParameters();

        try {
            iParams.setLayers(new int[] { 0 });
            iParams.setTolerance(5);
            iParams.setDPI(98);
            iParams.setLayerMode(IdentifyParameters.ALL_LAYERS);
            iParams.setGeometry(p);
            iParams.setSpatialReference(this.mMapView.getSpatialReference());
            iParams.setMapHeight(this.mMapView.getHeight());
            iParams.setMapWidth(this.mMapView.getWidth());
            Envelope env = new Envelope();
            this.mMapView.getExtent().queryEnvelope(env);
            iParams.setMapExtent(env);
        } catch (Exception e) {
            Log.e(TAG, "error di createIdentifyParameters : " + e.getMessage());
        }

        return iParams;
    }
}
