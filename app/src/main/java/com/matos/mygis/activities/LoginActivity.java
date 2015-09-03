package com.matos.mygis.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.matos.mygis.R;

/**
 * Created by matOS on 8/30/2015.
 */
public class LoginActivity extends Activity {

    private static final String TAG = "LoginActivity";

    private TextView tvAtau;
    private CheckBox chkOnline;
    private Button btnLapMas, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate start");

        setContentView(R.layout.act_login);

        tvAtau = (TextView) findViewById(R.id.tvAtau);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLapMas = (Button) findViewById(R.id.btnLapMas);
        chkOnline = (CheckBox) findViewById(R.id.chkOnline);

        setControlListener();

        Log.i(TAG, "onCreate end");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    private void setControlListener() {
        chkOnline.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    tvAtau.setVisibility(View.INVISIBLE);
                    btnLapMas.setVisibility(View.INVISIBLE);
                }
                else {
                    tvAtau.setVisibility(View.VISIBLE);
                    btnLapMas.setVisibility(View.VISIBLE);
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean succeed = false;

                succeed = true;

                if (succeed) {
                    Toast.makeText(getApplicationContext(), "Anda berhasil diotorisasi..."
                            , Toast.LENGTH_SHORT).show();
                    Intent iMap = new Intent(getApplicationContext(), MapActivity.class);
                    startActivity(iMap);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Periksa kembali koneksi, id dan kata kunci anda..."
                            , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
