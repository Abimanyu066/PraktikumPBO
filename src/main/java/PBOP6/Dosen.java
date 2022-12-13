
package PBOP6;


/**
 *
 * @author IdeaPad GAMING
 */
public class Dosen extends Pegawai{
    private int jumlahMatakuliah;
    private int jumlahSertifikat;

    public Dosen(String npp, String nama, double gaji, int jumlahMatakuliah, int jumlahSertifikat) {
        super(npp, nama, gaji);
        this.jumlahMatakuliah = jumlahMatakuliah;
        this.jumlahSertifikat = jumlahSertifikat;
    }
    
    
    public void showData() {
        System.out.println("NPP : " + npp);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
    
    public double totalPendapatan(){
        return
    }

}
