package com.matos.mygis.database.tables;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.matos.mygis.database.DB;

import com.matos.mygis.database.models.FCIRIGAPBWPRILN;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Qaccipinho on 03/07/2015.
 */
public class FCIRIGAPBWPRILNTable implements AppTable {         // jangan lupa saat buat classnya implements AppTable terus alt + enter

    private static final String TAG = "FCIRIGAPBWPRILNTable";

    private static final String TABLE_NAME = "FCIRIGAPBWPRIL";
    private static final String TABLE_ID = "id";
    private static final String OBJECTID = "OBJECTID";
    private static final String kodeaset = "kodeaset";

    // disesuaikan dengan yang di model ya... untuk yang ini gak perlu SHAPE_Length (sudah dihapus di model)
    private static final String Nama_Jaringan_Irigasi = "Nama_Jaringan_Irigasi";
    private static final String Nama_Saluran_Pembawa_Primer = "Nama_Saluran_Pembawa_Primer";
    private static final String SHAPE_Length = "SHAPE_Length";

    private static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + TABLE_ID + "integer primary key autoincrement"
                    + "," + OBJECTID + " integer null"
                    + "," + kodeaset + " integer null"
                    + "," + Nama_Jaringan_Irigasi + " integer null"
                    + "," + Nama_Saluran_Pembawa_Primer + " integer null"       // ini harusnya text bukan integer, perhatikan juga tipe data yang lain. Tipe data SQLLite yang kita pake integer, text, dan real
                    + "," + SHAPE_Length + " integer null"
                    + ")";

    private Context mContext;

    public FCIRIGAPBWPRILNTable(Context pContext) {
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
            FCIRIGAPBWPRILN fcirigapbwpriln = (FCIRIGAPBWPRILN) data;
            ContentValues val = new ContentValues();
            val.put(OBJECTID, fcirigapbwpriln.getOBJECTID());
            val.put(kodeaset, fcirigapbwpriln.getKodeaset());
            val.put(Nama_Jaringan_Irigasi, fcirigapbwpriln.getNama_Jaringan_Irigasi());
            val.put(Nama_Saluran_Pembawa_Primer, fcirigapbwpriln.getNama_Saluran_Pembawa_Primer());

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


    // dibuat juga ya yang updateData, deleteData, getData, iTableExists. Lihat Contoh di MyLayerTable

    @Override
    public boolean updateData(Object data) {
        boolean ret = false;
        SQLiteDatabase db = null;
        try {
            db = DB.getInstance(mContext).getDB(true);
            if (!isTableExists()) {
                db.execSQL(CREATE_TABLE);
            }
            FCIRIGAPBWPRILN fcirigapbwpriln= (FCIRIGAPBWPRILN) data;
            ContentValues val = new ContentValues();
            val.put(Nama_Jaringan_Irigasi, fcirigapbwpriln.getNama_Jaringan_Irigasi());
            val.put(Nama_Saluran_Pembawa_Primer, fcirigapbwpriln.getNama_Saluran_Pembawa_Primer());
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcirigapbwpriln.getId()) };
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
            FCIRIGAPBWPRILN fcirigapbwpriln= (FCIRIGAPBWPRILN) data;
            String whereClause = TABLE_ID + "=?";
            String whereArgs[] = new String[] { String.valueOf(fcirigapbwpriln.getId()) };
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
                FCIRIGAPBWPRILN fcirigapbwpriln = null;
                if (cur.moveToFirst()) {
                    do {
                        fcirigapbwpriln = new FCIRIGAPBWPRILN();
                        fcirigapbwpriln.setId(cur.getInt(0));
                        fcirigapbwpriln.setKodeaset(cur.getInt(1));
                        fcirigapbwpriln.setNama_Jaringan_Irigasi(cur.getInt(2));
                        fcirigapbwpriln.setNama_Saluran_Pembawa_Primer(cur.getString(3));
                        data.add(returnTypeClass.cast(fcirigapbwpriln));
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
