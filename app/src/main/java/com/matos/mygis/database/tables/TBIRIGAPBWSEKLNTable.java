package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;
import com.matos.mygis.database.models.FCIRIGASPBUXXLN;
import com.matos.mygis.database.models.TBIRIGAPBWPRILN;
import com.matos.mygis.database.models.TBIRIGAPBWSEKLN;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Qaccipinho on 07/07/2015.
 */
public class TBIRIGAPBWSEKLNTable implements AppTable {


    private static final String TAG = "TBIRIGAPBWSEKLNTable";

    private static final String TABLE_NAME = "TBIRIGAPBWSEKLN";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";

    private static final String Nama_Jaringan_Irigasi = "Nama_Jaringan_Irigasi";
    private static final String Nama_Saluran_Pembawa_Sekunder = "Nama_Saluran_Pembawa_Sekunder";
    private static final String Kondisi_Pelapisan = "Kondisi_Pelapisan";
    private static final String Kondisi = "Kondisi";
    private static final String Informasi_Tambahan = "Informasi_Tambahan";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"

                    + "," + Nama_Jaringan_Irigasi + " integer null"
                    + "," + Nama_Saluran_Pembawa_Sekunder + " integer null"
                    + "," + Kondisi_Pelapisan + " integer null"
                    + "," + Kondisi + " text null"
                    + "," + Informasi_Tambahan + " text null"
                    + ")";

    private Context mContext;

    public TBIRIGAPBWSEKLNTable(Context pContext) {
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
            TBIRIGAPBWSEKLN tbirigapbwsekln= (TBIRIGAPBWSEKLN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, tbirigapbwsekln.getOBJECTID());
            val.put(kodeaset, tbirigapbwsekln.getKodeaset());
            val.put(Nama_Jaringan_Irigasi, tbirigapbwsekln.getNama_Jaringan_Irigasi());
            val.put(Nama_Saluran_Pembawa_Sekunder, tbirigapbwsekln.getNama_Saluran_Pembawa_Sekunder());
            val.put(Kondisi_Pelapisan, tbirigapbwsekln.getKondisi_Pelapisan());
            val.put(Kondisi, tbirigapbwsekln.getKondisi());
            val.put(Informasi_Tambahan, tbirigapbwsekln.getInformasi_Tambahan());
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
            TBIRIGAPBWSEKLN tbirigapbwsekln= (TBIRIGAPBWSEKLN) data;
            ContentValues val = new ContentValues();
            val.put(Nama_Jaringan_Irigasi, tbirigapbwsekln.getNama_Jaringan_Irigasi());
            val.put(Nama_Saluran_Pembawa_Sekunder, tbirigapbwsekln.getNama_Saluran_Pembawa_Sekunder());
            val.put(Kondisi_Pelapisan, tbirigapbwsekln.getKondisi_Pelapisan());
            val.put(Kondisi, tbirigapbwsekln.getKondisi_Pelapisan());
            val.put(Informasi_Tambahan, tbirigapbwsekln.getInformasi_Tambahan());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbirigapbwsekln.getId()) };
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
            TBIRIGAPBWSEKLN tbirigapbwsekln= (TBIRIGAPBWSEKLN) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(tbirigapbwsekln.getId()) };
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
                TBIRIGAPBWSEKLN tbirigapbwsekln = null;
                if (cur.moveToFirst()) {
                    do {
                        tbirigapbwsekln = new TBIRIGAPBWSEKLN();
                        //FCIRIGAPBWPRILN = new fcirigapbwpriln();
                        //myLayer = new MyLayer();
                        tbirigapbwsekln.setId(cur.getInt(0));
                        tbirigapbwsekln.setKodeaset(cur.getInt(1));
                        tbirigapbwsekln.setNama_Jaringan_Irigasi(cur.getInt(2));
                        tbirigapbwsekln.setNama_Saluran_Pembawa_Sekunder(cur.getInt(3));
                        tbirigapbwsekln.setKondisi_Pelapisan(cur.getInt(4));
                        tbirigapbwsekln.setKondisi(cur.getString(5));
                        tbirigapbwsekln.setInformasi_Tambahan(cur.getString(6));
                        data.add(returnTypeClass.cast(tbirigapbwsekln));
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
