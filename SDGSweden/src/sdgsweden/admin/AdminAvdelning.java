package sdgsweden.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import sdgsweden.MainFrame;
import sdgsweden.Validering;
import javax.swing.table.DefaultTableModel;

/**
 * @author User
 */
public class AdminAvdelning extends javax.swing.JPanel {

    private MainFrame parent;
    private InfDB idb;
    private String aid;

    public AdminAvdelning(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;

        initComponents();
        fyllAvdelningarITabell();

        //Den här raden lägger till en "Lyssnare" till tabellen "Avdelningar".
        //Varje gång användaren markerar en avdelnings så körs koden inuti "e -> {...}"
        //Det som händer är att så fort man klickar sig in på sidan så syns information om Avdelningar.
        jTableAvdelningar.getSelectionModel().addListSelectionListener(e -> {

            //Detta är en if-sats som kontrollerar att koden bara körs när användaren har avslutat sin radmarkering.
            if (!e.getValueIsAdjusting()) {

                //Här hämtas radnummer för den rad som användaren klickat på.
                //rad är av datatypen "int" vilket innebär att resultatet visar siffor.
                int rad = jTableAvdelningar.getSelectedRow();

                //Om en rad inte är vald kommer kommer "-1" att "visas". Om en rad är ifylld som kommer koden här nedan att visas i textfälten.
                if (rad != -1) {

                    //Dessa kodrader hämtar värden från varje kolumn i "jTableAvdelning". 
                    //Den informationen visas sen i respektive textält till höger, exempelvis "txtAdress" - textfältet. 
                    txtNamn.setText(jTableAvdelningar.getValueAt(rad, 1).toString());
                    txtBeskrivning.setText(jTableAvdelningar.getValueAt(rad, 2).toString());
                    txtAdress.setText(jTableAvdelningar.getValueAt(rad, 3).toString());
                    txtEpost.setText(jTableAvdelningar.getValueAt(rad, 4).toString());
                    txtTelefon.setText(jTableAvdelningar.getValueAt(rad, 5).toString());

                    Object stadNamn = jTableAvdelningar.getValueAt(rad, 6);
                    if (stadNamn != null) {
                        txtStadNamn.setText(stadNamn.toString());
                    } else {
                        txtStadNamn.setText("");

                    }
                    Object chef = jTableAvdelningar.getValueAt(rad, 7);
                    if (chef != null) {
                        txtChef.setText(chef.toString());
                    } else {
                        txtChef.setText("");
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAvdelning = new javax.swing.JLabel();
        btnTillbakaAdmin = new javax.swing.JButton();
        jScrollPaneAvdelning = new javax.swing.JScrollPane();
        jTableAvdelningar = new javax.swing.JTable();
        jLabelNamn = new javax.swing.JLabel();
        jLabelAdress = new javax.swing.JLabel();
        jLabelEpost = new javax.swing.JLabel();
        jLabelTelefon = new javax.swing.JLabel();
        jLabelBeskrivning = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtBeskrivning = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        btnLaggTill = new javax.swing.JButton();
        btnSpara = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();
        jLabelChef = new javax.swing.JLabel();
        jLabelStad = new javax.swing.JLabel();
        txtChef = new javax.swing.JTextField();
        txtStadNamn = new javax.swing.JTextField();
        LbKosmetiskt = new javax.swing.JLabel();

        jLabelAvdelning.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelAvdelning.setText("Avdelning");

        btnTillbakaAdmin.setText("Tillbaka");
        btnTillbakaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAdminActionPerformed(evt);
            }
        });

        jTableAvdelningar.setColumnSelectionAllowed(true);
        jScrollPaneAvdelning.setViewportView(jTableAvdelningar);
        jTableAvdelningar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabelNamn.setText("Namn");

        jLabelAdress.setText("Adress");

        jLabelEpost.setText("E-post");

        jLabelTelefon.setText("Telefon");

        jLabelBeskrivning.setText("Beskrivning");

        txtNamn.setPreferredSize(new java.awt.Dimension(180, 24));

        txtAdress.setPreferredSize(new java.awt.Dimension(180, 24));

        txtEpost.setPreferredSize(new java.awt.Dimension(180, 24));

        txtBeskrivning.setPreferredSize(new java.awt.Dimension(180, 24));

        txtTelefon.setPreferredSize(new java.awt.Dimension(180, 24));

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        jLabelChef.setText("Chef");

        jLabelStad.setText("Stad");

        txtChef.setPreferredSize(new java.awt.Dimension(180, 24));

        txtStadNamn.setPreferredSize(new java.awt.Dimension(180, 24));

        LbKosmetiskt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo-lite-större.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefon)
                            .addComponent(jLabelBeskrivning)
                            .addComponent(jLabelEpost)
                            .addComponent(jLabelAdress)
                            .addComponent(jLabelNamn)
                            .addComponent(jLabelChef)
                            .addComponent(jLabelStad))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStadNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBeskrivning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabelAvdelning))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSpara)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLaggTill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTaBort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTillbakaAdmin)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(LbKosmetiskt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbKosmetiskt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelAvdelning)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNamn)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAdress))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEpost))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTelefon))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBeskrivning))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelChef))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStadNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStad))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSpara)
                                .addComponent(btnLaggTill)
                                .addComponent(btnTaBort))
                            .addComponent(btnTillbakaAdmin))
                        .addContainerGap(92, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Detta är en metod som inte returnerar något, utan dess syfte är att fylla tabellen "jTableAvdelningar" med information från databasen.
    private void fyllAvdelningarITabell() {

        //Början på en try-catch sats vars syfte är att försöka köra specifik kod, och vid eventuella fel fångar "Catch" det.
        try {
            // Första SQL-frågan hämtar grunddata från avdelning, inklusive stad-id och chef-id
            String sqlFraga = "SELECT avdelning.avdid, avdelning.namn, avdelning.beskrivning, avdelning.adress, "
                    + "avdelning.epost, avdelning.telefon, avdelning.stad, avdelning.chef "
                    + "FROM avdelning";

            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sqlFraga);

            // Vi använder fortfarande samma kolumner i tabellen
            String[] kolumner = {"avdid", "namn", "beskrivning", "adress", "epost", "telefon", "stad", "chef"};

            DefaultTableModel modell = new DefaultTableModel();
            for (String kolumn : kolumner) {
                modell.addColumn(kolumn);
            }

            for (HashMap<String, String> rad : resultat) {
                String[] radensVarden = new String[kolumner.length];

                // Fyll i kolumnerna från databasen
                for (int i = 0; i < kolumner.length; i++) {
                    radensVarden[i] = rad.get(kolumner[i]);
                }

                // Hämta stadens namn baserat på stad-ID
                String stadId = rad.get("stad");
                String stadNamn = "";
                if (stadId != null && !stadId.isEmpty()) {
                    try {
                        stadNamn = idb.fetchSingle("SELECT namn FROM stad WHERE sid = " + stadId);
                    } catch (Exception e) {
                        stadNamn = "Okänd stad";
                    }
                }

                // Hämta chefens fullständiga namn
                String chefId = rad.get("chef");
                String chefNamn = "";
                if (chefId != null && !chefId.isEmpty()) {
                    try {
                        chefNamn = idb.fetchSingle("SELECT CONCAT(fornamn, ' ', efternamn) FROM anstalld WHERE aid = " + chefId);
                    } catch (Exception e) {
                        chefNamn = "Okänd chef";
                    }
                }

                // Ersätt ID:t i radensVarden med de riktiga namnen
                radensVarden[6] = stadNamn;
                radensVarden[7] = chefNamn;

                // Lägg till raden i modellen
                modell.addRow(radensVarden);
            }

            // Visa datan i tabellen
            jTableAvdelningar.setModel(modell);

        } catch (Exception ettFel) {
            JOptionPane.showMessageDialog(this, "Kunde inte visa avdelningar.");
            ettFel.printStackTrace();
        }
    }

    //En metod som körs när vi trycker på "Tillbaka" knappen.
    private void btnTillbakaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAdminActionPerformed

        //Här skapas ett nytt objekt av "AdminPanel" i form av att ett nytt GUI-panel_fönster dyker upp.
        //Den får med sig tre saker från konstruktorn i form av "Parent (MainFrame), idb (databaskopplingen) och aid (användarens id).
        AdminPanel adminPanel = new AdminPanel(parent, idb, aid);

        //Detta är ett metodanrop vars syfte är att visa "adminPanel".
        parent.visaPanel(adminPanel, "adminPanel");
    }//GEN-LAST:event_btnTillbakaAdminActionPerformed

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed

        //Dessa "if;s" nedan är en validering där det ställs olika krav på de attibut som står angivna.
        //Exempelvis om man anger fel format på e-post så får man felmeddelandet "Ogitlig E-postadress".
        //Allt detta är sedan kopplat till en egen valideringsklass som importers (Se högst upp).
        if (Validering.isEmpty(txtNamn.getText())) {
            JOptionPane.showMessageDialog(this, "Namn får inte tomt.");
            return;
        }
        if (Validering.isValidAdress(txtAdress.getText())) {
            JOptionPane.showMessageDialog(this, "Ogiltig adress.");
            return;
        }
        if (!Validering.isValidEpostAvdelining(txtEpost.getText())) {
            JOptionPane.showMessageDialog(this, "Ogiltig E-postadress. Måste exempelvis skrivas: namn@ngo.org");
            return;
        }
        if (!Validering.isValidTelefon(txtTelefon.getText())) {
            JOptionPane.showMessageDialog(this, "Ogiltigt telefonnummer. Måste vara mellan 7-15 siffror.");
            return;
        }
        if (Validering.isEmpty(txtBeskrivning.getText())) {
            JOptionPane.showMessageDialog(this, "Beskrivning får inte vara tomt.");
            return;
        }
        if (Validering.isEmpty(txtChef.getText())) {
            JOptionPane.showMessageDialog(this, "Chef får inte vara tomt.");
            return;
        }
        if (Validering.isEmpty(txtStadNamn.getText())) {
            JOptionPane.showMessageDialog(this, "Stad får inte vara tomt.");
            return;
        }

        //Detta hämtar den rad som är markerad i tabellen "jTableAvdelningar".
        int valdRad = jTableAvdelningar.getSelectedRow();

        //Om inget är valt, alltså om -1 returneras...
        if (valdRad == -1) {

            //... så visas detta meddelande.
            JOptionPane.showMessageDialog(this, "Du måste klicka på en rad i tabellen först.");
            return;
        }

        //Här blir alla fält inlästa och "trim()" kontrollerar och tar bort mellanslag i kodraden.
        String namn = txtNamn.getText().trim();
        String adress = txtAdress.getText().trim();
        String epost = txtEpost.getText().trim();
        String telefon = txtTelefon.getText().trim();
        String beskrivning = txtBeskrivning.getText().trim();
        String chef = txtChef.getText().trim();
        String stad = txtStadNamn.getText().trim();
        String anstalldID = null;
        String stadID = null;
        
        String[] namnArray = chef.split(" ");
        if (namnArray.length != 2)
            JOptionPane.showMessageDialog(this, "Vänligen ange både för - och efternamn");
            
        try {
            anstalldID = idb.fetchSingle("SELECT aid FROM anstalld WHERE fornamn = '" + namnArray[0] + "' AND efternamn = '" + namnArray[1] + "'");
        } catch (InfException ex) {
            Logger.getLogger(AdminAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stadID = idb.fetchSingle("SELECT sid FROM stad WHERE namn = '" + stad + "'");
        } catch (InfException ex) {
            Logger.getLogger(AdminAvdelning.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                if (Validering.isEmpty(stadID) || stadID == null) {
            JOptionPane.showMessageDialog(this, "Hittade ingen stad. Ange en stad som redan finns i databasen");
            return;
        }
                if (Validering.isEmpty(anstalldID) || anstalldID == null) {
            JOptionPane.showMessageDialog(this, "Hittade ingen anställd. Ange en anställd som redan finns i databasen.");
            return;
        }

        //Början på en try-catch sats.
        try {

            //Här hämtar vi avdid från kolumn 0 på vald rad.
            String avdid = jTableAvdelningar.getValueAt(valdRad, 0).toString();

            //Här skapas en sql-fråga (sqlFraga) som uppdaterar informationen i databasen för specifikt valt avdid.
            String sqlFraga = "UPDATE avdelning SET namn = '" + namn + "', adress = '" + adress + "', epost = '" + epost + "', telefon = '" + telefon + "', beskrivning = '" + beskrivning + "', chef = " + anstalldID + ", stad = " + stadID + " WHERE avdid = " + avdid;

            //Här körs frågan så att uppdateringen implementeras i databasen.
            idb.update(sqlFraga);

            //Här visas ett meddelande om hur uppdateringen gick.
            JOptionPane.showMessageDialog(this, "Ändring sparad!");

            //Dessa kodrader tömmer varje textfält efter att ädnringen har skett för att underlätta inför nästa gång man ska skriva in något.
            txtNamn.setText("");
            txtAdress.setText("");
            txtEpost.setText("");
            txtTelefon.setText("");
            txtBeskrivning.setText("");
            txtChef.setText("");
            txtStadNamn.setText("");

            //Här sker ett internt metodanrop för att hämta den nya datan.
            fyllAvdelningarITabell();

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

            //Här hämtas alla värden från textfälten där "trim()" tar bort mellanslag i varje kodrad.
            String namn = txtNamn.getText().trim();
            String adress = txtAdress.getText().trim();
            String epost = txtEpost.getText().trim();
            String telefon = txtTelefon.getText().trim();
            String beskrivning = txtBeskrivning.getText().trim();
            String chefStr = txtChef.getText().trim();
            String stadStr = txtStadNamn.getText().trim();
        
            String[] namnArray = chefStr.split(" ");
            
            //Dessa "if;s" nedan är en validering där det ställs olika krav på de attibut som står angivna.
            //Exempelvis om man anger fel format på e-post så får man felmeddelandet "Ogitlig E-postadress".
            //Allt detta är sedan kopplat till en egen valideringsklass som importers (Se högst upp).
            if (Validering.isEmpty(txtNamn.getText())) {
                JOptionPane.showMessageDialog(this, "Namn får inte vara tomt.");
                return;
            }
            if (!Validering.isValidAdress(txtAdress.getText())) {
                JOptionPane.showMessageDialog(this, "Adress får inte vara tomt.");
                return;
            }
            if (!Validering.isValidEpostAvdelining(txtEpost.getText())) {
                JOptionPane.showMessageDialog(this, "Ogiltig E-postadress. Måste exempelvis skrivas: namn@ngo.org");
                return;
            }
            if (!Validering.isValidTelefon(txtTelefon.getText())) {
                JOptionPane.showMessageDialog(this, "Ogiltigt telefonnummer. Måste vara mellan 7-15 siffror.");
                return;
            }
            if (Validering.isEmpty(txtBeskrivning.getText())) {
                JOptionPane.showMessageDialog(this, "Beskrivning får inte vara tom.");
                return;
            }
            if (Validering.isEmpty(txtChef.getText())) {
                JOptionPane.showMessageDialog(this, "Chef får inte vara tomt.");
                return;
            }
            if (Validering.isEmpty(txtStadNamn.getText())) {
                JOptionPane.showMessageDialog(this, "Stad får inte vara tomt.");
                return;
            }

            if (namnArray.length != 2){
            JOptionPane.showMessageDialog(this, "Vänligen ange både för - och efternamn");
            return;
            }
            
            //Här ställs en sql-fråga där vi vill hämta "aid" från anställd.
            String sqlChef = "SELECT aid FROM anstalld WHERE fornamn = '" + namnArray[0] + "' AND efternamn = '" + namnArray[1] + "'";
             
            //Om inget resultat hittas, Om resultat är exakt icke-existerande (==) så returneras nedan meddelande.
            String chefResultat = idb.fetchSingle(sqlChef);
            if (chefResultat == null) {
                JOptionPane.showMessageDialog(this, "Chef finns inte.");
                return;
            }
            

            //Här ställs en sql-fråga där vi vill hämta "sid" från stad.
            String sqlStad = "SELECT sid FROM stad WHERE namn = '" + stadStr + "'";

            //Om inget resultat hittas, Om resultat är exakt icke-existerande (==) så returneras nedan meddelande.
            String stadResultat = idb.fetchSingle(sqlStad);
            if (stadResultat == null) {
                JOptionPane.showMessageDialog(this, "Stad finns inte.");
                return;
            }

            //Här hämtas det högsta avdid som existerar för stunden och lägger till + 1.
            String sqlNextId = "SELECT MAX(avdid) FROM avdelning";
            String nextIdStr = idb.fetchSingle(sqlNextId);

            //Om inga avdelningar finns så vill vi starta på 1.
            int nextAvdid = 1;
            if (nextIdStr != null && !nextIdStr.isEmpty()) {
                nextAvdid = Integer.parseInt(nextIdStr) + 1;
            }

            //Här skapas en sql-fråga där vi vill inserta (lägga till en ny rad) i avdelningstabellen.
            String sqlFraga = "INSERT INTO avdelning (avdid, namn, adress, epost, telefon, beskrivning, chef, stad) "
                    + "VALUES (" + nextAvdid + ", '" + namn + "', '" + adress + "', '" + epost + "', '" + telefon + "', '" + beskrivning + "', " + chefResultat + ", " + stadResultat + ")";
            
            //Här körs sql frågan.
            idb.insert(sqlFraga);

            //Detta skrivs ut ifall vi lyckats med att lägga till en avdelning.
            JOptionPane.showMessageDialog(this, "Avdelning har lagts till i systemet!");

            //Dessa kodrader tömmer varje textfält efter att ädnringen har skett
            //för att underlätta inför nästa gång man ska skriva in något.
            txtNamn.setText("");
            txtAdress.setText("");
            txtEpost.setText("");
            txtTelefon.setText("");
            txtBeskrivning.setText("");
            txtChef.setText("");
            txtStadNamn.setText("");
        } //Detta är slutet på try-catch satsen och här fångas eventuella fel.
        catch (Exception ettFel) {

            //Här skrivs följande felmeddelande ut vid fel som fångats i "catch".
            JOptionPane.showMessageDialog(this, "Fel: " + ettFel.getMessage());

            //Här skrivs felmeddelandet ut i terminalen.
            ettFel.printStackTrace();
        }

        //Här uppdateras tabellen så den nya avdelningen syns.
        fyllAvdelningarITabell();
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        try {
            // Detta visar en popup-ruta där man får ange avdelnings-ID.
            String avdelningsId = JOptionPane.showInputDialog(this, "Ange avdelnings-ID (avdid) för att ta bort:");

            // Om man inte fyller i rutan med ett giltigt avdid.
            if (avdelningsId == null || avdelningsId.isEmpty()) {
                //Detta skrivs ut ifall ett ogiltigt avdelnings-id anges.
                JOptionPane.showMessageDialog(this, "Fyll i ett avdelnings-ID först.");
                return;
            }

            // Här hämtar vi genom en sql-fråga namn på avdelning genom att ange specifikt avdid.
            String sqlFraga = "SELECT namn FROM avdelning WHERE avdid = " + avdelningsId;

            //Här kör vi sql-frågan.
            ArrayList<HashMap<String, String>> avdelningar = idb.fetchRows(sqlFraga);

            // Om ingen avdelning hittas...
            if (avdelningar == null || avdelningar.isEmpty()) {

                //...Så kommer följande felmeddelande att visas.
                JOptionPane.showMessageDialog(this, "Det finns ingen avdelning med detta ID.");
                return;
            }

            //Här skapas en array med namnen på samtliga avdelningar.
            String[] avdelningsNamnLista = new String[avdelningar.size()];

            //En for-loop körs och går igenom alla avdelningar.
            for (int i = 0; i < avdelningar.size(); i++) {

                //Här hämtar vi index och namn på avdelningarna från arrayen "avdelningsNamnLista".
                avdelningsNamnLista[i] = avdelningar.get(i).get("namn");
            }

            //Här visas en popup-ruta genom "JOptionPane.QUESTION_MESSAGE" där man måste bekräfta vilken avdelning man vill ta bort.
            String valdAvdelning = (String) JOptionPane.showInputDialog(
                    this, "Bekräfta vilken avdelning du vill ta bort:", "Ta bort avdelning",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    //Detta är lista med alternativ att välja mellan.
                    avdelningsNamnLista,
                    //Detta är standardvalet som är förvalt inför varje gång rutan öppnas.
                    avdelningsNamnLista[0]
            );

            //Om användaren inte har tryckt avbryt.
            if (valdAvdelning != null) {

                //Då kör den en for-each loop där den går igenom resultatet från databasen
                //Och jämför det med det som anvöndaren matade in.
                for (HashMap<String, String> a : avdelningar) {
                    String namn = a.get("namn");

                    //Om namnet på avdelningen stämmer överens med vad som matades in.
                    if (namn.equals(valdAvdelning)) {

                        //Så körs denna sql-fråga vars syfte är att ta bort avdelningen från databasen.
                        String deleteSql = "DELETE FROM avdelning WHERE avdid = " + avdelningsId;

                        //Här körs frågan.
                        idb.delete(deleteSql);

                        //Detta skrivs ut efter att borttagningen utförts.
                        JOptionPane.showMessageDialog(this, "Avdelningen togs bort.");
                        fyllAvdelningarITabell();

                        //Detta avslutar loopen och därmed metoden.
                        break;
                    }
                }
            }

            //Här fångas eventuella fel.
        } catch (InfException ettFel) {

            //Detta är det som skrivs ut vid ett fel av borttagningen av en avdelning.
            JOptionPane.showMessageDialog(this, "Fel vid borttagning av avdelning: " + ettFel.getMessage());
        }
    }//GEN-LAST:event_btnTaBortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbKosmetiskt;
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnTillbakaAdmin;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelAvdelning;
    private javax.swing.JLabel jLabelBeskrivning;
    private javax.swing.JLabel jLabelChef;
    private javax.swing.JLabel jLabelEpost;
    private javax.swing.JLabel jLabelNamn;
    private javax.swing.JLabel jLabelStad;
    private javax.swing.JLabel jLabelTelefon;
    private javax.swing.JScrollPane jScrollPaneAvdelning;
    private javax.swing.JTable jTableAvdelningar;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBeskrivning;
    private javax.swing.JTextField txtChef;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtStadNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
