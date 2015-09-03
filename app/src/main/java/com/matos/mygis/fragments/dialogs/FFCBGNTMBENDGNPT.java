package com.matos.mygis.fragments.dialogs;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.matos.mygis.R;
import com.matos.mygis.database.models.FCBGNTMBENDGNPT;
import com.matos.mygis.database.tables.FCBGNTMBENDGNPTTable;

/**
 * Created by matOS on 8/25/2015.
 */
public class FFCBGNTMBENDGNPT extends DialogFragment
{
    public static final String TAG = "FFCBGNTMBENDGNPT";

    private Button btnSimpan, btnBatal;
    private TextView tvObjectId, tvTableId;
    private EditText txtKodeAset, txtNamaBendungan;
    private FFCBGNTMBENDGNPTListener mFFCBGNTMBENDGNPTListener;

    private View.OnClickListener btnSimpanListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String message = "";
            boolean success = false;
            String tableid = tvTableId.getText().toString();
            String objectid = tvObjectId.getText().toString();
            String kodeaset = txtKodeAset.getText().toString();
            String namabendungan = txtNamaBendungan.getText().toString();

            FCBGNTMBENDGNPTTable table = new FCBGNTMBENDGNPTTable(getActivity());
            FCBGNTMBENDGNPT data = new FCBGNTMBENDGNPT();
            data.setId(Integer.parseInt(tableid));
            data.setOBJECTID(Integer.parseInt(objectid));
            data.setKodeaset(Integer.parseInt(kodeaset));
            data.setNama_Bendungan(Integer.parseInt(namabendungan));
            if (table.insertData(data)) {
                success = true;
                message = "Data berhasil disimpan";
            }
            else {
                success = false;
                message = "Data gagal disimpan";
            }
            mFFCBGNTMBENDGNPTListener.onBtnSimpanClicked(success, message);
        }
    };

    private View.OnClickListener btnBatalListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mFFCBGNTMBENDGNPTListener.onBtnBatalClicked("");
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
        View fragmentView = inflater.inflate(R.layout.f_fcbgntmbendgnpt, null);

        getDialog().setTitle("Input data");

        btnSimpan = (Button) fragmentView.findViewById(R.id.btnSimpan);
        btnBatal = (Button) fragmentView.findViewById(R.id.btnBatal);

        tvObjectId = (TextView) fragmentView.findViewById(R.id.tvObjectId);
        tvTableId = (TextView) fragmentView.findViewById(R.id.tvTableId);
        txtKodeAset = (EditText) fragmentView.findViewById(R.id.txtKodeAset);
        txtNamaBendungan = (EditText) fragmentView.findViewById(R.id.txtNamaBendungan);

        btnSimpan.setOnClickListener(btnSimpanListener);
        btnBatal.setOnClickListener(btnBatalListener);
        return fragmentView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "onAttach");
        this.mFFCBGNTMBENDGNPTListener = (FFCBGNTMBENDGNPTListener) activity;
    }
}
