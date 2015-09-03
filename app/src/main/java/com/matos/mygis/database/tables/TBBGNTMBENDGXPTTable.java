package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;

import com.matos.mygis.database.models.TBBGNTMBENDGXPT;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sihendri on 08/07/2015.
 */
public class TBBGNTMBENDGXPTTable implements AppTable {

    private static final String TAG = "TBBGNTMBENDGXPTTable";

    private static final String TABLE_NAME = "TBBGNTMBENDGXPT";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";
    private static final String Nama_Bendungan = "Nama_Bendungan";
    private static final String Tinggi_Muka_Air_Bendung = "Tinggi_Muka_Air_Bendung";
    private static final String Kondisi_Mercu = "Kondisi_Mercu";
    private static final String Kondisi_Pintu_Intake = "Kondisi_Pintu_Intake";
    private static final String Kondisi_Pintu_Pembilas = "Kondisi_Pintu_Pembilas";
    private static final String Kondisi_Dinding_Bendung = "Kondisi_Dinding_Bendung";
    private static final String Kondisi_Lantai_Apron = "Kondisi_Lantai_Apron";
    private static final String Kondisi_Kolam_Olak = "Kondisi_Kolam_Olak";
    private static final String Kondisi_Tebing_Hilir = "Kondisi_Tebing_Hilir";
    private static final String Kondisi_Peredam_Energi = "Kondisi_Peredam_Energi";
    private static final String Kondisi_Tanggul = "Kondisi_Tanggul";
    private static final String Kondisi_Pintu_Gerak = "Kondisi_Pintu_Gerak";
    private static final String Kondisi_Generator_PLTMH = "Kondisi_Generator_PLTMH";
    private static final String Kondisi_Pompa_Intake = "Kondisi_Pompa_Intake";
    private static final String Kondisi_Jembatan = "Kondisi_Jembatan";
    private static final String Informasi_Tambahan = "Informasi_Tambahan";


    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"
                    + "," + Nama_Bendungan + " integer null"
                    + "," + Tinggi_Muka_Air_Bendung + " integer null"
                    + "," + Kondisi_Mercu + " integer null"
                    + "," + Kondisi_Pintu_Intake + " integer null"
                    + "," + Kondisi_Pintu_Pembilas + " integer null"
                    + "," + Kondisi_Dinding_Bendung + " integer null"
                    + "," + Kondisi_Lantai_Apron + " integer null"
                    + "," + Kondisi_Kolam_Olak + " integer null"
                    + "," + Kondisi_Tebing_Hilir + " integer null"
                    + "," + Kondisi_Peredam_Energi + " integer null"
                    + "," + Kondisi_Tanggul + " integer null"
                    + "," + Kondisi_Pintu_Gerak + " integer null"
                    + "," + Kondisi_Generator_PLTMH + " integer null"
                    + "," + Kondisi_Pompa_Intake + " integer null"
                    + "," + Kondisi_Jembatan + " integer null"
                    + "," + Informasi_Tambahan + " integer null"
                    + ")";

    private Context mContext;

    public TBBGNTMBENDGXPTTable(Context pContext) {
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
            TBBGNTMBENDGXPT tbbgntmbendgxpt = (TBBGNTMBENDGXPT) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbbgntmbendgxpt.getOBJECTID());
            val.put(kodeaset, tbbgntmbendgxpt.getKodeaset());
            val.put(Nama_Bendungan, tbbgntmbendgxpt.getNama_Bendungan());
            val.put(Tinggi_Muka_Air_Bendung, tbbgntmbendgxpt.getTinggi_Muka_Air_Bendung());
            val.put(Kondisi_Mercu, tbbgntmbendgxpt.getKondisi_Mercu());
            val.put(Kondisi_Pintu_Intake, tbbgntmbendgxpt.getKondisi_Pintu_Intake());
            val.put(Kondisi_Pintu_Pembilas, tbbgntmbendgxpt.getKondisi_Pintu_Pembilas());
            val.put(Kondisi_Dinding_Bendung, tbbgntmbendgxpt.getKondisi_Dinding_Bendung());
            val.put(Kondisi_Lantai_Apron, tbbgntmbendgxpt.getKondisi_Lantai_Apron());
            val.put(Kondisi_Kolam_Olak, tbbgntmbendgxpt.getKondisi_Kolam_Olak());
            val.put(Kondisi_Tebing_Hilir, tbbgntmbendgxpt.getKondisi_Tebing_Hilir());
            val.put(Kondisi_Peredam_Energi, tbbgntmbendgxpt.getKondisi_Peredam_Energi());
            val.put(Kondisi_Tanggul, tbbgntmbendgxpt.getKondisi_Tanggul());
            val.put(Kondisi_Pintu_Gerak, tbbgntmbendgxpt.getKondisi_Pintu_Gerak());
            val.put(Kondisi_Generator_PLTMH, tbbgntmbendgxpt.getKondisi_Generator_PLTMH());
            val.put(Kondisi_Pompa_Intake, tbbgntmbendgxpt.getKondisi_Pompa_Intake());
            val.put(Kondisi_Jembatan, tbbgntmbendgxpt.getKondisi_Jembatan());
            val.put(Informasi_Tambahan, tbbgntmbendgxpt.getInformasi_Tambahan());

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
            TBBGNTMBENDGXPT tbbgntmbendgxpt = (TBBGNTMBENDGXPT) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbbgntmbendgxpt.getOBJECTID());
            val.put(kodeaset, tbbgntmbendgxpt.getKodeaset());
            val.put(Nama_Bendungan, tbbgntmbendgxpt.getNama_Bendungan());
            val.put(Tinggi_Muka_Air_Bendung, tbbgntmbendgxpt.getTinggi_Muka_Air_Bendung());
            val.put(Kondisi_Mercu, tbbgntmbendgxpt.getKondisi_Mercu());
            val.put(Kondisi_Pintu_Intake, tbbgntmbendgxpt.getKondisi_Pintu_Intake());
            val.put(Kondisi_Pintu_Pembilas, tbbgntmbendgxpt.getKondisi_Pintu_Pembilas());
            val.put(Kondisi_Dinding_Bendung, tbbgntmbendgxpt.getKondisi_Dinding_Bendung());
            val.put(Kondisi_Lantai_Apron, tbbgntmbendgxpt.getKondisi_Lantai_Apron());
            val.put(Kondisi_Kolam_Olak, tbbgntmbendgxpt.getKondisi_Kolam_Olak());
            val.put(Kondisi_Tebing_Hilir, tbbgntmbendgxpt.getKondisi_Tebing_Hilir());
            val.put(Kondisi_Peredam_Energi, tbbgntmbendgxpt.getKondisi_Peredam_Energi());
            val.put(Kondisi_Tanggul, tbbgntmbendgxpt.getKondisi_Tanggul());
            val.put(Kondisi_Pintu_Gerak, tbbgntmbendgxpt.getKondisi_Pintu_Gerak());
            val.put(Kondisi_Generator_PLTMH, tbbgntmbendgxpt.getKondisi_Generator_PLTMH());
            val.put(Kondisi_Pompa_Intake, tbbgntmbendgxpt.getKondisi_Pompa_Intake());
            val.put(Kondisi_Jembatan, tbbgntmbendgxpt.getKondisi_Jembatan());
            val.put(Informasi_Tambahan, tbbgntmbendgxpt.getInformasi_Tambahan());

            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbbgntmbendgxpt.getId()) };
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
            TBBGNTMBENDGXPT tbbgntmbendgxpt = (TBBGNTMBENDGXPT) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbbgntmbendgxpt.getId()) };
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
                TBBGNTMBENDGXPT tbbgntmbendgxpt = null;
                if (cur.moveToFirst()) {
                    do {
                        tbbgntmbendgxpt = new TBBGNTMBENDGXPT();
                        tbbgntmbendgxpt.setId(cur.getInt(0));
                        tbbgntmbendgxpt.setOBJECTID(cur.getInt(1));
                        tbbgntmbendgxpt.setKodeaset(cur.getInt(2));
                        tbbgntmbendgxpt.setNama_Bendungan(cur.getInt(3));
                        tbbgntmbendgxpt.setTinggi_Muka_Air_Bendung(cur.getInt(4));
                        tbbgntmbendgxpt.setKondisi_Mercu(cur.getString(5));
                        tbbgntmbendgxpt.setKondisi_Pintu_Intake(cur.getString(6));
                        tbbgntmbendgxpt.setKondisi_Pintu_Pembilas(cur.getString(7));
                        tbbgntmbendgxpt.setKondisi_Dinding_Bendung(cur.getString(8));
                        tbbgntmbendgxpt.setKondisi_Lantai_Apron(cur.getString(9));
                        tbbgntmbendgxpt.setKondisi_Kolam_Olak(cur.getString(10));
                        tbbgntmbendgxpt.setKondisi_Tebing_Hilir(cur.getString(11));
                        tbbgntmbendgxpt.setKondisi_Peredam_Energi(cur.getString(12));
                        tbbgntmbendgxpt.setKondisi_Tanggul(cur.getString(13));
                        tbbgntmbendgxpt.setKondisi_Pintu_Gerak(cur.getString(14));
                        tbbgntmbendgxpt.setKondisi_Generator_PLTMH(cur.getString(15));
                        tbbgntmbendgxpt.setKondisi_Pompa_Intake(cur.getString(16));
                        tbbgntmbendgxpt.setKondisi_Jembatan(cur.getString(17));
                        tbbgntmbendgxpt.setInformasi_Tambahan(cur.getString(18));
                        data.add(returnTypeClass.cast(tbbgntmbendgxpt));
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
