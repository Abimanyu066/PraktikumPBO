
package Pert4;

/**
 *
 * @author IdeaPad GAMING
 */
public class kendaraan {
    String nama;
    int jmlRoda;
    
    public void nyalakanMesin (){
        System.out.println("Mesin" + nama + "Telah dinyalakan");
    }
    public void showInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jml Roda : " + jmlRoda);
        extraInfo();
    }
    public void extraInfo () {
        
    }
}
