package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 07/07/2015.
 */
public class TBIRIGABBGSDPPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private int Nama_Bangunan_Bagi_Sadap;
    private String Kondisi;
    private String Informasi_Tambahan;


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

    public int getNama_Bangunan_Bagi_Sadap() {
        return Nama_Bangunan_Bagi_Sadap;
    }

    public void setNama_Bangunan_Bagi_Sadap(int nama_Bangunan_Bagi_Sadap) {
        Nama_Bangunan_Bagi_Sadap = nama_Bangunan_Bagi_Sadap;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String kondisi) {
        Kondisi = kondisi;
    }

    public String getInformasi_Tambahan() {
        return Informasi_Tambahan;
    }

    public void setInformasi_Tambahan(String informasi_Tambahan) {
        Informasi_Tambahan = informasi_Tambahan;
    }

    public TBIRIGABBGSDPPT() {
    }

    public TBIRIGABBGSDPPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pNama_Bangunan_Bagi_Sadap, String pKondisi,String pInformasi_Tambahan) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Bangunan_Bagi_Sadap(pNama_Bangunan_Bagi_Sadap);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }


    // Untuk insert data
    public TBIRIGABBGSDPPT(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pNama_Bangunan_Bagi_Sadap, String pKondisi,String pInformasi_Tambahan) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Bangunan_Bagi_Sadap(pNama_Bangunan_Bagi_Sadap);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }
}
