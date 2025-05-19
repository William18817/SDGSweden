package sdgsweden.admin;
import javax.swing.*;
import sdgsweden.admin.AdminPanel;

public class AdminTest
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            JFrame fönster = new JFrame("Adminpanel");
            fönster.setContentPane(new AdminPanel());
            fönster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fönster.pack();
            fönster.setVisible(true);
        });
    }
}
    

