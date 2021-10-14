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
public class GajiAgent {
    public static void main(String[] args) {
        int item;
        int gaji = 500000;
        int hargaItem = 50000;
        Scanner sc = new Scanner(System.in);
        item = sc.nextInt();
        if(item >= 40 && item < 80)
            gaji += item * hargaItem * 0.25;
        else if(item >= 80)
            gaji += item * hargaItem * 0.35;
        else if(item < 15)
            gaji -= (15 - item) * hargaItem * 0.15;
        else 
            gaji += item * hargaItem * 0.1;
        System.out.println(gaji);
    }
}
