package Kasus2;

import java.util.Scanner;

/**
 *
 * @author Fitri Fauziyah
 */
public class RestaurantMain {
    public static void main(String[] args) {
        String makananDipesan;
        int jumlahDipesan;
        
        Scanner sc = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        System.out.println("----------------------MENU----------------------");
        menu.tampilMenuMakanan();
        System.out.println("\nmasukkan nama makanan yang ingin dipesan: ");
        makananDipesan = sc.nextLine();
        System.out.println("masukkan jumlah makanan yang ingin dipesan: ");
        jumlahDipesan = sc.nextInt();
        menu.pesanan(makananDipesan,jumlahDipesan);
        System.out.println("\n");
        menu.tampilMenuMakanan();
    }
}
