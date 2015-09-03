package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.MyLayer;

import java.util.LinkedList;
import java.util.List;

/**
 * Concrete class for create, drop, access and modify Sqlite tbl_list_layer table
 */
public class MyLayerTable implements AppTable {

    private static final String TAG = "MyLayerTable";

    private static final String TABLE_NAME = "tbl_layer_cfg";
    private static final String TABLE_ID = "id";
    private static final String MODUL = "modul";
    private static final String GRUP = "grup";
    private static final String NAMA_LAYER = "nama_layer";
    private static final String BASEMAP = "basemap";
    private static final String TIPE_LAYER = "tipe_layer";
    private static final String TIPE_KONTROL = "tipe_kontrol";
    private static final String HOST = "host";
    private static final String SERVICE = "service";
    private static final String INITIAL = "initial";
    private static final String CURRENT = "current";
    private static final String URUTAN = "urutan";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                + TABLE_ID + "integer primary key autoincrement"
                + "," + MODUL + " text null"
                + "," + GRUP + " text null"
                + "," + NAMA_LAYER + " text null"
                + "," + BASEMAP + " text null"
                + "," + TIPE_LAYER + " text null"
                + "," + TIPE_KONTROL + " text null"
                + "," + HOST + " text null"
                + "," + SERVICE + " text null"
                + "," + INITIAL + " text null"
                + "," + CURRENT + " text null"
                + "," + URUTAN + " integer"
            + ")";

    private Context mContext;

    public MyLayerTable(Context pContext) {
        mContext = pContext;
    }

    @Override
    public boolean createTable() {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            ret = true;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }

    @Override
    public boolean dropTable() {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (isTableExists()) {
                db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            }
            ret = true;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }

    @Override
    public boolean insertData(Object data) {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            MyLayer myLayer = (MyLayer) data;
            ContentValues val = new ContentValues();
            val.put(MODUL, myLayer.getModul());
            val.put(GRUP, myLayer.getGrup());
            val.put(NAMA_LAYER, myLayer.getNama_layer());
            val.put(BASEMAP, myLayer.getBasemap());
            val.put(TIPE_LAYER, myLayer.getTipe_layer());
            val.put(TIPE_KONTROL, myLayer.getTipe_kontrol());
            val.put(HOST, myLayer.getHost());
            val.put(SERVICE, myLayer.getService());
            val.put(INITIAL, myLayer.getInitial());
            val.put(CURRENT, myLayer.getCurrent());
            val.put(URUTAN, myLayer.getUrutan());
            db.insert(TABLE_NAME, null, val);
            ret = true;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }

    @Override
    public boolean updateData(Object data) {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            MyLayer myLayer = (MyLayer) data;
            ContentValues val = new ContentValues();
            val.put(MODUL, myLayer.getModul());
            val.put(GRUP, myLayer.getGrup());
            val.put(NAMA_LAYER, myLayer.getNama_layer());
            val.put(BASEMAP, myLayer.getBasemap());
            val.put(TIPE_LAYER, myLayer.getTipe_layer());
            val.put(TIPE_KONTROL, myLayer.getTipe_kontrol());
            val.put(HOST, myLayer.getHost());
            val.put(SERVICE, myLayer.getService());
            val.put(INITIAL, myLayer.getInitial());
            val.put(CURRENT, myLayer.getCurrent());
            val.put(URUTAN, myLayer.getUrutan());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(myLayer.getId()) };
            db.update(TABLE_NAME, val, whereClause, whereArgs);
            ret = true;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }

    @Override
    public boolean updateData(ContentValues val, String whereClause, String[] whereArgs) {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            db.update(TABLE_NAME, val, whereClause, whereArgs);
            ret = true;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }

    @Override
    public boolean deleteData(Object data) {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            MyLayer myLayer = (MyLayer) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(myLayer.getId()) };
            db.delete(TABLE_NAME, whereClause, whereArgs);
            ret = true;
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }

    @Override
    public <T> List<T> getData(Class<T> returnTypeClass, String whereClause, String[] whereArgs) {
        List<T> data = new LinkedList<>();
        SQLiteDatabase db = null;
        Cursor cur = null;
        try {
            db = DB.getInstance(mContext).getDB(false);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            String sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + whereClause;
            cur = db.rawQuery(sql, whereArgs);
            if (cur != null) {
                MyLayer myLayer = null;
                if (cur.moveToFirst()) {
                    do {
                        myLayer = new MyLayer();
                        myLayer.setId(cur.getInt(0));
                        myLayer.setModul(cur.getString(1));
                        myLayer.setGrup(cur.getString(2));
                        myLayer.setNama_layer(cur.getString(3));
                        myLayer.setBasemap(cur.getString(4));
                        myLayer.setTipe_layer(cur.getString(5));
                        myLayer.setTipe_kontrol(cur.getString(6));
                        myLayer.setHost(cur.getString(7));
                        myLayer.setService(cur.getString(8));
                        myLayer.setInitial(cur.getString(9));
                        myLayer.setCurrent(cur.getString(10));
                        myLayer.setUrutan(cur.getInt(11));
                        data.add(returnTypeClass.cast(myLayer));
                    } while (cur.moveToNext());
                }
                cur.close();
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return data;
    }

    @Override
    public boolean isTableExists() {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(false);
            String args[] = { "table", TABLE_NAME };
            Cursor cur = db.rawQuery("SELECT * FROM sqlite_master WHERE type=? AND name=?"
                , args);
            if (cur != null) {
                if (cur.getCount() > 0) {
                    ret = true;
                }
            }
            cur.close();
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
        return ret;
    }
}
