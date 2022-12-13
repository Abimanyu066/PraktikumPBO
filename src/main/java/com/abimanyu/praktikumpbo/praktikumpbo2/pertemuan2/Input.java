/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abimanyu.praktikumpbo.praktikumpbo2.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author IdeaPad GAMING
 */
public class Input {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        
        
        System.out.println("Masukkan Nama : ");
        String nama = Input.nextLine();
        
        System.out.println("Masukkan Usia : ");
        int usia = Input.nextInt();
        
        System.out.println("Nama Saya : " + nama);
        System.out.println("Usia Saya : " + usia + " Tahun");
    }
}
