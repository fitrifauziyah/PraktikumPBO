package Kasus2;

/**
 *
 * @author Fitri Fauziyah
 */
public class Restaurant {
    private Makanan[] menuMakanan;
    private static byte id=0;

    public Restaurant() {
        menuMakanan = new Makanan[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.menuMakanan[id] = new Makanan(nama, harga, stok);
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                this.menuMakanan[i].tampilMakanan();
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        return menuMakanan[id].getStok() == 0;
    }

    public static void nextId(){
        id++;
    }
    
    public void pesanan(String nama, int jumlah){
        for(int i =0; i<=id;i++){
            if(nama.equals(menuMakanan[i].getNama_makanan())){
                if(menuMakanan[i].getStok() >= jumlah){
                    System.out.println("Pemesanan Berhasil!");
                    menuMakanan[i].kurangiStok(jumlah);
                } else
                    System.out.println("Stok " + nama + " tidak cukup.");
            }
        }
    }
}
