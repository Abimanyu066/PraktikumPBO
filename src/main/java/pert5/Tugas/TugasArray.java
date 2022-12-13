
package pert5.Tugas;
import java.util.Scanner;
/**
 *
 * @author IdeaPad GAMING
 */
public class TugasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("===Program Input Stock Barang===");
        System.out.println(" Masukkan Jumlah Barang ");
        int jml = input.nextInt();
        System.out.println();
        
        int [] nilai = new int [jml];
        
        for(int i = 0; i<jml ; i++){
            System.out.println("Masukkan Barang ke " + (i+1) + " : ");
            nilai [i] = input.nextInt();
        }
        System.out.println();
        System.out.println("===Daftar Barang===");
        for(int i =0 ; i<jml ; i++){
            System.out.println(i + " : " + nilai [i]);
        }
    }
}
