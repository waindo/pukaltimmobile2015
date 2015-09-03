package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGABPLNGKPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private int Tipe_Bangunan_Pelengkap_Irigasi;

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

    public FCIRIGABPLNGKPT() {
    }

    public FCIRIGABPLNGKPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pTipe_Bangunan_Pelengkap_Irigasi) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setTipe_Bangunan_Pelengkap_Irigasi(pTipe_Bangunan_Pelengkap_Irigasi);


    }

    // Untuk insert data
    public FCIRIGABPLNGKPT(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pTipe_Bangunan_Pelengkap_Irigasi) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setTipe_Bangunan_Pelengkap_Irigasi(pTipe_Bangunan_Pelengkap_Irigasi);

    }


}
