package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 08/07/2015.
 */
public class POS_HIDROLOGI {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Pos_Hidrologi;
    private int Lokasi_Kabupaten;
    private int Lokasi_Wilayah_Sungai;
    private int Tipe_Pos_Hidrologi;
    private double Curah_Hujan;
    private double Tinggi_Muka_Air_RataRata;
    private String Sungai;
    private String Tahun_Awal_Dibangun;
    private String Tahun_Selesai_Dibangun;
    private String Tahun_Rehabilitasi;
    private int Sumber_Dana;
    private String Kondisi;

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

    public int getNama_Pos_Hidrologi() {
        return Nama_Pos_Hidrologi;
    }

    public void setNama_Pos_Hidrologi(int nama_Pos_Hidrologi) {
        Nama_Pos_Hidrologi = nama_Pos_Hidrologi;
    }

    public int getLokasi_Kabupaten() {
        return Lokasi_Kabupaten;
    }

    public void setLokasi_Kabupaten(int lokasi_Kabupaten) {
        Lokasi_Kabupaten = lokasi_Kabupaten;
    }

    public int getLokasi_Wilayah_Sungai() {
        return Lokasi_Wilayah_Sungai;
    }

    public void setLokasi_Wilayah_Sungai(int lokasi_Wilayah_Sungai) {
        Lokasi_Wilayah_Sungai = lokasi_Wilayah_Sungai;
    }

    public int getTipe_Pos_Hidrologi() {
        return Tipe_Pos_Hidrologi;
    }

    public void setTipe_Pos_Hidrologi(int tipe_Pos_Hidrologi) {
        Tipe_Pos_Hidrologi = tipe_Pos_Hidrologi;
    }

    public double getCurah_Hujan() {
        return Curah_Hujan;
    }

    public void setCurah_Hujan(double curah_Hujan) {
        Curah_Hujan = curah_Hujan;
    }

    public double getTinggi_Muka_Air_RataRata() {
        return Tinggi_Muka_Air_RataRata;
    }

    public void setTinggi_Muka_Air_RataRata(double tinggi_Muka_Air_RataRata) {
        Tinggi_Muka_Air_RataRata = tinggi_Muka_Air_RataRata;
    }

    public String getSungai() {
        return Sungai;
    }

    public void setSungai(String sungai) {
        Sungai = sungai;
    }

    public String getTahun_Awal_Dibangun() {
        return Tahun_Awal_Dibangun;
    }

    public void setTahun_Awal_Dibangun(String tahun_Awal_Dibangun) {
        Tahun_Awal_Dibangun = tahun_Awal_Dibangun;
    }

    public String getTahun_Selesai_Dibangun() {
        return Tahun_Selesai_Dibangun;
    }

    public void setTahun_Selesai_Dibangun(String tahun_Selesai_Dibangun) {
        Tahun_Selesai_Dibangun = tahun_Selesai_Dibangun;
    }

    public String getTahun_Rehabilitasi() {
        return Tahun_Rehabilitasi;
    }

    public void setTahun_Rehabilitasi(String tahun_Rehabilitasi) {
        Tahun_Rehabilitasi = tahun_Rehabilitasi;
    }

    public int getSumber_Dana() {
        return Sumber_Dana;
    }

    public void setSumber_Dana(int sumber_Dana) {
        Sumber_Dana = sumber_Dana;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String kondisi) {
        Kondisi = kondisi;
    }

    public POS_HIDROLOGI() {
    }

    public POS_HIDROLOGI(int pId, int pOBJECTID, int pKodeAset, int pNama_Pos_Hidrologi, int pLokasi_Kabupaten, int pLokasi_Wilayah_Sungai, int pTipe_Pos_Hidrologi, double pCurah_Hujan, double pTinggi_Muka_Air_RataRata, String pSungai, String pTahun_Awal_Dibangun, String pTahun_Selesai_Dibangun, String pTahun_Rehabilitasi, int pSumber_Dana, String pKondisi) {

        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Pos_Hidrologi(pNama_Pos_Hidrologi);
        setLokasi_Kabupaten(pLokasi_Kabupaten);
        setTipe_Pos_Hidrologi(pTipe_Pos_Hidrologi);
        setCurah_Hujan(pCurah_Hujan);
        setTinggi_Muka_Air_RataRata(pTinggi_Muka_Air_RataRata);
        setSungai(pSungai);
        setTahun_Awal_Dibangun(pTahun_Awal_Dibangun);
        setTahun_Selesai_Dibangun(pTahun_Selesai_Dibangun);
        setTahun_Rehabilitasi(pTahun_Rehabilitasi);
        setSumber_Dana(pSumber_Dana);
        setKondisi(pKondisi);
    }

    // Untuk insert data
    public POS_HIDROLOGI(int pOBJECTID, int pKodeAset, int pNama_Pos_Hidrologi, int pLokasi_Kabupaten, int pLokasi_Wilayah_Sungai, int pTipe_Pos_Hidrologi, double pCurah_Hujan, double pTinggi_Muka_Air_RataRata, String pSungai, String pTahun_Awal_Dibangun, String pTahun_Selesai_Dibangun, String pTahun_Rehabilitasi, int pSumber_Dana, String pKondisi) {

        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Pos_Hidrologi(pNama_Pos_Hidrologi);
        setLokasi_Kabupaten(pLokasi_Kabupaten);
        setTipe_Pos_Hidrologi(pTipe_Pos_Hidrologi);
        setCurah_Hujan(pCurah_Hujan);
        setTinggi_Muka_Air_RataRata(pTinggi_Muka_Air_RataRata);
        setSungai(pSungai);
        setTahun_Awal_Dibangun(pTahun_Awal_Dibangun);
        setTahun_Selesai_Dibangun(pTahun_Selesai_Dibangun);
        setTahun_Rehabilitasi(pTahun_Rehabilitasi);
        setSumber_Dana(pSumber_Dana);
        setKondisi(pKondisi);
    }
}
