package sdgsweden.projekt;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JFrame;
/**
 * @author jonas
 */
public class ProjektTest {
    private static InfDB idb;
    
    
    public static void main(String[] args) {
        try {
            // Koppla till databasenp
            idb = new InfDB("sdgsweden", "3306", "dbAdmin2024", "dbAdmin2024PW");

            //String handlaggarId = "10"; // hårdkodat ÄNDRA
            // Skapa din Projekt-panel (JPanel)
            Projekt projektPanel = new Projekt(idb);

            // Skapa ett testfönster (JFrame)
            JFrame testFrame = new JFrame("Testfönster för Projekt-panelen");
            testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            testFrame.getContentPane().add(projektPanel); // Lägg till panelen
            testFrame.pack(); // Anpassar storleken till innehållet
            testFrame.setLocationRelativeTo(null); // Centrerar fönstret på skärmen
            testFrame.setVisible(true); // Visar fönstret

            System.out.println("Jonas det funkar");
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
}