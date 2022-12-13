
package pert5;

/**
 *
 * @author IdeaPad GAMING
 */
public class Array2 {
    public static void main(String[] args) {
        String [] names ={
            "Rain", " Thunder", "Storm"
        };
        
        System.out.println("Panjang Array : " + names.length);
        
        names[0] = "Rain";
        names[1] = "Thunder";
        names[2] = "Storm";
        
        for(int i = 0; i < names.length; i++){
            System.out.println(i + ":" + names[i]);
        }
    }   
}
