/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sdgsweden;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Personal extends javax.swing.JPanel {

    private InfDB idb;
    private String aid;
    private MainFrame parent;

    public Personal(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;
        initComponents();
        fyllAvdelningar();
        fyllPersonalTabell("", "Alla");

    }

    public void fyllPersonalTabell(String fornamnSok, String valdAvdelning) {
        try {
            StringBuilder sqlFraga = new StringBuilder(
                    "SELECT a.aid, a.fornamn, a.efternamn, a.epost, a.telefon "
                    + "FROM anstalld a "
                    + "JOIN avdelning avd ON a.avdelning = avd.avdid"
            );

            boolean harVillkor = false;

            if (fornamnSok != null && !fornamnSok.trim().isEmpty()) {
                sqlFraga.append(" WHERE LOWER(a.fornamn) LIKE '%")
                        .append(fornamnSok.toLowerCase())
                        .append("%'");
                harVillkor = true;
            }

            if (valdAvdelning != null && !valdAvdelning.equalsIgnoreCase("Alla")) {
                if (harVillkor) {
                    sqlFraga.append(" AND");
                } else {
                    sqlFraga.append(" WHERE");
                }
                sqlFraga.append(" avd.namn = '").append(valdAvdelning).append("'");
            }

            // Lägg till sortering med mellanslag
            sqlFraga.append(" ORDER BY a.aid ASC");

            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sqlFraga.toString());
            DefaultTableModel model = (DefaultTableModel) tabelPersonal.getModel();
            model.setRowCount(0);

            for (HashMap<String, String> rad : resultat) {
                model.addRow(new Object[]{
                    rad.get("aid"),
                    rad.get("fornamn"),
                    rad.get("efternamn"),
                    rad.get("epost"),
                    rad.get("telefon"),});
            }

        } catch (InfException ex) {
            Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fyllAvdelningar() {
        try {
            CbAvdelning.removeAllItems();
            CbAvdelning.addItem("Alla");
            ArrayList<HashMap<String, String>> avdelningar = idb.fetchRows("SELECT * FROM avdelning");
            for (HashMap<String, String> avd : avdelningar) {
                String avdid = avd.get("avdid");
                String namn = avd.get("namn");
                // Lägg till i ComboBox med namn men spara ID separat om du vill
                CbAvdelning.addItem(namn); // alt: namn + " (" + avdid + ")"
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Kunde inte hämta avdelningar: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPersonal = new javax.swing.JTable();
        txtSokFornamn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSokEfternamn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CbAvdelning = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 30);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });
        add(btnTillbaka);
        btnTillbaka.setBounds(710, 20, 110, 23);

        tabelPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Anställningsnummer", "Förnamn", "Efternamn", "Epost", "Telefon"
            }
        ));
        jScrollPane1.setViewportView(tabelPersonal);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 790, 320);

        txtSokFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSokFornamnActionPerformed(evt);
            }
        });
        add(txtSokFornamn);
        txtSokFornamn.setBounds(510, 90, 120, 22);

        jLabel2.setText("Sök på förnamn:");
        add(jLabel2);
        jLabel2.setBounds(510, 70, 120, 16);

        txtSokEfternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSokEfternamnActionPerformed(evt);
            }
        });
        add(txtSokEfternamn);
        txtSokEfternamn.setBounds(680, 90, 100, 22);

        jLabel3.setText("Sök på Epost:");
        add(jLabel3);
        jLabel3.setBounds(680, 70, 110, 16);

        CbAvdelning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "" }));
        CbAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAvdelningActionPerformed(evt);
            }
        });
        add(CbAvdelning);
        CbAvdelning.setBounds(20, 90, 450, 22);

        jLabel4.setText("Filtrera efter avdelning:");
        add(jLabel4);
        jLabel4.setBounds(20, 70, 130, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        Startsida startsida = new Startsida(parent, idb, aid);
        parent.visaPanel(startsida, "startsida");
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtSokFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSokFornamnActionPerformed
        String namn = txtSokFornamn.getText();

        String avd = (String) CbAvdelning.getSelectedItem();

        fyllPersonalTabell(namn, avd);

    }//GEN-LAST:event_txtSokFornamnActionPerformed

    private void txtSokEfternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSokEfternamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSokEfternamnActionPerformed

    private void CbAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAvdelningActionPerformed
        String valdAvdelning = (String) CbAvdelning.getSelectedItem();
        if (valdAvdelning == null) {
            return;
        }
        String namn = txtSokFornamn.getText();
        fyllPersonalTabell(namn, valdAvdelning);
    }//GEN-LAST:event_CbAvdelningActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbAvdelning;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPersonal;
    private javax.swing.JTextField txtSokEfternamn;
    private javax.swing.JTextField txtSokFornamn;
    // End of variables declaration//GEN-END:variables
}
