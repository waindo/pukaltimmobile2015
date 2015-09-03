package com.matos.mygis.database.models;

/**
 * Created by sihendri on 02/07/2015.
 */
public class FCPBJRXSALPRMLN {
    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Sistem_Pengendalian_Banjir;
    private String Nama_Saluran;

    public FCPBJRXSALPRMLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Sistem_Pengendalian_Banjir,String pNama_Saluran  ) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Sistem_Pengendalian_Banjir(pNama_Sistem_Pengendalian_Banjir);
        setNama_Saluran(pNama_Saluran);
    }

    // Untuk insert data
    public FCPBJRXSALPRMLN(int pOBJECTID, int pKodeAset, int pNama_Sistem_Pengendalian_Banjir,String pNama_Saluran  ) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Sistem_Pengendalian_Banjir(pNama_Sistem_Pengendalian_Banjir);
        setNama_Saluran(pNama_Saluran);
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

    public int getNama_Sistem_Pengendalian_Banjir() {
        return Nama_Sistem_Pengendalian_Banjir;
    }
    public void setNama_Sistem_Pengendalian_Banjir(int nama_sistem_pengendalian_Banjir) {
        Nama_Sistem_Pengendalian_Banjir = nama_sistem_pengendalian_Banjir;
    }

    public String getNama_Saluran() {
        return Nama_Saluran;
    }

    public void setNama_Saluran(String nama_Saluran) {
        Nama_Saluran = nama_Saluran;
    }

    public FCPBJRXSALPRMLN (){}


}
