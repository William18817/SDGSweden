
package sdgsweden.projekt;

import java.awt.Container;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfDB;

/*
 * @author jonas
 */
public class RedigeraProjekt extends javax.swing.JPanel {

   private InfDB idb;
   private int pid;
   private JPanel projektPanel;
   private JPanel tidigareProjektPanel;
   
    public RedigeraProjekt(InfDB idb, int pid, JPanel projektPanel) {
        this.idb = idb;
        this.pid = pid;
        this.projektPanel = projektPanel;
        
        initComponents(); //Metod för GUI-komponenter
        
        fyllProjektData();
        
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TillbakaKnapp = new javax.swing.JButton();
        projektNamnText = new javax.swing.JTextField();
        JLabelProjekt = new javax.swing.JLabel();
        statusText = new javax.swing.JTextField();
        startdatumText = new javax.swing.JTextField();
        slutdatumText = new javax.swing.JTextField();
        prioText = new javax.swing.JTextField();
        kostnadText = new javax.swing.JTextField();
        BeskrivningScrollPane = new javax.swing.JScrollPane();
        beskrivningText = new javax.swing.JTextArea();
        jLabelBeskrivning = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStartD = new javax.swing.JLabel();
        jLabelSlutD = new javax.swing.JLabel();
        jLabelKostnad = new javax.swing.JLabel();
        jLabelPrioritet = new javax.swing.JLabel();
        SparaButton = new javax.swing.JButton();
        statusComboBox = new javax.swing.JComboBox<>();
        prioComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(0, 0, 255));
        setPreferredSize(new java.awt.Dimension(500, 550));

        TillbakaKnapp.setText("Tillbaka");
        TillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TillbakaKnappActionPerformed(evt);
            }
        });

        projektNamnText.setColumns(10);

        JLabelProjekt.setText("Projektnamn");

        statusText.setColumns(10);

        startdatumText.setColumns(10);

        slutdatumText.setColumns(10);

        prioText.setColumns(10);

        kostnadText.setColumns(10);

        BeskrivningScrollPane.setName(""); // NOI18N
        BeskrivningScrollPane.setPreferredSize(new java.awt.Dimension(300, 100));

        beskrivningText.setColumns(20);
        beskrivningText.setLineWrap(true);
        beskrivningText.setRows(5);
        beskrivningText.setWrapStyleWord(true);
        BeskrivningScrollPane.setViewportView(beskrivningText);

        jLabelBeskrivning.setText("Beskrivning");

        jLabelStatus.setText("Status");

        jLabelStartD.setText("Startdatum");

        jLabelSlutD.setText("Slutdatum");

        jLabelKostnad.setText("Kostnad");

        jLabelPrioritet.setText("Prioritet");

        SparaButton.setText("Spara");
        SparaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SparaButtonActionPerformed(evt);
            }
        });

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pågående", "Planerat", "Avslutat" }));

        prioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hög", "Medel", "Låg" }));

        jLabel1.setText("YYYY-MM-DD");

        jLabel2.setText("YYYY-MM-DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrioritet)
                            .addComponent(jLabelKostnad)
                            .addComponent(jLabelSlutD)
                            .addComponent(jLabelStartD))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelProjekt)
                            .addComponent(jLabelBeskrivning)
                            .addComponent(jLabelStatus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projektNamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SparaButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TillbakaKnapp))
                                .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projektNamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelProjekt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatus)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStartD)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSlutD)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKostnad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrioritet)
                    .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBeskrivning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SparaButton)
                    .addComponent(TillbakaKnapp))
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TillbakaKnappActionPerformed
    
// Kontrollera om projektPanel faktiskt är ett objekt av klassen Projekt
// Om det är en Projekt-panel, "typecasta" den från JPanel till Projekt
        if (projektPanel instanceof Projekt) {
        ((Projekt) projektPanel).hamtaAllaProjekt(); // Uppdatera tabellen med nya data
    }
        
    Container parent = RedigeraProjekt.this.getParent();  // Hämta föräldrapanelen där RedigeraProjekt ligger
    parent.removeAll();                   // Ta bort nuvarande panel (RedigeraProjekt)
    parent.add(projektPanel);            // Lägg till den sparade "tillbaka"-panelen
    parent.revalidate();                  // Uppdatera GUI
    parent.repaint();                     // Måla om
    }//GEN-LAST:event_TillbakaKnappActionPerformed

    private void SparaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SparaButtonActionPerformed
        try {
        // Hämta värden från fält
        String namn = projektNamnText.getText().trim();
        //String status = statusText.getText().trim();
        String status = (String) statusComboBox.getSelectedItem();
        String startdatum = startdatumText.getText().trim();
        String slutdatum = slutdatumText.getText().trim();
        String kostnad = kostnadText.getText().trim().replace(',', '.');
        //String prioritet = prioText.getText().trim();
        String prioritet = (String) prioComboBox.getSelectedItem();
        String beskrivning = beskrivningText.getText().trim();

        // Kontrollera att inga fält är tomma
        if (namn.isEmpty() || status.isEmpty() || startdatum.isEmpty() || slutdatum.isEmpty() ||
            kostnad.isEmpty() || prioritet.isEmpty() || beskrivning.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Alla fält måste fyllas i.");
            return;
        }

        // Kontrollera datumformat (YYYY-MM-DD)
        if (!startdatum.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Startdatum måste vara i formatet YYYY-MM-DD.");
            return;
        }
        // Kontrollera datumformat (YYYY-MM-DD)
        if (!slutdatum.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Slutdatum måste vara i formatet YYYY-MM-DD.");
            return;
        }
        
        double kostnadDouble;
        try {
            kostnadDouble = Double.parseDouble(kostnad);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Kostnad måste vara ett tal.");
            return;
        }


        // Om allt är giltigt – gör uppdateringen
        String sql = "UPDATE projekt SET " +
                     "projektnamn = '" + namn + "', " +
                     "status = '" + status + "', " +
                     "startdatum = '" + startdatum + "', " +
                     "slutdatum = '" + slutdatum + "', " +
                     "kostnad = '" + kostnadDouble + "', " +
                     "prioritet = '" + prioritet + "', " +
                     "beskrivning = '" + beskrivning + "' " +
                     "WHERE pid = " + pid;

        idb.update(sql);
        JOptionPane.showMessageDialog(this, "Projektet har uppdaterats!");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Fel vid uppdatering: " + e.getMessage());
    }
    }//GEN-LAST:event_SparaButtonActionPerformed

    public void fyllProjektData(){
        
        try {
            String sql = "SELECT * FROM projekt WHERE pid = " + pid;
            
            
            
            HashMap<String, String> projektInfo = idb.fetchRow(sql);


            if (projektInfo != null) {
                projektNamnText.setText(projektInfo.get("projektnamn"));
                startdatumText.setText(projektInfo.get("startdatum"));
                slutdatumText.setText(projektInfo.get("slutdatum"));
                //statusText.setText(projektInfo.get("status"));
                statusComboBox.setSelectedItem(projektInfo.get("status"));
                kostnadText.setText(projektInfo.get("kostnad"));
                //prioText.setText(projektInfo.get("prioritet"));
                prioComboBox.setSelectedItem(projektInfo.get("prioritet"));
                beskrivningText.setText(projektInfo.get("beskrivning"));
                        
                     
                // Fyll i fler fält om du har
            } else {
                JOptionPane.showMessageDialog(this, "Inget projekt hittades för pid: " + pid);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fel vid hämtning av projektdata: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BeskrivningScrollPane;
    private javax.swing.JLabel JLabelProjekt;
    private javax.swing.JButton SparaButton;
    private javax.swing.JButton TillbakaKnapp;
    private javax.swing.JTextArea beskrivningText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBeskrivning;
    private javax.swing.JLabel jLabelKostnad;
    private javax.swing.JLabel jLabelPrioritet;
    private javax.swing.JLabel jLabelSlutD;
    private javax.swing.JLabel jLabelStartD;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JTextField kostnadText;
    private javax.swing.JComboBox<String> prioComboBox;
    private javax.swing.JTextField prioText;
    private javax.swing.JTextField projektNamnText;
    private javax.swing.JTextField slutdatumText;
    private javax.swing.JTextField startdatumText;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField statusText;
    // End of variables declaration//GEN-END:variables
}
