package com.matos.mygis.database.models;

/**
 * Created by matOS on 7/6/2015.
 */
public class NavDrawerItem {

    private boolean showNotify;
    private String title;

    public NavDrawerItem() {
    }

    public NavDrawerItem(boolean pShowNotify, String pTitle) {
        setShowNotify(pShowNotify);
        setTitle(pTitle);
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}