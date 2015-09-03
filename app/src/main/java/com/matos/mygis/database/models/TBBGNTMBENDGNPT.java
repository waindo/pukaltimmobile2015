package com.matos.mygis.database.models;

/**
 * Created by sihendri on 08/07/2015.
 */
public class TBBGNTMBENDGNPT {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Bendungan;
    private int Tinggi_Muka_Air_Bendung;
    private String Kondisi_Tubuh_Bendungan;
    private String Kondisi_Saluran_Pelimpah;
    private String Kondisi_Mercu;
    private String Kondisi_Pintu_Intake;
    private String Kondisi_Pintu_Pembilas;
    private String Kondisi_Lantai_Apron;
    private String Kondisi_Kolam_Olak;
    private String Kondisi_Peredam_Energi;
    private String Kondisi_Tanggul;
    private String Kondisi_Generator_PLTMH;
    private String Kondisi_Pompa_Intake;
    private String Kondisi_Jembatan;
    private String Informasi_Tambahan;


    public TBBGNTMBENDGNPT(int pId, int pOBJECTID, int pKodeAset, int pNama_Bendungan, int pTinggi_Muka_Air_Bendung, String pKondisi_Tubuh_Bendungan,
                           String pKondisi_Saluran_Pelimpah, String pKondisi_Mercu, String pKondisi_Pintu_Intake, String pKondisi_Pintu_Pembilas,
                           String pKondisi_Lantai_Apron, String pKondisi_Kolam_Olak,String pKondisi_Peredam_Energi, String pKondisi_Tanggul, String pKondisi_Generator_PLTMH,
                           String pKondisi_Pompa_Intake, String pKondisi_Jembatan, String pInformasi_Tambahan ) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Bendungan(pTinggi_Muka_Air_Bendung);
        setTinggi_Muka_Air_Bendung(pTinggi_Muka_Air_Bendung);
        setKondisi_Tubuh_Bendungan(pKondisi_Tubuh_Bendungan);
        setKondisi_Saluran_Pelimpah(pKondisi_Saluran_Pelimpah);
        setKondisi_Mercu(pKondisi_Mercu);
        setKondisi_Pintu_Intake(pKondisi_Pintu_Intake);
        setKondisi_Pintu_Pembilas(pKondisi_Pintu_Pembilas);
        setKondisi_Lantai_Apron(pKondisi_Lantai_Apron);
        setKondisi_Kolam_Olak(pKondisi_Kolam_Olak);
        setKondisi_Peredam_Energi(pKondisi_Peredam_Energi);
        setKondisi_Tanggul(pKondisi_Tanggul);
        setKondisi_Generator_PLTMH(pKondisi_Generator_PLTMH);
        setKondisi_Pompa_Intake(pKondisi_Pompa_Intake);
        setKondisi_Jembatan(pKondisi_Jembatan);
        setInformasi_Tambahan(pInformasi_Tambahan);

    }

    public TBBGNTMBENDGNPT(int pOBJECTID, int pKodeAset, int pNama_Bendungan, int pTinggi_Muka_Air_Bendung, String pKondisi_Tubuh_Bendungan,
                           String pKondisi_Saluran_Pelimpah, String pKondisi_Mercu, String pKondisi_Pintu_Intake, String pKondisi_Pintu_Pembilas,
                           String pKondisi_Lantai_Apron, String pKondisi_Kolam_Olak,String pKondisi_Peredam_Energi, String pKondisi_Tanggul, String pKondisi_Generator_PLTMH,
                           String pKondisi_Pompa_Intake, String pKondisi_Jembatan, String pInformasi_Tambahan ) {

        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Bendungan(pTinggi_Muka_Air_Bendung);
        setTinggi_Muka_Air_Bendung(pTinggi_Muka_Air_Bendung);
        setKondisi_Tubuh_Bendungan(pKondisi_Tubuh_Bendungan);
        setKondisi_Saluran_Pelimpah(pKondisi_Saluran_Pelimpah);
        setKondisi_Mercu(pKondisi_Mercu);
        setKondisi_Pintu_Intake(pKondisi_Pintu_Intake);
        setKondisi_Pintu_Pembilas(pKondisi_Pintu_Pembilas);
        setKondisi_Lantai_Apron(pKondisi_Lantai_Apron);
        setKondisi_Kolam_Olak(pKondisi_Kolam_Olak);
        setKondisi_Peredam_Energi(pKondisi_Peredam_Energi);
        setKondisi_Tanggul(pKondisi_Tanggul);
        setKondisi_Generator_PLTMH(pKondisi_Generator_PLTMH);
        setKondisi_Pompa_Intake(pKondisi_Pompa_Intake);
        setKondisi_Jembatan(pKondisi_Jembatan);
        setInformasi_Tambahan(pInformasi_Tambahan);

    }

    public String getInformasi_Tambahan() {
        return Informasi_Tambahan;
    }

    public void setInformasi_Tambahan(String informasi_Tambahan) {
        Informasi_Tambahan = informasi_Tambahan;
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

    public int getTinggi_Muka_Air_Bendung() {
        return Tinggi_Muka_Air_Bendung;
    }

    public void setTinggi_Muka_Air_Bendung(int tinggi_Muka_Air_Bendung) {
        Tinggi_Muka_Air_Bendung = tinggi_Muka_Air_Bendung;
    }

    public String getKondisi_Tubuh_Bendungan() {
        return Kondisi_Tubuh_Bendungan;
    }

    public void setKondisi_Tubuh_Bendungan(String kondisi_Tubuh_Bendungan) {
        Kondisi_Tubuh_Bendungan = kondisi_Tubuh_Bendungan;
    }

    public String getKondisi_Saluran_Pelimpah() {
        return Kondisi_Saluran_Pelimpah;
    }

    public void setKondisi_Saluran_Pelimpah(String kondisi_Saluran_Pelimpah) {
        Kondisi_Saluran_Pelimpah = kondisi_Saluran_Pelimpah;
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

    public String getKondisi_Tanggul() {
        return Kondisi_Tanggul;
    }

    public void setKondisi_Tanggul(String kondisi_Tanggul) {
        Kondisi_Tanggul = kondisi_Tanggul;
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

    public TBBGNTMBENDGNPT(){}
}
