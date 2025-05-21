package sdgsweden.projekt;

import java.awt.Container;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfDB;

/*
 * @author jonas
 */
public class HanteraProjekt extends javax.swing.JPanel {

    private InfDB idb;
    private JPanel projektPanel;
    private boolean redigering = false;  // flagga: false = lägg till, true = redigera
    private int pid;

    // Konstruktor för att lägga till nytt projekt.
    public HanteraProjekt(InfDB idb, JPanel projektPanel) {

        this.idb = idb;
        this.projektPanel = projektPanel;
        initComponents();
        redigering = false;
        hanteraProjektButton.setText("Lägg till");
    }

    // Konstruktor för att redigera ett projekt
    public HanteraProjekt(InfDB idb, JPanel projektPanel, int pid) {

        this.idb = idb;
        this.projektPanel = projektPanel;
        initComponents();
        redigering = true;
        hanteraProjektButton.setText("Spara");
        lasInProjektData(pid);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projektnamnText = new javax.swing.JTextField();
        kostnadText = new javax.swing.JTextField();
        startdatumText = new javax.swing.JTextField();
        slutdatumText = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        prioComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BeskrivningScrollPane = new javax.swing.JScrollPane();
        beskrivningText = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        avbrytButton = new javax.swing.JButton();
        hanteraProjektButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 550));

        projektnamnText.setColumns(10);

        kostnadText.setColumns(10);

        startdatumText.setColumns(10);

        slutdatumText.setColumns(10);

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Pågående", "Planerat", "Avslutat" }));

        prioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Hög", "Medel", "Låg" }));

        jLabel1.setText("Projektnamn*");

        jLabel2.setText("Kostnad*");

        jLabel3.setText("Startdatum*");

        jLabel4.setText("Slutdatum*");

        jLabel5.setText("Status*");

        jLabel6.setText("Prioritet*");

        jLabel7.setText("Beskrivning*");

        BeskrivningScrollPane.setName(""); // NOI18N
        BeskrivningScrollPane.setPreferredSize(new java.awt.Dimension(300, 100));

        beskrivningText.setColumns(20);
        beskrivningText.setLineWrap(true);
        beskrivningText.setRows(5);
        beskrivningText.setWrapStyleWord(true);
        BeskrivningScrollPane.setViewportView(beskrivningText);

        jLabel8.setText("YYYY-MM-DD");

        jLabel9.setText("YYYY-MM-DD");

        avbrytButton.setText("Avbryt");
        avbrytButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytButtonActionPerformed(evt);
            }
        });

        hanteraProjektButton.setText("       ");
        hanteraProjektButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraProjektButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(hanteraProjektButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avbrytButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avbrytButton)
                    .addComponent(hanteraProjektButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lasInProjektData(int pid) {
        try {
            String sql = "SELECT * FROM projekt WHERE pid = " + pid;

            HashMap<String, String> projekt = idb.fetchRow(sql);  // Anpassa beroende på API för att hämta rad

            if (projekt != null) {
                projektnamnText.setText(projekt.get("projektnamn"));
                kostnadText.setText(projekt.get("kostnad"));
                startdatumText.setText(projekt.get("startdatum"));
                slutdatumText.setText(projekt.get("slutdatum"));
                statusComboBox.setSelectedItem(projekt.get("status"));
                prioComboBox.setSelectedItem(projekt.get("prioritet"));
                beskrivningText.setText(projekt.get("beskrivning"));

                // Sätt projektchef och land om du har fält för det
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fel vid inläsning av projekt: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void avbrytButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytButtonActionPerformed

// Kontrollera om projektPanel faktiskt är ett objekt av klassen ProjektChef
// Om det är en ProjektChef-panel, "typecasta" den från JPanel till ProjektChef
        if (projektPanel instanceof ProjektChef) {
            ((ProjektChef) projektPanel).hamtaAllaAktuellaProjekt(); // Uppdatera tabellen med nya data
        }

        Container parent = HanteraProjekt.this.getParent();  // Hämta föräldrapanelen där RedigeraProjekt ligger
        parent.removeAll();                   // Ta bort nuvarande panel (HanteraProjekt)
        parent.add(projektPanel);            // Lägg till den sparade "tillbaka"-panelen
        parent.revalidate();                  // Uppdatera GUI
        parent.repaint();                     // Måla om
    }//GEN-LAST:event_avbrytButtonActionPerformed

    private void hanteraProjektButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraProjektButtonActionPerformed
        try {
            // Läs in text från fälten
            String projektnamn = projektnamnText.getText().trim();
            String kostnad = kostnadText.getText().trim().replace(',', '.');
            String startDatum = startdatumText.getText().trim();
            String slutDatum = slutdatumText.getText().trim();
            String status = (String) statusComboBox.getSelectedItem();
            String prioritet = (String) prioComboBox.getSelectedItem();
            String beskrivning = beskrivningText.getText().trim();

            // Validering: Inga fält får vara tomma (utom möjligtvis beskrivning, justera vid behov)
            if (projektnamn.isEmpty() || kostnad.isEmpty() || startDatum.isEmpty() || slutDatum.isEmpty()
                    || status == null || prioritet == null || beskrivning.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Alla fält måste fyllas i.");
                return;
            }

            // Validera kostnad är ett giltigt decimalnummer
            double kostnadDouble;
            try {
                kostnadDouble = Double.parseDouble(kostnad);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Kostnad måste vara ett giltigt tal.");
                return;
            }

            // Validera datumformat YYYY-MM-DD
            // Använder java.time.LocalDate som är enklare att validera med
            try {
                LocalDate.parse(startDatum);
                LocalDate.parse(slutDatum);
            } catch (DateTimeParseException dtpe) {
                JOptionPane.showMessageDialog(this, "Datum måste vara i formatet ÅÅÅÅ-MM-DD.");
                return;
            }

            // Om alla valideringar går igenom, fortsätt med INSERT eller UPDATE
            if (redigering) {
                String sql = "UPDATE projekt SET "
                        + "projektnamn = '" + projektnamn + "', "
                        + "kostnad = " + kostnadDouble + ", "
                        + "startdatum = '" + startDatum + "', "
                        + "slutdatum = '" + slutDatum + "', "
                        + "status = '" + status + "', "
                        + "prioritet = '" + prioritet + "', "
                        + "beskrivning = '" + beskrivning + "' "
                        + "WHERE pid = " + pid;
                idb.update(sql);
                JOptionPane.showMessageDialog(this, "Projekt uppdaterat!");
            } else {
                String sqlPid = "SELECT MAX(pid) + 1 FROM projekt";
                String nextId = idb.fetchSingle(sqlPid);
                if (nextId == null) {
                    nextId = "1";
                }
                int pID = Integer.parseInt(nextId);

                String sql = "INSERT INTO projekt (pid, projektnamn, kostnad, startdatum, slutdatum, status, prioritet, beskrivning) VALUES ("
                        + pID + ", '" + projektnamn + "', " + kostnadDouble + ", '" + startDatum + "', '" + slutDatum + "', '"
                        + status + "', '" + prioritet + "', '" + beskrivning + "')";
                idb.insert(sql);
                JOptionPane.showMessageDialog(this, "Projekt tillagt!");
            }

            // Uppdatera projektpanelen
            if (projektPanel instanceof ProjektChef projekt) {
                projekt.hamtaAllaAktuellaProjekt();
            }

            // Navigera tillbaka till projektpanelen
            Container parent = this.getParent();
            parent.removeAll();
            parent.add(projektPanel);
            parent.revalidate();
            parent.repaint();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fel vid sparande: " + e.getMessage());
        }
    }//GEN-LAST:event_hanteraProjektButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BeskrivningScrollPane;
    private javax.swing.JButton avbrytButton;
    private javax.swing.JTextArea beskrivningText;
    private javax.swing.JButton hanteraProjektButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kostnadText;
    private javax.swing.JComboBox<String> prioComboBox;
    private javax.swing.JTextField projektnamnText;
    private javax.swing.JTextField slutdatumText;
    private javax.swing.JTextField startdatumText;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
