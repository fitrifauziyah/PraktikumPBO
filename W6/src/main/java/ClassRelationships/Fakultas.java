package ClassRelationships;

import java.util.*;

/**
 *
 * @author Fitri Fauziyah
 */
public class Fakultas {
    private String nama;
    private List<Prodi> prodi;
    
    public Fakultas(String nama, List<Prodi> prodi) {
        this.nama = nama;
        this.prodi = prodi;
    }
    
//    public void getProdi() {
//        
//    
    public List<Prodi> getTotalProdi() {
        return prodi;
    }

    public String getNama() {
        return nama;
    }
    
    //}
}