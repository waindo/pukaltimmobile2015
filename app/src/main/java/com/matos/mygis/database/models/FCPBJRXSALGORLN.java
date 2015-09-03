package com.matos.mygis.database.models;

/**
 * Created by sihendri on 02/07/2015.
 */
public class FCPBJRXSALGORLN {
    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Sistem_Pengendalian_Banjir;
    private String Nama_GorongGorong;

    public FCPBJRXSALGORLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Sistem_Pengendalian_Banjir,String pNama_GorongGorong ) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Sistem_Pengendalian_Banjir(pNama_Sistem_Pengendalian_Banjir);
        setNama_GorongGorong(pNama_GorongGorong);
    }

    // Untuk insert data
    public FCPBJRXSALGORLN(int pOBJECTID, int pKodeAset, int pNama_Sistem_Pengendalian_Banjir,String pNama_GorongGorong ) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Sistem_Pengendalian_Banjir(pNama_Sistem_Pengendalian_Banjir);
        setNama_GorongGorong(pNama_GorongGorong);
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

    public void setNama_Sistem_Pengendalian_Banjir(int nama_Sistem_Pengendalian_Banjir) {
        Nama_Sistem_Pengendalian_Banjir = nama_Sistem_Pengendalian_Banjir;
    }

    public String getNama_GorongGorong() {
        return Nama_GorongGorong;
    }

    public void setNama_GorongGorong(String nama_GorongGorong) {
        Nama_GorongGorong = nama_GorongGorong;
    }

    public FCPBJRXSALGORLN(){}
}
