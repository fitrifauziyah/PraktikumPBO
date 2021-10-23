package ClassRelationships;

/**
 *
 * @author Fitri Fauziyah
 */
public class Mahasiswa {
    private int NIM;
    private String nama;
    private StatusMhs status;
    
    public Mahasiswa(int NIM, String nama, StatusMhs status) {
        this.NIM = NIM;
        this.nama = nama;
        this.status = status;
    }

    public int getNIM() {
        return NIM;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void printStatus() {
        System.out.println("Status : "+status.getStatus()+" sejak "+status.getTahunDibterlakukan()+"\n");
    }
}
