/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.model;

/**
 *
 * @author Asus
 */
public class Setrika {
    private String kode;
    private String merk;
    private String tanggalProduksi;
    private String harga;
    private String warna;

    public Setrika(String kode, String merk, String tanggalProduksi, String harga, String warna) {
        this.kode = kode;
        this.merk = merk;
        this.tanggalProduksi = tanggalProduksi;
        this.harga = harga;
        this.warna = warna;
    }
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTanggalProduksi() {
        return tanggalProduksi;
    }

    public void setTanggalProduksi(String tanggalProduksi) {
        this.tanggalProduksi = tanggalProduksi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    

    
}
