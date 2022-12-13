
package StudiKasus4;

import java.util.Scanner;

/**
 *
 * @author IdeaPad GAMING
 */
public class Main {

    
    public static void main(String[] args) {
        int[] listBilangan= {0, 0, 0, 0, 0, 0};
        int x;
        Scanner input = new Scanner(System.in);
        for(x = 0; x < listBilangan.length; ++x)
        {
            try
            {
                System.out.print("Masukan Bilangan >> ");
                listBilangan[x] = input.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Exception Muncul");
            }
        }
        System.out.print("Bilangan : ");
        for(x = 0; x < listBilangan.length; ++x)
        System.out.print(listBilangan[x] + " ");
        System.out.println();
    }
}
