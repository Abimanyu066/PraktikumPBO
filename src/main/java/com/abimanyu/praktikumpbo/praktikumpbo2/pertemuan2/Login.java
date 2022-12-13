/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abimanyu.praktikumpbo.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class Login {
    static final Scanner in = new Scanner (System.in);
    static String user, pass;
    
    // variable 
    static String user(){
        System.out.println(" Username = ");
        user = in.nextLine();
        return user;    
    } static String pass(){
            System.out.println(" Password  = ");
            pass = in.nextLine();
            return pass;
        
    }
    

    public static void main(String[] args) {
        String nama, username, pass, repeat;
        boolean reg = true;
        
        while(reg){ 
            System.out.print(" Username = ");
            username = in.nextLine();
            
            System.out.print(" Password = ");
            pass = in.nextLine();
            
            System.out.print(" Nama = ");
            nama = in.nextLine();
                    
            System.out.print(" Password salah, Silahkan ulangi = ");
            repeat = in.nextLine();
            
            if(repeat.equals(pass)){
                reg = false;
                System.out.println(" * LOGIN SUCCES * ");
                for (int i=3; i >=1; i--){
                    if (user().equals(username) && pass().equals(pass)){
                    System.out.println(" * LOGIN SUCCES * ");
                    break; 
                }
                    else if( i == 1){
                        System.out.println(" USERNAME / PASSWORD ANDA SALAH ");
                        }
                            else{
                            System.out.println(" ANDA GAGAL LOGIN ");
                            }
                }
            }
        }
     
    }
}
