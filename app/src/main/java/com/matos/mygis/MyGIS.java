package com.matos.mygis;

import android.app.Application;

import com.matos.mygis.database.DBAppFactory;

/**
 * Created by matOS on 7/6/2015.
 */
public class MyGIS extends Application {

    private static final String TAG = "MyGIS Application";

    @Override
    public void onCreate() {
        super.onCreate();
        prepareDB();
    }

    private void prepareDB() {
        DBAppFactory factory = new DBAppFactory(getApplicationContext());
        factory.createTables();
    }
}
