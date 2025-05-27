package sdgsweden.admin;

import sdgsweden.projekt.*;
import java.awt.Container;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;
import sdgsweden.Validering;

/*
 * @author jonas
 */
public class AdminProjekt extends javax.swing.JPanel {

    private InfDB idb;
    private JPanel projektPanel;
    private int pid;

    // Konstruktor för AdminProjekt 
    public AdminProjekt(InfDB idb, JPanel projektPanel) {

        this.idb = idb;
        this.projektPanel = projektPanel;
        initComponents();
        try {
            fyllProjektchefComboBox();
            fyllLandComboBox();
            fyllProjektTabell();

        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Kunde inte läsa in data för chef, land & avdelning: " + e.getMessage());
        }
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
        projektLabel = new javax.swing.JLabel();
        kostnadLabel = new javax.swing.JLabel();
        startDatumLabel = new javax.swing.JLabel();
        slutDatumLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        prioLabel = new javax.swing.JLabel();
        BeskrivningLabel = new javax.swing.JLabel();
        BeskrivningScrollPane = new javax.swing.JScrollPane();
        beskrivningText = new javax.swing.JTextArea();
        slutDKontroll = new javax.swing.JLabel();
        startDKontroll = new javax.swing.JLabel();
        avbrytButton = new javax.swing.JButton();
        projektchefLabel = new javax.swing.JLabel();
        landLabel = new javax.swing.JLabel();
        projektchefComboBox = new javax.swing.JComboBox<>();
        landComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProjekt = new javax.swing.JTable();
        AndrauppgifterButton = new javax.swing.JButton();
        sparaButton = new javax.swing.JButton();
        laggTillNyttProjektButton = new javax.swing.JButton();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1300, 600));

        projektnamnText.setColumns(10);

        kostnadText.setColumns(10);

        startdatumText.setColumns(10);

        slutdatumText.setColumns(10);

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Pågående", "Planerat", "Avslutat" }));

        prioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Hög", "Medel", "Låg" }));

        projektLabel.setText("Projektnamn*");

        kostnadLabel.setText("Kostnad*");

        startDatumLabel.setText("Startdatum*");

        slutDatumLabel.setText("Slutdatum*");

        statusLabel.setText("Status*");

        prioLabel.setText("Prioritet*");

        BeskrivningLabel.setText("Beskrivning*");

        BeskrivningScrollPane.setName(""); // NOI18N
        BeskrivningScrollPane.setPreferredSize(new java.awt.Dimension(300, 100));

        beskrivningText.setColumns(20);
        beskrivningText.setLineWrap(true);
        beskrivningText.setRows(5);
        beskrivningText.setWrapStyleWord(true);
        BeskrivningScrollPane.setViewportView(beskrivningText);

        slutDKontroll.setText("YYYY-MM-DD");

        startDKontroll.setText("YYYY-MM-DD");

        avbrytButton.setText("Avbryt");
        avbrytButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytButtonActionPerformed(evt);
            }
        });

        projektchefLabel.setText("Projektchef");

        landLabel.setText("Land");

        jLabel1.setText("ADMIN PANEL");

        DeleteButton.setText("Ta bort Projekt");
        DeleteButton.setPreferredSize(new java.awt.Dimension(120, 25));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jTableProjekt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pid", "Projektnamn", "Beskrivning", "Startdatum", "Slutdatum", "Kostnad", "Status", "Prioritet", "Projektchef", "Land"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProjekt);

        AndrauppgifterButton.setText("Ändra uppgifter");
        AndrauppgifterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndrauppgifterButtonActionPerformed(evt);
            }
        });

        sparaButton.setText("Spara ändrade uppgifter");
        sparaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaButtonActionPerformed(evt);
            }
        });

        laggTillNyttProjektButton.setText("Lägg till nytt projekt");
        laggTillNyttProjektButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillNyttProjektButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kostnadLabel)
                            .addComponent(projektLabel)
                            .addComponent(startDatumLabel)
                            .addComponent(slutDatumLabel)
                            .addComponent(statusLabel)
                            .addComponent(prioLabel)
                            .addComponent(BeskrivningLabel)
                            .addComponent(projektchefLabel)
                            .addComponent(landLabel)))
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laggTillNyttProjektButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDKontroll)
                            .addComponent(slutDKontroll)))
                    .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektchefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(AndrauppgifterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sparaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avbrytButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sparaButton)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AndrauppgifterButton)
                    .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kostnadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kostnadLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDatumLabel)
                            .addComponent(startDKontroll))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slutDKontroll)
                            .addComponent(slutDatumLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prioLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(projektchefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projektchefLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(landLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BeskrivningScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BeskrivningLabel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avbrytButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laggTillNyttProjektButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void fyllProjektTabell() {
        try {
            // SQL fråga för att hämta data om projekt 
            String sql = "SELECT "
                    + "p.pid, "
                    + "p.projektnamn, "
                    + "p.beskrivning, "
                    + "p.startdatum, "
                    + "p.slutdatum, "
                    + "p.kostnad, "
                    + "p.status, "
                    + "p.prioritet, "
                    + "CONCAT(a.fornamn, ' ', a.efternamn) AS projektchef, "
                    + "l.namn "
                    + "FROM projekt p "
                    + "LEFT JOIN anstalld a ON p.projektchef = a.aid "
                    + "LEFT JOIN land l ON p.land = l.lid";

            ArrayList<HashMap<String, String>> projektLista = idb.fetchRows(sql);

            // Hämta den befintliga modellen från JTable
            DefaultTableModel modell = (DefaultTableModel) jTableProjekt.getModel();
            modell.setRowCount(0); // Rensa tabellen först

            // For-loop för att trycka ut den hämtade datan i JTable
            for (HashMap<String, String> projekt : projektLista) {
                modell.addRow(new Object[]{
                    projekt.get("pid"),
                    projekt.get("projektnamn"),
                    projekt.get("beskrivning"),
                    projekt.get("startdatum"),
                    projekt.get("slutdatum"),
                    projekt.get("kostnad"),
                    projekt.get("status"),
                    projekt.get("prioritet"),
                    projekt.get("projektchef"),
                    projekt.get("namn")
                });
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Kunde inte hämta projektdata: " + e.getMessage());
        }
    }

    private void lasInProjektData(int pid) {
        // Metod för att fylla alla fält/boxar med data beroende på vilket projekt som vill redigeras (valt pid)
        try {
            this.pid = pid;
            // Fyll comboboxar först
            fyllProjektchefComboBox();
            fyllLandComboBox();

            // Hämta projektets data
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
                if (projektchefId != null && !projektchefId.isEmpty()) {
                    String chefSql = "SELECT fornamn, efternamn FROM anstalld WHERE aid = " + projektchefId;
                    HashMap<String, String> chef = idb.fetchRow(chefSql);
                    if (chef != null) {
                        String fullNamn = chef.get("fornamn") + " " + chef.get("efternamn");

                        // Kontrollera att namn finns i comboboxen
                        for (int i = 0; i < projektchefComboBox.getItemCount(); i++) {
                            if (projektchefComboBox.getItemAt(i).equalsIgnoreCase(fullNamn)) {
                                projektchefComboBox.setSelectedIndex(i);
                                break;
                            }
                        }
                    }
                }

                //  Land 
                String landId = projekt.get("land");
                if (landId != null && !landId.isEmpty()) {
                    String landSql = "SELECT namn FROM land WHERE lid = " + landId;
                    HashMap<String, String> land = idb.fetchRow(landSql);
                    if (land != null) {
                        String landNamn = land.get("namn");

                        // Kontrollera att namn finns i comboboxen
                        for (int i = 0; i < landComboBox.getItemCount(); i++) {
                            if (landComboBox.getItemAt(i).equalsIgnoreCase(landNamn)) {
                                landComboBox.setSelectedIndex(i);
                                break;
                            }
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Kunde inte hitta projekt med pid: " + pid);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fel vid inläsning av projektdata: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void fyllProjektchefComboBox() throws InfException {
        // metod för att fylla data i ComboBox
        projektchefComboBox.removeAllItems();
        String sql = "SELECT aid, fornamn, efternamn FROM anstalld ORDER BY efternamn, fornamn";
        ArrayList<HashMap<String, String>> anstallda = idb.fetchRows(sql);

        for (HashMap<String, String> a : anstallda) {
            String namn = a.get("fornamn") + " " + a.get("efternamn");
            projektchefComboBox.addItem(namn);
        }

    }

    private void fyllLandComboBox() throws InfException {
        // metod för att fylla data i ComboBox

        landComboBox.removeAllItems();
        ArrayList<HashMap<String, String>> lander = idb.fetchRows("SELECT namn FROM land");
        
        for (HashMap<String, String> l : lander) {
            landComboBox.addItem(l.get("namn"));
        }
    }

    private void avbrytButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytButtonActionPerformed

// Kontrollera om projektPanel faktiskt är ett objekt av klassen ProjektChef
// Om det är en ProjektChef-panel, "typecasta" den från JPanel till ProjektChef
        if (projektPanel instanceof ProjektChef projektChef) {
            projektChef.hamtaAllaAktuellaProjekt(); // Uppdatera tabellen med nya data
        }

        Container parent = AdminProjekt.this.getParent();  // Hämta föräldrapanelen där RedigeraProjekt ligger
        parent.removeAll();                   // Ta bort nuvarande panel (HanteraProjekt)
        parent.add(projektPanel);            // Lägg till den sparade "tillbaka"-panelen
        parent.revalidate();                  // Uppdatera GUI
        parent.repaint();                     // Måla om
    }//GEN-LAST:event_avbrytButtonActionPerformed

    private void hanteraProjekt(boolean redigering, int pid) {
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
            String valdChef = (String) projektchefComboBox.getSelectedItem();

            // Validering: Alla fält ifyllda
            if (!Validering.allaFältIfyllda(projektnamn, kostnad, startDatum, slutDatum, status, prioritet, beskrivning, valtLand, valdChef)) {
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

            if (!Validering.isValidKostnad(kostnadDouble)) {
                JOptionPane.showMessageDialog(this, "Kostnaden måste vara mellan 0 och 5 000 000.");
                return;
            }

            // Validera datum
            if (!Validering.isValidAnstallningsdatum(startDatum) || !Validering.isValidAnstallningsdatum(slutDatum)) {
                JOptionPane.showMessageDialog(this, "Datum måste vara i formatet YYYY-MM-DD.");
                return;
            }

            // Hämta landets ID
            String landId = idb.fetchSingle("SELECT lid FROM land WHERE namn = '" + valtLand + "'");
            if (landId == null) {
                JOptionPane.showMessageDialog(this, "Landet hittades inte i databasen.");
                return;
            }

            // Hämta projektchefens ID
            String projektchefSql = "SELECT aid, avdelning FROM anstalld WHERE CONCAT(fornamn, ' ', efternamn) = '" + valdChef + "'";
            HashMap<String, String> chefInfo = idb.fetchRow(projektchefSql);

            if (chefInfo == null || chefInfo.get("aid") == null) {
                JOptionPane.showMessageDialog(this, "Kunde inte hitta vald projektchef.");
                return;
            }

            String projektchefAid = chefInfo.get("aid");

            if (redigering) {
                if (pid <= 0) {
                    JOptionPane.showMessageDialog(this, "Inget projekt valt att uppdatera.");
                    return;
                }
                // Uppdatera befintligt projekt
                String sql = "UPDATE projekt SET projektnamn = '" + projektnamn
                        + "', kostnad = " + kostnad
                        + ", startdatum = '" + startDatum
                        + "', slutdatum = '" + slutDatum
                        + "', status = '" + status
                        + "', prioritet = '" + prioritet
                        + "', beskrivning = '" + beskrivning
                        + "', land = " + landId
                        + ", projektchef = " + projektchefAid
                        + " WHERE pid = " + pid;

                idb.update(sql);
                JOptionPane.showMessageDialog(this, "Projektet uppdaterades!");
                fyllProjektTabell();

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

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fel vid sparande: " + e.getMessage());
        }
    }

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        try {
            String pidStr = JOptionPane.showInputDialog(this, "Ange projektets ID (pid) som ska tas bort:");

            if (pidStr == null || pidStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Du måste ange ett projekt-ID.");
                return;
            }

            int pid = Integer.parseInt(pidStr.trim());

            int val = JOptionPane.showConfirmDialog(this,
                    "Är du säker på att du vill ta bort projektet med ID " + pid + "?",
                    "Bekräfta borttagning",
                    JOptionPane.YES_NO_OPTION);

            if (val != JOptionPane.YES_OPTION) {
                return;
            }

            // Steg 1: Ta bort kopplingar från relaterade tabeller
            idb.delete("DELETE FROM ans_proj WHERE pid = " + pid);
            idb.delete("DELETE FROM projekt_partner WHERE pid = " + pid);
            idb.delete("DELETE FROM proj_hallbarhet WHERE pid = " + pid);

            // Steg 2: Ta bort projektet
            idb.delete("DELETE FROM projekt WHERE pid = " + pid);

            JOptionPane.showMessageDialog(this, "Projektet har tagits bort.");

            // Steg 3: Uppdatera tabellen
            fyllProjektTabell();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Projekt-ID måste vara ett heltal.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fel vid borttagning: " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AndrauppgifterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndrauppgifterButtonActionPerformed
        int valdRad = jTableProjekt.getSelectedRow();

        if (valdRad == -1) {
            JOptionPane.showMessageDialog(this, "Välj ett projekt i tabellen först.");
            return;
        }

// Anta att pid ligger i kolumn 0
        Object pidObj = jTableProjekt.getValueAt(valdRad, 0);
        if (pidObj != null) {
            try {
                int pid = Integer.parseInt(pidObj.toString());
                lasInProjektData(pid);  // Befintlig metod
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Felaktigt pid-värde: " + pidObj);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Kunde inte hämta pid från vald rad.");
        }
    }//GEN-LAST:event_AndrauppgifterButtonActionPerformed

    private void sparaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaButtonActionPerformed
        hanteraProjekt(true, this.pid); // pid är valt från de projekt som ändras
        fyllProjektTabell();
    }//GEN-LAST:event_sparaButtonActionPerformed

    private void laggTillNyttProjektButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillNyttProjektButtonActionPerformed
        hanteraProjekt(false, -1); // -1 för att pid inte används
        fyllProjektTabell();
    }//GEN-LAST:event_laggTillNyttProjektButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AndrauppgifterButton;
    private javax.swing.JLabel BeskrivningLabel;
    private javax.swing.JScrollPane BeskrivningScrollPane;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton avbrytButton;
    private javax.swing.JTextArea beskrivningText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProjekt;
    private javax.swing.JLabel kostnadLabel;
    private javax.swing.JTextField kostnadText;
    private javax.swing.JButton laggTillNyttProjektButton;
    private javax.swing.JComboBox<String> landComboBox;
    private javax.swing.JLabel landLabel;
    private javax.swing.JComboBox<String> prioComboBox;
    private javax.swing.JLabel prioLabel;
    private javax.swing.JLabel projektLabel;
    private javax.swing.JComboBox<String> projektchefComboBox;
    private javax.swing.JLabel projektchefLabel;
    private javax.swing.JTextField projektnamnText;
    private javax.swing.JLabel slutDKontroll;
    private javax.swing.JLabel slutDatumLabel;
    private javax.swing.JTextField slutdatumText;
    private javax.swing.JButton sparaButton;
    private javax.swing.JLabel startDKontroll;
    private javax.swing.JLabel startDatumLabel;
    private javax.swing.JTextField startdatumText;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
