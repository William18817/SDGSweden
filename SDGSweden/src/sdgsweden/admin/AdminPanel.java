/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sdgsweden.admin;
import java.util.Random;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
/**
 *
 * @author willi
 */
public class AdminPanel extends javax.swing.JPanel {

    private InfDB idb;
    
    public AdminPanel(InfDB idb) {
        this.idb = idb;
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
        jLabel8 = new javax.swing.JLabel();
        txtAnstallningsdatum = new javax.swing.JTextField();
        pwdLosenord = new javax.swing.JPasswordField();
        txtAvdelning = new javax.swing.JTextField();
        btnLaggTillAnstalld = new javax.swing.JButton();
        btnGenereraLosenord = new javax.swing.JButton();
        chkVisaLosenord = new javax.swing.JCheckBox();
        btnTaBortAnstalld = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRedigeraAvdelning = new javax.swing.JButton();
        btnRedigeraPartner = new javax.swing.JButton();
        btnRedigeraLand = new javax.swing.JButton();
        btnRedigeraProjekt = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lägg till/Ta bort anställd"));

        jLabel1.setText("Förnamn");

        jLabel2.setText("Efternamn");

        jLabel3.setText("Adress");

        jLabel4.setText("Epost");

        jLabel5.setText("Telefon");

        txtFornamn.setPreferredSize(new java.awt.Dimension(150, 24));

        txtEfternamn.setPreferredSize(new java.awt.Dimension(150, 24));

        txtAdress.setPreferredSize(new java.awt.Dimension(150, 24));

        txtEpost.setPreferredSize(new java.awt.Dimension(150, 24));

        txtTelefon.setPreferredSize(new java.awt.Dimension(150, 24));

        jLabel6.setText("Anställningsdatum (yyyy-MM-dd)");

        jLabel7.setText("Lösenord (Dolt)");

        jLabel8.setText("Avdelning (ID)");

        txtAnstallningsdatum.setPreferredSize(new java.awt.Dimension(150, 24));

        pwdLosenord.setPreferredSize(new java.awt.Dimension(150, 24));

        txtAvdelning.setPreferredSize(new java.awt.Dimension(150, 24));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdLosenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAvdelning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnstallningsdatum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenereraLosenord)
                            .addComponent(btnTaBortAnstalld)
                            .addComponent(chkVisaLosenord)
                            .addComponent(btnLaggTillAnstalld))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(jLabel8)
                    .addComponent(txtAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnLaggTillAnstalld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaBortAnstalld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenereraLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkVisaLosenord)
                .addContainerGap(20, Short.MAX_VALUE))
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

        btnRedigeraLand.setText("Land");
        btnRedigeraLand.setPreferredSize(new java.awt.Dimension(150, 24));
        btnRedigeraLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraLandActionPerformed(evt);
            }
        });

        btnRedigeraProjekt.setText("Projekt");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRedigeraProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRedigeraLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRedigeraPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRedigeraAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnRedigeraAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedigeraPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedigeraLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedigeraProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenereraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenereraLosenordActionPerformed
        String tecken = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //Detta betyder att den kan generera ett lösenord som inenhåller bokstäver mellan a-z (Stora och små bokstäver) samt siffrorna 0-9.
        
        StringBuilder losenord = new StringBuilder();
        //Här skapas ett tomt objekt av typen "StringBuilder". Går att använda "String" också men "StringBuilder" anses som ett bättre val gällande kommande for-loop.
        
        for (int i = 0; i < 10; i++)
        //Detta är en for-loop som beskriver att loopen körs 10 gånger vilket också innebär att lösenordet är 10 tecken långt.
        {
            int index = (int)(Math.random() * tecken.length());
            //Raden ovan väljer ett slumpmässigt tal som visar vilket tal och/eller tecken som ska väljas från "String tecken".
            //Math.random() genererar ett slumpmässigt tal mellan 0 och 1.
            //tecken.length() = Hur många tecken som finns i "String tecken".
            //(int) = Detta tar bort decimalerna vilekt bidrar till att lösenordet blir av heltal.
            
            losenord.append(tecken.charAt(index));
            //Här hämtar vi ett tecken från "String tecken" på platsen "index" och lägger det i lösenordet.
        }
        pwdLosenord.setText(losenord.toString());
        //Losenord.toString() = omvandlar "StringBuilder" till en textsträng.
        //setText = Gör att lösenordet visas i textfältet.
               

    }//GEN-LAST:event_btnGenereraLosenordActionPerformed

    private void chkVisaLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVisaLosenordActionPerformed
        if (chkVisaLosenord.isSelected())
        //En if-sats där det här kontrolleras om rutan är ikryssad.
        {
            pwdLosenord.setEchoChar((char) 0);
            //Sista stycket i denna rad säger att lösenordet ska visas i vanlig text.
        }
        else
        //Detta körs om inte rutan är ikryssad.
        {
            pwdLosenord.setEchoChar('•');
            //Lösenordet visas isåfall i denna formen "•••••".
        }
    

    }//GEN-LAST:event_chkVisaLosenordActionPerformed

    private void btnRedigeraAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraAvdelningActionPerformed
        RedigeraAvdelning nyttFönster = new RedigeraAvdelning();
        //Denna kodrad skapar ett nytt fönster av klassen "RedigeraAvdelning".
        //"nyttFönster" är en variabel som vi valde att döpa till "nyttFönster".
        
        nyttFönster.setVisible(true);
        //Här skriver vi att vi vill att fönstret ska vara synligt.
    }//GEN-LAST:event_btnRedigeraAvdelningActionPerformed

    private void btnRedigeraPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraPartnerActionPerformed
        RedigeraPartner nyttFönster = new RedigeraPartner();
        //Denna kodrad skapar ett nytt fönster av klassen "RedigeraPartner".
        //"nyttFönster" är en variabel som vi valde att döpa till "nyttFönster".
        
        nyttFönster.setVisible(true);
        //Här vill vi att fönstret ska vara synligt.
    }//GEN-LAST:event_btnRedigeraPartnerActionPerformed

    private void btnRedigeraLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraLandActionPerformed
        RedigeraLand nyttFönster = new RedigeraLand();
        //Denna kodrad skapar ett nytt fönster av klassen "RedigeraLand".
        //"nyttFönster" är en variabel som vi valde att döpa till "nyttFönster".
        
        nyttFönster.setVisible(true);
        //Här vill vi att fönstret ska vara synligt.
    }//GEN-LAST:event_btnRedigeraLandActionPerformed

    private void btnLaggTillAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillAnstalldActionPerformed
        try
        //Detta är början på en try-catch sats och allt som står innaför try och catch försöker nu systemet att köra.
            
        {
            // 1. Hämta nästa pid
            String sqlAid = "SELECT MAX(aid) + 1 FROM anstalld";
            String nextId = idb.fetchSingle(sqlAid);

        if (nextId == null) {
            nextId = "1";  // Första projektet
            }

            int aID = Integer.parseInt(nextId);
            String fornamn = txtFornamn.getText();
            String efternamn = txtEfternamn.getText();
            String adress = txtAdress.getText();
            String epost = txtEpost.getText();
            String telefon = txtTelefon.getText();
            String datum = txtAnstallningsdatum.getText();
            String losenord = new String(pwdLosenord.getPassword());
            String avdelning = txtAvdelning.getText();
            
            String sqlFraga = "INSERT INTO anstalld (aid, fornamn, efternamn, adress, epost, telefon, anstallningsdatum, losenord, avdelning) "
    + "VALUES ('" + aID + "', '" + fornamn + "', '" + efternamn + "', '" + adress + "', '" + epost + "', '" + telefon + "', '"
    + datum + "', '" + losenord + "', " + avdelning + ")";

        idb.insert(sqlFraga);
        
        JOptionPane.showMessageDialog(null, "En ny anställd har nu blivit tillagd i systemet.");

        }
        catch (Exception felHittat)
        //Här har vi slutet på try-catch satsen och om något går fel i ovan kod så kommer följande kodrad under detta att ske. "felHittat" ansåg vi var ett passande namn på variabeln.
        {
            JOptionPane.showMessageDialog(null, "Ett fel har upptäckts: " + felHittat.getMessage());
            //Här visas istället ett felmeddelande som meddelar ovan information som vi angett i koden.
        }
    }//GEN-LAST:event_btnLaggTillAnstalldActionPerformed

    private void btnRedigeraProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraProjektActionPerformed
        RedigeraProjekt nyttFönster = new RedigeraProjekt();
        //Denna kodrad skapar ett nytt fönster av klassen "RedigeraProjekt".
        //"nyttFönster" är en variabel som vi valde att döpa till "nyttFönster".
        
        nyttFönster.setVisible(true);
        //Här skriver vi att vi vill att fönstret ska vara synligt.
    }//GEN-LAST:event_btnRedigeraProjektActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenereraLosenord;
    private javax.swing.JButton btnLaggTillAnstalld;
    private javax.swing.JButton btnRedigeraAvdelning;
    private javax.swing.JButton btnRedigeraLand;
    private javax.swing.JButton btnRedigeraPartner;
    private javax.swing.JButton btnRedigeraProjekt;
    private javax.swing.JButton btnTaBortAnstalld;
    private javax.swing.JCheckBox chkVisaLosenord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pwdLosenord;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAnstallningsdatum;
    private javax.swing.JTextField txtAvdelning;
    private javax.swing.JTextField txtEfternamn;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtFornamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
