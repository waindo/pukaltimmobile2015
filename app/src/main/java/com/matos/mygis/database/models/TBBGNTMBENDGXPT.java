package com.matos.mygis.database.models;

/**
 * Created by sihendri on 08/07/2015.
 */
public class TBBGNTMBENDGXPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Bendungan;
    private int Tinggi_Muka_Air_Bendung;
    private String Kondisi_Mercu;
    private String Kondisi_Pintu_Intake;
    private String Kondisi_Pintu_Pembilas;
    private String Kondisi_Dinding_Bendung;
    private String Kondisi_Lantai_Apron;
    private String Kondisi_Kolam_Olak;
    private String Kondisi_Tebing_Hilir;
    private String Kondisi_Peredam_Energi;
    private String Kondisi_Tanggul;
    private String Kondisi_Pintu_Gerak;
    private String Kondisi_Generator_PLTMH;
    private String Kondisi_Pompa_Intake;
    private String Kondisi_Jembatan;
    private String Informasi_Tambahan;

    public TBBGNTMBENDGXPT(int pId, int pOBJECTID, int pKodeAset, int pTinggi_Muka_Air_Bendung, String pKondisi_Mercu, String pKondisi_Pintu_Intake,
                           String pKondisi_Pintu_Pembilas, String pKondisi_Dinding_Bendung, String pKondisi_Lantai_Apron, String pKondisi_Kolam_Olak, String pKondisi_Tebing_Hilir,
                           String pKondisi_Peredam_Energi, String pKondisi_Tanggul, String pKondisi_Pintu_Gerak, String pKondisi_Generator_PLTMH, String pKondisi_Pompa_Intake,
                           String pKondisi_Jembatan, String pInformasi_Tambahan) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Bendungan(pTinggi_Muka_Air_Bendung);
        setTinggi_Muka_Air_Bendung(pTinggi_Muka_Air_Bendung);
        setKondisi_Mercu(pKondisi_Mercu);
        setKondisi_Pintu_Intake(pKondisi_Pintu_Intake);
        setKondisi_Pintu_Pembilas(pKondisi_Pintu_Pembilas);
        setKondisi_Dinding_Bendung(pKondisi_Dinding_Bendung);
        setKondisi_Lantai_Apron(pKondisi_Lantai_Apron);
        setKondisi_Kolam_Olak(pKondisi_Kolam_Olak);
        setKondisi_Tebing_Hilir(pKondisi_Tebing_Hilir);
        setKondisi_Peredam_Energi(pKondisi_Peredam_Energi);
        setKondisi_Tanggul(pKondisi_Tanggul);
        setKondisi_Pintu_Gerak(pKondisi_Pintu_Gerak);
        setKondisi_Generator_PLTMH(pKondisi_Generator_PLTMH);
        setKondisi_Pompa_Intake(pKondisi_Pompa_Intake);
        setKondisi_Jembatan(pKondisi_Jembatan);
        setInformasi_Tambahan(pInformasi_Tambahan);
    }

    public TBBGNTMBENDGXPT( int pOBJECTID, int pKodeAset, int pTinggi_Muka_Air_Bendung, String pKondisi_Mercu, String pKondisi_Pintu_Intake,
                           String pKondisi_Pintu_Pembilas, String pKondisi_Dinding_Bendung, String pKondisi_Lantai_Apron, String pKondisi_Kolam_Olak, String pKondisi_Tebing_Hilir,
                           String pKondisi_Peredam_Energi, String pKondisi_Tanggul, String pKondisi_Pintu_Gerak, String pKondisi_Generator_PLTMH, String pKondisi_Pompa_Intake,
                           String pKondisi_Jembatan, String pInformasi_Tambahan) {

        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Bendungan(pTinggi_Muka_Air_Bendung);
        setTinggi_Muka_Air_Bendung(pTinggi_Muka_Air_Bendung);
        setKondisi_Mercu(pKondisi_Mercu);
        setKondisi_Pintu_Intake(pKondisi_Pintu_Intake);
        setKondisi_Pintu_Pembilas(pKondisi_Pintu_Pembilas);
        setKondisi_Dinding_Bendung(pKondisi_Dinding_Bendung);
        setKondisi_Lantai_Apron(pKondisi_Lantai_Apron);
        setKondisi_Kolam_Olak(pKondisi_Kolam_Olak);
        setKondisi_Tebing_Hilir(pKondisi_Tebing_Hilir);
        setKondisi_Peredam_Energi(pKondisi_Peredam_Energi);
        setKondisi_Tanggul(pKondisi_Tanggul);
        setKondisi_Pintu_Gerak(pKondisi_Pintu_Gerak);
        setKondisi_Generator_PLTMH(pKondisi_Generator_PLTMH);
        setKondisi_Pompa_Intake(pKondisi_Pompa_Intake);
        setKondisi_Jembatan(pKondisi_Jembatan);
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

    public int getNama_Bendungan() {
        return Nama_Bendungan;
    }

    public void setNama_Bendungan(int nama_Bendungan) {
        Nama_Bendungan = nama_Bendungan;
    }

    public double getTinggi_Muka_Air_Bendung() {
        return Tinggi_Muka_Air_Bendung;
    }

    public void setTinggi_Muka_Air_Bendung(int tinggi_Muka_Air_Bendung) {
        Tinggi_Muka_Air_Bendung = tinggi_Muka_Air_Bendung;
    }

    public String getKondisi_Mercu() {
        return Kondisi_Mercu;
    }

    public void setKondisi_Mercu(String kondisi_Mercu) {
        Kondisi_Mercu = kondisi_Mercu;
    }

    public String getKondisi_Pintu_Intake() {
        return Kondisi_Pintu_Intake;
    }

    public void setKondisi_Pintu_Intake(String kondisi_Pintu_Intake) {
        Kondisi_Pintu_Intake = kondisi_Pintu_Intake;
    }

    public String getKondisi_Pintu_Pembilas() {
        return Kondisi_Pintu_Pembilas;
    }

    public void setKondisi_Pintu_Pembilas(String kondisi_Pintu_Pembilas) {
        Kondisi_Pintu_Pembilas = kondisi_Pintu_Pembilas;
    }

    public String getKondisi_Dinding_Bendung() {
        return Kondisi_Dinding_Bendung;
    }

    public void setKondisi_Dinding_Bendung(String kondisi_Dinding_Bendung) {
        Kondisi_Dinding_Bendung = kondisi_Dinding_Bendung;
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

    public String getKondisi_Tebing_Hilir() {
        return Kondisi_Tebing_Hilir;
    }

    public void setKondisi_Tebing_Hilir(String kondisi_Tebing_Hilir) {
        Kondisi_Tebing_Hilir = kondisi_Tebing_Hilir;
    }

    public String getKondisi_Peredam_Energi() {
        return Kondisi_Peredam_Energi;
    }

    public void setKondisi_Peredam_Energi(String kondisi_Peredam_Energi) {
        Kondisi_Peredam_Energi = kondisi_Peredam_Energi;
    }

    public String getKondisi_Tanggul() {
        return Kondisi_Tanggul;
    }

    public void setKondisi_Tanggul(String kondisi_Tanggul) {
        Kondisi_Tanggul = kondisi_Tanggul;
    }

    public String getKondisi_Pintu_Gerak() {
        return Kondisi_Pintu_Gerak;
    }

    public void setKondisi_Pintu_Gerak(String kondisi_Pintu_Gerak) {
        Kondisi_Pintu_Gerak = kondisi_Pintu_Gerak;
    }

    public String getKondisi_Generator_PLTMH() {
        return Kondisi_Generator_PLTMH;
    }

    public void setKondisi_Generator_PLTMH(String kondisi_Generator_PLTMH) {
        Kondisi_Generator_PLTMH = kondisi_Generator_PLTMH;
    }

    public String getKondisi_Pompa_Intake() {
        return Kondisi_Pompa_Intake;
    }

    public void setKondisi_Pompa_Intake(String kondisi_Pompa_Intake) {
        Kondisi_Pompa_Intake = kondisi_Pompa_Intake;
    }

    public String getKondisi_Jembatan() {
        return Kondisi_Jembatan;
    }

    public void setKondisi_Jembatan(String kondisi_Jembatan) {
        Kondisi_Jembatan = kondisi_Jembatan;
    }

    public String getInformasi_Tambahan() {
        return Informasi_Tambahan;
    }

    public void setInformasi_Tambahan(String informasi_Tambahan) {
        Informasi_Tambahan = informasi_Tambahan;
    }

    public TBBGNTMBENDGXPT(){}
}
