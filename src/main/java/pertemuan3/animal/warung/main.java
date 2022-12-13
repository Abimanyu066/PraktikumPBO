
package pertemuan3.animal.warung;

public class main {
        public static void main(String[] args) {
         // -- Pembuatan Class --
        warung satu = new warung("Beras", 6, 69000);
        warung dua = new warung("Minyak ", 6, 66000);
        warung tiga = new  warung("Sabun", 6, 7000);

        // Menjalankan method 'showProfile()' masing-masing object
        satu.showProfile();
        dua.showProfile();
        tiga.showProfile();
       
    }  
}
