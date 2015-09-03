package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.FCPBJRXSALPRMLN;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sihendri on 08/07/2015.
 */
public class FCPBJRXSALPRMLNTable implements AppTable {

    private static final String TAG = "FCPBJRXSALPRMLNTable";

    private static final String TABLE_NAME = "FCPBJRXSALPRMLN";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";
    private static final String Nama_Sistem_Pengendalian_Banjir = "Nama_Sistem_Pengendalian_Banjir";
    private static final String Nama_Saluran = "Nama_Saluran";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"
                    + "," + Nama_Sistem_Pengendalian_Banjir + " integer null"
                    + "," + Nama_Saluran + " string null"
                    + ")";

    private Context mContext;

    public FCPBJRXSALPRMLNTable(Context pContext) {
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
            FCPBJRXSALPRMLN fcpbjrxsalprmln = (FCPBJRXSALPRMLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcpbjrxsalprmln.getOBJECTID());
            val.put(kodeaset, fcpbjrxsalprmln.getKodeaset());
            val.put(Nama_Sistem_Pengendalian_Banjir, fcpbjrxsalprmln.getNama_Sistem_Pengendalian_Banjir());
            val.put(Nama_Saluran, fcpbjrxsalprmln.getNama_Saluran());
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
            FCPBJRXSALPRMLN fcpbjrxsalprmln = (FCPBJRXSALPRMLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcpbjrxsalprmln.getOBJECTID());
            val.put(kodeaset, fcpbjrxsalprmln.getKodeaset());
            val.put(Nama_Sistem_Pengendalian_Banjir, fcpbjrxsalprmln.getNama_Sistem_Pengendalian_Banjir());
            val.put(Nama_Saluran, fcpbjrxsalprmln.getNama_Saluran());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcpbjrxsalprmln.getId()) };
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
            FCPBJRXSALPRMLN fcpbjrxsalprmln = (FCPBJRXSALPRMLN) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcpbjrxsalprmln.getId()) };
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
                FCPBJRXSALPRMLN fcpbjrxsalprmln = null;
                if (cur.moveToFirst()) {
                    do {
                        fcpbjrxsalprmln = new FCPBJRXSALPRMLN();
                        fcpbjrxsalprmln.setId(cur.getInt(0));
                        fcpbjrxsalprmln.setOBJECTID(cur.getInt(1));
                        fcpbjrxsalprmln.setKodeaset(cur.getInt(2));
                        fcpbjrxsalprmln.setNama_Sistem_Pengendalian_Banjir(cur.getInt(3));
                        fcpbjrxsalprmln.setNama_Saluran(cur.getString(4));
                        data.add(returnTypeClass.cast(fcpbjrxsalprmln));
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
