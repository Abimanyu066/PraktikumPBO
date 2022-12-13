
package pertemuan3.animal;

/**
 *
 * @author IdeaPad GAMING
 */
public class Main {
    public static void main(String[] args) {
        
        Animal cat = new Animal("Pussy", 6, "Orange");
        Animal dog = new Animal("Doggy", 6, "Black");
        Animal rabbit = new Animal ("Vhagar", 6, "Green");
        
        
        
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        
                
        System.out.println("Dog's name (before) : " + dog.getName());
        dog.setName("Blacky");
        System.out.println("Dog's name (after) : " + dog.getName());
    }
    
}
