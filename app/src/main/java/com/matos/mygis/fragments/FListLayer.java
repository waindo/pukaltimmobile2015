package com.matos.mygis.fragments;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.matos.mygis.R;
import com.matos.mygis.adapters.RVListAdapter;
import com.matos.mygis.database.models.Layer;

import java.util.List;

/**
 * Created by matOS on 7/28/2015.
 */
public class FListLayer extends Fragment {

    private static final String TAG = "FList Fragment";

    private RecyclerView recyclerView;
    private View fragmentView;
    private Button btnBack;
    private List<Layer> layers;
    private String namaModul;
    private boolean showBack;
    private FListLayerListener mFListLayerListener;

    public interface FListLayerListener {
        public void onItemTextCicked(int id, int urutan, String nama_grup);
        public void onButtonBackClicked();
        public void onToggleButtonClicked(int id_layer, boolean is_grup_layer, String nama_grup, boolean new_value);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "di onCreateView FListLayer Fragment");
        fragmentView = inflater.inflate(R.layout.f_list_layer, container, false);
        return fragmentView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.i(TAG, "di onActivityCreated FListLayer Fragment");

        recyclerView = (RecyclerView) fragmentView.findViewById(R.id.layer_list);
        recyclerView.setHasFixedSize(false);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        RVListAdapter listLayerAdapter =
                new RVListAdapter(this.layers, mFListLayerListener);
        recyclerView.setAdapter(listLayerAdapter);

        btnBack = (Button) fragmentView.findViewById(R.id.btnBack);
        if (!isShowBack()) {
            btnBack.setVisibility(View.GONE);
        }
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFListLayerListener.onButtonBackClicked();
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "di onPause FListLayer Fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "di onResume FListLayer Fragment");
    }

    public void setmFListLayerListener(FListLayerListener listener) {
        this.mFListLayerListener = listener;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
        if (recyclerView != null) {
            RVListAdapter listLayerAdapter = new RVListAdapter(this.layers, this.mFListLayerListener);
            recyclerView.setAdapter(listLayerAdapter);
        }
    }

    public String getNamaModul() {
        return namaModul;
    }

    public void setNamaModul(String namaModul) {
        this.namaModul = namaModul;
    }

    public boolean isShowBack() {
        return this.showBack;
    }

    public void setShowBack(boolean showBack) {
        this.showBack = showBack;

        if (btnBack != null) {
            if (isShowBack())
                btnBack.setVisibility(View.VISIBLE);
            else
                btnBack.setVisibility(View.GONE);
        }
    }
}
