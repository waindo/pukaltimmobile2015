package com.matos.mygis.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISDynamicMapServiceLayer;
import com.esri.android.map.ags.ArcGISFeatureLayer;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;
import com.esri.android.map.event.OnStatusChangedListener;
import com.esri.android.toolkit.analysis.MeasuringTool;
import com.matos.mygis.R;
import com.matos.mygis.database.models.Layer;
import com.matos.mygis.libraries.MyDynamicCallout;
import com.matos.mygis.libraries.MyMeasuringTool;
import com.matos.mygis.libraries.MyTouchListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by matOS on 8/18/2015.
 */
public class FMapViewer extends Fragment {

    private static final String TAG = "FMap Fragment";

    private FMapViewerListener mFMapViewerListener;
    private MyTouchListener mTouchListener;
    private Map<Integer, Layer> layers;
    private MyDynamicCallout mCallout;
    private MapView mMapView;
    private View fragmentView;
    private String nama_modul;
    private int mSelectedLayer = -1;

    public interface FMapViewerListener {
        public void onStatusChanged();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "di onCreateView FMapViewer Fragment");
        fragmentView = inflater.inflate(R.layout.f_map, container, false);
        return fragmentView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.i(TAG, "di onActivityCreated FMapViewer Fragment");

        mMapView = (MapView) fragmentView.findViewById(R.id.peta);
        prepare();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "di onPause FMapViewer Fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "di onResume FMapViewer Fragment");
    }

    private void prepare() {
        generateMapLayers();
        mMapView.setOnStatusChangedListener(new OnStatusChangedListener() {
            @Override
            public void onStatusChanged(Object o, STATUS status) {
                if (STATUS.INITIALIZED == status && o == mMapView) {
                    Log.i(TAG, "mMapView has been initialized");
                    mFMapViewerListener.onStatusChanged();
                    mCallout = new MyDynamicCallout(getActivity(), mMapView.getCallout()
                            , R.layout.callout_1, R.id.linAttr);
                    mTouchListener = new MyTouchListener(getActivity(), mMapView, mCallout);
                    mMapView.setOnTouchListener(mTouchListener);
                }
            }
        });
    }

    private void generateMapLayers() {
        for (Map.Entry<Integer, Layer> entry : layers.entrySet()) {
            Layer layer = entry.getValue();
            if (!layer.is_grup_layer()) {
                String url = layer.getHost() + layer.getService();
                String tipeLayer = layer.getTipe_layer();
                boolean on_off = layer.isOn_off();
                int urutan = layer.getUrutan();
                mMapView.addLayer(createMapServiceLayer(url, tipeLayer, on_off), urutan);
            }
        }
    }

    private com.esri.android.map.Layer createMapServiceLayer(String url, String tipeLayer, boolean on_off) {
        com.esri.android.map.Layer layer;
        switch (tipeLayer) {
            case Layer.DYNAMIC:
                layer = new ArcGISDynamicMapServiceLayer(url);
                layer.setVisible(on_off);
                break;
            case Layer.FEATURE:
                layer = new ArcGISFeatureLayer(url, ArcGISFeatureLayer.MODE.ONDEMAND);
                layer.setVisible(on_off);
                break;
            case Layer.TILED:
                layer = new ArcGISTiledMapServiceLayer(url);
                layer.setVisible(on_off);
                break;
            default:
                layer = null;
                break;
        }
        return layer;
    }

    private Map<Integer, Layer> list2Map(List<Layer> list) {
        Map<Integer, Layer> data = new HashMap<>();
        try {
            for (Layer item : list) {
                data.put(item.getUrutan(), item);
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
        }
        return data;
    }

    public MeasuringTool getMeasuringTool() {
        MyMeasuringTool measuringTool = new MyMeasuringTool(this.mMapView);
        return measuringTool.getMeasuringTool();
    }

    public void setSelectedLayer(int pSelectedLayer) {
        this.mSelectedLayer = pSelectedLayer;
        Layer l = ((pSelectedLayer == -1)? null : this.layers.get(pSelectedLayer));
        this.mTouchListener.setSelectedLayer(l);
    }

    public int getSelectedLayer() {
        return this.mSelectedLayer;
    }

    public void setLayerVisibility(int urutan, boolean on_off) {
        this.mMapView.getLayer(urutan).setVisible(on_off);
    }

    public void setLayers(List<Layer> pLayers) {
        this.layers = list2Map(pLayers);
    }

    public void setmFMapViewerListener(FMapViewerListener mFMapViewerListener) {
        this.mFMapViewerListener = mFMapViewerListener;
    }

    public String getNama_modul() {
        return nama_modul;
    }

    public void setNama_modul(String nama_modul) {
        this.nama_modul = nama_modul;
    }
}
