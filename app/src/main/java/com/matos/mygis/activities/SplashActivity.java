package com.matos.mygis.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import com.matos.mygis.R;
import com.matos.mygis.tasks.SplashTask;

/**
 * Created by matOS on 8/4/2015.
 */
public class SplashActivity extends Activity implements SplashTask.SplashListener {

    private static final String TAG = "SplashActivity";

    private ProgressBar mSplashPBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate start");

        setContentView(R.layout.act_splash);

        mSplashPBar = (ProgressBar) findViewById(R.id.mSplashPBar);
        mSplashPBar.setProgress(0);
        SplashTask splashTask = new SplashTask(this);
        splashTask.execute(new String[] {""});

        Log.i(TAG, "onCreate end");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onTaskUpdated(int progres) {
        this.mSplashPBar.setProgress(progres);
    }

    @Override
    public void onTaskFinished(String message, String data) {
        goToLogin();
    }

    private void goToLogin() {
        Intent iLogin = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(iLogin);
        finish();
    }
}
