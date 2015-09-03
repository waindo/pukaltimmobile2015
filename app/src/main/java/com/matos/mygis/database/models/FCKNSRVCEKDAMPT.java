package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCKNSRVCEKDAMPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Cek_Dam;

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

    public int getNama_Cek_Dam() {
        return Nama_Cek_Dam;
    }

    public void setNama_Cek_Dam(int nama_Cek_Dam) {
        Nama_Cek_Dam = nama_Cek_Dam;
    }

    public FCKNSRVCEKDAMPT() {
    }

    public FCKNSRVCEKDAMPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Cek_Dam) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Cek_Dam(pNama_Cek_Dam);


    }

    // Untuk insert data
    public FCKNSRVCEKDAMPT(int pOBJECTID, int pKodeAset, int pNama_Cek_Dam) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Cek_Dam(pNama_Cek_Dam);


    }

}
