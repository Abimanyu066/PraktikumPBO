
package Pert4;

/**
 *
 * @author IdeaPad GAMING
 */
public class Mobil extends kendaraan {
    public void belok(String arah){
        System.out.println("Mobil " + nama + " belok ke " + arah + " ! ");
    }
    
    public void belok(){
        System.out.println("Error : Mohon masukkan arah");
    }
}
