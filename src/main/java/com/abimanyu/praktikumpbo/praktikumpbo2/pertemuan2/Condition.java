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
public class Condition {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan Bulat : ");
        int bilangan = Input.nextInt();
        
        if(bilangan > 0)
            System.out.println(" adalah bilangan positif");
        
        else if(bilangan < 0)
            System.out.println(" adalah bilangan negatif");
        
        else
            System.out.println(" adalah nol");
                
        
    }
}
