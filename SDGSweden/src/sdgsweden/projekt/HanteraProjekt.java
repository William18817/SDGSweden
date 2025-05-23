package sdgsweden.projekt;

import java.awt.Container;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfDB;
import oru.inf.InfException;

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
        try {
            fyllProjektchefComboBox();
            fyllLandComboBox();
        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Kunde inte läsa in data för chef, land & stad: " + e.getMessage());
        }

    }

    // Konstruktor för att redigera ett projekt
    public HanteraProjekt(InfDB idb, JPanel projektPanel, int pid) {

        this.idb = idb;
        this.projektPanel = projektPanel;
        this.pid = pid;
        initComponents();
        redigering = true;
        hanteraProjektButton.setText("Spara");
        lasInProjektData(pid);
        projektchefComboBox.setEnabled(false); // ändrar så att fältet för chef inte går att komma åt/redigera

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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        projektchefComboBox = new javax.swing.JComboBox<>();
        landComboBox = new javax.swing.JComboBox<>();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));

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

        jLabel10.setText("Projektchef");

        jLabel11.setText("Land");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(116, 116, 116)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)))
                                    .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(projektchefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(hanteraProjektButton)
                        .addGap(156, 156, 156)
                        .addComponent(avbrytButton)
                        .addContainerGap(394, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(projektchefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hanteraProjektButton)
                    .addComponent(avbrytButton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lasInProjektData(int pid) {
        try {
            // Förbered comboBoxar
            fyllProjektchefComboBox();
            fyllLandComboBox();

            // Hämta projektdata
            String projektSql = "SELECT * FROM projekt WHERE pid = " + pid;
            HashMap<String, String> projekt = idb.fetchRow(projektSql);

            if (projekt != null) {
                projektnamnText.setText(projekt.get("projektnamn"));
                kostnadText.setText(projekt.get("kostnad"));
                startdatumText.setText(projekt.get("startdatum"));
                slutdatumText.setText(projekt.get("slutdatum"));
                statusComboBox.setSelectedItem(projekt.get("status"));
                prioComboBox.setSelectedItem(projekt.get("prioritet"));
                beskrivningText.setText(projekt.get("beskrivning"));

                // Projektchef
                String projektchefId = projekt.get("projektchef");
                if (projektchefId != null) {
                    String chefSql = "SELECT fornamn, efternamn FROM anstalld WHERE aid = " + projektchefId;
                    HashMap<String, String> chef = idb.fetchRow(chefSql);
                    if (chef != null) {
                        String helaNamnet = chef.get("fornamn") + " " + chef.get("efternamn");
                        projektchefComboBox.setSelectedItem(helaNamnet);
                    }
                }

                // Land och stad
                String landId = projekt.get("land");
                if (landId != null) {
                    String landSql = "SELECT namn FROM land WHERE lid = " + landId;
                    HashMap<String, String> land = idb.fetchRow(landSql);
                    if (land != null) {
                        landComboBox.setSelectedItem(land.get("namn"));
                    }

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fel vid inläsning av projektdata: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void fyllProjektchefComboBox() throws InfException {

        projektchefComboBox.removeAllItems();
        ArrayList<HashMap<String, String>> anstallda = idb.fetchRows("SELECT aid, fornamn, efternamn FROM anstalld");

        for (HashMap<String, String> a : anstallda) {
            String namn = a.get("fornamn") + " " + a.get("efternamn");
            projektchefComboBox.addItem(namn);
        }
    }

    private void fyllLandComboBox() throws InfException {

        landComboBox.removeAllItems();
        ArrayList<HashMap<String, String>> lander = idb.fetchRows("SELECT namn FROM land");
        for (HashMap<String, String> l : lander) {
            landComboBox.addItem(l.get("namn"));
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
            String valtLand = (String) landComboBox.getSelectedItem();
            String valdChef = (String) projektchefComboBox.getSelectedItem(); // Förnamn + Efternamn

            // Validering
            if (projektnamn.isEmpty() || kostnad.isEmpty() || startDatum.isEmpty() || slutDatum.isEmpty()
                    || status == null || prioritet == null || beskrivning.isEmpty() || valtLand == null || valdChef == null) {
                JOptionPane.showMessageDialog(this, "Alla fält måste fyllas i.");
                return;
            }

            // Validera kostnad
            double kostnadDouble;
            try {
                kostnadDouble = Double.parseDouble(kostnad);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Kostnad måste vara ett giltigt tal.");
                return;
            }

            // Validera datum
            try {
                LocalDate.parse(startDatum);
                LocalDate.parse(slutDatum);
            } catch (DateTimeParseException dtpe) {
                JOptionPane.showMessageDialog(this, "Datum måste vara i formatet ÅÅÅÅ-MM-DD.");
                return;
            }

            // Hämta landets ID från namn
            String landId = idb.fetchSingle("SELECT lid FROM land WHERE namn = '" + valtLand + "'");
            if (landId == null) {
                JOptionPane.showMessageDialog(this, "Landet hittades inte i databasen.");
                return;
            }

            // Hämta projektchefens aid
            String[] namnSplit = valdChef.split(" ");
            if (namnSplit.length < 2) {
                JOptionPane.showMessageDialog(this, "Ogiltigt namnformat på projektchef.");
                return;
            }
            String fornamn = namnSplit[0];
            String efternamn = namnSplit[1];

            String projektchefAid = idb.fetchSingle(
                    "SELECT aid FROM anstalld WHERE fornamn = '" + fornamn + "' AND efternamn = '" + efternamn + "'"
            );

            if (projektchefAid == null) {
                JOptionPane.showMessageDialog(this, "Projektchefen kunde inte hittas i databasen.");
                return;
            }

            if (redigering) {
                // Uppdatera befintligt projekt
                String sql = "UPDATE projekt SET "
                        + "projektnamn = '" + projektnamn + "', "
                        + "kostnad = " + kostnadDouble + ", "
                        + "startdatum = '" + startDatum + "', "
                        + "slutdatum = '" + slutDatum + "', "
                        + "status = '" + status + "', "
                        + "prioritet = '" + prioritet + "', "
                        + "beskrivning = '" + beskrivning + "', "
                        + "land = " + landId + ", "
                        + "projektchef = " + projektchefAid + " "
                        + "WHERE pid = " + pid;

                idb.update(sql);
                JOptionPane.showMessageDialog(this, "Projektet uppdaterades!");

            } else {
                // Skapa nytt projekt
                String sqlPid = "SELECT MAX(pid) + 1 FROM projekt";
                String nextId = idb.fetchSingle(sqlPid);
                if (nextId == null) {
                    nextId = "1";
                }
                int pID = Integer.parseInt(nextId);

                String sql = "INSERT INTO projekt (pid, projektnamn, kostnad, startdatum, slutdatum, status, prioritet, beskrivning, land, projektchef) VALUES ("
                        + pID + ", '" + projektnamn + "', " + kostnadDouble + ", '" + startDatum + "', '" + slutDatum + "', '"
                        + status + "', '" + prioritet + "', '" + beskrivning + "', " + landId + ", " + projektchefAid + ")";

                idb.insert(sql);
                JOptionPane.showMessageDialog(this, "Projekt tillagt!");
            }

            // Uppdatera vy
            if (projektPanel instanceof ProjektChef projektchef) {
                projektchef.hamtaAllaAktuellaProjekt();
            }

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kostnadText;
    private javax.swing.JComboBox<String> landComboBox;
    private javax.swing.JComboBox<String> prioComboBox;
    private javax.swing.JComboBox<String> projektchefComboBox;
    private javax.swing.JTextField projektnamnText;
    private javax.swing.JTextField slutdatumText;
    private javax.swing.JTextField startdatumText;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
