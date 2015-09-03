package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGAJALANXLN {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private int Jenis_Jalan;



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

    public int getJenis_Jalan() {
        return Jenis_Jalan;
    }

    public void setJenis_Jalan(int jenis_Jalan) {
        Jenis_Jalan = jenis_Jalan;
    }

    public FCIRIGAJALANXLN() {
    }

    public FCIRIGAJALANXLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pJenis_Jalan) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setJenis_Jalan(pJenis_Jalan);


    }

    // Untuk insert data
    public FCIRIGAJALANXLN(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pJenis_Jalan) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setJenis_Jalan(pJenis_Jalan);

    }


}
