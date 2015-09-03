package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCPOSHDPOSHIDPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Pos_Hidrologi;


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

    public int getNama_Pos_Hidrologi() {
        return Nama_Pos_Hidrologi;
    }

    public void setNama_Pos_Hidrologi(int nama_Pos_Hidrologi) {
        Nama_Pos_Hidrologi = nama_Pos_Hidrologi;
    }

    public FCPOSHDPOSHIDPT() {
    }

    public FCPOSHDPOSHIDPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Pos_Hidrologi) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Pos_Hidrologi(pNama_Pos_Hidrologi);

    }

    // Untuk insert data
    public FCPOSHDPOSHIDPT(int pOBJECTID, int pKodeAset, int pNama_Pos_Hidrologi) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Pos_Hidrologi(pNama_Pos_Hidrologi);

    }

}
