package com.example.katalogsmartphone.model;



public class Hp {
    private String merek;
    private String nama;
    private String flatfrorm;
    private String deskripsi;
    private int drawableRes;

    public Hp(String merek, String nama, String flatfrorm, String deskripsi, int drawableRes) {
        this.merek = merek;
        this.nama = nama;
        this.flatfrorm = flatfrorm;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNama() { return nama; }

    public void setNama(String nama) { this.nama = nama; }

    public String getFlatfrorm() { return flatfrorm; }

    public void setFlatfrorm(String flatfrorm) { this.flatfrorm= flatfrorm; }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
