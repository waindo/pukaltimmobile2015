package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGABBGSDPPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private int Tipe_Bangunan_Bagi_Sadap;
    private String Nama_Bangunan_Bagi_Sadap;

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

    public int getTipe_Bangunan_Bagi_Sadap() {
        return Tipe_Bangunan_Bagi_Sadap;
    }

    public void setTipe_Bangunan_Bagi_Sadap(int tipe_Bangunan_Bagi_Sadap) {
        Tipe_Bangunan_Bagi_Sadap = tipe_Bangunan_Bagi_Sadap;
    }

    public String getNama_Bangunan_Bagi_Sadap() {
        return Nama_Bangunan_Bagi_Sadap;
    }

    public void setNama_Bangunan_Bagi_Sadap(String nama_Bangunan_Bagi_Sadap) {
        Nama_Bangunan_Bagi_Sadap = nama_Bangunan_Bagi_Sadap;
    }

    public FCIRIGABBGSDPPT() {
    }

    public FCIRIGABBGSDPPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pTipe_Bangunan_Bagi_Sadap, String pNama_Bangunan_Bagi_Sadap) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setTipe_Bangunan_Bagi_Sadap(pTipe_Bangunan_Bagi_Sadap);
        setNama_Bangunan_Bagi_Sadap(pNama_Bangunan_Bagi_Sadap);

    }

    // Untuk insert data
    public FCIRIGABBGSDPPT(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pTipe_Bangunan_Bagi_Sadap, String pNama_Bangunan_Bagi_Sadap) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setTipe_Bangunan_Bagi_Sadap(pTipe_Bangunan_Bagi_Sadap);
        setNama_Bangunan_Bagi_Sadap(pNama_Bangunan_Bagi_Sadap);
    }


}
