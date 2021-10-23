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
public class Person {
    private String nama;
    private Rumah rumah;
    
    Person(String nama,Rumah rumah) {
        this.nama = nama;
        this.rumah = rumah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Rumah getRumah() {
        return rumah;
    }

    public void setRumah(Rumah rumah) {
        this.rumah = rumah;
    }
}
