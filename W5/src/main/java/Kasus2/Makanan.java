package Kasus2;

/**
 *
 * @author Fitri Fauziyah
 */
public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Makanan(String nama, double harga, int stok){
        this.nama_makanan = nama;
        this.harga_makanan = harga;
        this.stok = stok;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public double getHarga_makanan() {
        return harga_makanan;
    }

    public int getStok() {
        return stok;
    }
    
    public void tampilMakanan(){
        System.out.println(nama_makanan +"["+stok+"]"+"\tRp. "+harga_makanan);
    }
    
    public void kurangiStok(int stock){
        stok -= stock;
    }
}
