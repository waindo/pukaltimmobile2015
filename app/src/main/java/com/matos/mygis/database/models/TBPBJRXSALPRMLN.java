package com.matos.mygis.database.models;

/**
 * Created by sihendri on 09/07/2015.
 */
public class TBPBJRXSALPRMLN {

    private int id;
    private int OBJECTID;
    private int kodeaset;


    private int Nama_Sistem_Pengendalian_Banjir;
    private int Nama_Saluran;
    private String Kondisi;
    private String Informasi_Tambahan;

    public TBPBJRXSALPRMLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Sistem_Pengendalian_Banjir, int pNama_Saluran,
                           String pKondisi,String pInformasi_Tambahan ) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Sistem_Pengendalian_Banjir(pNama_Sistem_Pengendalian_Banjir);
        setNama_Saluran(pNama_Saluran);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }

    public TBPBJRXSALPRMLN(int pOBJECTID, int pKodeAset, int pNama_Sistem_Pengendalian_Banjir, int pNama_Saluran,
                           String pKondisi,String pInformasi_Tambahan ) {

        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Sistem_Pengendalian_Banjir(pNama_Sistem_Pengendalian_Banjir);
        setNama_Saluran(pNama_Saluran);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
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

    public int getNama_Saluran() {
        return Nama_Saluran;
    }

    public void setNama_Saluran(int nama_Saluran) {
        Nama_Saluran = nama_Saluran;
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
}
