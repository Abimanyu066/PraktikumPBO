
package StudiKasus3;

import java.util.Scanner;

/**
 *
 * @author IdeaPad GAMING
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.print("Masukan pembilang >> ");
        pembilang = input.nextInt();
        System.out.print("Masukan penyebut >> ");
        penyebut = input.nextInt();
        try
        {
            hasil = pembilang / penyebut;
            System.out.println(pembilang + " / " + penyebut + " = " + hasil);
        }
        catch(ArithmeticException mistake)
        {
            System.out.println("Error perhitungan aritmatika sudah ditangani");
        }
            System.out.println("Program Selesai");
     }
}
   
