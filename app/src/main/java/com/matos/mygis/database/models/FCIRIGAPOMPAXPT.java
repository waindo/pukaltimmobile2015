package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGAPOMPAXPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private String Nama_Pompa;

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

    public int getNama_Jaringan_Irigasi() {
        return Nama_Jaringan_Irigasi;
    }

    public void setNama_Jaringan_Irigasi(int nama_Jaringan_Irigasi) {
        Nama_Jaringan_Irigasi = nama_Jaringan_Irigasi;
    }

    public String getNama_Pompa() {
        return Nama_Pompa;
    }

    public void setNama_Pompa(String nama_Pompa) {
        Nama_Pompa = nama_Pompa;
    }

    public FCIRIGAPOMPAXPT() {
    }

    public FCIRIGAPOMPAXPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Pompa, int nama_jaringan_irigasi, String nama_pompa) {
        Nama_Jaringan_Irigasi = nama_jaringan_irigasi;
        Nama_Pompa = nama_pompa;
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Pompa(pNama_Pompa);

    }

    // Untuk insert data
    public FCIRIGAPOMPAXPT(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Pompa, int nama_jaringan_irigasi, String nama_pompa) {
        Nama_Jaringan_Irigasi = nama_jaringan_irigasi;
        Nama_Pompa = nama_pompa;
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Pompa(pNama_Pompa);

    }




}
