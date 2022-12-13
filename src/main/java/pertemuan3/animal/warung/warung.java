
package pertemuan3.animal.warung;


public class warung {
    // tidak perlu menggunakan main, karena bukan program utama
    // atribut
     private String barang;
     private int stok;
     private int harga;
    
   // Constructur
    public warung(){};
    
    // alt + fn + insert + construktur + select all// alt + fn + insert + construktur + select all
    public warung(String barang, int stok, int harga){
        this.barang = barang;
        this.stok = stok;
        this.harga = harga;
    }

    public void showProfile() {
        System.out.println(" Barang : " + barang);
        System.out.println(" Stok : " + stok);
        System.out.println(" Harga : " + harga);
    }
    // alt + fn + insert + getter and setter + select all
    // fungsi getter & setter 

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
