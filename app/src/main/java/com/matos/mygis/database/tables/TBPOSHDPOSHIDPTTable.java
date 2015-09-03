package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.TBKNSRVCEKDAMPT;
import com.matos.mygis.database.models.TBPOSHDPOSHIDPT;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Qaccipinho on 08/07/2015.
 */
public class TBPOSHDPOSHIDPTTable implements  AppTable {

    private static final String TAG = "TBPOSHDPOSHIDPTTable";

    private static final String TABLE_NAME = "TBPOSHDPOSHIDPT";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";

    private static final String Nama_Pos_Hidrologi = "Nama_Pos_Hidrologi";
    private static final String Kondisi_Bangunan = "Kondisi_Bangunan";
    private static final String Kondisi_Solar_Panel = "Kondisi_Solar_Panel";
    private static final String Kondisi_Aki = "Kondisi_Aki";
    private static final String Kondisi_Charger_Controller = "Kondisi_Charger_Controller";
    private static final String Kondisi_GSM_Modem_Antena = "Kondisi_GSM_Modem_Antena";
    private static final String Kondisi_GPRS_Modem_Antena = "Kondisi_GPRS_Modem_Antena";
    private static final String Kondisi_Data_Logger = "Kondisi_Data_Logger";
    private static final String Kondisi_Sensor_Curah_Hujan = "Kondisi_Sensor_Curah_Hujan";
    private static final String Kondisi_Sensor_Tinggi_Muka_Air = "Kondisi_Sensor_Tinggi_Muka_Air";
    private static final String Kondisi_Sensor_Suhu_Udara = "Kondisi_Sensor_Suhu_Udara";
    private static final String Kondisi_Sensor_Tekanan_Udara = "Kondisi_Sensor_Tekanan_Udara";
    private static final String Kondisi_Sensor_Kelembaban_Udara = "Kondisi_Sensor_Kelembaban_Udara";
    private static final String Kondisi_Sensor_Arah_Angin = "Kondisi_Sensor_Arah_Angin";
    private static final String Kondisi_Sensor_Kecepatan_Angin = "Kondisi_Sensor_Kecepatan_Angin";
    private static final String Kondisi_Sensor_Radiasi_Matahari = "Kondisi_Sensor_Radiasi_Matahari";
    private static final String Kondisi_Sensor_pH = "Kondisi_Sensor_pH";
    private static final String Kondisi_Sensor_Kekeruhan = "Kondisi_Sensor_Kekeruhan";
    private static final String Kondisi_Sensor_Oksigen_Terlarut = "Kondisi_Sensor_Oksigen_Terlarut";
    private static final String Kondisi_Sensor_Konduktivitas = "Kondisi_Sensor_Konduktivitas";
    private static final String Informasi_Tambahan = "Informasi_Tambahan";


    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"

                    + "," + Nama_Pos_Hidrologi + " integer null"
                    + "," + Kondisi_Bangunan + " text null"
                    + "," + Kondisi_Solar_Panel + " text null"
                    + "," + Kondisi_Aki + " text null"
                    + "," + Kondisi_Charger_Controller + " text null"
                    + "," + Kondisi_GSM_Modem_Antena + " text null"
                    + "," + Kondisi_GPRS_Modem_Antena + " text null"
                    + "," + Kondisi_Data_Logger + " text null"
                    + "," + Kondisi_Sensor_Curah_Hujan + " text null"
                    + "," + Kondisi_Sensor_Tinggi_Muka_Air + " text null"
                    + "," + Kondisi_Sensor_Suhu_Udara + " text null"
                    + "," + Kondisi_Sensor_Tekanan_Udara + " text null"
                    + "," + Kondisi_Sensor_Kelembaban_Udara + " text null"
                    + "," + Kondisi_Sensor_Arah_Angin + " text null"
                    + "," + Kondisi_Sensor_Kecepatan_Angin + " text null"
                    + "," + Kondisi_Sensor_Radiasi_Matahari + " text null"
                    + "," + Kondisi_Sensor_pH + " text null"
                    + "," + Kondisi_Sensor_Kekeruhan + " text null"
                    + "," + Kondisi_Sensor_Oksigen_Terlarut + " text null"
                    + "," + Kondisi_Sensor_Konduktivitas + " text null"
                    + "," + Informasi_Tambahan + " text null"
                    + ")";

    private Context mContext;

    public TBPOSHDPOSHIDPTTable(Context pContext) {
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
            TBPOSHDPOSHIDPT tbposhdposhidpt= (TBPOSHDPOSHIDPT) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbposhdposhidpt.getOBJECTID());
            val.put(kodeaset, tbposhdposhidpt.getKodeaset());
            val.put(Nama_Pos_Hidrologi, tbposhdposhidpt.getNama_Pos_Hidrologi());
            val.put(Kondisi_Bangunan, tbposhdposhidpt.getKondisi_Bangunan());
            val.put(Kondisi_Solar_Panel, tbposhdposhidpt.getKondisi_Solar_Panel());
            val.put(Kondisi_Aki, tbposhdposhidpt.getKondisi_Aki());
            val.put(Kondisi_Charger_Controller, tbposhdposhidpt.getKondisi_Charger_Controller());
            val.put(Kondisi_GSM_Modem_Antena, tbposhdposhidpt.getKondisi_GSM_Modem_Antena());
            val.put(Kondisi_GPRS_Modem_Antena, tbposhdposhidpt.getKondisi_GPRS_Modem_Antena());
            val.put(Kondisi_Data_Logger, tbposhdposhidpt.getKondisi_Data_Logger());
            val.put(Kondisi_Sensor_Curah_Hujan, tbposhdposhidpt.getKondisi_Sensor_Curah_Hujan());
            val.put(Kondisi_Sensor_Tinggi_Muka_Air, tbposhdposhidpt.getKondisi_Sensor_Tinggi_Muka_Air());
            val.put(Kondisi_Sensor_Suhu_Udara, tbposhdposhidpt.getKondisi_Sensor_Suhu_Udara());
            val.put(Kondisi_Sensor_Tekanan_Udara, tbposhdposhidpt.getKondisi_Sensor_Tekanan_Udara());
            val.put(Kondisi_Sensor_Kelembaban_Udara, tbposhdposhidpt.getKondisi_Sensor_Kelembaban_Udara());
            val.put(Kondisi_Sensor_Arah_Angin, tbposhdposhidpt.getKondisi_Sensor_Arah_Angin());
            val.put(Kondisi_Sensor_Kecepatan_Angin, tbposhdposhidpt.getKondisi_Sensor_Kecepatan_Angin());
            val.put(Kondisi_Sensor_Radiasi_Matahari, tbposhdposhidpt.getKondisi_Sensor_Radiasi_Matahari());
            val.put(Kondisi_Sensor_pH, tbposhdposhidpt.getKondisi_Sensor_pH());
            val.put(Kondisi_Sensor_Kekeruhan, tbposhdposhidpt.getKondisi_Sensor_Kekeruhan());
            val.put(Kondisi_Sensor_Oksigen_Terlarut, tbposhdposhidpt.getKondisi_Sensor_Oksigen_Terlarut());
            val.put(Kondisi_Sensor_Konduktivitas, tbposhdposhidpt.getKondisi_Sensor_Konduktivitas());
            val.put(Informasi_Tambahan, tbposhdposhidpt.getInformasi_Tambahan());

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
            TBPOSHDPOSHIDPT tbposhdposhidpt= (TBPOSHDPOSHIDPT) data;
            ContentValues val = new ContentValues();
            val.put(Nama_Pos_Hidrologi, tbposhdposhidpt.getNama_Pos_Hidrologi());
            val.put(Kondisi_Bangunan, tbposhdposhidpt.getKondisi_Bangunan());
            val.put(Kondisi_Solar_Panel, tbposhdposhidpt.getKondisi_Solar_Panel());
            val.put(Kondisi_Aki, tbposhdposhidpt.getKondisi_Aki());
            val.put(Kondisi_Charger_Controller, tbposhdposhidpt.getKondisi_Charger_Controller());
            val.put(Kondisi_GSM_Modem_Antena, tbposhdposhidpt.getKondisi_GSM_Modem_Antena());
            val.put(Kondisi_GPRS_Modem_Antena, tbposhdposhidpt.getKondisi_GPRS_Modem_Antena());
            val.put(Kondisi_Data_Logger, tbposhdposhidpt.getKondisi_Data_Logger());
            val.put(Kondisi_Sensor_Curah_Hujan, tbposhdposhidpt.getKondisi_Sensor_Curah_Hujan());
            val.put(Kondisi_Sensor_Tinggi_Muka_Air, tbposhdposhidpt.getKondisi_Sensor_Tinggi_Muka_Air());
            val.put(Kondisi_Sensor_Suhu_Udara, tbposhdposhidpt.getKondisi_Sensor_Suhu_Udara());
            val.put(Kondisi_Sensor_Tekanan_Udara, tbposhdposhidpt.getKondisi_Sensor_Tekanan_Udara());
            val.put(Kondisi_Sensor_Kelembaban_Udara, tbposhdposhidpt.getKondisi_Sensor_Kelembaban_Udara());
            val.put(Kondisi_Sensor_Arah_Angin, tbposhdposhidpt.getKondisi_Sensor_Arah_Angin());
            val.put(Kondisi_Sensor_Kecepatan_Angin, tbposhdposhidpt.getKondisi_Sensor_Kecepatan_Angin());
            val.put(Kondisi_Sensor_Radiasi_Matahari, tbposhdposhidpt.getKondisi_Sensor_Radiasi_Matahari());
            val.put(Kondisi_Sensor_pH, tbposhdposhidpt.getKondisi_Sensor_pH());
            val.put(Kondisi_Sensor_Kekeruhan, tbposhdposhidpt.getKondisi_Sensor_Kekeruhan());
            val.put(Kondisi_Sensor_Oksigen_Terlarut, tbposhdposhidpt.getKondisi_Sensor_Oksigen_Terlarut());
            val.put(Kondisi_Sensor_Konduktivitas, tbposhdposhidpt.getKondisi_Sensor_Konduktivitas());
            val.put(Informasi_Tambahan, tbposhdposhidpt.getInformasi_Tambahan());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbposhdposhidpt.getId()) };
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
            TBPOSHDPOSHIDPT tbposhdposhidpt= (TBPOSHDPOSHIDPT) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbposhdposhidpt.getId()) };
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
                TBPOSHDPOSHIDPT tbposhdposhidpt = null;
                if (cur.moveToFirst()) {
                    do {
                        tbposhdposhidpt = new TBPOSHDPOSHIDPT();
                        //FCIRIGAPBWPRILN = new fcirigapbwpriln();
                        //myLayer = new MyLayer();
                        tbposhdposhidpt.setId(cur.getInt(0));
                        tbposhdposhidpt.setKodeaset(cur.getInt(1));

                        tbposhdposhidpt.setNama_Pos_Hidrologi(cur.getInt(2));
                        tbposhdposhidpt.setKondisi_Bangunan(cur.getString(3));
                        tbposhdposhidpt.setKondisi_Solar_Panel(cur.getString(4));
                        tbposhdposhidpt.setKondisi_Aki(cur.getString(5));
                        tbposhdposhidpt.setKondisi_Charger_Controller(cur.getString(6));
                        tbposhdposhidpt.setKondisi_GSM_Modem_Antena(cur.getString(7));
                        tbposhdposhidpt.setKondisi_GPRS_Modem_Antena(cur.getString(8));
                        tbposhdposhidpt.setKondisi_Data_Logger(cur.getString(9));
                        tbposhdposhidpt.setKondisi_Sensor_Curah_Hujan(cur.getString(10));
                        tbposhdposhidpt.setKondisi_Sensor_Tinggi_Muka_Air(cur.getString(11));
                        tbposhdposhidpt.setKondisi_Sensor_Suhu_Udara(cur.getString(12));
                        tbposhdposhidpt.setKondisi_Sensor_Tekanan_Udara(cur.getString(13));
                        tbposhdposhidpt.setKondisi_Sensor_Kelembaban_Udara(cur.getString(14));
                        tbposhdposhidpt.setKondisi_Sensor_Arah_Angin(cur.getString(15));
                        tbposhdposhidpt.setKondisi_Sensor_Kecepatan_Angin(cur.getString(16));
                        tbposhdposhidpt.setKondisi_Sensor_Radiasi_Matahari(cur.getString(17));
                        tbposhdposhidpt.setKondisi_Sensor_pH(cur.getString(18));
                        tbposhdposhidpt.setKondisi_Sensor_Kekeruhan(cur.getString(19));
                        tbposhdposhidpt.setKondisi_Sensor_Oksigen_Terlarut(cur.getString(20));
                        tbposhdposhidpt.setKondisi_Sensor_Konduktivitas(cur.getString(21));
                        tbposhdposhidpt.setInformasi_Tambahan(cur.getString(22));
                        data.add(returnTypeClass.cast(tbposhdposhidpt));
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
