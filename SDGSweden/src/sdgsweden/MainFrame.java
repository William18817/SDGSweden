package sdgsweden;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

// MainFrame ärver klassen JFrame från java
// aid används för att identifiera vilken användare som är inloggad.
public class MainFrame extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;

//Konstruktorn tar emot databasanslutningen och användarID på den inloggade personen.
    // Den här konstrukotrn används efter inloggningen och visar startsidan.
    public MainFrame(InfDB idb, String aid) {
        this.idb = idb;
        this.aid = aid;
        initComponents();

        Startsida startsida = new Startsida(this, idb, aid);
        mainPanel.add(startsida, "startsida");

        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, "startsida");
    }

    //Alterativ konstrukr, används om man vill starta direkt från MainFrame istället för Inloggningsrutan.
    public MainFrame() {
        initComponents();
        try {
            InfDB idb = new InfDB("sdgsweden", "3306", "dbAdmin2024", "dbAdmin2024PW");
            Startsida startsida = new Startsida(this, idb, aid);
            mainPanel.add(startsida, "startsida");

            // Visa startsidan som första vy
            CardLayout cl = (CardLayout) mainPanel.getLayout();
            cl.show(mainPanel, "startsida");
        } catch (InfException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Kunde inte ansluta till databasen: " + ex.getMessage());
        }
    }
    // Metoden som används av andra klasser för att byta sida som visas i MainFrame-fönstret

    public void visaPanel(javax.swing.JPanel panel, String namn) {
        mainPanel.add(panel, namn);
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.show(mainPanel, namn);
    }

// Kod från designläget
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
