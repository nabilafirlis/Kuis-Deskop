/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;


public class Setrika {
    
    private String harga,merek, warna, tanggal_masuk, jenis;

    public Setrika(String harga, String merek, String warna, String tanggal_masuk, String jenis) {
        this.harga = harga;
        this.merek = merek;
        this.warna = warna;
        this.tanggal_masuk = tanggal_masuk;
        this.jenis = jenis;
    }

    
    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
   
    
}
