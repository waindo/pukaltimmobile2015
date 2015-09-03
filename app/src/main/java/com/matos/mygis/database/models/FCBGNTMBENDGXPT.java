package com.matos.mygis.database.models;

/**
 * Created by matOS on 7/1/2015.
 */
public class FCBGNTMBENDGXPT {
    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Bendung;

    public FCBGNTMBENDGXPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Bendung) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Bendung(pNama_Bendung);
    }

    // Untuk insert data
    public FCBGNTMBENDGXPT(int pOBJECTID, int pKodeAset, int pNama_Bendung) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Bendung(pNama_Bendung);
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

    public int getNama_Bendung() {
        return Nama_Bendung;
    }

    public void setNama_Bendung(int nama_Bendung) {
        Nama_Bendung = nama_Bendung;
    }

    public FCBGNTMBENDGXPT(){}
}
