
package sdgsweden;

import oru.inf.InfDB;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Kalkilm, under följer kod som gör det möjligt för intresenter att
 * visa samnt redigera personlig information som sparats i angiven databas.
 */
public class MittKonto extends javax.swing.JPanel {

    /**
     * Creates new form MittKonto
     */
    private InfDB idb;
    private String aid;

    public MittKonto(InfDB idb, String aid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        LbMotivation.setVisible(false); // gömmer vår katt från start.
        hamntaAnvandarInfo();
    }

    //metoden hämtar info om en användare från databas,
    //baserat på "aid". 
    public void hamntaAnvandarInfo() {
        try {
            String sql = "SELECT * FROM anstalld WHERE aid = '" + aid + "'";
            HashMap<String, String> anvandarData = idb.fetchRow(sql);

            if (anvandarData != null)//kontrollerar om vi hittar en match för "aid" i databasen och plockar ut data från användare där det machar.
            {
                TfFornamn.setText(anvandarData.get("fornamn"));
                TfEfternamn.setText(anvandarData.get("efternamn"));
                TfAdress.setText(anvandarData.get("adress"));
                TfEpost.setText(anvandarData.get("epost"));
                TfTelefon.setText(anvandarData.get("telefon"));
                TfAnstallningsdatum.setText(anvandarData.get("anstallningsdatum"));
                TfLosenord.setText(anvandarData.get("losenord"));
                TfAvdelning.setText(anvandarData.get("avdelning"));

                String sqlMentor = ""
                        + "SELECT mentor "
                        + "FROM handlaggare "
                        + "WHERE aid = '" + aid + "'";
                // OBS: fetchSingle (med två l) hämtar en enstaka kolumn
                String mentorAid = idb.fetchSingle(sqlMentor);

                if (mentorAid != null && !mentorAid.isEmpty()) {
                    // 3) Hämta mentorens namn ur anstalld
                    String sqlM = ""
                            + "SELECT fornamn, efternamn "
                            + "FROM anstalld "
                            + "WHERE aid = '" + mentorAid + "'";
                    HashMap<String, String> m = idb.fetchRow(sqlM);

                    if (m != null) {
                        TfDinMentor.setText(
                                m.get("fornamn") + " " + m.get("efternamn")
                        );
                    } else {
                        TfDinMentor.setText("Ingen mentor i anställd");
                    }
                } else {
                    TfDinMentor.setText("Ingen mentor tilldelad");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Användardata hittades inte");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Kunde inte hämta information");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbFornamn = new javax.swing.JLabel();
        LbEfternamn = new javax.swing.JLabel();
        LbAdress = new javax.swing.JLabel();
        LbEpost = new javax.swing.JLabel();
        LbTelefon = new javax.swing.JLabel();
        LbAnstallningsdatum = new javax.swing.JLabel();
        LbLosenord = new javax.swing.JLabel();
        LbAvdelning = new javax.swing.JLabel();
        TfFornamn = new javax.swing.JTextField();
        TfEfternamn = new javax.swing.JTextField();
        TfAdress = new javax.swing.JTextField();
        TfEpost = new javax.swing.JTextField();
        TfTelefon = new javax.swing.JTextField();
        TfAnstallningsdatum = new javax.swing.JTextField();
        TfLosenord = new javax.swing.JTextField();
        TfAvdelning = new javax.swing.JTextField();
        CbRedigeraUppgifter = new javax.swing.JCheckBox();
        BnSparaAndringar = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        SidaTitel = new java.awt.Label();
        TfDinMentor = new javax.swing.JTextField();
        LbDinMentor = new javax.swing.JLabel();
        LbKosmetika = new javax.swing.JLabel();
        BtnMotivation = new javax.swing.JButton();
        LbMotivation = new javax.swing.JLabel();

        LbFornamn.setText("Förnamn :");

        LbEfternamn.setText("Efternamn :");

        LbAdress.setText("Adress :");

        LbEpost.setText("E-post :");

        LbTelefon.setText("Telefon :");

        LbAnstallningsdatum.setText("Anställningsdatum :");

        LbLosenord.setText("Lösenord :");

        LbAvdelning.setText("Avdelning :");

        TfFornamn.setEditable(false);
        TfFornamn.setForeground(java.awt.Color.lightGray);
        TfFornamn.setText("jTextField1");

        TfEfternamn.setEditable(false);
        TfEfternamn.setText("jTextField2");
        TfEfternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfEfternamnActionPerformed(evt);
            }
        });

        TfAdress.setEditable(false);
        TfAdress.setText("jTextField3");
        TfAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfAdressActionPerformed(evt);
            }
        });

        TfEpost.setEditable(false);
        TfEpost.setText("jTextField4");

        TfTelefon.setEditable(false);
        TfTelefon.setText("jTextField5");

        TfAnstallningsdatum.setEditable(false);
        TfAnstallningsdatum.setText("jTextField6");

        TfLosenord.setEditable(false);
        TfLosenord.setText("jTextField7");

        TfAvdelning.setEditable(false);
        TfAvdelning.setText("jTextField8");

        CbRedigeraUppgifter.setText("Redigera Uppgifter");
        CbRedigeraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbRedigeraUppgifterActionPerformed(evt);
            }
        });

        BnSparaAndringar.setText("Spara ändringar");
        BnSparaAndringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnSparaAndringarActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        SidaTitel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SidaTitel.setForeground(new java.awt.Color(255, 255, 255));
        SidaTitel.setText("Dina uppgifter :");

        TfDinMentor.setEditable(false);
        TfDinMentor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfDinMentorActionPerformed(evt);
            }
        });

        LbDinMentor.setText("Din Mentor :");

        LbKosmetika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo-lite-större.png"))); // NOI18N
        LbKosmetika.setText("jLabel1");

        BtnMotivation.setText("BEHÖVER DU MOTIVATION?");
        BtnMotivation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMotivationActionPerformed(evt);
            }
        });

        LbMotivation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/katten.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SidaTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(LbAvdelning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LbLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LbAnstallningsdatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                                .addComponent(LbTelefon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LbEpost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LbAdress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LbFornamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LbEfternamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(LbDinMentor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TfDinMentor, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(TfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TfAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TfAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TfEpost, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(TfTelefon)
                                            .addComponent(TfAdress))))
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnMotivation)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbMotivation, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbRedigeraUppgifter))
                        .addGap(18, 18, 18)
                        .addComponent(BnSparaAndringar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(LbKosmetika, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbKosmetika, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnMotivation, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SidaTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbFornamn)
                                    .addComponent(TfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbEfternamn)
                                    .addComponent(TfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbAdress)
                                    .addComponent(TfAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbEpost)
                                    .addComponent(TfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbTelefon)
                                    .addComponent(TfTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbAnstallningsdatum)
                                    .addComponent(TfAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbLosenord)
                                    .addComponent(TfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbAvdelning)
                                    .addComponent(TfAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TfDinMentor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbDinMentor))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BnSparaAndringar)
                                    .addComponent(CbRedigeraUppgifter)))
                            .addComponent(LbMotivation))
                        .addGap(18, 18, 18)
                        .addComponent(btnTillbaka)
                        .addContainerGap(130, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
    Aktiverar eller inaktiverar redigeringen av vissa textfält
    beroende på om en kryssruta är ibockad eller inte.
     */
    private void CbRedigeraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbRedigeraUppgifterActionPerformed
        boolean redigera = CbRedigeraUppgifter.isSelected();
        TfFornamn.setEditable(redigera);
        TfEfternamn.setEditable(redigera);
        TfAdress.setEditable(redigera);
        TfEpost.setEditable(redigera);
        TfTelefon.setEditable(redigera);
        TfLosenord.setEditable(redigera);


    }//GEN-LAST:event_CbRedigeraUppgifterActionPerformed

    /*
    Den här metoden uppdaterar  en anställds uppgifter i databasen
    utifrån det som användaren har angivit i textfälten.
     */

    private void BnSparaAndringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnSparaAndringarActionPerformed

        if (Validering.isEmpty(TfFornamn.getText())) {
            JOptionPane.showMessageDialog(this, "Förnamn får inte vara tomt.");
            return;
        }

        if (Validering.isEmpty(TfEfternamn.getText())) {
            JOptionPane.showMessageDialog(this, "Efternamn får inte vara tomt");
            return;

        }

        if (!Validering.isValidEpost(TfEpost.getText())) {
            JOptionPane.showMessageDialog(this, "Ogiltig E-postadress. Måste exempelvis skrivas: namn.efternamn@example.com");
            return;
        }

        if (!Validering.isValidTelefon(TfTelefon.getText())) {
            JOptionPane.showMessageDialog(this, "Ogiltigt telefonnummer.");
            return;
        }

        if (!Validering.isValidAnstallningsdatum(TfAnstallningsdatum.getText())) {
            JOptionPane.showMessageDialog(this, "Anställningsdatum måste ha formatet ÅÅÅÅ-MM-DD.");
            return;
        }

        if (!Validering.isValidLosenord(TfLosenord.getText())) {
            JOptionPane.showMessageDialog(this, "Lösenordet måste vara minst 11 tecken långt och innehålla både bokstäver och siffror.");
            return;
        }
        //om validering fungerar sparas datan.
        try {
            String sql = "UPDATE anstalld SET "
                    + "fornamn = '" + TfFornamn.getText() + "', "
                    + "efternamn = '" + TfEfternamn.getText() + "', "
                    + "adress = '" + TfAdress.getText() + "', "
                    + "epost = '" + TfEpost.getText() + "', "
                    + "telefon = '" + TfTelefon.getText() + "', "
                    + "anstallningsdatum = '" + TfAnstallningsdatum.getText() + "', "
                    + "losenord = '" + TfLosenord.getText() + "', "
                    + "avdelning = '" + TfAvdelning.getText() + "' "
                    + "WHERE aid = '" + aid + "'";

            idb.update(sql);//updaterar databasen.

            //visar ett popup-fönster som medelar användaren om att uppgifterna sparats.
            JOptionPane.showMessageDialog(this, "Dina uppgifter har sparats!");
        } //om något går fel i tex databasanropet visas ett felmedelanade, samnt felet loggas i terminal.
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Kunde ej spara ändringar.");

        }

    }//GEN-LAST:event_BnSparaAndringarActionPerformed

    private void TfEfternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfEfternamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfEfternamnActionPerformed
    /*
 Metoden används när användaren klicar på en "tillbaka" knapp
 som ska navigera användaren till startsidan i vårt mainFrame.
     */
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed

        java.awt.Container parentContainer = this.getParent();

        //Loop som går uppåt tills MianFrame hittas (eller andra parent)
        while (!(parentContainer instanceof MainFrame) && parentContainer != null) {

            parentContainer = parentContainer.getParent();

        }

        //Om den hittade containern är ett MianFrame så castar den om till till den samnt sparar den som mainFrame.
        if (parentContainer instanceof MainFrame) {

            MainFrame mainFrame = (MainFrame) parentContainer;

            Startsida startsida = new Startsida(mainFrame, idb, aid);// skapar en ny instans av Startsida, skickar med databasobjekt, aid.

            mainFrame.visaPanel(startsida, "startsida");//Anropar en metod som viasr en ny panel (Startsida)

        }

    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void TfAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfAdressActionPerformed

    private void TfDinMentorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfDinMentorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfDinMentorActionPerformed

    private void BtnMotivationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMotivationActionPerformed
        LbMotivation.setVisible(!LbMotivation.isVisible());
    }//GEN-LAST:event_BtnMotivationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BnSparaAndringar;
    private javax.swing.JButton BtnMotivation;
    private javax.swing.JCheckBox CbRedigeraUppgifter;
    private javax.swing.JLabel LbAdress;
    private javax.swing.JLabel LbAnstallningsdatum;
    private javax.swing.JLabel LbAvdelning;
    private javax.swing.JLabel LbDinMentor;
    private javax.swing.JLabel LbEfternamn;
    private javax.swing.JLabel LbEpost;
    private javax.swing.JLabel LbFornamn;
    private javax.swing.JLabel LbKosmetika;
    private javax.swing.JLabel LbLosenord;
    private javax.swing.JLabel LbMotivation;
    private javax.swing.JLabel LbTelefon;
    private java.awt.Label SidaTitel;
    private javax.swing.JTextField TfAdress;
    private javax.swing.JTextField TfAnstallningsdatum;
    private javax.swing.JTextField TfAvdelning;
    private javax.swing.JTextField TfDinMentor;
    private javax.swing.JTextField TfEfternamn;
    private javax.swing.JTextField TfEpost;
    private javax.swing.JTextField TfFornamn;
    private javax.swing.JTextField TfLosenord;
    private javax.swing.JTextField TfTelefon;
    private javax.swing.JButton btnTillbaka;
    // End of variables declaration//GEN-END:variables
}
