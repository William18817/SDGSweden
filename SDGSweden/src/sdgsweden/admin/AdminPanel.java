package sdgsweden.admin;

import java.awt.Container;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import sdgsweden.MainFrame;
import sdgsweden.Startsida;
import oru.inf.InfException;
import sdgsweden.Validering;

/**
 * @author willi
 */
public class AdminPanel extends javax.swing.JPanel {

    private MainFrame parent;
    private InfDB idb;
    private String aid;

    public AdminPanel(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;
        initComponents();

        //Här förösker vi köra metoden "fyllAvdelningComboBox()" vars syfte är att fyllla i en combobox med information.
        try {
            fyllAvdelningComboBox();

            //Om något går fel under tiden metoden körs så fångas felet här.
        } catch (InfException e) {

            //Då skrivs detta felmeddelande ut.
            JOptionPane.showMessageDialog(this, "Kunde inte läsa in data för avdelningar " + e.getMessage());
        }
    }

    public AdminPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFornamn = new javax.swing.JTextField();
        txtEfternamn = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtEpost = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAnstallningsdatum = new javax.swing.JTextField();
        pwdLosenord = new javax.swing.JPasswordField();
        btnLaggTillAnstalld = new javax.swing.JButton();
        btnGenereraLosenord = new javax.swing.JButton();
        chkVisaLosenord = new javax.swing.JCheckBox();
        btnTaBortAnstalld = new javax.swing.JButton();
        avdelningComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRedigeraAvdelning = new javax.swing.JButton();
        btnRedigeraPartner = new javax.swing.JButton();
        btnRedigeraLand1 = new javax.swing.JButton();
        btnRedigeraProjekt = new javax.swing.JButton();
        LbKosmetiskt = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lägg till/Ta bort anställd"));

        jLabel1.setText("Förnamn*");

        jLabel2.setText("Efternamn*");

        jLabel3.setText("Adress*");

        jLabel4.setText("Epost*");

        jLabel5.setText("Telefon*");

        txtFornamn.setPreferredSize(new java.awt.Dimension(150, 24));

        txtEfternamn.setPreferredSize(new java.awt.Dimension(150, 24));

        txtAdress.setPreferredSize(new java.awt.Dimension(150, 24));

        txtEpost.setPreferredSize(new java.awt.Dimension(150, 24));

        txtTelefon.setPreferredSize(new java.awt.Dimension(150, 24));

        jLabel6.setText("Anställningsdatum (YYYY-MM-DD*");

        jLabel7.setText("Lösenord (Dolt)*");

        txtAnstallningsdatum.setPreferredSize(new java.awt.Dimension(150, 24));

        pwdLosenord.setPreferredSize(new java.awt.Dimension(150, 24));

        btnLaggTillAnstalld.setText("Lägg till");
        btnLaggTillAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillAnstalldActionPerformed(evt);
            }
        });

        btnGenereraLosenord.setText("Generera lösenord");
        btnGenereraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenereraLosenordActionPerformed(evt);
            }
        });

        chkVisaLosenord.setText("Visa lösenord");
        chkVisaLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVisaLosenordActionPerformed(evt);
            }
        });

        btnTaBortAnstalld.setText("Ta bort");
        btnTaBortAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAnstalldActionPerformed(evt);
            }
        });

        jLabel9.setText("Avdelning");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(chkVisaLosenord)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(avdelningComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pwdLosenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(txtAnstallningsdatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFornamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnLaggTillAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaBortAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenereraLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pwdLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avdelningComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addComponent(btnLaggTillAnstalld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaBortAnstalld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenereraLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkVisaLosenord)
                    .addComponent(btnTillbaka))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Redigera enhet"));

        btnRedigeraAvdelning.setText("Avdelning");
        btnRedigeraAvdelning.setPreferredSize(new java.awt.Dimension(150, 24));
        btnRedigeraAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraAvdelningActionPerformed(evt);
            }
        });

        btnRedigeraPartner.setText("Partner");
        btnRedigeraPartner.setPreferredSize(new java.awt.Dimension(150, 24));
        btnRedigeraPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraPartnerActionPerformed(evt);
            }
        });

        btnRedigeraLand1.setText("Land");
        btnRedigeraLand1.setPreferredSize(new java.awt.Dimension(150, 24));
        btnRedigeraLand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraLand1ActionPerformed(evt);
            }
        });

        btnRedigeraProjekt.setText("Projekt ");
        btnRedigeraProjekt.setPreferredSize(new java.awt.Dimension(150, 24));
        btnRedigeraProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraProjektActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRedigeraLand1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedigeraPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedigeraAvdelning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedigeraProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnRedigeraAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRedigeraPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRedigeraLand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRedigeraProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LbKosmetiskt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo-lite-större.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(LbKosmetiskt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LbKosmetiskt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenereraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenereraLosenordActionPerformed

        //Detta betyder att den kan generera ett lösenord som inenhåller bokstäver mellan a-z (Stora och små bokstäver) samt siffrorna 0-9.
        String tecken = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        //Här skapas ett tomt objekt av typen "StringBuilder". Går att använda "String" också men "StringBuilder" anses som ett bättre val gällande kommande for-loop.
        StringBuilder losenord = new StringBuilder();

        //Detta är en for-loop som beskriver att loopen körs 10 gånger vilket också innebär att lösenordet är 10 tecken långt.
        for (int i = 0; i < 11; i++) {

            //Raden ovan väljer ett slumpmässigt tal som visar vilket tal och/eller tecken som ska väljas från "String tecken".
            //Math.random() genererar ett slumpmässigt tal mellan 0 och 1.
            //tecken.length() = Hur många tecken som finns i "String tecken".
            //(int) = Detta tar bort decimalerna vilekt bidrar till att lösenordet blir av heltal.
            int index = (int) (Math.random() * tecken.length());

            //Här hämtar vi ett tecken från "String tecken" på platsen "index" och lägger det i lösenordet.
            losenord.append(tecken.charAt(index));
        }

        //Losenord.toString() = omvandlar "StringBuilder" till en textsträng.
        //setText = Gör att lösenordet visas i textfältet.
        pwdLosenord.setText(losenord.toString());

    }//GEN-LAST:event_btnGenereraLosenordActionPerformed

    private void chkVisaLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVisaLosenordActionPerformed

        //En if-sats där det här kontrolleras om rutan är ikryssad.
        if (chkVisaLosenord.isSelected()) {

            //Sista stycket i denna rad säger att lösenordet ska visas i vanlig text.
            pwdLosenord.setEchoChar((char) 0);

            //Detta körs om inte rutan är ikryssad.  
        } else {

            //Lösenordet visas isåfall i denna formen "•••••".
            pwdLosenord.setEchoChar('•');

        }
    }//GEN-LAST:event_chkVisaLosenordActionPerformed

    private void btnRedigeraAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraAvdelningActionPerformed

        //Skapar ett nytt objekt av klassen AdminAvdelning och skickar med tre argument:
        //parent är huvudfönstret (ofta ett MainFrame eller liknande som styr vilket panel som visas).
        //idb är databasanslutningen (InfDB-objektet).
        //aid är den inloggade användarens ID (anställnings-ID)
        //Resultatet sparas i en variabel som heter adminAvdelningPanel.
        AdminAvdelning adminAvdelningPanel = new AdminAvdelning(parent, idb, aid);

        //Anropar en metod i parent (huvudfönstret) som visar det nya panel-objektet (adminAvdelningPanel)
        //och ger det ett namn ("adminAvdelning") som kan användas för att byta paneler i ett CardLayout. 
        parent.visaPanel(adminAvdelningPanel, "adminAvdelning");


    }//GEN-LAST:event_btnRedigeraAvdelningActionPerformed

    private void btnRedigeraPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraPartnerActionPerformed

        //Skapar ett nytt objekt av klassen AdminPartner och skickar med tre argument:
        //parent är huvudfönstret (ofta ett MainFrame eller liknande som styr vilket panel som visas).
        //idb är databasanslutningen (InfDB-objektet).
        //aid är den inloggade användarens ID (anställnings-ID)
        //Resultatet sparas i en variabel som heter adminPartnerPanel.
        AdminPartner adminPartnerPanel = new AdminPartner(parent, idb, aid);

        //Anropar en metod i parent (huvudfönstret) som visar det nya panel-objektet (adminPartnerPanel)
        //och ger det ett namn ("adminPartner") som kan användas för att byta paneler i ett CardLayout. 
        parent.visaPanel(adminPartnerPanel, "adminPartner");
    }//GEN-LAST:event_btnRedigeraPartnerActionPerformed

    private void btnLaggTillAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillAnstalldActionPerformed
        try {

            // Hämta inmatade värden från formuläret (tar bort onödiga mellanslag med trim()).
            String fornamn = txtFornamn.getText().trim();
            String efternamn = txtEfternamn.getText().trim();
            String adress = txtAdress.getText().trim();
            String epost = txtEpost.getText().trim();
            String telefon = txtTelefon.getText().trim();
            String datum = txtAnstallningsdatum.getText().trim();
            String losenord = new String(pwdLosenord.getPassword()).trim();
            String valdAvdelning = (String) avdelningComboBox.getSelectedItem();

            if (Validering.isEmpty(txtFornamn.getText())) {
                JOptionPane.showMessageDialog(this, "Förnamn får inte vara tomt.");
                return;
            }
            if (Validering.isEmpty(txtEfternamn.getText())) {
                JOptionPane.showMessageDialog(this, "Efternamn får inte vara tomt.");
                return;
            }
            if (!Validering.isValidAdress(txtAdress.getText())) {
                JOptionPane.showMessageDialog(this, "Ogiltig adress.");
                return;
            }
            if (!Validering.isValidEpost(txtEpost.getText())) {
                JOptionPane.showMessageDialog(this, "Ogiltig E-postadress. Måste exempelvis skrivas: namn.efternamn@example.com");
                return;
            }
            if (!Validering.isValidTelefon(txtTelefon.getText())) {
                JOptionPane.showMessageDialog(this, "Ogiltigt telefonnummer. Måste vara mellan 7-15 siffror.");
                return;
            }
            if (!Validering.isValidAnstallningsdatum(txtAnstallningsdatum.getText())) {
                JOptionPane.showMessageDialog(this, "Ogiltigt anställningsdatum. Måste skrivas: YYYY-MM-DD.");
                return;
            }
            if (!Validering.isValidLosenord(new String(pwdLosenord.getPassword()))) {
                JOptionPane.showMessageDialog(this, "Lösenord får inte vara tomt. Måste vara minst 11 tecken.");
                return;
            }

            //hämtar avdid baserat på den avdelning man valt i comboBox.
            String avdelningsId = idb.fetchSingle("SELECT avdid FROM avdelning WHERE namn = '" + valdAvdelning + "'");
            if (avdelningsId == null) {

                //Detta felmeddelande skrivs ut ifall ingen avdelning hittades.
                JOptionPane.showMessageDialog(this, "Avdelningen hittades inte i databasen.");
                return;
            }

            //Här hämtar vi nästa lediga aid.
            String sqlNextId = "SELECT MAX(aid) + 1 FROM anstalld";
            String nextIdStr = idb.fetchSingle(sqlNextId);

            //Om det inte finns några anställda i systemet så börjar vi på 1.
            if (nextIdStr == null) {
                nextIdStr = "1";
            }

            //Här konverteras id:t till ett heltal.
            int nextAid = Integer.parseInt(nextIdStr);

            //Skapar en INSERT-fråga.
            String sql = "INSERT INTO anstalld (aid, fornamn, efternamn, adress, epost, telefon, anstallningsdatum, losenord, avdelning) "
                    + "VALUES (" + nextAid + ", "
                    + "'" + fornamn + "', "
                    + "'" + efternamn + "', "
                    + "'" + adress + "', "
                    + "'" + epost + "', "
                    + "'" + telefon + "', "
                    + "'" + datum + "', "
                    + "'" + losenord + "', "
                    + avdelningsId + ")";

            //Kör INSERT där frågan skickas till databasen för att lägga till personen.
            idb.insert(sql);

            //Detta meddelande skrivs ut om det lyckas.
            JOptionPane.showMessageDialog(this, "Anställd har lagts till i systemet!");

            //Detta rensar sedan textfälten.
            txtFornamn.setText("");
            txtEfternamn.setText("");
            txtAdress.setText("");
            txtEpost.setText("");
            txtTelefon.setText("");
            txtAnstallningsdatum.setText("");
            pwdLosenord.setText("");
            //txtAvdelning.setText("");

            //Här fångas eventuella fel upp.
        } catch (Exception ettFel) {

            //Detta felmeddelande skrivs då ut.
            JOptionPane.showMessageDialog(this, "Fel: " + ettFel.getMessage());
            ettFel.printStackTrace();
        }
    }//GEN-LAST:event_btnLaggTillAnstalldActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed

        //Här skapas ett nytt objekt av "AdminPanel" i form av att ett nytt GUI-panel_fönster dyker upp.
        //Den får med sig tre saker från konstruktorn i form av "Parent (MainFrame), idb (databaskopplingen) och aid (användarens id).
        Startsida startsida = new Startsida(parent, idb, aid);

        //Detta är ett metodanrop vars syfte är att visa "startsida".
        parent.visaPanel(startsida, "startsida");
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnTaBortAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAnstalldActionPerformed

        //Här påbörjar vi en try-catch sats. All kod mellan try och catch kommer nu köras.
        try {
            //Detta visar en popup-ruta som dyker upp efter man klickat på "Ta bort" och här får man ange "aid" för att ta bort en anställd.
            String anstalldId = JOptionPane.showInputDialog(this, "Ange anställnings-ID (aid) för att ta bort:");

            // Om användaren trycker på "Avbryt" eller stänger rutan
            if (anstalldId == null) {
                return;
            }

            //Om man inte fyller i rutan med ett giltigt aid så kommer meddelandet i koden här under att visas.
            if (anstalldId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fyll i ett anställnings-ID först.");
                return;
            }

            // Hämta specifik information om den anställde.
            String sql = "SELECT fornamn, efternamn FROM anstalld WHERE aid = " + anstalldId;

            //Här körs SQL_frågan mot databasen.
            ArrayList<HashMap<String, String>> anstallda = idb.fetchRows(sql);

            //Om inget resultat hittas så kommer nedan meddelande att visas och sedan avbryts sekvensen på grund av "return".
            if (anstallda == null || anstallda.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Det finns ingen anställd med detta ID.");
                return;
            }

            //Här skapas en array "anstalldNamnLista".
            String[] anstalldNamnLista = new String[anstallda.size()];

            //Här sker en for-loop som går igenom alla naställda i listan och lägger in deras fullständiga namn i arrayen.
            for (int i = 0; i < anstallda.size(); i++) {
                anstalldNamnLista[i] = anstallda.get(i).get("fornamn") + " " + anstallda.get(i).get("efternamn");
            }

            //Visar en popup-dialog där användaren kan välja en person att ta bort.
            //Den använder arrayen med namn som alternativ i rullgardinsmenyn.
            //Förvalt val är det första namnet i listan.
            String valdAnstalld = (String) JOptionPane.showInputDialog(
                    this,
                    "Bekräfta vilken anställd du vill ta bort:",
                    "Ta bort anställd",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    anstalldNamnLista,
                    anstalldNamnLista[0]
            );

            //Om användaren inte valt ett namn...
            if (valdAnstalld != null) {

                //Så körs denna loop som går igenom listan med anställda för att hitta rätt person.
                for (HashMap<String, String> a : anstallda) {

                    //Här skapas det ett fullständigt namn från varje rad (förnamn + efternamn).
                    String namn = a.get("fornamn") + " " + a.get("efternamn");

                    //Här jämförs namnet med det namn som användaren valde i popup-rutan.
                    if (namn.equals(valdAnstalld)) {

                        //Om rätt person hittas, så tas personen bort.
                        String deleteSql = "DELETE FROM anstalld WHERE aid = " + anstalldId;

                        //Denna kod kör frågan i databasen.
                        idb.delete(deleteSql);

                        //Detta meddelande skrivs sedan ut.
                        JOptionPane.showMessageDialog(this, "Den anställde togs bort.");
                        break;
                    }
                }
            }

            //Här fångas eventuella fel.  
        } catch (InfException e) {

            //Vid fel skrivs detta felmeddelande ut.
            JOptionPane.showMessageDialog(this, "Fel vid borttagning av anställd: " + e.getMessage());
        }

    }//GEN-LAST:event_btnTaBortAnstalldActionPerformed

    private void btnRedigeraLand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraLand1ActionPerformed

        //Skapar ett nytt objekt av klassen AdminLand.
        //Tre saker skickas med till konstruktorn:
        //parent är huvudfönstret (t.ex. ett objekt av MainFrame eller liknande)
        //idb är anslutningen till databasen (InfDB-objekt)
        //aid är inloggad användares ID (anställnings-ID)
        //Detta gör att panelen "AdminLand" får tillgång till både databas och användarinformation.
        AdminLand adminLandPanel = new AdminLand(parent, idb, aid);

        //Anropar metoden "visaPanel" i huvudfönstret (parent).
        //Den byter ut den nuvarande panelen i GUI:t till adminLandPanel.
        //"adminLand" används som namn för att identifiera panelen i ett CardLayout-system.
        parent.visaPanel(adminLandPanel, "adminLand");

    }//GEN-LAST:event_btnRedigeraLand1ActionPerformed

    private void btnRedigeraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraProjektActionPerformed

        //Skapar ett nytt objekt av klassen AdminProjekt.
        //Skickar med:
        // - idb: databasanslutningen (så att panelen kan hämta och spara projekt)
        // - this: referens till den nuvarande panelen (Admin), om AdminProjekt behöver kommunicera tillbaka.
        AdminProjekt adminProjektPanel = new AdminProjekt(idb, this); // this = referens till Admin om det behövs

        // Hämtar containern (föräldern) som den nuvarande panelen ligger i.
        // Detta behövs för att kunna byta ut panelen som visas i fönstret.
        Container parentAdminPanel = this.getParent();
        parentAdminPanel.removeAll();
        parentAdminPanel.add(adminProjektPanel);
        parentAdminPanel.revalidate();
        parentAdminPanel.repaint();
    }//GEN-LAST:event_btnRedigeraProjektActionPerformed

    private void fyllAvdelningComboBox() throws InfException {
        avdelningComboBox.removeAllItems();
        ArrayList<HashMap<String, String>> avdelningar = idb.fetchRows("SELECT namn FROM avdelning");

        for (HashMap<String, String> a : avdelningar) {
            avdelningComboBox.addItem(a.get("namn"));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbKosmetiskt;
    private javax.swing.JComboBox<String> avdelningComboBox;
    private javax.swing.JButton btnGenereraLosenord;
    private javax.swing.JButton btnLaggTillAnstalld;
    private javax.swing.JButton btnRedigeraAvdelning;
    private javax.swing.JButton btnRedigeraLand1;
    private javax.swing.JButton btnRedigeraPartner;
    private javax.swing.JButton btnRedigeraProjekt;
    private javax.swing.JButton btnTaBortAnstalld;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JCheckBox chkVisaLosenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pwdLosenord;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAnstallningsdatum;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
