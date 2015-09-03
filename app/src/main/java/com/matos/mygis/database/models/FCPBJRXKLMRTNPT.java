package com.matos.mygis.database.models;

/**
 * Created by sihendri on 02/07/2015.
 */
public class FCPBJRXKLMRTNPT {
    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Kolam_Retensi;

    public FCPBJRXKLMRTNPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Kolam_Retensi ) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Kolam_Retensi(pNama_Kolam_Retensi);
    }

    // Untuk insert data
    public FCPBJRXKLMRTNPT(int pOBJECTID, int pKodeAset, int pNama_Kolam_Retensi) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Kolam_Retensi(pNama_Kolam_Retensi);
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

    public int getNama_Kolam_Retensi() {
        return Nama_Kolam_Retensi;
    }

    public void setNama_Kolam_Retensi(int nama_Kolam_Retensi) {
        Nama_Kolam_Retensi = nama_Kolam_Retensi;
    }

    public FCPBJRXKLMRTNPT() {
    }
}
