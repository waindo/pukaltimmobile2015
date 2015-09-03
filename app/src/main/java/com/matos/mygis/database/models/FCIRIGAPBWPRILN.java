package com.matos.mygis.database.models;

/**
 * Created by Qaccipinho on 02/07/2015.
 */
public class FCIRIGAPBWPRILN {

    private int id;                                 /// => harusnya gak boleh warna abu2
    private int OBJECTID;                           /// => harusnya gak boleh warna abu2
    private int kodeaset;                           /// => harusnya gak boleh warna abu2

    private int Nama_Jaringan_Irigasi;              /// => harusnya gak boleh warna abu2
    private String Nama_Saluran_Pembawa_Primer;     /// => harusnya gak boleh warna abu2
   // SHAPE_Length dibuang... yang ada SHAPE_ gak usah dibuat yak

    public FCIRIGAPBWPRILN(int pId, int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Saluran_Pembawa_Primer) {
        setId(pId);
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);
        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembawa_Primer(pNama_Saluran_Pembawa_Primer);

}

    // Untuk insert data
    public FCIRIGAPBWPRILN(int pOBJECTID, int pKodeAset, int pNama_Jaringan_Irigasi, String pNama_Saluran_Pembawa_Primer) {
        setOBJECTID(pOBJECTID);
        setKodeaset(pKodeAset);

        setNama_Jaringan_Irigasi(pNama_Jaringan_Irigasi);
        setNama_Saluran_Pembawa_Primer(pNama_Saluran_Pembawa_Primer);
    }

    public FCIRIGAPBWPRILN() {
    }

    // bikin getter dan setter nya jangan diketik sendiri ya... perhatikan deh jadinya warna abu-abu (Nama_Jaringan_Irigasi)
    // , kurang this. didepannya
    // cara buatnya... hapus semua yang ada getXXXXXXX() dan setXXXXXX(bla bla);
    // terus pilih menu Code -> Generate... -> Getter and Setter -> terus pilih semua variabelnya dari id sampai ke yang paling bawah


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

    public String getNama_Saluran_Pembawa_Primer() {
        return Nama_Saluran_Pembawa_Primer;
    }

    public void setNama_Saluran_Pembawa_Primer(String nama_Saluran_Pembawa_Primer) {
        Nama_Saluran_Pembawa_Primer = nama_Saluran_Pembawa_Primer;
    }
}


