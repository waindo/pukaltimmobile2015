package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;

import com.matos.mygis.database.models.FCPBJRXSALGORLN;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sihendri on 03/07/2015.
 */
public class FCPBJRXSALGORLNTable implements AppTable {

    private static final String TAG = "FCPBJRXSALGORLNTable";

    private static final String TABLE_NAME = "FCPBJRXSALGORLN";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";
    private static final String Nama_Sistem_Pengendalian_Banjir = "Nama_Sistem_Pengendalian_Banjir";
    private static final String Nama_GorongGorong = "Nama_GorongGorong";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"
                    + "," + Nama_Sistem_Pengendalian_Banjir + " integer null"
                    + "," + Nama_GorongGorong + " string null"
                    + ")";

    private Context mContext;

    public FCPBJRXSALGORLNTable(Context pContext) {
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
            FCPBJRXSALGORLN fcpbjrxsalgorln = (FCPBJRXSALGORLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcpbjrxsalgorln.getOBJECTID());
            val.put(kodeaset, fcpbjrxsalgorln.getKodeaset());
            val.put(Nama_Sistem_Pengendalian_Banjir, fcpbjrxsalgorln.getNama_Sistem_Pengendalian_Banjir());
            val.put(Nama_GorongGorong, fcpbjrxsalgorln.getNama_GorongGorong());
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
            FCPBJRXSALGORLN fcpbjrxsalgorln = (FCPBJRXSALGORLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcpbjrxsalgorln.getOBJECTID());
            val.put(kodeaset, fcpbjrxsalgorln.getKodeaset());
            val.put(Nama_Sistem_Pengendalian_Banjir, fcpbjrxsalgorln.getNama_Sistem_Pengendalian_Banjir());
            val.put(Nama_GorongGorong, fcpbjrxsalgorln.getNama_GorongGorong());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcpbjrxsalgorln.getId()) };
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
            FCPBJRXSALGORLN fcpbjrxsalgorln = (FCPBJRXSALGORLN) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcpbjrxsalgorln.getId()) };
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
                FCPBJRXSALGORLN fcpbjrxsalgorln = null;
                if (cur.moveToFirst()) {
                    do {
                        fcpbjrxsalgorln = new FCPBJRXSALGORLN();
                        fcpbjrxsalgorln.setId(cur.getInt(0));
                        fcpbjrxsalgorln.setOBJECTID(cur.getInt(1));
                        fcpbjrxsalgorln.setKodeaset(cur.getInt(2));
                        fcpbjrxsalgorln.setNama_Sistem_Pengendalian_Banjir(cur.getInt(3));
                        fcpbjrxsalgorln.setNama_GorongGorong(cur.getString(4));
                        data.add(returnTypeClass.cast(fcpbjrxsalgorln));
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
