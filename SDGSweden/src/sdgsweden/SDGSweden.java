
package sdgsweden;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * @author willi
 */
public class SDGSweden {
    private static InfDB idb;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            idb = new InfDB("sdgsweden", "3306", "dbAdmin2024", "dbAdmin2024PW");
            new Inloggning(idb).setVisible(true);
            
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
