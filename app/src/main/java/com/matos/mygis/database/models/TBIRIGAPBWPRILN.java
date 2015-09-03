package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 07/07/2015.
 */
public class TBIRIGAPBWPRILN {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private int Nama_Saluran_Pembawa_Primer;
    private int Kondisi_Pelapisan ;
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

    public int getNama_Saluran_Pembawa_Primer() {
        return Nama_Saluran_Pembawa_Primer;
    }

    public void setNama_Saluran_Pembawa_Primer(int nama_Saluran_Pembawa_Primer) {
        Nama_Saluran_Pembawa_Primer = nama_Saluran_Pembawa_Primer;
    }

    public int getKondisi_Pelapisan() {
        return Kondisi_Pelapisan;
    }

    public void setKondisi_Pelapisan(int kondisi_Pelapisan) {
        Kondisi_Pelapisan = kondisi_Pelapisan;
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

    public TBIRIGAPBWPRILN() {
    }

    public TBIRIGAPBWPRILN(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pNama_Saluran_Pembawa_Primer, int pKondisi_Pelapisan, String pKondisi,String pInformasi_Tambahan) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembawa_Primer(pNama_Saluran_Pembawa_Primer);
        setKondisi_Pelapisan(pKondisi_Pelapisan);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }


    // Untuk insert data
    public TBIRIGAPBWPRILN(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pNama_Saluran_Pembawa_Primer, int pKondisi_Pelapisan, String pKondisi,String pInformasi_Tambahan) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembawa_Primer(pNama_Saluran_Pembawa_Primer);
        setKondisi_Pelapisan(pKondisi_Pelapisan);
        setKondisi(pKondisi);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }
}
