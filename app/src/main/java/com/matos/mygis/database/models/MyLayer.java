package com.matos.mygis.database.models;

/**
 * Model class for Layer table
 */
public class MyLayer {
    private int id;
    private int urutan;
    private String modul;
    private String grup;
    private String nama_layer;
    private String basemap;
    private String tipe_layer;
    private String tipe_kontrol;
    private String host;
    private String service;
    private String initial;
    private String current;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTipe_kontrol() {
        return tipe_kontrol;
    }

    public void setTipe_kontrol(String tipe_kontrol) {
        this.tipe_kontrol = tipe_kontrol;
    }

    public String getTipe_layer() {
        return tipe_layer;
    }

    public void setTipe_layer(String tipe_layer) {
        this.tipe_layer = tipe_layer;
    }

    public String getBasemap() {
        return basemap;
    }

    public void setBasemap(String basemap) {
        this.basemap = basemap;
    }

    public String getNama_layer() {
        return nama_layer;
    }

    public void setNama_layer(String nama_layer) {
        this.nama_layer = nama_layer;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Contructor MyLayer
     */
    public MyLayer() {
    }

    /**
     * Constructor MyLayer
     * @param pId table id
     * @param pModul the name of activity
     * @param pGrup the name of group layer
     * @param pNama_Layer the name of layer
     * @param pBasemap basemap or not
     * @param pTipe_Layer type of layer, osm, dynamic, tiled, etc
     * @param pTipe_Kontrol type of control ex. chk(checkbox), rdb(radiobutton), etc
     * @param pHost host of layer service ex. http://10.10.10.2, http://jdsd.kaltimprov.go.id:6080
     * @param pService url of layer service ex. /arcgis/rest/services/Admin_Wilayah_Kaltim/MapServer
     * @param pInitial initial value of layer visibility, 1 visible, 0 invisible
     * @param pCurrent current value of layer visibility, 1 visible, 0 invisible
     * @param pUrutan the order of layer
     */
    public MyLayer(int pId, String pModul, String pGrup, String pNama_Layer, String pBasemap, String pTipe_Layer
        , String pTipe_Kontrol, String pHost, String pService, String pInitial, String pCurrent, int pUrutan) {
        this.setId(pId);
        this.setModul(pModul);
        this.setGrup(pGrup);
        this.setNama_layer(pNama_Layer);
        this.setBasemap(pBasemap);
        this.setTipe_layer(pTipe_Layer);
        this.setTipe_kontrol(pTipe_Kontrol);
        this.setHost(pHost);
        this.setService(pService);
        this.setInitial(pInitial);
        this.setCurrent(pCurrent);
        this.setUrutan(pUrutan);
    }

    /**
     * Constructor MyLayer
     * @param pModul the name of activity
     * @param pGrup the name of group layer
     * @param pNama_Layer the name of layer
     * @param pBasemap basemap or not
     * @param pTipe_Layer type of layer, osm, dynamic, tiled, etc
     * @param pTipe_Kontrol type of control ex. chk(checkbox), rdb(radiobutton), etc
     * @param pHost host of layer service ex. http://10.10.10.2, http://jdsd.kaltimprov.go.id:6080
     * @param pService url of layer service ex. /arcgis/rest/services/Admin_Wilayah_Kaltim/MapServer
     * @param pInitial initial value of layer visibility, 1 visible, 0 invisible
     * @param pCurrent current value of layer visibility, 1 visible, 0 invisible
     * @param pUrutan the order of layer
     */
    public MyLayer(String pModul, String pGrup, String pNama_Layer, String pBasemap, String pTipe_Layer
            , String pTipe_Kontrol, String pHost, String pService, String pInitial, String pCurrent, int pUrutan) {
        this.setModul(pModul);
        this.setGrup(pGrup);
        this.setNama_layer(pNama_Layer);
        this.setBasemap(pBasemap);
        this.setTipe_layer(pTipe_Layer);
        this.setTipe_kontrol(pTipe_Kontrol);
        this.setHost(pHost);
        this.setService(pService);
        this.setInitial(pInitial);
        this.setCurrent(pCurrent);
        this.setUrutan(pUrutan);
    }


}
