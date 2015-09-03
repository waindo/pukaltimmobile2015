package com.matos.mygis.fragments.dialogs;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.matos.mygis.R;;

/**
 * Created by acer-pc on 27/08/2015.
 */
public class FFCPBJRXKLMRTNPT extends DialogFragment {

    public static final String TAG = "FFCPBJRXKLMRTNPT";

    private Button btnSimpan, btnBatal;
    private FFCPBJRXKLMRTNPTListener mFFCPBJRXKLMRTNPTListener;

    private View.OnClickListener btnSimpanListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //codingan simpan
        }
    };

    private View.OnClickListener btnBatalListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dismiss();
        }
    };


    public interface FFCPBJRXKLMRTNPTListener {
        public void onBtnSimpanClicked(boolean success, String message);
        public void onBtnBatalClicked(String message);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savesdInstanceState) {
        Log.i(TAG, "onCreateView di fragment FFCPBJRXKLMRTNPT");
        View fragmentView = inflater.inflate(R.layout.f_fcpbjrxklmrtnpt, null);
        btnSimpan = (Button) fragmentView.findViewById(R.id.btnSimpan);
        btnBatal = (Button) fragmentView.findViewById(R.id.btnBatal);

        btnSimpan.setOnClickListener(btnSimpanListener);
        btnBatal.setOnClickListener(btnBatalListener);
        return fragmentView;
    }
    
}
