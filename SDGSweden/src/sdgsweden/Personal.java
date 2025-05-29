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
        sokPersonal();
    }

    public void fyllPersonalTabell(String fornamnSok, String epostSok, String valdAvdelning, String valdRoll) {
        try {
            StringBuilder sqlFraga = new StringBuilder(
                    "SELECT a.aid, a.fornamn, a.efternamn, a.epost, a.telefon "
                    + "FROM anstalld a "
                    + "JOIN avdelning avd ON a.avdelning = avd.avdid "
            );

            boolean harVillkor = false;

            String fornamnFilter = fornamnFilter(fornamnSok);
            if (!fornamnFilter.isEmpty()) {
                sqlFraga.append(" WHERE ").append(fornamnFilter);
                harVillkor = true;
            }

            String epostFilter = epostFilter(epostSok);
            if (!epostFilter.isEmpty()) {
                sqlFraga.append(harVillkor ? " AND " : " WHERE").append(" ").append(epostFilter);
                harVillkor = true;
            }

            if (valdAvdelning != null && !valdAvdelning.equalsIgnoreCase("Alla")) {
                sqlFraga.append(harVillkor ? " AND " : " WHERE").append(" avd.namn = '").append(valdAvdelning).append("'");
                harVillkor = true;
            }

            if (valdRoll != null && !valdRoll.equalsIgnoreCase("Alla")) {
                if (valdRoll.equalsIgnoreCase("Admin")) {
                    sqlFraga.append(harVillkor ? " AND " : " WHERE").append(" a.aid IN (SELECT aid FROM admin)");
                } else if (valdRoll.equalsIgnoreCase("Handläggare")) {
                    sqlFraga.append(harVillkor ? " AND " : " WHERE").append(" a.aid IN (SELECT aid FROM handlaggare)");
                }
            }

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

    private void sokPersonal() {
        String namn = txtSokFornamn.getText();
        String epost = txtSokEpost.getText();
        String avd = (String) CbAvdelning.getSelectedItem();
        String roll = (String) cbRoll.getSelectedItem();
        fyllPersonalTabell(namn, epost, avd, roll);
    }

    private String fornamnFilter(String fornamnSok) {
        if (fornamnSok != null && !fornamnSok.trim().isEmpty()) {
            return " LOWER(a.fornamn) LIKE '%" + fornamnSok.toLowerCase() + "%'";
        }
        return "";
    }

    private String epostFilter(String epostSok) {
        if (epostSok != null && !epostSok.trim().isEmpty()) {
            return " LOWER(a.epost) LIKE '%" + epostSok.toLowerCase() + "%'";
        }
        return "";
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
        txtSokEpost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CbAvdelning = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        rensaButton = new javax.swing.JButton();
        LbGlobalGoalsLogo = new javax.swing.JLabel();
        cbRoll = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Personal");
        add(jLabel1);
        jLabel1.setBounds(10, 30, 200, 30);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.setPreferredSize(new java.awt.Dimension(77, 23));
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });
        add(btnTillbaka);
        btnTillbaka.setBounds(730, 20, 110, 23);

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
        jScrollPane1.setBounds(20, 120, 820, 440);

        txtSokFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSokFornamnActionPerformed(evt);
            }
        });
        add(txtSokFornamn);
        txtSokFornamn.setBounds(480, 90, 120, 22);

        jLabel2.setText("Sök på förnamn:");
        add(jLabel2);
        jLabel2.setBounds(480, 70, 120, 16);

        txtSokEpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSokEpostActionPerformed(evt);
            }
        });
        txtSokEpost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSokEpostKeyReleased(evt);
            }
        });
        add(txtSokEpost);
        txtSokEpost.setBounds(610, 90, 100, 22);

        jLabel3.setText("Sök på Epost:");
        add(jLabel3);
        jLabel3.setBounds(610, 70, 110, 16);

        CbAvdelning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "" }));
        CbAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAvdelningActionPerformed(evt);
            }
        });
        add(CbAvdelning);
        CbAvdelning.setBounds(20, 90, 320, 22);

        jLabel4.setText("Filtrera efter roll:");
        add(jLabel4);
        jLabel4.setBounds(350, 70, 90, 16);

        rensaButton.setText("Rensa sökning");
        rensaButton.setPreferredSize(new java.awt.Dimension(77, 23));
        rensaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rensaButtonActionPerformed(evt);
            }
        });
        add(rensaButton);
        rensaButton.setBounds(720, 90, 120, 23);

        LbGlobalGoalsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo-lite-större.png"))); // NOI18N
        add(LbGlobalGoalsLogo);
        LbGlobalGoalsLogo.setBounds(920, -40, 830, 860);

        cbRoll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Admin", "Handläggare" }));
        cbRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRollActionPerformed(evt);
            }
        });
        add(cbRoll);
        cbRoll.setBounds(350, 90, 120, 22);

        jLabel5.setText("Filtrera efter avdelning:");
        add(jLabel5);
        jLabel5.setBounds(20, 70, 210, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        Startsida startsida = new Startsida(parent, idb, aid);
        parent.visaPanel(startsida, "startsida");
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtSokFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSokFornamnActionPerformed
        String namn = txtSokFornamn.getText();
        String avd = (String) CbAvdelning.getSelectedItem();
        sokPersonal();

    }//GEN-LAST:event_txtSokFornamnActionPerformed

    private void txtSokEpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSokEpostActionPerformed
        String namn = txtSokFornamn.getText();
        String epost = txtSokEpost.getText();
        String avd = (String) CbAvdelning.getSelectedItem();
        sokPersonal();
    }//GEN-LAST:event_txtSokEpostActionPerformed

    private void CbAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAvdelningActionPerformed
        String valdAvdelning = (String) CbAvdelning.getSelectedItem();
        if (valdAvdelning == null) {
            return;
        }
        String namn = txtSokFornamn.getText();
        sokPersonal();
    }//GEN-LAST:event_CbAvdelningActionPerformed

    private void txtSokEpostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSokEpostKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSokEpostKeyReleased

    private void rensaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rensaButtonActionPerformed
        txtSokFornamn.setText("");
        txtSokEpost.setText("");
        CbAvdelning.setSelectedItem("Alla");
        cbRoll.setSelectedItem("Alla");
        sokPersonal();
    }//GEN-LAST:event_rensaButtonActionPerformed

    private void cbRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRollActionPerformed
        sokPersonal();
    }//GEN-LAST:event_cbRollActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbAvdelning;
    private javax.swing.JLabel LbGlobalGoalsLogo;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rensaButton;
    private javax.swing.JTable tabelPersonal;
    private javax.swing.JTextField txtSokEpost;
    private javax.swing.JTextField txtSokFornamn;
    // End of variables declaration//GEN-END:variables
}
