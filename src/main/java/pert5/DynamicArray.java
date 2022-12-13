
package pert5;

import java.util.Scanner;
/**
 *
 * @author IdeaPad GAMING
 */
public class DynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("===Program Input Nilai===");
        System.out.println(" Masukkan jumlah matkul ");
        int jml = input.nextInt();
        System.out.println();
        
        int [] nilai = new int [jml];
        
        for(int i = 0; i<jml ; i++){
            System.out.println("Masukkan nilai ke " + (i+1) + " : ");
            nilai [i] = input.nextInt();
        }
        System.out.println();
        System.out.println("===Daftar Nilai===");
        for(int i =0 ; i<jml ; i++){
            System.out.println(i + " : " + nilai [i]);
        }
    }
}
