
package sdgsweden;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * @author willi
 */
public class SDGSweden {
    private static InfDB idb;
    public static void main(String[] args) {
        try {
            // Aktivera FlatDarkLaf *innan* några fönster visas
            UIManager.setLookAndFeel(new FlatDarkLaf());

            idb = new InfDB("sdgsweden", "3306", "dbAdmin2024", "dbAdmin2024PW");
            new Inloggning(idb).setVisible(true);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.err.println("Kunde inte sätta LookAndFeel: " + e.getMessage());
        }
    }
}
