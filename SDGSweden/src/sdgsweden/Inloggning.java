
package sdgsweden;


import oru.inf.InfDB;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Kalkilm: Nedan följer kod som tillåter användare att logga in i vårt
 * system baserat på data hämtat ur databasen, efter inloggningen lyckats så
 * plockar den med "aid" för att kunna fortsätta hålla kopplingen individuell.
 *
 */
public class Inloggning extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form Inloggning
     */
    public Inloggning(InfDB idb) {
        this.idb = idb;
        initComponents();
    }

    public Inloggning() //extra klass för att få Logga ut att köra.
    {
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        PasswordField = new javax.swing.JPasswordField();
        TextFieldEpost = new javax.swing.JTextField();
        ButtonLoggaIn = new javax.swing.JButton();
        LabelRubrik = new javax.swing.JLabel();
        CheckBoxVisaLosenord = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        LabelEpost = new javax.swing.JLabel();
        LabelLosenord = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PasswordField.setColumns(11);
        PasswordField.setText("passwordabc");

        TextFieldEpost.setColumns(10);
        TextFieldEpost.setText("sofia.a@example.com");

        ButtonLoggaIn.setText("Logga in");
        ButtonLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoggaInActionPerformed(evt);
            }
        });

        LabelRubrik.setText("Inloggning  SDG Sweden");

        CheckBoxVisaLosenord.setText("Visa Lösenord");
        CheckBoxVisaLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxVisaLosenordActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo.png"))); // NOI18N

        LabelEpost.setText("E-post:");

        LabelLosenord.setText("Lösenord:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("THE GLOBA GOALS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(ButtonLoggaIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEpost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLosenord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CheckBoxVisaLosenord)
                    .addComponent(TextFieldEpost)
                    .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(LabelRubrik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEpost)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextFieldEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelLosenord))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxVisaLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(ButtonLoggaIn)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBoxVisaLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxVisaLosenordActionPerformed
        if (CheckBoxVisaLosenord.isSelected()) {
            PasswordField.setEchoChar((char) 0); //Visa text
        } else {
            PasswordField.setEchoChar('•'); //Dölj text med karaktär
        }

    }//GEN-LAST:event_CheckBoxVisaLosenordActionPerformed

    private void ButtonLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoggaInActionPerformed
        String epost = TextFieldEpost.getText().trim();
        String losenord = new String(PasswordField.getPassword()).trim();

        // Kontrollera om fälten är tomma
        if (epost.isEmpty() || losenord.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fyll i både e-post och lösenord.");
            return;
        }

        try {
            // Undvik SQL-injektion genom att ersätta ' med ''
            String epostSan = epost.replace("'", "''");
            String losenordSan = losenord.replace("'", "''");

            String sql = "SELECT * FROM anstalld WHERE epost = '" + epostSan + "' AND losenord = '" + losenordSan + "'";
            HashMap<String, String> user = idb.fetchRow(sql);

            if (user != null) {
                String fornamn = user.get("fornamn");
                String efternamn = user.get("efternamn");
                String aid = user.get("aid");

                // Extra säkerhet: kontrollera att namn och aid inte är null
                if (fornamn != null && efternamn != null && aid != null) {
                    JOptionPane.showMessageDialog(this, "Välkommen " + fornamn + " " + efternamn + "! Du kommer nu att logga in.");
                    MainFrame main = new MainFrame(idb, aid);
                    main.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Fel e-post eller lösenord.");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fel vid anslutning till databasen.");
        }

    }//GEN-LAST:event_ButtonLoggaInActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLoggaIn;
    private javax.swing.JCheckBox CheckBoxVisaLosenord;
    private javax.swing.JLabel LabelEpost;
    private javax.swing.JLabel LabelLosenord;
    private javax.swing.JLabel LabelRubrik;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TextFieldEpost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
