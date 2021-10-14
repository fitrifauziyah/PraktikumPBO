/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3;

import java.util.Scanner;

/**
 *
 * @author Fitri Fauziyah
 */
public class BukaTutupJalan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String plat1 = sc.next();
    String plat2 = sc.next();       
    String plat3 = sc.next();
    String plat4 = sc.next();
    String gabungan = plat1 + plat2 + plat3 + plat4;
    long x = Long.parseLong(gabungan);                  //konversi tipe data string ke long
    Long hasil = (x - 999999)%5;       
    if(hasil == 0)
            System.out.println("jalan");
    else
        System.out.println("berhenti");
    }
}
