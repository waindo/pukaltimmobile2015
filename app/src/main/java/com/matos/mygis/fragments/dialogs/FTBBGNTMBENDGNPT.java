package com.matos.mygis.fragments.dialogs;

import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.matos.mygis.R;

/**
 * Created by matOS on 8/25/2015.
 */
public class FTBBGNTMBENDGNPT extends DialogFragment
{
    public static final String TAG = "FFCBGNTMBENDGNPT";

    private Button btnSimpan, btnBatal;
    private FFCBGNTMBENDGNPTListener mFFCBGNTMBENDGNPTListener;

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


    public interface FFCBGNTMBENDGNPTListener {
        public void onBtnSimpanClicked(boolean success, String message);
        public void onBtnBatalClicked(String message);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView di fragment FFCBGNTMBENDGNPT");
        View fragmentView = inflater.inflate(R.layout.f_tbbgntmbendgnpt, null);
        btnSimpan = (Button) fragmentView.findViewById(R.id.btnSimpan);
        btnBatal = (Button) fragmentView.findViewById(R.id.btnBatal);

        btnSimpan.setOnClickListener(btnSimpanListener);
        btnBatal.setOnClickListener(btnBatalListener);
        return fragmentView;
    }
}
