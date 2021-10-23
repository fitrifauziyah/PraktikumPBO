/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah;

/**
 *
 * @author Fitri Fauziyah
 */
public class Provinsi {
    private String nama;
    private Kota kota;
    
    public Provinsi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public Kota getKota() {
        return kota;
    }

    public void setKota(Kota kota) {
        this.kota = kota;
    }
    
    
}
