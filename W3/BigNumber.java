/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Fitri Fauziyah
 */
public class BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        System.out.println(bigA.add(bigB));
        System.out.println(bigB.multiply(bigA));
    }
}
