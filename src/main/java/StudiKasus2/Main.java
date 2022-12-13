
package StudiKasus2;

import java.util.Scanner;

/**
 *
 * @author IdeaPad GAMING
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.print("Masukan pembilang >> ");
        pembilang = input.nextInt();
        System.out.print("Masukan penyebut >> ");
        penyebut = input.nextInt();
        if(penyebut == 0)
        System.out.println ("Cannot divide by 0");
        else
            {
                hasil = pembilang / penyebut;
                System.out.println(pembilang + " / " + penyebut +" = " + hasil);
            }
        }
    }
    