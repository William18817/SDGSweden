package sdgsweden;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import sdgsweden.admin.AdminPanel;
import sdgsweden.projekt.ProjektChef;
import sdgsweden.projekt.Projekt;


/**
 * @author User
 */
public class Startsida extends javax.swing.JPanel {

    private MainFrame parent;
    private InfDB idb;
    private String aid;

    /*
     * Creates new form Startsida
     *
     * @param parent
     */
    public Startsida(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProjektChef = new javax.swing.JButton();
        label1 = new java.awt.Label();
        btnMittKonto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAdmin = new javax.swing.JButton();
        btnLoggaUt_v2 = new javax.swing.JButton();
        btnProjektAlla = new javax.swing.JButton();

        btnProjektChef.setText("Projektchef");
        btnProjektChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjektChefActionPerformed(evt);
            }
        });

        label1.setText("STARTSIDA");

        btnMittKonto.setText("Mitt Konto");
        btnMittKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMittKontoActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. Ingen fattigdom", "2. Ingen hunger", "3. God hälsa och Välbefinnande", "4. God utbildning", "5. Jämställdhet", "6. Rent vatten och sanitet", "7. Hållbar energi för alla", "8. Anständiga arbetsvillkor och ekonomisk tillväxt", "9. Hållbar industri innovation och infrastruktur", "10. Minskad ojämlikhet", "11. Hållbara städer och samhällen", "12. Hållbar konsumtion och produktion", "13. Bekämpa klimatförändringar", "14. Hav och marina resurser", "15. Ekosystem och biologisk mångfald", "16. Fredliga och inkluderande samhällen", "17. Genomförande och globalt partnerskap" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnLoggaUt_v2.setText("Logga ut");
        btnLoggaUt_v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUt_v2ActionPerformed(evt);
            }
        });

        btnProjektAlla.setText("Projekt Alla");
        btnProjektAlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjektAllaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProjektChef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProjektAlla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMittKonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoggaUt_v2))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(619, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProjektChef)
                        .addGap(18, 18, 18)
                        .addComponent(btnProjektAlla)
                        .addGap(18, 18, 18)
                        .addComponent(btnMittKonto)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdmin))
                    .addComponent(btnLoggaUt_v2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("Startsida");
    }// </editor-fold>//GEN-END:initComponents

    public boolean arProjektchef(String aid) {
        try {
            String sql = "SELECT pid FROM projekt WHERE projektchef = " + aid;
            String resultat = idb.fetchSingle(sql);
            return resultat != null; // true = personen är projektchef
        } catch (InfException e) {
            System.out.println("Fel i arProjektchef(): " + e.getMessage());
            return false;
        }
    }

    private void btnProjektChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjektChefActionPerformed
        if (arProjektchef(aid)) {
            ProjektChef projektPanel = new ProjektChef(parent, idb, aid);
            parent.visaPanel(projektPanel, "projekt");
        } else {
            JOptionPane.showMessageDialog(null, "Du måste vara projektchef för att öppna detta.");
        }
    }//GEN-LAST:event_btnProjektChefActionPerformed

    private void btnMittKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMittKontoActionPerformed

        MittKonto mittKontoPanel = new MittKonto(idb, aid);
        parent.visaPanel(mittKontoPanel, "mittkonto");

    }//GEN-LAST:event_btnMittKontoActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        AdminPanel adminPanel = new AdminPanel(parent, idb, aid);
        parent.visaPanel(adminPanel, "adminpanel");
    }//GEN-LAST:event_btnAdminActionPerformed

    //Vi behöver hjälp att ta bort koden för private void btnLoggaUtActionPerformed
    //Knappen går inte att hitta i designläget eller ta bort manuellt.

    private void btnLoggaUt_v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUt_v2ActionPerformed
        // stänger Jframen som innehåller den här panelen, alltså MainFrame.
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        //Öppnar inloggning igen
        new Inloggning(idb).setVisible(true);
    }//GEN-LAST:event_btnLoggaUt_v2ActionPerformed

    private void btnProjektAllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjektAllaActionPerformed
        Projekt projektPanel = new Projekt(parent, idb, aid);
        parent.visaPanel(projektPanel, "projekt");
    }//GEN-LAST:event_btnProjektAllaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnLoggaUt_v2;
    private javax.swing.JButton btnMittKonto;
    private javax.swing.JButton btnProjektAlla;
    private javax.swing.JButton btnProjektChef;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
