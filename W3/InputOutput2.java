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
public class InputOutput2 {
      public static void main(String[] args) {
            String[] str = new String[3];
            int[] integer = new int[3];
            Scanner sc = new Scanner(System.in);
            boolean range = true;
            
            for(int i=0;i<3;i++) {
                str[i] = sc.next();
                integer[i] = sc.nextInt();
                if(!(str[i].length() <= 10 && integer[i] >= 0 && integer[i] < 1000))    //validasi input
                    range = false;
                }
            if(range) {
                System.out.println("================================");
                System.out.printf("%-15s %03d\n", str[0], integer[0]);                  //membuat kolom string rata sebesar 15 karakter
                System.out.printf("%-15s %03d\n", str[1], integer[1]);                  //dan kolom integer tepat 3 digit
                System.out.printf("%-15s %03d\n", str[2], integer[2]);    
                System.out.println("================================");
            } else
                System.out.println("Your input exceeds the maximum limit.");
    }
}
