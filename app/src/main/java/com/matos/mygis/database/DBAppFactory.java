package com.matos.mygis.database;

import android.content.Context;
import android.util.Log;

import com.matos.mygis.database.tables.LayerTable;

/**
 * Concrete class of DBFactory interface
 */
public class DBAppFactory implements DBFactory {

    private static final String TAG = "DBAppFactory";
    private Context mContext;
    private LayerTable layerTable;

    /**
     * Contructor
     * @param pContext
     * Application context, needed for create tables
     */
    public DBAppFactory(Context pContext) {
        mContext = pContext;

        layerTable = new LayerTable(mContext);
    }

    /**
     * override method for create tables
     * @return boolean value
     */
    @Override
    public boolean createTables() {
        boolean ret = false;
        try {
            layerTable.createTable();
            ret = true;
        } catch(Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return ret;
    }

    /**
     * override method for drop tables
     * @return boolean value
     */
    @Override
    public boolean dropTables() {
        boolean ret = false;
        try {
            layerTable.dropTable();
            ret = true;
        } catch(Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return ret;
    }
}
