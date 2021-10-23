/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah;

import java.util.List;

/**
 *
 * @author Fitri Fauziyah
 */
public class Rumah {
    private int no;
    private String namaPemilik;
    private final List <Ruangan> ruangan;   //composition
    
    public Rumah(int no,String namaPemilik,List <Ruangan> ruangan) {
        this.no = no;
        this.namaPemilik = namaPemilik;
        this.ruangan = ruangan;
    }
    
    public List <Ruangan> getTotalRuangan() {
        return ruangan;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }
}
