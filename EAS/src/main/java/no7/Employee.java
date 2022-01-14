/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no7;
import java.util.*;

/**
 *
 * @author Fitri Fauziyah
 */
public class Employee {
    public static void main(String[] args) {
        ArrayList<String> listJabatan = new ArrayList<String>();

        //Adding elements to list
        listJabatan.add("Direktur");
        listJabatan.add("Kepala Bidang");
        listJabatan.add("Sekretaris");
        listJabatan.add("Bendahara");

        List<String> syncList = null;
        syncList = listJabatan;

        Iterator<String> iteratorListJabatan = listJabatan.iterator();
        System.out.println("Isi List Jabatan :");
        for (int i = 0; i <= listJabatan.size() - 1; i++) {
            System.out.println(iteratorListJabatan.next());
        }

        Iterator<String> iteratorSyncList = syncList.iterator();
        System.out.println("\nIsi Sync List :");
        for (int i = 0; i <= syncList.size() - 1; i++) {
            System.out.println(iteratorSyncList.next());
        }
    }
}
