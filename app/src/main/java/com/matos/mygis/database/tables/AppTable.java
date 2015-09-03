package com.matos.mygis.database.tables;

import android.content.ContentValues;

import java.util.List;

/**
 * Interface table
 */
public interface AppTable {
    public boolean createTable();
    public boolean dropTable();
    public boolean insertData(Object data);
    public boolean updateData(Object data);
    public boolean updateData(ContentValues values, String whereClause, String[] whereArgs);
    public boolean deleteData(Object data);
    public <T> List<T> getData(Class<T> returnTypeClass, String whereClause, String[] whereArgs);

    public boolean isTableExists();
}
