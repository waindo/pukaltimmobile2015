package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;


import com.matos.mygis.database.models.TBBGNTMEMBUNGPT;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sihendri on 09/07/2015.
 */
public class TBBGNTMEMBUNGPTTable implements AppTable {

    private static final String TAG = "TBBGNTMEMBUNGPTTable";

    private static final String TABLE_NAME = "TBBGNTMEMBUNGPT";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";

    private static final String Nama_Embung = "Nama_Embung";
    private static final String Tinggi_Muka_Air_Embung = "Tinggi_Muka_Air_Embung";

    private static final String Kondisi_Tubuh_Embung = "Kondisi_Tubuh_Embung";
    private static final String Kondisi_Saluran_Pelimpah = "Kondisi_Saluran_Pelimpah";
    private static final String Kondisi_Mercu = "Kondisi_Mercu";
    private static final String Kondisi_Pintu_Intake = "Kondisi_Pintu_Intake";
    private static final String Kondisi_Pintu_Pembilas = "Kondisi_Pintu_Pembilas";
    private static final String Kondisi_Lantai_Apron = "Kondisi_Lantai_Apron";
    private static final String Kondisi_Tanggul = "Kondisi_Tanggul";
    private static final String Kondisi_Peredam_Energi = "Kondisi_Peredam_Energi";
    private static final String Kondisi_Kolam_Olak = "Kondisi_Kolam_Olak";
    private static final String Kondisi_Generator_PLTMH = "Kondisi_Generator_PLTMH";
    private static final String Kondisi_Pompa_Intake = "Kondisi_Pompa_Intake";
    private static final String Kondisi_Jembatan = "Kondisi_Jembatan";
    private static final String Informasi_Tambahan = "Informasi_Tambahan";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"
                    + "," + Nama_Embung + " integer null"
                    + "," + Tinggi_Muka_Air_Embung + " integer null"
                    + "," + Kondisi_Tubuh_Embung + " integer null"
                    + "," + Kondisi_Saluran_Pelimpah + " integer null"
                    + "," + Kondisi_Mercu + " integer null"
                    + "," + Kondisi_Pintu_Intake + " integer null"
                    + "," + Kondisi_Pintu_Pembilas + " integer null"
                    + "," + Kondisi_Lantai_Apron + " integer null"
                    + "," + Kondisi_Tanggul + " integer null"
                    + "," + Kondisi_Peredam_Energi + " integer null"
                    + "," + Kondisi_Kolam_Olak + " integer null"
                    + "," + Kondisi_Generator_PLTMH + " integer null"
                    + "," + Kondisi_Pompa_Intake + " integer null"
                    + "," + Kondisi_Jembatan + " integer null"
                    + "," + Informasi_Tambahan + " integer null"
                    + ")";

    private Context mContext;

    public TBBGNTMEMBUNGPTTable(Context pContext) {
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
            TBBGNTMEMBUNGPT tbbgntmembungpt = (TBBGNTMEMBUNGPT) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbbgntmembungpt.getOBJECTID());
            val.put(kodeaset, tbbgntmembungpt.getKodeaset());
            val.put(Nama_Embung, tbbgntmembungpt.getNama_Embung());
            val.put(Tinggi_Muka_Air_Embung, tbbgntmembungpt.getTinggi_Muka_Air_Embung());
            val.put(Kondisi_Tubuh_Embung, tbbgntmembungpt.getKondisi_Tubuh_Embung());
            val.put(Kondisi_Saluran_Pelimpah, tbbgntmembungpt.getKondisi_Saluran_Pelimpah());
            val.put(Kondisi_Mercu, tbbgntmembungpt.getKondisi_Mercu());
            val.put(Kondisi_Pintu_Intake, tbbgntmembungpt.getKondisi_Pintu_Intake());
            val.put(Kondisi_Pintu_Pembilas, tbbgntmembungpt.getKondisi_Pintu_Pembilas());
            val.put(Kondisi_Lantai_Apron, tbbgntmembungpt.getKondisi_Lantai_Apron());
            val.put(Kondisi_Tanggul, tbbgntmembungpt.getKondisi_Tanggul());
            val.put(Kondisi_Peredam_Energi, tbbgntmembungpt.getKondisi_Peredam_Energi());
            val.put(Kondisi_Kolam_Olak, tbbgntmembungpt.getKondisi_Kolam_Olak());
            val.put(Kondisi_Generator_PLTMH, tbbgntmembungpt.getKondisi_Generator_PLTMH());
            val.put(Kondisi_Pompa_Intake, tbbgntmembungpt.getKondisi_Pompa_Intake());
            val.put(Kondisi_Jembatan, tbbgntmembungpt.getKondisi_Jembatan());
            val.put(Informasi_Tambahan, tbbgntmembungpt.getInformasi_Tambahan());

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
            TBBGNTMEMBUNGPT tbbgntmembungpt = (TBBGNTMEMBUNGPT) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbbgntmembungpt.getOBJECTID());
            val.put(kodeaset, tbbgntmembungpt.getKodeaset());
            val.put(Nama_Embung, tbbgntmembungpt.getNama_Embung());
            val.put(Tinggi_Muka_Air_Embung, tbbgntmembungpt.getTinggi_Muka_Air_Embung());
            val.put(Kondisi_Tubuh_Embung, tbbgntmembungpt.getKondisi_Tubuh_Embung());
            val.put(Kondisi_Saluran_Pelimpah, tbbgntmembungpt.getKondisi_Saluran_Pelimpah());
            val.put(Kondisi_Mercu, tbbgntmembungpt.getKondisi_Mercu());
            val.put(Kondisi_Pintu_Intake, tbbgntmembungpt.getKondisi_Pintu_Intake());
            val.put(Kondisi_Pintu_Pembilas, tbbgntmembungpt.getKondisi_Pintu_Pembilas());
            val.put(Kondisi_Lantai_Apron, tbbgntmembungpt.getKondisi_Lantai_Apron());
            val.put(Kondisi_Tanggul, tbbgntmembungpt.getKondisi_Tanggul());
            val.put(Kondisi_Peredam_Energi, tbbgntmembungpt.getKondisi_Peredam_Energi());
            val.put(Kondisi_Kolam_Olak, tbbgntmembungpt.getKondisi_Kolam_Olak());
            val.put(Kondisi_Generator_PLTMH, tbbgntmembungpt.getKondisi_Generator_PLTMH());
            val.put(Kondisi_Pompa_Intake, tbbgntmembungpt.getKondisi_Pompa_Intake());
            val.put(Kondisi_Jembatan, tbbgntmembungpt.getKondisi_Jembatan());
            val.put(Informasi_Tambahan, tbbgntmembungpt.getInformasi_Tambahan());

            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbbgntmembungpt.getId()) };
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
            TBBGNTMEMBUNGPT tbbgntmembungpt = (TBBGNTMEMBUNGPT) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbbgntmembungpt.getId()) };
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
                TBBGNTMEMBUNGPT tbbgntmembungpt = null;
                if (cur.moveToFirst()) {
                    do {
                        tbbgntmembungpt = new TBBGNTMEMBUNGPT();
                        tbbgntmembungpt.setId(cur.getInt(0));
                        tbbgntmembungpt.setOBJECTID(cur.getInt(1));
                        tbbgntmembungpt.setKodeaset(cur.getInt(2));
                        tbbgntmembungpt.setNama_Embung(cur.getInt(3));
                        tbbgntmembungpt.setTinggi_Muka_Air_Embung(cur.getInt(4));
                        tbbgntmembungpt.setKondisi_Tubuh_Embung(cur.getString(5));
                        tbbgntmembungpt.setKondisi_Saluran_Pelimpah(cur.getString(6));
                        tbbgntmembungpt.setKondisi_Mercu(cur.getString(7));
                        tbbgntmembungpt.setKondisi_Pintu_Intake(cur.getString(8));
                        tbbgntmembungpt.setKondisi_Pintu_Pembilas(cur.getString(9));
                        tbbgntmembungpt.setKondisi_Lantai_Apron(cur.getString(10));
                        tbbgntmembungpt.setKondisi_Tanggul(cur.getString(11));
                        tbbgntmembungpt.setKondisi_Peredam_Energi(cur.getString(12));
                        tbbgntmembungpt.setKondisi_Kolam_Olak(cur.getString(13));
                        tbbgntmembungpt.setKondisi_Generator_PLTMH(cur.getString(14));
                        tbbgntmembungpt.setKondisi_Pompa_Intake(cur.getString(15));
                        tbbgntmembungpt.setKondisi_Jembatan(cur.getString(16));
                        tbbgntmembungpt.setInformasi_Tambahan(cur.getString(17));

                        data.add(returnTypeClass.cast(tbbgntmembungpt));
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
