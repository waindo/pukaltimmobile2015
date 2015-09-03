package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 07/07/2015.
 */
public class TBIRIGABPLNGKPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private int Tipe_Bangunan_Pelengkap_Irigasi;
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

    public int getTipe_Bangunan_Pelengkap_Irigasi() {
        return Tipe_Bangunan_Pelengkap_Irigasi;
    }

    public void setTipe_Bangunan_Pelengkap_Irigasi(int tipe_Bangunan_Pelengkap_Irigasi) {
        Tipe_Bangunan_Pelengkap_Irigasi = tipe_Bangunan_Pelengkap_Irigasi;
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

    public TBIRIGABPLNGKPT() {
    }

    public TBIRIGABPLNGKPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pTipe_Bangunan_Pelengkap_Irigasi, String pKondisi,String pInformasi_Tambahan) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setTipe_Bangunan_Pelengkap_Irigasi(pTipe_Bangunan_Pelengkap_Irigasi);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }


    // Untuk insert data
    public TBIRIGABPLNGKPT(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pTipe_Bangunan_Pelengkap_Irigasi, String pKondisi,String pInformasi_Tambahan) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setTipe_Bangunan_Pelengkap_Irigasi(pTipe_Bangunan_Pelengkap_Irigasi);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }

}
