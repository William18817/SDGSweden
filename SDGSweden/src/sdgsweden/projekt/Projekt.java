package sdgsweden.projekt;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.table.DefaultTableModel;
import sdgsweden.MainFrame;
import sdgsweden.Startsida;
import sdgsweden.Validering;

/*
 * @author jonas
 */
public class Projekt extends javax.swing.JPanel {

    private InfDB idb;
    private MainFrame parent;
    private String aid;

    public Projekt(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;

        initComponents();
        hamtaAvdelningOchVisa();
        hamtaAllaAktuellaProjekt();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNorth = new javax.swing.JPanel();
        StatusMenu = new javax.swing.JComboBox<>();
        StatusLabel = new javax.swing.JLabel();
        projektComboBox = new javax.swing.JComboBox<>();
        jLabelProjektAvdelning = new javax.swing.JLabel();
        avdelningLabel = new javax.swing.JLabel();
        jPanelCenter = new javax.swing.JPanel();
        jScrollPaneProjekt = new javax.swing.JScrollPane();
        InfoProjectTable = new javax.swing.JTable();
        jPanelSouth = new javax.swing.JPanel();
        DatumLabel = new javax.swing.JLabel();
        DateOne = new javax.swing.JTextField();
        jLabelStartdatum = new javax.swing.JLabel();
        DateTwo = new javax.swing.JTextField();
        jLabelSlutdatum = new javax.swing.JLabel();
        UppdateButton = new javax.swing.JButton();
        visaProjektchefButton = new javax.swing.JButton();
        visaLandInfoButton = new javax.swing.JButton();
        visaPartnerInfoButton = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        designLabel = new javax.swing.JLabel();

        setToolTipText("");

        StatusMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Planerat", "Avslutat" }));
        StatusMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusMenuActionPerformed(evt);
            }
        });

        StatusLabel.setText("Status");

        projektComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Projekt jag handlägger", "Avdelningens projekt" }));
        projektComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektComboBoxActionPerformed(evt);
            }
        });

        jLabelProjektAvdelning.setText("Projekt");

        avdelningLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        avdelningLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avdelningLabel.setToolTipText("");
        avdelningLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        avdelningLabel.setMaximumSize(new java.awt.Dimension(255, 25));
        avdelningLabel.setMinimumSize(new java.awt.Dimension(255, 25));
        avdelningLabel.setPreferredSize(new java.awt.Dimension(255, 25));

        javax.swing.GroupLayout jPanelNorthLayout = new javax.swing.GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(avdelningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProjektAvdelning)
                    .addComponent(projektComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelNorthLayout.setVerticalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNorthLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusLabel)
                            .addComponent(jLabelProjektAvdelning))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projektComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addComponent(avdelningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGap(10, 10, 10))
        );

        jPanelCenter.setLayout(new java.awt.BorderLayout());

        InfoProjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pid", "Projektnamn", "Prioritet", "Status", "Startdatum", "Slutdatum", "Kostnad", "Beskrivning", "Partner", "Handläggare", "Land"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InfoProjectTable.setToolTipText("");
        jScrollPaneProjekt.setViewportView(InfoProjectTable);

        jPanelCenter.add(jScrollPaneProjekt, java.awt.BorderLayout.CENTER);

        DatumLabel.setText("Sök datum (YYYY-MM-DD)");

        DateOne.setColumns(12);

        jLabelStartdatum.setText("Startdatum");

        DateTwo.setColumns(12);

        jLabelSlutdatum.setText("Slutdatum");

        UppdateButton.setText("Filtrera");
        UppdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UppdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSouthLayout = new javax.swing.GroupLayout(jPanelSouth);
        jPanelSouth.setLayout(jPanelSouthLayout);
        jPanelSouthLayout.setHorizontalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSouthLayout.createSequentialGroup()
                        .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DatumLabel)
                            .addGroup(jPanelSouthLayout.createSequentialGroup()
                                .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UppdateButton))
                    .addGroup(jPanelSouthLayout.createSequentialGroup()
                        .addComponent(jLabelStartdatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSlutdatum)
                        .addGap(169, 169, 169)))
                .addGap(541, 541, 541))
        );
        jPanelSouthLayout.setVerticalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DatumLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UppdateButton))
                .addGap(6, 6, 6)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSlutdatum)
                    .addComponent(jLabelStartdatum))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        visaProjektchefButton.setText("Visa Projektchef");
        visaProjektchefButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaProjektchefButtonActionPerformed(evt);
            }
        });

        visaLandInfoButton.setText("Visa Landinfo");
        visaLandInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaLandInfoButtonActionPerformed(evt);
            }
        });

        visaPartnerInfoButton.setText("Visa Partnerinfo");
        visaPartnerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaPartnerInfoButtonActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.setPreferredSize(new java.awt.Dimension(110, 25));
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        designLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo.png"))); // NOI18N
        designLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(visaProjektchefButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visaLandInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visaPartnerInfoButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelSouth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(designLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(visaProjektchefButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(visaLandInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(visaPartnerInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(designLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void hamtaAllaAktuellaProjekt() {
        try {
            String valdStatus = StatusMenu.getSelectedItem().toString();
            String datumFran = DateOne.getText().trim();
            String datumTill = DateTwo.getText().trim();
            String valdVy = projektComboBox.getSelectedItem().toString(); // "Mina projekt" eller "Avdelningens projekt"

            String fraga = "SELECT p.pid, p.status, p.projektnamn, p.beskrivning, p.startdatum, p.slutdatum, "
                    + "p.kostnad, p.prioritet, "
                    + "GROUP_CONCAT(DISTINCT pa.namn SEPARATOR ', ') AS partnernamn, "
                    + "l.namn "
                    + "FROM projekt p "
                    + "LEFT JOIN land l ON p.land = l.lid "
                    + "LEFT JOIN projekt_partner pp ON p.pid = pp.pid "
                    + "LEFT JOIN partner pa ON pp.partner_pid = pa.pid ";

            boolean harVillkor = false;

            if (valdVy.equals("Projekt jag handlägger")) {
                // Visa projekt där användaren är handläggare 
                fraga += "JOIN ans_proj ap ON p.pid = ap.pid "
                        + "JOIN handlaggare h ON ap.aid = h.aid "
                        + "WHERE h.aid = " + this.aid + " ";
                harVillkor = true;
            } else if (valdVy.equals("Avdelningens projekt")) {
                fraga += "JOIN ans_proj ap ON p.pid = ap.pid "
                        + "JOIN anstalld an ON ap.aid = an.aid "
                        + "LEFT JOIN anstalld a ON ap.aid = a.aid "
                        + "WHERE an.avdelning = (SELECT avdelning FROM anstalld WHERE aid = " + this.aid + ") ";
                harVillkor = true;
            }

            // Datumfilter
            if (!datumFran.isEmpty() && !datumTill.isEmpty()) {
                fraga += (harVillkor ? "AND " : "WHERE ");
                fraga += "p.startdatum >= '" + datumFran + "' AND p.slutdatum <= '" + datumTill + "' ";
                harVillkor = true;
            } else if (!datumFran.isEmpty()) {
                fraga += (harVillkor ? "AND " : "WHERE ");
                fraga += "p.startdatum >= '" + datumFran + "' ";
                harVillkor = true;
            } else if (!datumTill.isEmpty()) {
                fraga += (harVillkor ? "AND " : "WHERE ");
                fraga += "p.slutdatum <= '" + datumTill + "' ";
                harVillkor = true;
            }

            // Statusfilter
            if (!valdStatus.equals("Alla")) {
                fraga += (harVillkor ? "AND " : "WHERE ");
                fraga += "p.status = '" + valdStatus + "' ";
            }

            fraga += "GROUP BY p.pid";

            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(fraga);

            DefaultTableModel model = (DefaultTableModel) InfoProjectTable.getModel();
            model.setRowCount(0);

            for (HashMap<String, String> rad : resultat) {
                String pid = rad.get("pid");

                // Hämta bara riktiga handläggare separat
                String handlaggare = hamtaHandlaggareForProjekt(pid);

                model.addRow(new Object[]{
                    pid,
                    rad.get("projektnamn"),
                    rad.get("prioritet"),
                    rad.get("status"),
                    rad.get("startdatum"),
                    rad.get("slutdatum"),
                    rad.get("kostnad"),
                    rad.get("beskrivning"),
                    rad.get("partnernamn"),
                    handlaggare, // Endast handläggare!
                    rad.get("namn") // landets namn
                });
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Kunde inte hämta projekt: " + e.getMessage());
        }
    }

    private String hamtaHandlaggareForProjekt(String pid) {
        try {
            String fraga = "SELECT CONCAT(a.fornamn, ' ', a.efternamn) AS namn "
                    + "FROM ans_proj ap "
                    + "JOIN anstalld a ON ap.aid = a.aid "
                    + "WHERE ap.pid = " + pid + " "
                    + "AND ap.aid IN (SELECT aid FROM handlaggare)";

            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(fraga);

            ArrayList<String> namnLista = new ArrayList<>();
            for (HashMap<String, String> rad : resultat) {
                namnLista.add(rad.get("namn"));
            }

            return String.join(", ", namnLista);
        } catch (InfException e) {
            System.out.println("Fel vid hämtning av handläggare: " + e.getMessage());
            return "";
        }
    }

    private void hamtaAvdelningOchVisa() {
        // Metod för att hämta avdelningen för den inloggade och visa den i en Jlabel.
        // Körs i konstruktorn så det visas varje gång JPanel visas.
        try {

            String sql = "SELECT av.namn AS avdelning "
                    + "FROM anstalld a "
                    + "JOIN avdelning av ON a.avdelning = av.avdid "
                    + "WHERE a.aid = " + aid;

            HashMap<String, String> resultat = idb.fetchRow(sql);

            if (resultat != null && resultat.get("namn") != null) {
                String avdelningsnamn = resultat.get("namn");
                avdelningLabel.setText(avdelningsnamn);
            } else {
                avdelningLabel.setText("Avdelning okänd");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Kunde inte hämta avdelning: " + e.getMessage());
        }
    }

    public boolean arProjektchef(String aid) {
        try {
            String sql = "SELECT pid FROM projekt WHERE projektchef = " + aid;
            String resultat = idb.fetchSingle(sql);
            return resultat != null; // true = personen är projektchef
        } catch (InfException e) {
            System.out.println("Fel i arProjektchef(): " + e.getMessage());
            return false;
        }
    }


    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed

        Startsida startsida = new Startsida(parent, idb, aid);
        parent.visaPanel(startsida, "startsida");
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void projektComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projektComboBoxActionPerformed
        try {
            hamtaAllaAktuellaProjekt();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Kunde inte filtrera baserat på projektvy: " + e.getMessage());
        }
    }//GEN-LAST:event_projektComboBoxActionPerformed

    private void UppdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UppdateButtonActionPerformed

        String datumFran = DateOne.getText().trim();
        String datumTill = DateTwo.getText().trim();

        // Kontrollera om datumen är i rätt format (om de är ifyllda)
        if (!datumFran.isEmpty() && !Validering.isValidAnstallningsdatum(datumFran)) {
            JOptionPane.showMessageDialog(this, "Startdatum måste vara i formatet ÅÅÅÅ-MM-DD.");
            return;
        }

        if (!datumTill.isEmpty() && !Validering.isValidAnstallningsdatum(datumTill)) {
            JOptionPane.showMessageDialog(this, "Slutdatum måste vara i formatet ÅÅÅÅ-MM-DD.");
            return;
        }

        // Om bara ett datum är ifyllt är det OK – hanteras i SQL-frågan
        // Om båda är tomma – hämta alla projekt (inga datumfilter)
        // Kör hämtningen
        hamtaAllaAktuellaProjekt();
    }//GEN-LAST:event_UppdateButtonActionPerformed

    private void StatusMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusMenuActionPerformed

        try {
            hamtaAllaAktuellaProjekt();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fel vid hämtning: " + e.getMessage());
        }
    }//GEN-LAST:event_StatusMenuActionPerformed

    private void visaPartnerInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaPartnerInfoButtonActionPerformed
        // Metod för att visa info om partners
        try {
            int radIndex = InfoProjectTable.getSelectedRow();
            if (radIndex == -1) {
                JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
                return;
            }

            String pid = InfoProjectTable.getValueAt(radIndex, 0).toString();

            // Kontrollera behörighet till valt projekt på JTable
            String kontrollFraga
                    = "SELECT pid FROM projekt "
                    + "WHERE pid = " + pid + " AND (projektchef = " + aid
                    + " OR pid IN (SELECT pid FROM ans_proj WHERE aid = " + aid + "))";

            String resultat = idb.fetchSingle(kontrollFraga);
            if (resultat == null) {
                JOptionPane.showMessageDialog(this, "Du har inte behörighet att se partner för det valda projektet.");
                return;
            }

            // Hämta partnerinfo utan JOIN mot stad, blev bara en STOR konflikt med namnet om allt hämtades samtidigt.
            String sqlPartner
                    = "SELECT DISTINCT p.pid, p.namn, p.kontaktperson, p.kontaktepost, "
                    + "p.telefon, p.adress, p.branch, p.stad "
                    + "FROM partner p "
                    + "JOIN projekt_partner pp ON p.pid = pp.partner_pid "
                    + "WHERE pp.pid = " + pid;

            ArrayList<HashMap<String, String>> partnerLista = idb.fetchRows(sqlPartner);

            if (partnerLista == null || partnerLista.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Inga partners kopplade till projektet.");
                return;
            }

            StringBuilder info = new StringBuilder();

            for (HashMap<String, String> partner : partnerLista) {
                // Hämtar namnet på staden här, blir ingen konflikt med "namn" då. 
                String stadId = partner.get("stad");
                String stadNamn = idb.fetchSingle("SELECT namn FROM stad WHERE sid = " + stadId);

                info.append("Partnernamn: ").append(partner.get("namn")).append("\n");
                info.append("Kontaktperson: ").append(partner.get("kontaktperson")).append("\n");
                info.append("E-post: ").append(partner.get("kontaktepost")).append("\n");
                info.append("Telefon: ").append(partner.get("telefon")).append("\n");
                info.append("Adress: ").append(partner.get("adress")).append("\n");
                info.append("Bransch: ").append(partner.get("branch")).append("\n");
                info.append("Stad: ").append(stadNamn).append("\n");
                info.append("\n-----------------------------\n\n");
            }

            JOptionPane.showMessageDialog(this, info.toString(), "Partnerinformation", JOptionPane.INFORMATION_MESSAGE);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Fel vid hämtning av partnerinformation: " + e.getMessage());
        }
    }//GEN-LAST:event_visaPartnerInfoButtonActionPerformed

    private void visaLandInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaLandInfoButtonActionPerformed
        // Metod för att visa info om ett Land
        try {
            int radIndex = InfoProjectTable.getSelectedRow();
            if (radIndex == -1) {
                JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
                return;
            }

            // Hämta projektets ID från den valda raden
            String pid = InfoProjectTable.getValueAt(radIndex, 0).toString();

            // SQL-fråga för att hämta landinformation kopplad till projektet
            String sql = "SELECT l.namn, l.valuta, l.sprak, l.tidszon, "
                    + "l.politisk_struktur, l.ekonomi "
                    + "FROM land l "
                    + "JOIN projekt p ON p.land = l.lid "
                    + "WHERE p.pid = " + pid;

            // Hämta landinfo
            HashMap<String, String> landInfo = idb.fetchRow(sql);

            // Kontrollera om någon data hittades
            if (landInfo == null || landInfo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingen landinformation hittades.");
                return;
            }

            // Bygg upp en sträng med landinformation
            StringBuilder info = new StringBuilder();
            info.append("Land: ").append(landInfo.get("namn")).append("\n");
            info.append("Språk: ").append(landInfo.get("sprak")).append("\n");
            info.append("Valuta: ").append(landInfo.get("valuta")).append("\n");
            info.append("Tidszon: ").append(landInfo.get("tidszon")).append("\n");
            info.append("Politisk struktur: ").append(landInfo.get("politisk_struktur")).append("\n");
            info.append("Ekonomi: ").append(landInfo.get("ekonomi")).append("\n");

            // Visa informationen i en popup
            JOptionPane.showMessageDialog(this, info.toString(), "Landinformation", JOptionPane.INFORMATION_MESSAGE);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Fel vid hämtning av landinformation: " + e.getMessage());
        }
    }//GEN-LAST:event_visaLandInfoButtonActionPerformed

    private void visaProjektchefButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaProjektchefButtonActionPerformed
        // Metod för att visa info om en projektchef till det projekt man väljer i JTable
        try {
            int rad = InfoProjectTable.getSelectedRow();
            if (rad == -1) {
                JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
                return;
            }

            // Hämta pid från första kolumnen
            String pid = InfoProjectTable.getValueAt(rad, 0).toString();

            // SQL för att hämta projektchefens uppgifter inklusive avdelningsnamn
            String sql = """
            SELECT a.fornamn, a.efternamn, a.telefon, a.epost, av.namn
            FROM projekt p
            JOIN anstalld a ON p.projektchef = a.aid
            JOIN avdelning av ON a.avdelning = av.avdid
            WHERE p.pid = """ + pid;

            HashMap<String, String> chefInfo = idb.fetchRow(sql);

            if (chefInfo != null) {
                String info = "Namn: " + chefInfo.get("fornamn") + " " + chefInfo.get("efternamn") + "\n"
                        + "Telefon: " + chefInfo.get("telefon") + "\n"
                        + "E-post: " + chefInfo.get("epost") + "\n"
                        + "Avdelning: " + chefInfo.get("namn");

                JOptionPane.showMessageDialog(this, info, "Projektchef", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Projektchef kunde inte hittas.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fel vid hämtning av projektchef: " + e.getMessage());
        }
    }//GEN-LAST:event_visaProjektchefButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateOne;
    private javax.swing.JTextField DateTwo;
    private javax.swing.JLabel DatumLabel;
    private javax.swing.JTable InfoProjectTable;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JComboBox<String> StatusMenu;
    private javax.swing.JButton UppdateButton;
    private javax.swing.JLabel avdelningLabel;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel designLabel;
    private javax.swing.JLabel jLabelProjektAvdelning;
    private javax.swing.JLabel jLabelSlutdatum;
    private javax.swing.JLabel jLabelStartdatum;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelNorth;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JScrollPane jScrollPaneProjekt;
    private javax.swing.JComboBox<String> projektComboBox;
    private javax.swing.JButton visaLandInfoButton;
    private javax.swing.JButton visaPartnerInfoButton;
    private javax.swing.JButton visaProjektchefButton;
    // End of variables declaration//GEN-END:variables
}
