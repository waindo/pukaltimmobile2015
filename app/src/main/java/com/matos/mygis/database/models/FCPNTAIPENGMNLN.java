package com.matos.mygis.database.models;

/**
 * Created by sihendri on 02/07/2015.
 */
public class FCPNTAIPENGMNLN {
    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Pengaman_Pantai;


    public FCPNTAIPENGMNLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Pengaman_Pantai ) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Pengaman_Pantai(pNama_Pengaman_Pantai);

    }

    // Untuk insert data
    public FCPNTAIPENGMNLN(int pOBJECTID, int pKodeAset, int pNama_Pengaman_Pantai ) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Pengaman_Pantai(pNama_Pengaman_Pantai);

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

    public int getNama_Pengaman_Pantai() {
        return Nama_Pengaman_Pantai;
    }

    public void setNama_Pengaman_Pantai(int nama_Pengaman_Pantai) {
        Nama_Pengaman_Pantai = nama_Pengaman_Pantai;
    }

    public FCPNTAIPENGMNLN(){ }
}
