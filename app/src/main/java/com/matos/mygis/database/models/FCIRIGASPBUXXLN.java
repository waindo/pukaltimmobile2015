package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGASPBUXXLN {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private String Nama_Saluran_Pembuang;


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

    public String getNama_Saluran_Pembuang() {
        return Nama_Saluran_Pembuang;
    }

    public void setNama_Saluran_Pembuang(String nama_Saluran_Pembuang) {
        Nama_Saluran_Pembuang = nama_Saluran_Pembuang;
    }

    public FCIRIGASPBUXXLN() {
    }

    public FCIRIGASPBUXXLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Saluran_Pembuang) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembuang(pNama_Saluran_Pembuang);


    }

    // Untuk insert data
    public FCIRIGASPBUXXLN(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Saluran_Pembuang) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembuang(pNama_Saluran_Pembuang);

    }

}
