package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.FCIRIGABBGSDPPT;
import com.matos.mygis.database.models.FCIRIGASLAINXLN;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Qaccipinho on 06/07/2015.
 */
public class FCIRIGABBGSDPPTTable implements AppTable {

    private static final String TAG = "FCIRIGABBGSDPPTTable";

    private static final String TABLE_NAME = "FCIRIGABBGSDPPT";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";


    private static final String Nama_Jaringan_Irigasi = "Nama_Jaringan_Irigasi";
    private static final String Tipe_Bangunan_Bagi_Sadap = "Tipe_Bangunan_Bagi_Sadap";
    private static final String Nama_Bangunan_Bagi_Sadap = "Nama_Bangunan_Bagi_Sadap";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"
                    + "," + Nama_Jaringan_Irigasi + " integer null"
                    + "," + Tipe_Bangunan_Bagi_Sadap + " integer null"       // ini harusnya text bukan integer, perhatikan juga tipe data yang lain. Tipe data SQLLite yang kita pake integer, text, dan real
                    + "," + Nama_Bangunan_Bagi_Sadap + " text null"
                    + ")";

    private Context mContext;

    public FCIRIGABBGSDPPTTable(Context pContext) {
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
            FCIRIGABBGSDPPT fcirigabbgsdppt= (FCIRIGABBGSDPPT) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcirigabbgsdppt.getOBJECTID());
            val.put(kodeaset, fcirigabbgsdppt.getKodeaset());
            val.put(Nama_Jaringan_Irigasi, fcirigabbgsdppt.getNama_Jaringan_Irigasi());
            val.put(Tipe_Bangunan_Bagi_Sadap, fcirigabbgsdppt.getTipe_Bangunan_Bagi_Sadap());
            val.put(Nama_Bangunan_Bagi_Sadap, fcirigabbgsdppt.getNama_Bangunan_Bagi_Sadap());
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
            FCIRIGABBGSDPPT fcirigabbgsdppt= (FCIRIGABBGSDPPT) data;
            ContentValues val = new ContentValues();
            val.put(Nama_Jaringan_Irigasi, fcirigabbgsdppt.getNama_Jaringan_Irigasi());
            val.put(Tipe_Bangunan_Bagi_Sadap, fcirigabbgsdppt.getTipe_Bangunan_Bagi_Sadap());
            val.put(Nama_Bangunan_Bagi_Sadap, fcirigabbgsdppt.getNama_Bangunan_Bagi_Sadap());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcirigabbgsdppt.getId()) };
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
    public boolean updateData(ContentValues values, String whereClause, String[] whereArgs) {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            db.update(TABLE_NAME, values, whereClause, whereArgs);
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
            FCIRIGABBGSDPPT fcirigabbgsdppt= (FCIRIGABBGSDPPT) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcirigabbgsdppt.getId()) };
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
                FCIRIGABBGSDPPT  fcirigabbgsdppt = null;
                if (cur.moveToFirst()) {
                    do {
                        fcirigabbgsdppt = new FCIRIGABBGSDPPT();
                        //FCIRIGAPBWPRILN = new fcirigapbwpriln();
                        //myLayer = new MyLayer();
                        fcirigabbgsdppt.setId(cur.getInt(0));
                        fcirigabbgsdppt.setKodeaset(cur.getInt(1));
                        fcirigabbgsdppt.setNama_Jaringan_Irigasi(cur.getInt(2));
                        fcirigabbgsdppt.setTipe_Bangunan_Bagi_Sadap(cur.getInt(3));
                        fcirigabbgsdppt.setNama_Bangunan_Bagi_Sadap(cur.getString(4));
                        data.add(returnTypeClass.cast(fcirigabbgsdppt));
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
