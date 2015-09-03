package com.matos.mygis.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.matos.mygis.R;
import com.matos.mygis.database.models.Layer;
import com.matos.mygis.database.tables.LayerTable;
import com.matos.mygis.fragments.FListLayer;
import com.matos.mygis.fragments.FMapViewer;

import java.util.List;

/**
 * Created by matOS on 8/4/2015.
 */
public class MapActivity extends ActionBarActivity
        implements FListLayer.FListLayerListener, FMapViewer.FMapViewerListener {

    private static final String TAG = "MapActivity";
    private static final String NAMA_MODUL = "map";

    private FragmentManager mFragmentManager;
    private List<Layer> mLlistLayers, mMapLayers;
    private ImageButton mBtnLayer;
    private Toolbar mToolbar;

    private String nama_grup = "";
    private boolean show = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "di onCreate MapActivity Start");

        setContentView(R.layout.act_map);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mBtnLayer = (ImageButton) findViewById(R.id.btnLayer);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        prepareMap();

        Log.i(TAG, "di onCreate MapActivity End");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "di onResume MapActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "di onPause MapActivity");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_map, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mn_pengukuran) {
            mFragmentManager = getFragmentManager();
            FMapViewer mapViewer = (FMapViewer) mFragmentManager.findFragmentByTag("mapViewer");
            if (mapViewer != null) {
                startActionMode(mapViewer.getMeasuringTool());
            }
            return true;
        } else if (id == R.id.mn_pencarian) {
            return true;
        } else if (id == R.id.mn_ambil_data) {
            return true;
        } else if (id == R.id.mn_inspeksi) {
            return true;
        } else if (id == R.id.mn_logout) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void prepareMap() {
        mFragmentManager = getFragmentManager();
        FMapViewer mapViewer = (FMapViewer) mFragmentManager.findFragmentByTag("mapViewer");
        FragmentTransaction ft = mFragmentManager.beginTransaction();

        getMapLayers();

        if (mapViewer != null) {
        }
        else {
            Log.i(TAG, "prepareMap mapViewer null");
            mapViewer = new FMapViewer();
            mapViewer.setmFMapViewerListener(this);
            mapViewer.setNama_modul(NAMA_MODUL);
            mapViewer.setLayers(mMapLayers);

            ft.add(R.id.mapContainer, mapViewer, "mapViewer");
            ft.commit();
        }
    }

    private void prepareLayer() {

        getListLayer(this.nama_grup);
        showListLayer(this.nama_grup, this.show);

    }

    private void prepareControl() {

        mBtnLayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "click button show layer");
                getListLayer(nama_grup);
                showListLayer(nama_grup, !show);
            }
        });

    }

    private void getMapLayers() {

        LayerTable layerTable = new LayerTable(getApplicationContext());

        String whereClause = LayerTable.NAMA_MODUL + "=?";
        String[] whereArgs = new String[] { NAMA_MODUL };

        mMapLayers = layerTable.getData(Layer.class, whereClause, whereArgs);

    }

    private void getListLayer(String nama_grup) {

        LayerTable layerTable = new LayerTable(getApplicationContext());

        if (!nama_grup.equals("")) {
            String whereClause = LayerTable.IS_GRUP_LAYER + "=?"
                    + " AND " + LayerTable.NAMA_GRUP + "=?"
                    + " AND " + LayerTable.NAMA_MODUL + "=?";
            String[] whereArgs = new String[] { "0", nama_grup, NAMA_MODUL };

            mLlistLayers = layerTable.getData(Layer.class, whereClause, whereArgs);
        }
        else {
            String whereClause = LayerTable.IS_GRUP_LAYER + "=?" +
                    " AND " + LayerTable.NAMA_MODUL + "=?";
            String[] whereArgs = new String[] { "1", NAMA_MODUL };

            mLlistLayers = layerTable.getData(Layer.class, whereClause, whereArgs);
        }

    }

    private void showListLayer(String nama_grup, boolean show) {
        mFragmentManager = getFragmentManager();
        FListLayer mapListLayer = (FListLayer) mFragmentManager.findFragmentByTag("mapListLayer");
        FragmentTransaction ft = mFragmentManager.beginTransaction();

        if (mapListLayer != null) {

            if (!nama_grup.equals("")) {
                // yang tampil secondary (layer)
                Log.i(TAG, "tampil sub layer dari grup " + nama_grup);
                mapListLayer.setShowBack(true);
            }
            else {
                Log.i(TAG, "tampil layer dari grup " + nama_grup);
                mapListLayer.setShowBack(false);
            }
            mapListLayer.setLayers(mLlistLayers);

            if (show) {
                Log.i(TAG, "attach, show = " + show);
                ft.attach(mapListLayer);
            }
            else {
                Log.i(TAG, "detach, show = " + show);
                ft.detach(mapListLayer);
            }
            ft.commit();
            this.show = show;
            Log.i(TAG, "nilai dari show di activity " + this.show);
        }
        else {
            Log.i(TAG, "showListLayer mapListLayer null");
            mapListLayer = new FListLayer();
            mapListLayer.setmFListLayerListener(this);
            mapListLayer.setNamaModul(NAMA_MODUL);
            mapListLayer.setLayers(mLlistLayers);
            mapListLayer.setShowBack(false);

            ft.add(R.id.layerContainer, mapListLayer, "mapListLayer");
            ft.commit();
            this.show = true;
            Log.i(TAG, "nilai dari show di activity " + this.show);
        }
    }

    @Override
    public void onItemTextCicked(int id, int urutan, String nama_grup) {
        Log.i(TAG, "onItemClicked untuk grup " + nama_grup);
        if (!nama_grup.equals("")) {
            this.nama_grup = nama_grup;
            getListLayer(nama_grup);
            showListLayer(nama_grup, true);
        }
        else {
            mFragmentManager = getFragmentManager();
            FMapViewer mapViewer = (FMapViewer) mFragmentManager.findFragmentByTag("mapViewer");

            if (mapViewer != null) {
                mapViewer.setSelectedLayer(urutan);
            }
        }
    }

    @Override
    public void onButtonBackClicked() {
        Log.i(TAG, "onButtonBackClicked");
        this.nama_grup = "";
        getListLayer(this.nama_grup);
        showListLayer(this.nama_grup, true);
    }

    @Override
    public void onToggleButtonClicked(int id_layer, boolean is_grup_layer, String nama_grup, boolean new_value) {
        LayerTable layerTable = new LayerTable(getApplicationContext());
        List<Layer> temp;
        if (is_grup_layer) {
            Log.i(TAG, "onToggleButtonClicked untuk grup " + nama_grup);
            layerTable.updateGrupCurrentValue(nama_grup, new_value);
            temp = layerTable.getData(Layer.class
                    , LayerTable.NAMA_MODUL + "=? AND " + LayerTable.NAMA_GRUP + "=?"
                    , new String[] { NAMA_MODUL, nama_grup });
        }
        else {
            Log.i(TAG, "onToggleButtonClicked untuk layer " + id_layer);
            layerTable.updateCurrentValue(id_layer, new_value);
            temp = layerTable.getData(Layer.class
                    , LayerTable.NAMA_MODUL + "=? AND " + LayerTable.TABLE_ID + "=?"
                    , new String[] { NAMA_MODUL, String.valueOf(id_layer) });
        }
        mFragmentManager = getFragmentManager();
        FMapViewer mapViewer = (FMapViewer) mFragmentManager.findFragmentByTag("mapViewer");
        if (mapViewer != null) {
            for (Layer l : temp) {
                mapViewer.setLayerVisibility(l.getUrutan(), new_value);
            }
        }
    }

    @Override
    public void onStatusChanged() {
        prepareLayer();
        prepareControl();
    }
}
