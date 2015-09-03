package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.TBIRIGATANGGULN;
import com.matos.mygis.database.models.TBKNSRVCEKDAMPT;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Qaccipinho on 08/07/2015.
 */
public class TBKNSRVCEKDAMPTTable implements AppTable {

    private static final String TAG = "TBKNSRVCEKDAMPTTable";

    private static final String TABLE_NAME = "TBKNSRVCEKDAMPT";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";

    private static final String Nama_Cek_Dam = "Nama_Cek_Dam";
    private static final String Kondisi_Mercu = "Kondisi_Mercu";
    private static final String Kondisi_Dinding_Cekdam = "Kondisi_Dinding_Cekdam";
    private static final String Kondisi_Lantai_Apron = "Kondisi_Lantai_Apron";
    private static final String Kondisi_Kolam_Olak = "Kondisi_Kolam_Olak";
    private static final String Kondisi_Peredam_Energi = "Kondisi_Peredam_Energi";
    private static final String Kondisi_Tebing_Hilir = "Kondisi_Tebing_Hilir";
    private static final String Informasi_Tambahan = "Informasi_Tambahan";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"

                    + "," + Nama_Cek_Dam + " integer null"
                    + "," + Kondisi_Mercu + " text null"
                    + "," + Kondisi_Dinding_Cekdam + " text null"
                    + "," + Kondisi_Lantai_Apron + " text null"
                    + "," + Kondisi_Kolam_Olak + " text null"
                    + "," + Kondisi_Peredam_Energi + " text null"
                    + "," + Kondisi_Tebing_Hilir + " text null"
                    + "," + Informasi_Tambahan + " text null"
                    + ")";

    private Context mContext;

    public TBKNSRVCEKDAMPTTable(Context pContext) {
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
            TBKNSRVCEKDAMPT tbknsrvcekdampt= (TBKNSRVCEKDAMPT) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbknsrvcekdampt.getOBJECTID());
            val.put(kodeaset, tbknsrvcekdampt.getKodeaset());
            val.put(Nama_Cek_Dam, tbknsrvcekdampt.getNama_Cek_Dam());
            val.put(Kondisi_Mercu, tbknsrvcekdampt.getKondisi_Mercu());
            val.put(Kondisi_Dinding_Cekdam, tbknsrvcekdampt.getKondisi_Dinding_Cekdam());
            val.put(Kondisi_Lantai_Apron, tbknsrvcekdampt.getKondisi_Lantai_Apron());
            val.put(Kondisi_Kolam_Olak, tbknsrvcekdampt.getKondisi_Kolam_Olak());
            val.put(Kondisi_Peredam_Energi, tbknsrvcekdampt.getKondisi_Peredam_Energi());
            val.put(Kondisi_Tebing_Hilir, tbknsrvcekdampt.getKondisi_Tebing_Hilir());
            val.put(Informasi_Tambahan, tbknsrvcekdampt.getInformasi_Tambahan());
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
            TBKNSRVCEKDAMPT tbknsrvcekdampt= (TBKNSRVCEKDAMPT) data;
            ContentValues val = new ContentValues();
            val.put(Nama_Cek_Dam, tbknsrvcekdampt.getNama_Cek_Dam());
            val.put(Kondisi_Mercu, tbknsrvcekdampt.getKondisi_Mercu());
            val.put(Kondisi_Dinding_Cekdam, tbknsrvcekdampt.getKondisi_Dinding_Cekdam());
            val.put(Kondisi_Lantai_Apron, tbknsrvcekdampt.getKondisi_Lantai_Apron());
            val.put(Kondisi_Kolam_Olak, tbknsrvcekdampt.getKondisi_Kolam_Olak());
            val.put(Kondisi_Peredam_Energi, tbknsrvcekdampt.getKondisi_Peredam_Energi());
            val.put(Kondisi_Tebing_Hilir, tbknsrvcekdampt.getKondisi_Tebing_Hilir());
            val.put(Informasi_Tambahan, tbknsrvcekdampt.getInformasi_Tambahan());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbknsrvcekdampt.getId()) };
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
            TBKNSRVCEKDAMPT tbknsrvcekdampt= (TBKNSRVCEKDAMPT) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbknsrvcekdampt.getId()) };
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
                TBKNSRVCEKDAMPT tbknsrvcekdampt = null;
                if (cur.moveToFirst()) {
                    do {
                        tbknsrvcekdampt = new TBKNSRVCEKDAMPT();
                        //FCIRIGAPBWPRILN = new fcirigapbwpriln();
                        //myLayer = new MyLayer();
                        tbknsrvcekdampt.setId(cur.getInt(0));
                        tbknsrvcekdampt.setKodeaset(cur.getInt(1));
                        tbknsrvcekdampt.setNama_Cek_Dam(cur.getInt(2));
                        tbknsrvcekdampt.setKondisi_Mercu(cur.getString(3));
                        tbknsrvcekdampt.setKondisi_Dinding_Cekdam(cur.getString(4));
                        tbknsrvcekdampt.setKondisi_Lantai_Apron(cur.getString(5));
                        tbknsrvcekdampt.setKondisi_Kolam_Olak(cur.getString(6));
                        tbknsrvcekdampt.setKondisi_Peredam_Energi(cur.getString(7));
                        tbknsrvcekdampt.setKondisi_Tebing_Hilir(cur.getString(8));
                        tbknsrvcekdampt.setInformasi_Tambahan(cur.getString(9));
                        data.add(returnTypeClass.cast(tbknsrvcekdampt));
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
