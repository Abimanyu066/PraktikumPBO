
package Pert4;

/**
 *
 * @author IdeaPad GAMING
 */
public class Main {
    public static void main(String[] args) {
        Mobil mb = new Mobil();
        kendaraan kn = new kendaraan();
        Motor mr = new Motor();
        
        mb.nama = "Mitsubishit";
        mb.jmlRoda = 4;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        mr.nama = "GoFLy";
        mr.jmlRoda = 2;
        
        mb.showInfo();
        mb.belok("Kanan");
        mb.belok();
        
        kn.showInfo();
        
        mr.belok("Atas");
        mr.terbang(20000);
        
    }
}
