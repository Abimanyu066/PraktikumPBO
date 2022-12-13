
package pert5;

/**
 *
 * @author IdeaPad GAMING
 */
public class Array1 {
    public static void main(String[] args) {
        String [] names = new String [5];
        
        System.out.println("Panjang Array : " + names.length);
        
        names[0] = "Rain";
        names[1] = "Thunder";
        names[2] = "Storm";
        
        for(int i = 0; i < names.length; i++){
            System.out.println(i + ":" + names[i]);
        }
    }
}
