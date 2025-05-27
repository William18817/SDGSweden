/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sdgsweden.admin;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import sdgsweden.MainFrame;
import sdgsweden.Validering;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfException;

/**
 *
 * @author User
 */
public class AdminPartner extends javax.swing.JPanel {

    private MainFrame parent;
    private InfDB idb;
    private String aid;
    
    /**
     * Creates new form AdminPartner
     */
    public AdminPartner(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;
        
        initComponents();
        fyllPartnerITabell();
        
        //Den här raden lägger till en "Lyssnare" till tabellen "Avdelningar".
        //Varje gång användaren markerar en avdelnings så körs koden inuti "e -> {...}"
        jTablePartner.getSelectionModel().addListSelectionListener(e -> {
            
            //Detta är en if-sats som kontrollerar att koden bara körs när användaren har avslutat sin radmarkering.
            if (!e.getValueIsAdjusting()) {
                
                //Här hämtas radnummer för den rad som användaren klickat på.
                //rad är av datatypen "int" vilket innebär att resultatet visar siffor.
                int rad = jTablePartner.getSelectedRow();
                
                //Om en rad inte är vald kommer kommer "-1" att "visas". Om en rad är ifylld som kommer koden här nedan att visas i textfälten.
                if (rad != -1) {
                    
                    //Dessa kodrader hämtar värden från varje kolumn i "jTableAvdelning". 
                    //Den informationen visas sen i respektive textält till höger, exempelvis "txtAdress" - textfältet.
                    txtNamn.setText(jTablePartner.getValueAt(rad, 1).toString());
                    txtKontaktPerson.setText(jTablePartner.getValueAt(rad, 2).toString());
                    txtKontaktEpost.setText(jTablePartner.getValueAt(rad, 3).toString());
                    txtTelefon.setText(jTablePartner.getValueAt(rad, 4).toString());
                    txtAdress.setText(jTablePartner.getValueAt(rad, 5).toString());
                    txtBranch.setText(jTablePartner.getValueAt(rad, 6).toString());
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTillbakaAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartner = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtKontaktPerson = new javax.swing.JTextField();
        txtKontaktEpost = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        btnSpara = new javax.swing.JButton();
        btnLaggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();

        jLabel1.setText("Partner");

        btnTillbakaAdmin.setText("Tillbaka");
        btnTillbakaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAdminActionPerformed(evt);
            }
        });

        jTablePartner.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTablePartner);
        jTablePartner.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel2.setText("Namn");

        jLabel3.setText("Kontakperson");

        jLabel4.setText("Kontaktepost");

        jLabel5.setText("Telefon");

        jLabel6.setText("Adress");

        jLabel7.setText("Branch");

        txtNamn.setPreferredSize(new java.awt.Dimension(180, 24));

        txtKontaktPerson.setPreferredSize(new java.awt.Dimension(180, 24));

        txtKontaktEpost.setPreferredSize(new java.awt.Dimension(150, 24));

        txtTelefon.setPreferredSize(new java.awt.Dimension(150, 24));

        txtAdress.setPreferredSize(new java.awt.Dimension(150, 24));

        txtBranch.setPreferredSize(new java.awt.Dimension(150, 24));

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKontaktPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKontaktEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBranch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSpara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLaggTill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTaBort)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbakaAdmin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtKontaktPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtKontaktEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSpara)
                            .addComponent(btnLaggTill)
                            .addComponent(btnTaBort))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnTillbakaAdmin)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fyllPartnerITabell() {
try {
            String sqlFraga = "SELECT * FROM partner";
            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sqlFraga);

            String[] kolumner = {"pid", "namn", "kontaktperson", "kontaktepost", "telefon", "adress", "branch"};
            DefaultTableModel modell = new DefaultTableModel();

            for (String kolumn : kolumner) {
                modell.addColumn(kolumn);
            }

            for (HashMap<String, String> rad : resultat) {
                String[] radensVarden = new String[kolumner.length];
                for (int i = 0; i < kolumner.length; i++) {
                    radensVarden[i] = rad.get(kolumner[i]);
                }
                modell.addRow(radensVarden);
            }

            jTablePartner.setModel(modell);
        } catch (Exception ettFel) {
            JOptionPane.showMessageDialog(this, "Kunde inte visa partner.");
            ettFel.printStackTrace();
        }
    }

    private void btnTillbakaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAdminActionPerformed
        AdminPanel adminPanel = new AdminPanel (parent, idb, aid);
        parent.visaPanel(adminPanel, "adminPanel");
    }//GEN-LAST:event_btnTillbakaAdminActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        
        String namn = txtNamn.getText().trim();
        String kontaktperson = txtKontaktPerson.getText().trim();
        String kontaktEpost = txtKontaktEpost.getText().trim();
        String telefon = txtTelefon.getText().trim();
        String adress = txtAdress.getText().trim();
        String bransch = txtBranch.getText().trim();
        
        if (Validering.isEmpty(txtNamn.getText()))
            
        {
           JOptionPane.showMessageDialog(this, "Namn får inte tomt.");
           return;
        }
        if (Validering.isEmpty(txtKontaktPerson.getText()))
        {
            JOptionPane.showMessageDialog(this, "Kontaktperson får inte vara tomt.");
            return;
        }
        if (Validering.isEmpty(txtKontaktEpost.getText()))
        {
            JOptionPane.showMessageDialog(this, "Ogiltig E-postadress.");
            return;
        }
        if (Validering.isEmpty(txtTelefon.getText()))
        {
            JOptionPane.showMessageDialog(this, "Ogiltigt telefonnummer.");
            return;
        }
        if (Validering.isEmpty(txtAdress.getText()))
        {
            JOptionPane.showMessageDialog(this, "Ogiltig adress.");
            return;
        }
        if (Validering.isEmpty(txtBranch.getText()))
        {
            JOptionPane.showMessageDialog(this, "Bransch får inte vara tomt.");
            return;
        }
        
        // Kolla att en rad är vald i tabellen
        int valdRad = jTablePartner.getSelectedRow();
        
        if (valdRad == -1) {
            JOptionPane.showMessageDialog(this, "Du måste klicka på en rad i tabellen först.");
            return;
        }
        
        try {
    // Hämta ID från vald rad
    String pid = jTablePartner.getValueAt(valdRad, 0).toString();

    // Skapa SQL-fråga för att uppdatera
    String sqlFraga = "UPDATE partner SET namn = '" + namn + "', kontaktperson = '" + kontaktperson + "', kontaktEpost = '" + kontaktEpost + "', telefon = '" + telefon + "', adress = '" + adress + "', branch = '" + bransch + "' WHERE pid = " + pid;

    // Kör SQL-frågan
    idb.update(sqlFraga);

    // Visa meddelande
    JOptionPane.showMessageDialog(this, "Ändring sparad!");

    // Töm textfälten
    txtNamn.setText("");
    txtKontaktPerson.setText("");
    txtKontaktEpost.setText("");
    txtTelefon.setText("");
    txtAdress.setText("");
    txtBranch.setText("");

    // Uppdatera tabellen
    fyllPartnerITabell();

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Något gick fel: " + e.getMessage());
    e.printStackTrace();
}
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        try {
    // Hämta alla värden från formuläret
    String namn = txtNamn.getText().trim();
    String kontaktperson = txtKontaktPerson.getText().trim();
    String kontaktEpost = txtKontaktEpost.getText().trim();
    String telefon = txtTelefon.getText().trim();
    String adress = txtAdress.getText().trim();
    String bransch = txtBranch.getText().trim();

    // Validering
    if (Validering.isEmpty(txtNamn.getText())) {
        JOptionPane.showMessageDialog(this, "Namn får inte vara tomt.");
        return;
    }
    if (Validering.isEmpty(txtKontaktPerson.getText())) {
        JOptionPane.showMessageDialog(this, "Kontaktperson får inte vara tomt.");
        return;
    }
    if (Validering.isEmpty(txtKontaktEpost.getText())) {
        JOptionPane.showMessageDialog(this, "KontaktEpost får inte vara tom.");
        return;
    }
    if (Validering.isEmpty(txtTelefon.getText())) {
        JOptionPane.showMessageDialog(this, "Telefon får inte vara tom.");
        return;
    }
    if (Validering.isEmpty(txtAdress.getText())) {
        JOptionPane.showMessageDialog(this, "Adress får inte vara tom.");
        return;
    }
    if (Validering.isEmpty(txtBranch.getText())) {
        JOptionPane.showMessageDialog(this, "Bransch får inte vara tom.");
        return;
    }

    // Hämta nästa lediga pid
    String sqlNextId = "SELECT MAX(pid) FROM partner";
    String nextIdStr = idb.fetchSingle(sqlNextId);
    int nextPid = 1; // starta på 1
    if (nextIdStr != null && !nextIdStr.isEmpty()) {
        nextPid = Integer.parseInt(nextIdStr) + 1;
    }

    // Skapa SQL-fråga
    String sql = "INSERT INTO partner (pid, namn, kontaktperson, kontaktEpost, telefon, adress, branch) " +
                 "VALUES (" + nextPid + ", '" + namn + "', '" + kontaktperson + "', '" + kontaktEpost + "', '" + telefon + "', '" + adress + "', '" + bransch + "')";

    // Kör INSERT
    idb.insert(sql);

    JOptionPane.showMessageDialog(this, "Partner har lagts till i systemet!");

    // Rensa fält
    txtNamn.setText("");
    txtKontaktPerson.setText("");
    txtKontaktEpost.setText("");
    txtTelefon.setText("");
    txtAdress.setText("");
    txtBranch.setText("");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fel: " + e.getMessage());
            e.printStackTrace();
        }
        fyllPartnerITabell();
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        try
{
    // Detta visar en popup-ruta där man får ange partner-ID
    String partnerId = JOptionPane.showInputDialog(this, "Ange partner-ID (pid) för att ta bort:");

    // Om man inte fyller i rutan med ett giltigt pid
    if (partnerId == null || partnerId.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Fyll i ett partner-ID först.");
        return;
    }

    // Hämta specifik information om partnern
    String sql = "SELECT namn FROM partner WHERE pid = " + partnerId;

    // Kör SQL-frågan
    ArrayList<HashMap<String, String>> partnerLista = idb.fetchRows(sql);

    // Om ingen partner hittas
    if (partnerLista == null || partnerLista.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Det finns ingen partner med detta ID.");
        return;
    }

    // Lista namn (även om det bara är en)
    String[] partnerNamnLista = new String[partnerLista.size()];
    for (int i = 0; i < partnerLista.size(); i++) {
        partnerNamnLista[i] = partnerLista.get(i).get("namn");
    }

    // Dialog för att bekräfta borttagning
    String valtPartner = (String) JOptionPane.showInputDialog(
        this, "Bekräfta vilken partner du vill ta bort:", "Ta bort partner",
        JOptionPane.QUESTION_MESSAGE,
        null,
        partnerNamnLista,
        partnerNamnLista[0]
    );

    if (valtPartner != null) {
        for (HashMap<String, String> p : partnerLista) {
            String namn = p.get("namn");
            if (namn.equals(valtPartner)) {
                String deleteSql = "DELETE FROM partner WHERE pid = " + partnerId;
                idb.delete(deleteSql);
                JOptionPane.showMessageDialog(this, "Partnern togs bort.");
                fyllPartnerITabell();
                break;
            }
        }
    }
} catch (InfException e) {
    JOptionPane.showMessageDialog(this, "Fel vid borttagning av partner: " + e.getMessage());
}
    }//GEN-LAST:event_btnTaBortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbakaAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePartner;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtKontaktEpost;
    private javax.swing.JTextField txtKontaktPerson;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
