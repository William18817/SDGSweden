package sdgsweden.projekt;

import java.awt.Container;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.table.DefaultTableModel;
import sdgsweden.MainFrame;
import sdgsweden.Startsida;

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
        DateTwo = new javax.swing.JTextField();
        DateOne = new javax.swing.JTextField();
        jLabelSlutdatum = new javax.swing.JLabel();
        jLabelStartdatum = new javax.swing.JLabel();
        DatumLabel = new javax.swing.JLabel();
        StatusMenu = new javax.swing.JComboBox<>();
        StatusLabel = new javax.swing.JLabel();
        UppdateButton = new javax.swing.JButton();
        projektComboBox = new javax.swing.JComboBox<>();
        jLabelProjektAvdelning = new javax.swing.JLabel();
        jLabelProjektVy = new javax.swing.JLabel();
        avdelningLabel = new javax.swing.JLabel();
        visaPartnerInfoButton = new javax.swing.JButton();
        visaLandInfoButton = new javax.swing.JButton();
        visaprojektchefButton = new javax.swing.JToggleButton();
        jPanelCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoProjectTable = new javax.swing.JTable();
        jPanelSouth = new javax.swing.JPanel();
        btnTillbaka = new javax.swing.JButton();

        setToolTipText("");

        DateTwo.setColumns(12);

        DateOne.setColumns(12);

        jLabelSlutdatum.setText("Slutdatum");

        jLabelStartdatum.setText("Startdatum");

        DatumLabel.setText("Sök datum (YYYY-MM-DD)");

        StatusMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Planerat", "Avslutat" }));
        StatusMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusMenuActionPerformed(evt);
            }
        });

        StatusLabel.setText("Status");

        UppdateButton.setText("Filtrera");
        UppdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UppdateButtonActionPerformed(evt);
            }
        });

        projektComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mina projekt", "Avdelningens projekt" }));
        projektComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektComboBoxActionPerformed(evt);
            }
        });

        jLabelProjektAvdelning.setText("Projekt");

        jLabelProjektVy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelProjektVy.setText("Projekt ALLA");

        avdelningLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avdelningLabel.setToolTipText("");
        avdelningLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        avdelningLabel.setMaximumSize(new java.awt.Dimension(255, 25));
        avdelningLabel.setMinimumSize(new java.awt.Dimension(255, 25));
        avdelningLabel.setPreferredSize(new java.awt.Dimension(255, 25));

        visaPartnerInfoButton.setText("Visa Partnerinfo");
        visaPartnerInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaPartnerInfoButtonActionPerformed(evt);
            }
        });

        visaLandInfoButton.setText("Visa Landinfo");
        visaLandInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaLandInfoButtonActionPerformed(evt);
            }
        });

        visaprojektchefButton.setText("Visa Projekchef");

        javax.swing.GroupLayout jPanelNorthLayout = new javax.swing.GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avdelningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelProjektVy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNorthLayout.createSequentialGroup()
                                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DatumLabel)
                                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                                        .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UppdateButton)
                                .addGap(38, 38, 38))
                            .addGroup(jPanelNorthLayout.createSequentialGroup()
                                .addComponent(jLabelStartdatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSlutdatum)
                                .addGap(207, 207, 207)))))
                .addGap(90, 90, 90)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProjektAvdelning)
                            .addComponent(projektComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addComponent(visaPartnerInfoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visaLandInfoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visaprojektchefButton)))
                .addGap(54, 54, 54))
        );
        jPanelNorthLayout.setVerticalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatumLabel)
                            .addComponent(StatusLabel)
                            .addComponent(jLabelProjektAvdelning))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UppdateButton)
                            .addComponent(projektComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelProjektVy)))
                .addGap(6, 6, 6)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSlutdatum)
                    .addComponent(jLabelStartdatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(visaPartnerInfoButton)
                        .addComponent(visaLandInfoButton)
                        .addComponent(visaprojektchefButton))
                    .addComponent(avdelningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanelCenter.setLayout(new java.awt.BorderLayout());

        InfoProjectTable.setBackground(new java.awt.Color(204, 204, 204));
        InfoProjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pid", "Projektnamn", "Prioritet", "Status", "Startdatum", "Slutdatum", "Kostnad", "Beskrivning", "Partner", "Handläggare"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InfoProjectTable.setToolTipText("");
        jScrollPane1.setViewportView(InfoProjectTable);

        jPanelCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.setPreferredSize(new java.awt.Dimension(110, 25));
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSouthLayout = new javax.swing.GroupLayout(jPanelSouth);
        jPanelSouth.setLayout(jPanelSouthLayout);
        jPanelSouthLayout.setHorizontalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSouthLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelSouthLayout.setVerticalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelSouth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void hamtaAllaAktuellaProjekt() {
        try {
            String valdStatus = StatusMenu.getSelectedItem().toString();
            String datumFran = DateOne.getText().trim();
            String datumTill = DateTwo.getText().trim();
            String valdVy = projektComboBox.getSelectedItem().toString(); // "Mina projekt" eller "Avdelningens projekt"

            String fraga
                    = "SELECT DISTINCT p.pid, p.status, p.projektnamn, p.beskrivning, p.startdatum, p.slutdatum, p.kostnad, p.prioritet, "
                    + "GROUP_CONCAT(DISTINCT pa.namn SEPARATOR ', ') AS partnernamn, "
                    + "GROUP_CONCAT(DISTINCT CONCAT(a.fornamn, ' ', a.efternamn) SEPARATOR ', ') AS handlaggare "
                    + "FROM projekt p "
                    + "LEFT JOIN projekt_partner pp ON p.pid = pp.pid "
                    + "LEFT JOIN partner pa ON pp.partner_pid = pa.pid "
                    + "LEFT JOIN ans_proj ap ON p.pid = ap.pid "
                    + "LEFT JOIN anstalld a ON ap.aid = a.aid ";

            boolean harVillkor = false;

            // Koppling till aid eller avdelning
            if (valdVy.equals("Mina projekt")) {
                fraga += "WHERE projektchef = " + this.aid + " ";
                harVillkor = true;
            } else if (valdVy.equals("Avdelningens projekt")) {
                fraga += "JOIN anstalld an ON ap.aid = an.aid WHERE an.avdelning = (SELECT avdelning FROM anstalld WHERE aid = " + this.aid + ") ";
                harVillkor = true;
            }

            // Datumfilter: anpassa efter vad som är ifyllt
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
                model.addRow(new Object[]{
                    rad.get("pid"),
                    rad.get("projektnamn"),
                    rad.get("prioritet"),
                    rad.get("status"),
                    rad.get("startdatum"),
                    rad.get("slutdatum"),
                    rad.get("kostnad"),
                    rad.get("beskrivning"),
                    rad.get("partnernamn"),
                    rad.get("handlaggare")
                });
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Kunde inte hämta projekt: " + e.getMessage());
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
        // TODO add your handling code here:
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

        String datumRegex = "^\\d{4}-\\d{2}-\\d{2}$";

        // Kontrollera om datumen är i rätt format (om de är ifyllda)
        if (!datumFran.isEmpty() && !datumFran.matches(datumRegex)) {
            JOptionPane.showMessageDialog(this, "Startdatum måste vara i formatet ÅÅÅÅ-MM-DD.");
            return;
        }

        if (!datumTill.isEmpty() && !datumTill.matches(datumRegex)) {
            JOptionPane.showMessageDialog(this, "Slutdatum måste vara i formatet ÅÅÅÅ-MM-DD.");
            return;
        }

        // Om bara ett datum är ifyllt är det OK – vi hanterar det i SQL-frågan
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
    private javax.swing.JLabel jLabelProjektAvdelning;
    private javax.swing.JLabel jLabelProjektVy;
    private javax.swing.JLabel jLabelSlutdatum;
    private javax.swing.JLabel jLabelStartdatum;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelNorth;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> projektComboBox;
    private javax.swing.JButton visaLandInfoButton;
    private javax.swing.JButton visaPartnerInfoButton;
    private javax.swing.JToggleButton visaprojektchefButton;
    // End of variables declaration//GEN-END:variables
}
