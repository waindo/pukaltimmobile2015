package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.Layer;

import java.util.LinkedList;
import java.util.List;

/**
 * Concrete class for create, drop, access and modify Sqlite tbl_list_layer table
 */
public class LayerTable implements AppTable {

    private static final String TAG = "LayerCFGTable";

    public static final String TABLE_NAME = "tbl_layer_cfg";
    public static final String TABLE_ID = "id";
    public static final String NAMA_MODUL = "nama_modul";
    public static final String NAMA_GRUP = "nama_grup";
    public static final String TEKS_TAMPIL = "teks_tampil";
    public static final String IS_GRUP_LAYER = "is_grup_layer";
    public static final String IS_BASEMAP = "is_basemap";
    public static final String TIPE_LAYER = "tipe_layer";
    public static final String TIPE_KONTROL = "tipe_kontrol";
    public static final String HOST = "host";
    public static final String SERVICE = "service";
    public static final String INITIAL_ON_OFF = "initial_on_off";
    public static final String ON_OFF = "on_off";
    public static final String URUTAN = "urutan";
    public static final String IDENTIFY_URL = "identify_url";
    public static final String IDENTIFY_LAYER = "identify_layer";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                + TABLE_ID + "integer primary key autoincrement"    // 0
                + "," + NAMA_MODUL + " text null"                   // 1
                + "," + NAMA_GRUP + " text null"                    // 2
                + "," + TEKS_TAMPIL + " text null"                  // 3
                + "," + IS_GRUP_LAYER + " integer default 0"        // 4
                + "," + IS_BASEMAP + " integer default 0"           // 5
                + "," + TIPE_LAYER + " text null"                   // 6
                + "," + TIPE_KONTROL + " text null"                 // 7
                + "," + HOST + " text null"                         // 8
                + "," + SERVICE + " text null"                      // 9
                + "," + INITIAL_ON_OFF + " integer default 0"       // 10
                + "," + ON_OFF + " integer default 0"               // 11
                + "," + URUTAN + " integer"                         // 12
                + "," + IDENTIFY_URL + " text null"                   // 13
                + "," + IDENTIFY_LAYER + " text null"                   // 14
            + ")";

    private Context mContext;

    public LayerTable(Context pContext) {
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
            Layer layer = (Layer) data;
            int is_grup_layer = (layer.is_grup_layer() ? 1 : 0);
            int is_basemap = (layer.is_basemap() ? 1 : 0);
            int initial_on_off = (layer.isInitial_on_off() ? 1 : 0);
            int on_off = (layer.isOn_off() ? 1 : 0);
            ContentValues val = new ContentValues();
            val.put(NAMA_MODUL, layer.getNama_modul());
            val.put(NAMA_GRUP, layer.getNama_grup());
            val.put(TEKS_TAMPIL, layer.getTeks_tampil());
            val.put(IS_GRUP_LAYER, is_grup_layer);
            val.put(IS_BASEMAP, is_basemap);
            val.put(TIPE_LAYER, layer.getTipe_layer());
            val.put(TIPE_KONTROL, layer.getTipe_kontrol());
            val.put(HOST, layer.getHost());
            val.put(SERVICE, layer.getService());
            val.put(INITIAL_ON_OFF, initial_on_off);
            val.put(ON_OFF, on_off);
            val.put(URUTAN, layer.getUrutan());
            val.put(IDENTIFY_URL, layer.getIdentify_url());
            val.put(IDENTIFY_LAYER, layer.getIdentify_layer());
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
            Layer layer = (Layer) data;
            int is_grup_layer = (layer.is_grup_layer() ? 1 : 0);
            int is_basemap = (layer.is_basemap() ? 1 : 0);
            int initial_on_off = (layer.isInitial_on_off() ? 1 : 0);
            int on_off = (layer.isOn_off() ? 1 : 0);
            ContentValues val = new ContentValues();
            val.put(NAMA_MODUL, layer.getNama_modul());
            val.put(NAMA_GRUP, layer.getNama_grup());
            val.put(TEKS_TAMPIL, layer.getTeks_tampil());
            val.put(IS_GRUP_LAYER, is_grup_layer);
            val.put(IS_BASEMAP, is_basemap);
            val.put(TIPE_LAYER, layer.getTipe_layer());
            val.put(TIPE_KONTROL, layer.getTipe_kontrol());
            val.put(HOST, layer.getHost());
            val.put(SERVICE, layer.getService());
            val.put(INITIAL_ON_OFF, initial_on_off);
            val.put(ON_OFF, on_off);
            val.put(URUTAN, layer.getUrutan());
            val.put(IDENTIFY_URL, layer.getIdentify_url());
            val.put(IDENTIFY_LAYER, layer.getIdentify_layer());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(layer.getId()) };
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
            Layer layer = (Layer) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(layer.getId()) };
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
            String sql = "SELECT * FROM " + TABLE_NAME;
            if (!whereClause.equals(""))
                sql = sql + " WHERE " + whereClause;
            cur = db.rawQuery(sql, whereArgs);
            if (cur != null) {
                Layer layer = null;
                if (cur.moveToFirst()) {
                    do {
                        layer = new Layer();
                        layer.setId(cur.getInt(0));
                        layer.setNama_modul(cur.getString(1));
                        layer.setNama_grup(cur.getString(2));
                        layer.setTeks_tampil(cur.getString(3));
                        layer.setIs_grup_layer(cur.getInt(4) == 1);
                        layer.setIs_basemap(cur.getInt(5) == 1);
                        layer.setTipe_layer(cur.getString(6));
                        layer.setTipe_kontrol(cur.getString(7));
                        layer.setHost(cur.getString(8));
                        layer.setService(cur.getString(9));
                        layer.setInitial_on_off(cur.getInt(10) == 1);
                        layer.setOn_off(cur.getInt(11) == 1);
                        layer.setUrutan(cur.getInt(12));
                        layer.setIdentify_url(cur.getString(13));
                        layer.setIdentify_layer(cur.getString(14));
                        data.add(returnTypeClass.cast(layer));
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

    public boolean updateGrupCurrentValue(String nama_grup, boolean new_value) {
        boolean ret = false;
        try {
            int on_off = new_value ? 1 : 0;
            ContentValues val = new ContentValues();
            val.put(ON_OFF, on_off);
            ret = updateData(val, NAMA_GRUP + "=?", new String[] { String.valueOf(nama_grup) });
        } catch (Exception e) {
            ret = false;
            Log.e(TAG, e.getMessage());
        } finally {
        }
        return ret;
    }

    public boolean updateCurrentValue(int id_layer, boolean new_value) {
        boolean ret = false;
        try {
            int on_off = new_value ? 1 : 0;
            ContentValues val = new ContentValues();
            val.put(ON_OFF, on_off);
            ret = updateData(val, TABLE_ID + "=?", new String[] { String.valueOf(id_layer) });
        } catch (Exception e) {
            ret = false;
            Log.e(TAG, e.getMessage());
        } finally {
        }
        return ret;
    }
}
