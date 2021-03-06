/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fitri.w12;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.*;

/**
 *
 * @author Fitri Fauziyah
 */
public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            FileReader json = new FileReader("D:\\POLBAN\\SEMESTER 3\\PBO\\Github3\\PraktikumPBO\\W12\\barang.json");
            ArrayList<Barang> product = gson.fromJson(json, new TypeToken<ArrayList<Barang>>() {}.getType());
            System.out.printf("%-23s","      ProductName");
            System.out.printf("%-9s","| Quantity ");
            System.out.printf("%-7s","| Weight ");
            System.out.printf("%-12s","| Destination ");
            System.out.printf("%-26s","|         Service ");
            System.out.printf("%-10s","|  Value ");
            System.out.printf("%-10s","|  Total  |\n");
            for (int i=0;i<product.size();i++) {
                System.out.printf("%-23s",product.get(i).getProductName());
                System.out.printf("| %-9s",product.get(i).getQuantity());
                System.out.printf("| %-7s",product.get(i).getWeight());
                System.out.printf("| %-12s",product.get(i).city.getDestination());
                System.out.printf("| %-24s",product.get(i).servicePackage.getService());
                System.out.printf("| %-8s",product.get(i).servicePackage.getValue());
                System.out.printf("| %-8s",
                        (product.get(i).getQuantity()*product.get(i).getPriceItem())
                                +product.get(i).servicePackage.getValue());
                System.out.printf("|\n");
            }
        } catch(JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
