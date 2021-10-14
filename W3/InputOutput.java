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
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] token = s.split("['!?,._@ ]");    //membagi string menjadi token berdasarkan delimeter
        System.out.println(token.length);          //menampilkan jumlah token
        for (String str : token)
        System.out.println(str);
    }
}
