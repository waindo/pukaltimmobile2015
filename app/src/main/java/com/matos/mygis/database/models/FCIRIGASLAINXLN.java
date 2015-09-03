package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGASLAINXLN {

    private int id;
    private int OBJECTID;
    private int kodeaset;

    private int Nama_Jaringan_Irigasi;
    private int Jenis_Saluran_Irigasi_Lainnya;

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

    public int getJenis_Saluran_Irigasi_Lainnya() {
        return Jenis_Saluran_Irigasi_Lainnya;
    }

    public void setJenis_Saluran_Irigasi_Lainnya(int jenis_Saluran_Irigasi_Lainnya) {
        Jenis_Saluran_Irigasi_Lainnya = jenis_Saluran_Irigasi_Lainnya;
    }

    public FCIRIGASLAINXLN() {
    }

    public FCIRIGASLAINXLN(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pJenis_Saluran_Irigasi_Lainnya) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setJenis_Saluran_Irigasi_Lainnya(pJenis_Saluran_Irigasi_Lainnya);

    }

    // Untuk insert data
    public FCIRIGASLAINXLN(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, int pJenis_Saluran_Irigasi_Lainnya) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setJenis_Saluran_Irigasi_Lainnya(pJenis_Saluran_Irigasi_Lainnya);

    }


}
