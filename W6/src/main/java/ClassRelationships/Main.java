package ClassRelationships;

import java.util.*;

/**
 *
 * @author Fitri Fauziyah
 */
public class Main {
    public static void main(String[] args) {
        StatusMhs s1 = new StatusMhs("aktif",2020);
        StatusMhs s2 = new StatusMhs("aktif",2021);

        Mahasiswa m1 = new Mahasiswa(201511040,"Fitri Fauziyah",s1);
        Mahasiswa m2 = new Mahasiswa(192011838,"Billie Eilish",s2);
        Mahasiswa m3 = new Mahasiswa(826377255,"Dummy",s1);
        Mahasiswa m4 = new Mahasiswa(201117764,"John",s1);

        List<Mahasiswa> mhsTM = new ArrayList<>();
        mhsTM.add(m1);
        mhsTM.add(m2);
        
        List<Mahasiswa> mhsTA = new ArrayList<>();
        mhsTA.add(m3);
        mhsTA.add(m4);
        
        Prodi p1 = new Prodi("Teknik Perminyakan",mhsTM);
        Prodi p2 = new Prodi("Teknik Pertambangan",mhsTA);
        
        List<Prodi> prodiFTTM = new ArrayList<>();
        prodiFTTM.add(p1);
        prodiFTTM.add(p2);
        
        Fakultas f1 = new Fakultas("FTTM",prodiFTTM);
        
        DaerahAsal d1 = new DaerahAsal();
        d1.setKota("Las Vegas");
        d1.setProvinsi("Jawa Barat");
        
        DaerahAsal d2 = new DaerahAsal();
        d2.setKota("Sodong Hulu");
        d2.setProvinsi("Hawaii");
        
        DaerahAsal d3 = new DaerahAsal();
        d3.setKota("Bandung");
        d3.setProvinsi("Jawa Barat");
        
        while(true) {
            System.out.println("----------------Info Mahasiswa "+f1.getNama()+"----------------");
            List<Prodi> prodi = f1.getTotalProdi();
            for (Prodi p : prodi)
                    System.out.println(p.getNama());
            System.out.println("Keluar");
            System.out.println("Pilihan: ");
            Scanner sc = new Scanner(System.in);
            String pilih = sc.nextLine();

            List<Mahasiswa> mhs1 = p1.getMhs();
            List<Mahasiswa> mhs2 = p2.getMhs();
            if (pilih.equalsIgnoreCase(p1.getNama())) {
                for (Mahasiswa m : mhs1){
                    System.out.println("NIM    : "+m.getNIM());
                    System.out.println("nama   : "+m.getNama());
                    m.printStatus();
                }
                System.out.println("lihat asal daerah mahasiswa[Y/T]: ");
                String plh = sc.nextLine();
                if (plh.equalsIgnoreCase("y")) {
                    System.out.println(m1.getNama()+" = "+d1.getKota()+", "+d1.getProvinsi());
                    System.out.println(m2.getNama()+" = "+d2.getKota()+", "+d2.getProvinsi());
                }
            } else if (pilih.equalsIgnoreCase(p2.getNama())) {
                for (Mahasiswa m : mhs2){
                    System.out.println("NIM    : "+m.getNIM());
                    System.out.println("nama   : "+m.getNama());
                    m.printStatus();
                }
                System.out.println("lihat asal daerah mahasiswa[Y/T]: ");
                String plh = sc.nextLine();
                if (plh.equalsIgnoreCase("y")) {
                    System.out.println(m3.getNama()+" = "+d1.getKota()+", "+d1.getProvinsi());
                    System.out.println(m4.getNama()+" = "+d3.getKota()+", "+d3.getProvinsi());
                }
            } else if (pilih.equalsIgnoreCase("keluar"))
                System.exit(0);
        }
    }
}