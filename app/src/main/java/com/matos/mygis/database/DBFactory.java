package com.matos.mygis.database;

/**
 * Interface pabrik database
 */
public interface DBFactory {
    public boolean createTables();
    public boolean dropTables();
}
