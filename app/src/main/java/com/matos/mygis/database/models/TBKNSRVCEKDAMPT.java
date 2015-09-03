package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 08/07/2015.
 */
public class TBKNSRVCEKDAMPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Cek_Dam;
    private String Kondisi_Mercu;
    private String Kondisi_Dinding_Cekdam;
    private String Kondisi_Lantai_Apron;
    private String Kondisi_Kolam_Olak;
    private String Kondisi_Peredam_Energi;
    private String Kondisi_Tebing_Hilir;
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

    public int getNama_Cek_Dam() {
        return Nama_Cek_Dam;
    }

    public void setNama_Cek_Dam(int nama_Cek_Dam) {
        Nama_Cek_Dam = nama_Cek_Dam;
    }

    public String getKondisi_Mercu() {
        return Kondisi_Mercu;
    }

    public void setKondisi_Mercu(String kondisi_Mercu) {
        Kondisi_Mercu = kondisi_Mercu;
    }

    public String getKondisi_Dinding_Cekdam() {
        return Kondisi_Dinding_Cekdam;
    }

    public void setKondisi_Dinding_Cekdam(String kondisi_Dinding_Cekdam) {
        Kondisi_Dinding_Cekdam = kondisi_Dinding_Cekdam;
    }

    public String getKondisi_Lantai_Apron() {
        return Kondisi_Lantai_Apron;
    }

    public void setKondisi_Lantai_Apron(String kondisi_Lantai_Apron) {
        Kondisi_Lantai_Apron = kondisi_Lantai_Apron;
    }

    public String getKondisi_Kolam_Olak() {
        return Kondisi_Kolam_Olak;
    }

    public void setKondisi_Kolam_Olak(String kondisi_Kolam_Olak) {
        Kondisi_Kolam_Olak = kondisi_Kolam_Olak;
    }

    public String getKondisi_Peredam_Energi() {
        return Kondisi_Peredam_Energi;
    }

    public void setKondisi_Peredam_Energi(String kondisi_Peredam_Energi) {
        Kondisi_Peredam_Energi = kondisi_Peredam_Energi;
    }

    public String getKondisi_Tebing_Hilir() {
        return Kondisi_Tebing_Hilir;
    }

    public void setKondisi_Tebing_Hilir(String kondisi_Tebing_Hilir) {
        Kondisi_Tebing_Hilir = kondisi_Tebing_Hilir;
    }

    public String getInformasi_Tambahan() {
        return Informasi_Tambahan;
    }

    public void setInformasi_Tambahan(String informasi_Tambahan) {
        Informasi_Tambahan = informasi_Tambahan;
    }

    public TBKNSRVCEKDAMPT() {
    }

    public TBKNSRVCEKDAMPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Cek_Dam, String pKondisi_Mercu, String pKondisi_Dinding_Cekdam, String pKondisi_Lantai_Apron, String pKondisi_Kolam_Olak, String pKondisi_Peredam_Energi, String pKondisi_Tebing_Hilir, String pInformasi_Tambahan) {

        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Cek_Dam(pNama_Cek_Dam);
        setKondisi_Mercu(pKondisi_Mercu);
        setKondisi_Dinding_Cekdam(pKondisi_Dinding_Cekdam);
        setKondisi_Lantai_Apron(pKondisi_Lantai_Apron);
        setKondisi_Kolam_Olak(pKondisi_Kolam_Olak);
        setKondisi_Peredam_Energi(pKondisi_Peredam_Energi);
        setKondisi_Tebing_Hilir(pKondisi_Tebing_Hilir);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }


    // Untuk insert data
    public TBKNSRVCEKDAMPT(int pOBJECTID, int pKodeAset, int pNama_Cek_Dam, String pKondisi_Mercu, String pKondisi_Dinding_Cekdam, String pKondisi_Lantai_Apron, String pKondisi_Kolam_Olak, String pKondisi_Peredam_Energi, String pKondisi_Tebing_Hilir, String pInformasi_Tambahan){

        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Cek_Dam(pNama_Cek_Dam);
        setKondisi_Mercu(pKondisi_Mercu);
        setKondisi_Dinding_Cekdam(pKondisi_Dinding_Cekdam);
        setKondisi_Lantai_Apron(pKondisi_Lantai_Apron);
        setKondisi_Kolam_Olak(pKondisi_Kolam_Olak);
        setKondisi_Peredam_Energi(pKondisi_Peredam_Energi);
        setKondisi_Tebing_Hilir(pKondisi_Tebing_Hilir);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }


}
