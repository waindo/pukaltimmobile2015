package com.matos.mygis.database.models;

/**
 * Created by matOS on 7/12/2015.
 */
public class Layer {

    public static final String DYNAMIC = "dynamic";
    public static final String FEATURE = "feature";
    public static final String TILED = "tiled";
    public static final String OSM = "osm";

    private int id;
    private int urutan;
    private String nama_modul;
    private String nama_grup;
    private String teks_tampil;
    private String tipe_layer;
    private String tipe_kontrol;
    private String host;
    private String service;
    private String identify_url;
    private String identify_layer;
    private boolean is_grup_layer = false;
    private boolean is_basemap = false;
    private boolean initial_on_off = false;
    private boolean on_off = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }

    public String getNama_modul() {
        return nama_modul;
    }

    public void setNama_modul(String nama_modul) {
        this.nama_modul = nama_modul;
    }

    public String getNama_grup() {
        return nama_grup;
    }

    public void setNama_grup(String nama_grup) {
        this.nama_grup = nama_grup;
    }

    public String getTeks_tampil() {
        return teks_tampil;
    }

    public void setTeks_tampil(String teks_tampil) {
        this.teks_tampil = teks_tampil;
    }

    public String getTipe_layer() {
        return tipe_layer;
    }

    public void setTipe_layer(String tipe_layer) {
        this.tipe_layer = tipe_layer;
    }

    public String getTipe_kontrol() {
        return tipe_kontrol;
    }

    public void setTipe_kontrol(String tipe_kontrol) {
        this.tipe_kontrol = tipe_kontrol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getIdentify_url() {
        return identify_url;
    }

    public void setIdentify_url(String identify_url) {
        this.identify_url = identify_url;
    }

    public String getIdentify_layer() {
        return identify_layer;
    }

    public void setIdentify_layer(String identify_layer) {
        this.identify_layer = identify_layer;
    }

    public boolean is_grup_layer() {
        return is_grup_layer;
    }

    public void setIs_grup_layer(boolean is_grup_layer) {
        this.is_grup_layer = is_grup_layer;
    }

    public boolean is_basemap() {
        return is_basemap;
    }

    public void setIs_basemap(boolean is_basemap) {
        this.is_basemap = is_basemap;
    }

    public boolean isInitial_on_off() {
        return initial_on_off;
    }

    public void setInitial_on_off(boolean initial_on_off) {
        this.initial_on_off = initial_on_off;
    }

    public boolean isOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    /**
     * Contructor Layer
     */
    public Layer() {
    }

    /**
     * Constructor Layer
     * @param pId table id
     * @param pNama_Modul the name of activity
     * @param pNama_Grup the name of group layer
     * @param pTeks_Tampil the name of layer that will be displayed
     * @param pTipe_Layer type of layer, osm, dynamic, tiled, etc
     * @param pTipe_Kontrol type of control ex. chk(checkbox), rdb(radiobutton), etc
     * @param pHost host of layer service ex. http://10.10.10.2, http://jdsd.kaltimprov.go.id:6080
     * @param pService url of layer service ex. /arcgis/rest/services/Admin_Wilayah_Kaltim/MapServer
     * @param pIs_Grup_Layer indicate layer is a grup
     * @param pIs_Basemap indicate layer is a basemap
     * @param pInitial_On_Off initial value of layer visibility, 1 visible, 0 invisible
     * @param pOn_Off current value of layer visibility, 1 visible, 0 invisible
     * @param pUrutan the order of layer
     */
    public Layer(int pId, String pNama_Modul, String pNama_Grup, String pTeks_Tampil
            , String pTipe_Layer, String pTipe_Kontrol, String pHost, String pService
            , boolean pIs_Grup_Layer, boolean pIs_Basemap, boolean pInitial_On_Off
            , boolean pOn_Off, int pUrutan) {
        this.setId(pId);
        this.setUrutan(pUrutan);
        this.setNama_modul(pNama_Modul);
        this.setNama_grup(pNama_Grup);
        this.setTeks_tampil(pTeks_Tampil);
        this.setTipe_layer(pTipe_Layer);
        this.setTipe_kontrol(pTipe_Kontrol);
        this.setHost(pHost);
        this.setService(pService);
        this.setIs_grup_layer(pIs_Grup_Layer);
        this.setIs_basemap(pIs_Basemap);
        this.setInitial_on_off(pInitial_On_Off);
        this.setOn_off(pOn_Off);
    }

    /**
     * Constructor Layer
     * @param pNama_Modul the name of activity
     * @param pNama_Grup the name of group layer
     * @param pTeks_Tampil the name of layer that will be displayed
     * @param pTipe_Layer type of layer, osm, dynamic, tiled, etc
     * @param pTipe_Kontrol type of control ex. chk(checkbox), rdb(radiobutton), etc
     * @param pHost host of layer service ex. http://10.10.10.2, http://jdsd.kaltimprov.go.id:6080
     * @param pService url of layer service ex. /arcgis/rest/services/Admin_Wilayah_Kaltim/MapServer
     * @param pIs_Grup_Layer indicate layer is a grup
     * @param pIs_Basemap indicate layer is a basemap
     * @param pInitial_On_Off initial value of layer visibility, 1 visible, 0 invisible
     * @param pOn_Off current value of layer visibility, 1 visible, 0 invisible
     * @param pUrutan the order of layer
     */
    public Layer(String pNama_Modul, String pNama_Grup, String pTeks_Tampil
            , String pTipe_Layer, String pTipe_Kontrol, String pHost, String pService
            , boolean pIs_Grup_Layer, boolean pIs_Basemap, boolean pInitial_On_Off
            , boolean pOn_Off, int pUrutan) {
        this.setUrutan(pUrutan);
        this.setNama_modul(pNama_Modul);
        this.setNama_grup(pNama_Grup);
        this.setTeks_tampil(pTeks_Tampil);
        this.setTipe_layer(pTipe_Layer);
        this.setTipe_kontrol(pTipe_Kontrol);
        this.setHost(pHost);
        this.setService(pService);
        this.setIs_grup_layer(pIs_Grup_Layer);
        this.setIs_basemap(pIs_Basemap);
        this.setInitial_on_off(pInitial_On_Off);
        this.setOn_off(pOn_Off);
    }
}
