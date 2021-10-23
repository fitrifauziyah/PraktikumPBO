package ClassRelationships;

import java.util.*;

/**
 *
 * @author Fitri Fauziyah
 */
public class Prodi {
    private String nama;
    private List<Mahasiswa> mhs;
    
    Prodi(String nama, List<Mahasiswa> mhs) {
        this.nama = nama;
        this.mhs = mhs;
    }

    public String getNama() {
        return nama;
    }
    
    public List<Mahasiswa> getMhs() {
        return mhs;
    }
}
