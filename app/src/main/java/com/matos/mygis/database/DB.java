package com.matos.mygis.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Concrete class to create, open, close Sqlite database
 */
public class DB extends SQLiteOpenHelper {

    private static final String TAG = "DB Class";
    private static final String DBPATH = "/mnt/sdcard/com.matos.mygis/db/";
    private static final String DBNAME = "pukaltim.db";
    private static final int DBVERSION = 1;

    private volatile static DB database;
    private Context mContext;
    private DBAppFactory factory;
    private static SQLiteDatabase db;

    private DB(Context pContext) {
        super(pContext, DBNAME, null, DBVERSION);
        mContext = pContext;
        Log.i(TAG, "Creating Database PUKALTIM : " + DBPATH + DBNAME);

        try {
            constructDB();
            Log.i(TAG, "Database created");
        } catch(Exception e) {
            Log.e(TAG, e.getMessage());
        }
    }

    public static DB getInstance(Context pContext) {
        if (database == null) {
            synchronized (DB.class) {
                if (database == null) {
                    database = new DB(pContext);
                }
            }
        }
        return database;
    }

    private void openDB(boolean writable) throws SQLException {
        String path = DBPATH + DBNAME;
        if (writable) db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READWRITE);
        else db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
    }

    public SQLiteDatabase getDB(boolean writable) {
        openDB(writable);
        return db;
    }

    private void copyDBTemplate() throws IOException {
        InputStream inputDBFile = this.mContext.getAssets().open(DBNAME);

        File path = new File(DBPATH);
        path.mkdirs();
        String outputDBFileName = DBPATH + DBNAME;
        OutputStream outputDBFile = new FileOutputStream(outputDBFileName);
        byte[] buffer = new byte[1024];
        int length;

        while ((length = inputDBFile.read(buffer)) > 0) {
            outputDBFile.write(buffer, 0, length);
        }

        outputDBFile.flush();
        outputDBFile.close();
        inputDBFile.close();
    }

    private boolean isDBExists() {
        SQLiteDatabase checkdb = null;
        boolean ret = false;

        try {
            String path = DBPATH + DBNAME;
            checkdb = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
            Log.i(TAG, "DB already exists");
        } catch(SQLiteException e) {
            Log.e(TAG, e.getMessage());
        }


        if (checkdb != null) {
            ret = true;
            checkdb.close();
        }

        return ret;
    }

    private void constructDB() throws IOException {
        boolean dbExists = isDBExists();

        if (!dbExists) {
            try {
                copyDBTemplate();
            } catch(Exception e) {
                Log.e(TAG, "Error copying database...");
                throw new Error("Error copying database... " + e.getMessage());
            }
        }
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        factory.dropTables();
        factory.createTables();
    }

    @Override
    public synchronized void close() {
        if (db != null) {
            db.close();
        }
        super.close();
    }
}
