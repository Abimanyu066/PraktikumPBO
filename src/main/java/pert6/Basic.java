
package pert6;

/**
 *
 * @author IdeaPad GAMING
 */
public class Basic {
    public static void main(String[] args) {
        int [] myNumbers = {1, 2, 3};
        
        try {
        System.out.println(myNumbers[10]);
        }
        catch(ArithmeticException e ){
            System.out.println("Array tidak sebesar itu");
        }
        System.out.println("Proses selesai");
    }
}
