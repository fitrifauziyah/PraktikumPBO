/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2;

import java.util.Scanner;

/**
 *
 * @author Fitri Fauziyah
 */
public class Strings {
    public static void main(String[] args){
        String A, B;
        int sum, x;
        
        Scanner sc = new Scanner(System.in);
        A = sc.nextLine();
        B = sc.nextLine();
        
        sum = A.length() + B.length();
        System.out.println("\n" + sum);
        
        x = A.compareTo(B);
        if(x > 0){
             System.out.println("Yes");
        } else{
             System.out.println("No");
        }
        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
