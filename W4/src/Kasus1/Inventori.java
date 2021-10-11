/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus1;

/**
 *
 * @author Fitri Fauziyah
 */
public class Inventori {
    Barang[] barangg;
    void initBarang() {
        barangg = new Barang[2];
        barangg[0] = new Barang("001", "Baju", 10);
        barangg[1] = new Barang("002", "Celana", 20);
    }
    
    void showBarang() {
        System.out.println(barangg[0].getNamaBarang() + "(" + barangg[0].getStok() + ")");
        System.out.println(barangg[1].getNamaBarang() + "(" + barangg[1].getStok() + ")");
    }
    
    void pengadaan() {
    initBarang();
    barangg[0].setStok(barangg[0].getStok() + 20);
//  barangs[0].stok -= 30; //Bisa juga dikurangi dong?
//  barangs[0].stok *= 30; //dikali juga bisa dong??
    showBarang();
    }

    public static void main(String[] args) {  
    Inventori beli = new Inventori(); 
    beli.pengadaan(); 
    } 
}
