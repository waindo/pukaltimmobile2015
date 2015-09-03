package com.matos.mygis.database.models;

/**
 * Created by sihendri on 02/07/2015.
 */
public class FCPBJRXPOLDERPT {
    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Polder;

    public FCPBJRXPOLDERPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Polder ) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Polder(pNama_Polder);
    }

    // Untuk insert data
    public FCPBJRXPOLDERPT(int pOBJECTID, int pKodeAset, int pNama_Polder) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Polder(pNama_Polder);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOBJECTID() {
        return OBJECTID;
    }

    public void setOBJECTID(int OBJECTID) {
        this.OBJECTID = OBJECTID;
    }

    public int getKodeaset() {
        return kodeaset;
    }

    public void setKodeaset(int kodeaset) {
        this.kodeaset = kodeaset;
    }

    public int getNama_Polder() {
        return Nama_Polder;
    }

    public void setNama_Polder(int nama_Polder) {
        Nama_Polder = nama_Polder;
    }

    public FCPBJRXPOLDERPT(){}
}
