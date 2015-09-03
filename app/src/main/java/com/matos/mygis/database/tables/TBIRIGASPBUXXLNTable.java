package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.TBIRIGAPBWTERLN;
import com.matos.mygis.database.models.TBIRIGASPBUXXLN;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Qaccipinho on 07/07/2015.
 */
public class TBIRIGASPBUXXLNTable implements AppTable {

    private static final String TAG = "TBIRIGASPBUXXLNTable";

    private static final String TABLE_NAME = "TBIRIGASPBUXXLN";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";

    private static final String Nama_Jaringan_Irigasi = "Nama_Jaringan_Irigasi";
    private static final String Nama_Saluran_Pembuang = "Kondisi_Pelapisan";
    private static final String Kondisi = "Kondisi";
    private static final String Informasi_Tambahan = "Informasi_Tambahan";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"

                    + "," + Nama_Jaringan_Irigasi + " integer null"
                    + "," + Nama_Saluran_Pembuang + " integer null"
                    + "," + Kondisi + " text null"
                    + "," + Informasi_Tambahan + " text null"
                    + ")";

    private Context mContext;

    public TBIRIGASPBUXXLNTable(Context pContext) {
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
            TBIRIGASPBUXXLN tbirigaspbuxxln= (TBIRIGASPBUXXLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbirigaspbuxxln.getOBJECTID());
            val.put(kodeaset, tbirigaspbuxxln.getKodeaset());
            val.put(Nama_Jaringan_Irigasi, tbirigaspbuxxln.getNama_Jaringan_Irigasi());
            val.put(Nama_Saluran_Pembuang, tbirigaspbuxxln.getNama_Saluran_Pembuang());
            val.put(Kondisi, tbirigaspbuxxln.getKondisi());
            val.put(Informasi_Tambahan, tbirigaspbuxxln.getInformasi_Tambahan());
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
            TBIRIGASPBUXXLN tbirigaspbuxxln= (TBIRIGASPBUXXLN) data;
            ContentValues val = new ContentValues();
            val.put(Nama_Jaringan_Irigasi, tbirigaspbuxxln.getNama_Jaringan_Irigasi());
            val.put(Nama_Saluran_Pembuang, tbirigaspbuxxln.getNama_Saluran_Pembuang());
            val.put(Kondisi, tbirigaspbuxxln.getKondisi());
            val.put(Informasi_Tambahan, tbirigaspbuxxln.getInformasi_Tambahan());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbirigaspbuxxln.getId()) };
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
            TBIRIGASPBUXXLN tbirigaspbuxxln= (TBIRIGASPBUXXLN) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbirigaspbuxxln.getId()) };
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
                TBIRIGASPBUXXLN tbirigaspbuxxln = null;
                if (cur.moveToFirst()) {
                    do {
                        tbirigaspbuxxln = new TBIRIGASPBUXXLN();
                        //FCIRIGAPBWPRILN = new fcirigapbwpriln();
                        //myLayer = new MyLayer();
                        tbirigaspbuxxln.setId(cur.getInt(0));
                        tbirigaspbuxxln.setKodeaset(cur.getInt(1));
                        tbirigaspbuxxln.setNama_Jaringan_Irigasi(cur.getInt(2));
                        tbirigaspbuxxln.setNama_Saluran_Pembuang(cur.getInt(3));
                        tbirigaspbuxxln.setKondisi(cur.getString(4));
                        tbirigaspbuxxln.setInformasi_Tambahan(cur.getString(5));
                        data.add(returnTypeClass.cast(tbirigaspbuxxln));
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
