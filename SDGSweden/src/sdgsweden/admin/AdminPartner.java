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
        //Det som händer är att så fort man klickar sig in på sidan så syns information om Partners.
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

        jLabelPartner = new javax.swing.JLabel();
        btnTillbakaAdmin = new javax.swing.JButton();
        jScrollPanePartner = new javax.swing.JScrollPane();
        jTablePartner = new javax.swing.JTable();
        jLabelNamn = new javax.swing.JLabel();
        jLabelKontaktperson = new javax.swing.JLabel();
        jLabelKontaktEpost = new javax.swing.JLabel();
        jLabelTelefon = new javax.swing.JLabel();
        jLabelAdress = new javax.swing.JLabel();
        jLabelBranch = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtKontaktPerson = new javax.swing.JTextField();
        txtKontaktEpost = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtBranch = new javax.swing.JTextField();
        btnSpara = new javax.swing.JButton();
        btnLaggTill = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();

        jLabelPartner.setText("Partner");

        btnTillbakaAdmin.setText("Tillbaka");
        btnTillbakaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAdminActionPerformed(evt);
            }
        });

        jTablePartner.setColumnSelectionAllowed(true);
        jScrollPanePartner.setViewportView(jTablePartner);
        jTablePartner.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabelNamn.setText("Namn");

        jLabelKontaktperson.setText("Kontakperson");

        jLabelKontaktEpost.setText("Kontaktepost");

        jLabelTelefon.setText("Telefon");

        jLabelAdress.setText("Adress");

        jLabelBranch.setText("Branch");

        txtNamn.setPreferredSize(new java.awt.Dimension(180, 24));

        txtKontaktPerson.setPreferredSize(new java.awt.Dimension(180, 24));

        txtKontaktEpost.setPreferredSize(new java.awt.Dimension(180, 24));

        txtTelefon.setPreferredSize(new java.awt.Dimension(180, 24));

        txtAdress.setPreferredSize(new java.awt.Dimension(180, 24));

        txtBranch.setPreferredSize(new java.awt.Dimension(180, 24));

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
                        .addComponent(jLabelPartner)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPanePartner, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNamn)
                                    .addComponent(jLabelKontaktperson))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKontaktPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelKontaktEpost)
                                    .addComponent(jLabelTelefon)
                                    .addComponent(jLabelAdress)
                                    .addComponent(jLabelBranch))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKontaktEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtBranch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSpara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLaggTill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTaBort)
                                .addContainerGap(63, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbakaAdmin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPartner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPanePartner, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNamn)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelKontaktperson)
                            .addComponent(txtKontaktPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelKontaktEpost)
                            .addComponent(txtKontaktEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefon)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAdress)
                            .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBranch)
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
        
        //Detta är början på en try-catch sats. All kod mellan try och catch kommer nu att testköras.
        try {
            
            //Här skapas en sql-fråga där vi vill hämta all information från partner.
            String sqlFraga = "SELECT * FROM partner";
            
            //Här körs sedan den frågan.
            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sqlFraga);

            //Här skapas en array kallad "kolumner" med nedan information.
            String[] kolumner = {"pid", "namn", "kontaktperson", "kontaktepost", "telefon", "adress", "branch"};
            
            //Här skapas ett nytt tabellobjekt som sedan kommer att fyllas med data.
            DefaultTableModel modell = new DefaultTableModel();

            //Här körs en for-each loop som går igenom kolumner i arrayen.
            for (String kolumn: kolumner) {
                
                //Här läggs en ny kolumn till för varje kolumn som gåtts igenom i arrayen.
                modell.addColumn(kolumn);
            }

            //Här körs en for-each loop som går igenom resultatet.
            for (HashMap<String, String> rad: resultat) {
                
                //Här skapas en array som har som syfte att lagra alla värden i raden.
                String[] radensVarden = new String[kolumner.length];
                
                //Här körs en for-loop som går igenom kolumner.
                for (int i = 0; i < kolumner.length; i++) {
                    
                    //Här hämtas sedan värdet.
                    radensVarden[i] = rad.get(kolumner[i]);
                }
                
                //Här läggs sedan raden med värden till i tabellen.
                modell.addRow(radensVarden);
            }

            //Denna kodrad gör att tabellen visas i GUI:t.
            jTablePartner.setModel(modell);
            
          //Det är här som eventuella fel fångas.
        } catch (Exception ettFel) {
            
            //Detta felmeddelande skrivs då ut.
            JOptionPane.showMessageDialog(this, "Kunde inte visa partner.");
            
            //Detta gör att det även skrivs ut i terminalen.
            ettFel.printStackTrace();
        }
    }

    private void btnTillbakaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAdminActionPerformed
        
        //Här skapas ett nytt objekt av "AdminPanel" i form av att ett nytt GUI-panel_fönster dyker upp.
        //Den får med sig tre saker från konstruktorn i form av "Parent (MainFrame), idb (databaskopplingen) och aid (användarens id).
        AdminPanel adminPanel = new AdminPanel (parent, idb, aid);
        
        //Detta är ett metodanrop vars syfte är att visa "adminPanel".
        parent.visaPanel(adminPanel, "adminPanel");
    }//GEN-LAST:event_btnTillbakaAdminActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        
        //Här blir alla fält inlästa och "trim()" kontrollerar och tar bort mellanslag i kodraden.
        String namn = txtNamn.getText().trim();
        String kontaktperson = txtKontaktPerson.getText().trim();
        String kontaktEpost = txtKontaktEpost.getText().trim();
        String telefon = txtTelefon.getText().trim();
        String adress = txtAdress.getText().trim();
        String bransch = txtBranch.getText().trim();
        
        //Dessa "if;s" nedan är en validering där det ställs olika krav på de attibut som står angivna.
        //Exempelvis om man anger fel format på e-post så får man felmeddelandet "Ogitlig E-postadress".
        //Allt detta är sedan kopplat till en egen valideringsklass som importers (Se högst upp).
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
        if (!Validering.isValidEpost(txtKontaktEpost.getText()))
        {
            JOptionPane.showMessageDialog(this, "Ogiltig E-postadress.");
            return;
        }
        if (!Validering.isValidTelefon(txtTelefon.getText()))
        {
            JOptionPane.showMessageDialog(this, "Ogiltigt telefonnummer.");
            return;
        }
        if (!Validering.isValidAdress(txtAdress.getText()))
        {
            JOptionPane.showMessageDialog(this, "Ogiltig adress.");
            return;
        }
        if (Validering.isEmpty(txtBranch.getText()))
        {
            JOptionPane.showMessageDialog(this, "Bransch får inte vara tomt.");
            return;
        }
        
        //Detta hämtar den rad som är markerad i tabellen "jTablePartner".
        int valdRad = jTablePartner.getSelectedRow();
        
        //Om inget är valt, alltså om -1 returneras...
        if (valdRad == -1) {
            
            //... så visas detta meddelande.
            JOptionPane.showMessageDialog(this, "Du måste klicka på en rad i tabellen först.");
            return;
        }
        
        //Början på en try-catch sats.
        try {
            
    //Här hämtar vi pid från kolumn 0 på vald rad.
    String pid = jTablePartner.getValueAt(valdRad, 0).toString();

    //Här skapas en sql-fråga (sqlFraga) som uppdaterar informationen i databasen för specifikt valt pid.
    String sqlFraga = "UPDATE partner SET namn = '" + namn + "', kontaktperson = '" + kontaktperson + "', kontaktEpost = '" + kontaktEpost + "', telefon = '" + telefon + "', adress = '" + adress + "', branch = '" + bransch + "' WHERE pid = " + pid;

    //Här körs frågan så att uppdateringen implementeras i databasen.
    idb.update(sqlFraga);

    //Här visas ett meddelande om hur uppdateringen gick.
    JOptionPane.showMessageDialog(this, "Ändring sparad!");

    //Dessa kodrader tömmer varje textfält efter att ädnringen har skett för att underlätta inför nästa gång man ska skriva in något.
    txtNamn.setText("");
    txtKontaktPerson.setText("");
    txtKontaktEpost.setText("");
    txtTelefon.setText("");
    txtAdress.setText("");
    txtBranch.setText("");

    //Här sker ett internt metodanrop för att hämta den nya datan.
    fyllPartnerITabell();

  //Detta är slutet på try-catch satsen. Om något går fel så fångar catch det här.  
} catch (Exception ettFel) {
    
    //Följande meddelande skrivs ut vid fel.
    JOptionPane.showMessageDialog(this, "Något gick fel: " + ettFel.getMessage());
    
    //printStackTrace skriver ut felet i terminalen för att kunna felsöka.
    ettFel.printStackTrace();
}
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        
        //Början på en try-catch sats. All kod mellan try och catch kommer nu att testköras.
        try {
            
    //Här hämtas alla värden från textfälten där "trim()" tar bort mellanslag i varje kodrad
    String namn = txtNamn.getText().trim();
    String kontaktperson = txtKontaktPerson.getText().trim();
    String kontaktEpost = txtKontaktEpost.getText().trim();
    String telefon = txtTelefon.getText().trim();
    String adress = txtAdress.getText().trim();
    String branch = txtBranch.getText().trim();

    //Dessa "if;s" nedan är en validering där det ställs olika krav på de attibut som står angivna.
    //Exempelvis om man anger fel format på e-post så får man felmeddelandet "Ogitlig E-postadress".
    //Allt detta är sedan kopplat till en egen valideringsklass som importers (Se högst upp).
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
        JOptionPane.showMessageDialog(this, "Branch får inte vara tom.");
        return;
    }

    //Här skapas en sql-fråga vars syfte är att hämta max pid från databasen.
    String sqlNextId = "SELECT MAX(pid) FROM partner";
    
    //Detta hämtar endast ett värde från databasen.
    String nextIdStr = idb.fetchSingle(sqlNextId);
    
    //Vi har här angett att vi vill att 1 är vårt startvärde ifall tabellen är tom.
    int nextPid = 1;
    
    //OM ett värde redan fanns i databasen så gör denna kod att det ökar med + 1 för att hitta nästa lediga id.
    if (nextIdStr != null && !nextIdStr.isEmpty()) {
        nextPid = Integer.parseInt(nextIdStr) + 1;
    }

    //Här skapas änu en sql-fråga vars syfte är att implementera partnern i databasen.
    String sqlFraga = "INSERT INTO partner (pid, namn, kontaktperson, kontaktEpost, telefon, adress, branch) " + 
            "VALUES (" + nextPid + ", '" + namn + "', '" + kontaktperson + "', '" + kontaktEpost + "', '" + telefon + "', '" + adress + "', '" + branch + "')";

    //Här körs sql-frågan.
    idb.insert(sqlFraga);

    //Om tilläggningen av partner gick bra visas detta meddelande.
    JOptionPane.showMessageDialog(this, "Partner har lagts till i systemet!");

    //Denna kod rensar textfälten från den tidigare informationen.
    txtNamn.setText("");
    txtKontaktPerson.setText("");
    txtKontaktEpost.setText("");
    txtTelefon.setText("");
    txtAdress.setText("");
    txtBranch.setText("");
        
          //Här fångas eventuella fel.
        } catch (Exception ettFel) {
            
            //Detta felmeddelande visas isåfall.
            JOptionPane.showMessageDialog(this, "Fel: " + ettFel.getMessage());
            
            //Detta skriver ut det i terminalen.
            ettFel.printStackTrace();
        }
        
        //Detta updaterar tabellen med den nya informationen så att nya partners syns i databasen.
        fyllPartnerITabell();
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        
        //Det här är början på en try-catch sats. All kod mellan try och catch kommer nu testköras.
        try
        {
            
    //Detta visar en popup-ruta där man får ange partner-ID.
    String partnerId = JOptionPane.showInputDialog(this, "Ange partner-ID (pid) för att ta bort:");

    //Denna kod är för om man inte fyller i rutan med ett giltigt pid.
    if (partnerId == null || partnerId.isEmpty())
    {
        //Då syns detta felmeddelande.
        JOptionPane.showMessageDialog(this, "Fyll i ett partner-ID först.");
        return;
    }

    //Här skapas en sql-fråga vars syfte är att hämta namn från partner via ett pid.
    String sqlFraga = "SELECT namn FROM partner WHERE pid = " + partnerId;

    //Här körs sedan sql-frågan.
    ArrayList<HashMap<String, String>> partnerLista = idb.fetchRows(sqlFraga);

    //Denna kod är till för om ingen partner hittas.
    if (partnerLista == null || partnerLista.isEmpty()) {
        
        //Då skrivs detta felmeddelande ut.
        JOptionPane.showMessageDialog(this, "Det finns ingen partner med detta ID.");
        return;
    }

    //Här skapas en array kallad "partnerNamnLista"
    String[] partnerNamnLista = new String[partnerLista.size()];
    
    //Här körs en for-loop som går igenom partnerLista.
    for (int i = 0; i < partnerLista.size(); i++) {
        
        //Här hämtas namnet.
        partnerNamnLista[i] = partnerLista.get(i).get("namn");
    }

    //Denna kod handlar om att en bekräftelseruta dyker upp
    //som vill att användaren ska bekräfta borttagningen av en partner.
    //partnerNamnLista är de alternativa namn att välja mellan.
    //partnerNamnLista[0] är ett förvalt alternativ som vi satt till 0.
    String valtPartner = (String) JOptionPane.showInputDialog(
        this, "Bekräfta vilken partner du vill ta bort:", "Ta bort partner",
        JOptionPane.QUESTION_MESSAGE,
        null,
        partnerNamnLista,
        partnerNamnLista[0]
    );

    //Om använder valde ett namn i rutan.
    if (valtPartner != null) {
        
        //Då körs denna for-each loop som går igenom partnerlista och hämtar namnet.
        for (HashMap<String, String> p: partnerLista) {
            String namn = p.get("namn");
            
            //namnet är exakt lika med valtPartner-namnet.
            if (namn.equals(valtPartner)) {
                
                //Då kommer vi ta bort partnern genom denna sql-fråga.
                String deleteSql = "DELETE FROM partner WHERE pid = " + partnerId;
                
                //Här körs sql-frågan.
                idb.delete(deleteSql);
                
                //Detta meddelande syns ifall borttagningen gick bra.
                JOptionPane.showMessageDialog(this, "Partnern togs bort.");
                
                //Denna kod uppdaterar tabellen med den nya datan.
                fyllPartnerITabell();
                
                //Avslutar loopen.
                break;
            }
        }
    }
    
  //Vid fel fångas det här.
} catch (InfException ettFel) {
    
    //Då skrivs detta felmeddelande ut.
    JOptionPane.showMessageDialog(this, "Fel vid borttagning av partner: " + ettFel.getMessage());
}
    }//GEN-LAST:event_btnTaBortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbakaAdmin;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelBranch;
    private javax.swing.JLabel jLabelKontaktEpost;
    private javax.swing.JLabel jLabelKontaktperson;
    private javax.swing.JLabel jLabelNamn;
    private javax.swing.JLabel jLabelPartner;
    private javax.swing.JLabel jLabelTelefon;
    private javax.swing.JScrollPane jScrollPanePartner;
    private javax.swing.JTable jTablePartner;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBranch;
    private javax.swing.JTextField txtKontaktEpost;
    private javax.swing.JTextField txtKontaktPerson;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
