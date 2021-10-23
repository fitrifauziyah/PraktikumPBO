/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fitri Fauziyah
 */
public class Main {
    public static void main(String[] args) {
        Ruangan rn1 = new Ruangan("kamar tidur",1);
        Ruangan rn2 = new Ruangan("ruang kerja",2);
        Ruangan rn3 = new Ruangan("ruang tamu",1);
        Ruangan rn4 = new Ruangan("ruang keluarga",2);
        Ruangan rn5 = new Ruangan("kamar rahasia",1);
        
        List <Ruangan> rooms1 = new ArrayList <>();
        rooms1.add(rn1);
        rooms1.add(rn3);
        rooms1.add(rn5);
        
        List <Ruangan> rooms2 = new ArrayList <>();
        rooms2.add(rn1);
        rooms2.add(rn2);
        rooms2.add(rn3);
        
        List <Ruangan> rooms3 = new ArrayList <>();
        rooms3.add(rn1);
        rooms3.add(rn3);
        rooms3.add(rn4);
        
        Rumah r1 = new Rumah(001,"Bapak Dedi",rooms1);
        Rumah r2 = new Rumah(91,"Bapak Ruslan",rooms2);
        Rumah r3 = new Rumah(11,"Bapak Chaniago",rooms3);
        
        Kota k1 = new Kota();
        k1.setNama("Sodong Hulu");
        
        Kota k2 = new Kota();
        k2.setNama("Cimahi");
        
        //Aggregation class Kota dengan class Provinsi
        Provinsi prov1 = new Provinsi("Jawa Barat");
        prov1.setKota(k1);
  
        //Association class Rumah dengan class Provinsi
        System.out.println("Rumah "+r1.getNamaPemilik()+ " ada di Kota " +prov1.getKota().getNama()+", "+prov1.getNama());
//        System.out.println("Rumah "+r2.getNamaPemilik()+ " ada di Kota " +k2.getNama()+", "+k2.getProvinsi());
//        System.out.println("Rumah "+r3.getNamaPemilik()+ " ada di Kota " +k1.getNama()+", "+k1.getProvinsi()+"\n");
        
        //Dependency class Person dengan class Rumah
        Person p1 = new Person("Putri",r1);
        System.out.println(p1.getNama()+" tinggal di rumah "+p1.getRumah().getNamaPemilik());
        
        //Composition class Ruangan dengan class Rumah
        List <Ruangan> roomrumah1 = r1.getTotalRuangan();
        for(Ruangan room : roomrumah1) {
            System.out.print(room.nama+", ");
        }
        System.out.println("ada di rumah "+r1.getNamaPemilik());
        
        //Dependency
        //rooms1.
    }
}


