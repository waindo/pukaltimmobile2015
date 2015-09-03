package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;

import com.matos.mygis.database.models.FCPNTAIPENGMNLN;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sihendri on 08/07/2015.
 */
public class FCPNTAIPENGMNLNTable implements AppTable {
    private static final String TAG = "FCPNTAIPENGMNLNTable";

    private static final String TABLE_NAME = "FCPNTAIPENGMNLN";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";
    private static final String Nama_Pengaman_Pantai = "Nama_Pengaman_Pantai";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"
                    + "," + Nama_Pengaman_Pantai + " integer null"
                    + ")";

    private Context mContext;

    public FCPNTAIPENGMNLNTable(Context pContext) {
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
            FCPNTAIPENGMNLN fcpntaipengmnln = (FCPNTAIPENGMNLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcpntaipengmnln.getOBJECTID());
            val.put(kodeaset, fcpntaipengmnln.getKodeaset());
            val.put(Nama_Pengaman_Pantai, fcpntaipengmnln.getNama_Pengaman_Pantai());
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
            FCPNTAIPENGMNLN fcpntaipengmnln = (FCPNTAIPENGMNLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcpntaipengmnln.getOBJECTID());
            val.put(kodeaset, fcpntaipengmnln.getKodeaset());
            val.put(Nama_Pengaman_Pantai, fcpntaipengmnln.getNama_Pengaman_Pantai());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcpntaipengmnln.getId()) };
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
            FCPNTAIPENGMNLN fcpntaipengmnln = (FCPNTAIPENGMNLN) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcpntaipengmnln.getId()) };
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
                FCPNTAIPENGMNLN fcpntaipengmnln = null;
                if (cur.moveToFirst()) {
                    do {
                        fcpntaipengmnln = new FCPNTAIPENGMNLN();
                        fcpntaipengmnln.setId(cur.getInt(0));
                        fcpntaipengmnln.setOBJECTID(cur.getInt(1));
                        fcpntaipengmnln.setKodeaset(cur.getInt(2));
                        fcpntaipengmnln.setNama_Pengaman_Pantai(cur.getInt(3));
                        data.add(returnTypeClass.cast(fcpntaipengmnln));
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
