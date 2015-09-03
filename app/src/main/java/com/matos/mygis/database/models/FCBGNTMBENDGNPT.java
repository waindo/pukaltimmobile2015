package com.matos.mygis.database.models;

/**
 * Created by sihendri on 02/07/2015.
 */
public class FCBGNTMBENDGNPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Bendungan;


    public FCBGNTMBENDGNPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Bendungan) {
        this.setId(pId);
        this.setOBJECTID(pOBJECTID);
        this.setKodeaset(pKodeAset);
        this.setNama_Bendungan(pNama_Bendungan);
    }


    public FCBGNTMBENDGNPT(int pOBJECTID, int pKodeAset, int pNama_Bendungan) {
        this.setOBJECTID(pOBJECTID);
        this.setKodeaset(pKodeAset);
        this.setNama_Bendungan(pNama_Bendungan);
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

    public int getNama_Bendungan() {
        return Nama_Bendungan;
    }

    public void setNama_Bendungan(int nama_Bendungan) {
        Nama_Bendungan = nama_Bendungan;
    }


    public FCBGNTMBENDGNPT() {
    }

}
