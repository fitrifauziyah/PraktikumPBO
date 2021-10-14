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
public class Berhitung {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
	String operator;
		
	A = sc.nextInt();			
	operator = sc.next();
	B = sc.nextInt();
		
	if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
            switch (operator){
		case "+" : 
                    System.out.println(A + B);
                    break; 
		case "-" : 
                    System.out.println(A - B);
                    break; 
		case "*" : 
		    System.out.println(A * B);
		    break;
		case "/" : 
		    System.out.println(A / B);
		    break;
		case "%" : 
		    System.out.println(A % B);
		    break;
		default : System.out.println(" - ");
            }	
	} else
            System.out.println("Angka yang Anda masukkan melebihi limit.");
     }
}
