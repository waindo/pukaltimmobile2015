package com.matos.mygis.activities;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.matos.mygis.R;
import com.matos.mygis.fragments.dialogs.FFCBGNTMBENDGNPT;

import java.util.List;

/**
 * Created by matOS on 8/4/2015.
 */
public class TestDialogActivity extends ActionBarActivity implements FFCBGNTMBENDGNPT.FFCBGNTMBENDGNPTListener {

    private static final String TAG = "MapActivity";

    private FragmentManager mFragmentManager;
    private Button btnShowDialog;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "di onCreate MapActivity Start");

        setContentView(R.layout.act_test_dialog);

//        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        btnShowDialog = (Button) findViewById(R.id.btnShowDialog);

//        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FFCBGNTMBENDGNPT ffcbgntmbendgnpt = new FFCBGNTMBENDGNPT();
                ffcbgntmbendgnpt.show(getFragmentManager(), "ffcbgntmbendgnpt_dialog");
            }
        });

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

    @Override
    public void onBtnSimpanClicked(boolean success, String message) {
        Log.i(TAG, "onBtnSimpanClicked");
    }

    @Override
    public void onBtnBatalClicked(String message) {
        Log.i(TAG, "onBtnBatalClicked");
    }
}
