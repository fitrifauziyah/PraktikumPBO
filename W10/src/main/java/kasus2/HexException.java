package kasus2;

import java.util.Scanner;
/**
 *
 * @author Fitri Fauziyah
 */
public class HexException {
    public static void main(String[] args) {
        String hex;
        int dec;

        Scanner sc = new Scanner(System.in);
        System.out.print("Hex: ");
        hex = sc.nextLine();
        try {
            dec = Integer.parseInt(hex, 16);
            System.out.println("Dec: " + dec);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + " handled");
        }
    }
}
