/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBOP6;

/**
 *
 * @author IdeaPad GAMING
 */
public class Staff extends Pegawai {
    private int jamKerja;
    private int jamLembur;

    public Staff(String npp, String nama, double gaji, int jamKerja, int jamLembur) {
        super(npp, nama, gaji);
        this.jamKerja = jamKerja;
        this.jamLembur = jamLembur;
    }

    @Override
    public void showData() {
        System.out.println("NPP : " + npp);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
    public double totalPendapatan(){
        return
    }
    
}
