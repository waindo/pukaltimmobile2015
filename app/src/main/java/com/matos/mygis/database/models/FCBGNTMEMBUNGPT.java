package com.matos.mygis.database.models;

/**
 * Created by sihendri on 02/07/2015.
 */
public class FCBGNTMEMBUNGPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Embung;

    public FCBGNTMEMBUNGPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Embung) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Embung(pNama_Embung);
    }

    // Untuk insert data
    public FCBGNTMEMBUNGPT(int pOBJECTID, int pKodeAset, int pNama_Embung) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Embung(pNama_Embung);
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

    public int getNama_Embung() {
        return Nama_Embung;
    }

    public void setNama_Embung(int nama_Embung) {
        Nama_Embung = nama_Embung;
    }

    public FCBGNTMEMBUNGPT() {
    }

}


