package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGAPBWTERLN {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private String Nama_Saluran_Pembawa_Tersier;

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

    public String getNama_Saluran_Pembawa_Tersier() {
        return Nama_Saluran_Pembawa_Tersier;
    }

    public void setNama_Saluran_Pembawa_Tersier(String nama_Saluran_Pembawa_Tersier) {
        Nama_Saluran_Pembawa_Tersier = nama_Saluran_Pembawa_Tersier;
    }

    public  FCIRIGAPBWTERLN(){
    }

    public FCIRIGAPBWTERLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Saluran_Pembawa_Tersier) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembawa_Tersier(pNama_Saluran_Pembawa_Tersier);

    }

    // Untuk insert data
    public FCIRIGAPBWTERLN(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Saluran_Pembawa_Tersier) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembawa_Tersier(pNama_Saluran_Pembawa_Tersier);

    }


}
