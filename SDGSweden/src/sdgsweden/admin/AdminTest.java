package sdgsweden.admin;
import javax.swing.*;
import sdgsweden.admin.AdminPanel;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

public class AdminTest
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            try {
                // Skapa databasanslutning
                InfDB idb = new InfDB("sdgsweden", "3306", "dbAdmin2024", "dbAdmin2024PW"); // byt till rätt databasfil om nödvändigt

                // Skapa fönster
                JFrame fönster = new JFrame("Adminpanel");
                fönster.setContentPane(new AdminPanel(idb)); // Skicka in databasen
                fönster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fönster.pack();
                fönster.setVisible(true);
            } catch (InfException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen: " + e.getMessage());
            }
        });
    }
}
    

