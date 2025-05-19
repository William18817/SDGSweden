
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

//private String handlaggarId;


    
    public Projekt(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;
        
        //this.handlaggarId = handlaggarId;
        
        
        initComponents();
        hamtaAllaProjekt(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        StatusMenu = new javax.swing.JComboBox<>();
        DateOne = new javax.swing.JTextField();
        DateTwo = new javax.swing.JTextField();
        DatumLabel = new javax.swing.JLabel();
        UppdateButton = new javax.swing.JButton();
        StatusLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoProjectTable = new javax.swing.JTable();
        AndraUppgifter = new javax.swing.JButton();
        addProjektButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        StatistikKostnad = new javax.swing.JButton();
        pidTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        addPartnerButton = new javax.swing.JButton();
        taBortPartnerButton = new javax.swing.JButton();
        addHandlaggareButton = new javax.swing.JButton();
        taBortHandlaggareButton = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setToolTipText("");

        StatusMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Planerat", "Avslutat" }));
        StatusMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusMenuActionPerformed(evt);
            }
        });

        DateOne.setColumns(12);

        DateTwo.setColumns(12);

        DatumLabel.setText("Sök datum");

        UppdateButton.setText("Filtrera");
        UppdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UppdateButtonActionPerformed(evt);
            }
        });

        StatusLabel.setText("Status");

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

        AndraUppgifter.setText("Ändra Uppgifter");
        AndraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraUppgifterActionPerformed(evt);
            }
        });

        addProjektButton.setText("Lägg till Projekt");
        addProjektButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjektButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Ta bort Projekt");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        StatistikKostnad.setText("Total kostnad");
        StatistikKostnad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistikKostnadActionPerformed(evt);
            }
        });

        pidTextField.setColumns(2);

        jLabel1.setText("Pid");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        addPartnerButton.setText("Lägg till Partner");
        addPartnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartnerButtonActionPerformed(evt);
            }
        });

        taBortPartnerButton.setText("Ta bort Partner");
        taBortPartnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortPartnerButtonActionPerformed(evt);
            }
        });

        addHandlaggareButton.setText("Lägg till Handläggare");
        addHandlaggareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHandlaggareButtonActionPerformed(evt);
            }
        });

        taBortHandlaggareButton.setText("Ta bort Handläggare");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StatusLabel)
                        .addGap(80, 80, 80)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UppdateButton)
                        .addGap(60, 60, 60)
                        .addComponent(btnTillbaka))
                    .addComponent(DatumLabel))
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addProjektButton)
                                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taBortPartnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AndraUppgifter, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addPartnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addHandlaggareButton)
                                .addGap(199, 199, 199)
                                .addComponent(StatistikKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(taBortHandlaggareButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatumLabel)
                    .addComponent(StatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UppdateButton)
                    .addComponent(btnTillbaka))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatistikKostnad)
                    .addComponent(AndraUppgifter)
                    .addComponent(pidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(addPartnerButton)
                    .addComponent(addHandlaggareButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProjektButton)
                    .addComponent(taBortPartnerButton)
                    .addComponent(taBortHandlaggareButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void hamtaAllaProjekt() {
         try {
        String fraga = 
    "SELECT p.pid, p.status, p.projektnamn, p.beskrivning, p.startdatum, p.slutdatum, p.kostnad, p.prioritet, " +
    "GROUP_CONCAT(DISTINCT pa.namn SEPARATOR ', ') AS partnernamn, " +
    "GROUP_CONCAT(DISTINCT CONCAT(a.fornamn, ' ', a.efternamn) SEPARATOR ', ') AS handlaggare " +
    "FROM projekt p " +
    "LEFT JOIN projekt_partner pp ON p.pid = pp.pid " +
    "LEFT JOIN partner pa ON pp.partner_pid = pa.pid " +
    "LEFT JOIN ans_proj ap ON p.pid = ap.pid " +
    "LEFT JOIN anstalld a ON ap.aid = a.aid " +
    "GROUP BY p.pid";

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
                rad.get("handlaggare"),
            });
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Kunde inte hämta projekt: " + e.getMessage());
    }
}
    
    

    private void StatusMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusMenuActionPerformed
        String valdStatus = StatusMenu.getSelectedItem().toString();
   
        try{
            String sql;
            
            if (valdStatus.equals("Alla")){
            sql = "SELECT pid, status, projektnamn, beskrivning, startdatum, slutdatum, kostnad, prioritet "
                    + "FROM projekt ";
                    }
            else{
                sql = "SELECT pid, status, projektnamn, beskrivning, startdatum, slutdatum, kostnad, prioritet "
                    + "FROM projekt "
                    + "WHERE status = '" + valdStatus + "'";}
            
                    ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);
                    
                    DefaultTableModel model = (DefaultTableModel) InfoProjectTable.getModel();
                    
                    model.setRowCount(0);
                    
                    for(HashMap<String, String> rad : resultat){
                       model.addRow(new Object[]{
                       rad.get("pid"),
                       rad.get("status"),
                       rad.get("projektnamn"),
                       rad.get("beskrivning"),
                       rad.get("startdatum"),
                       rad.get("slutdatum"),
                       rad.get("kostnad"),
                       rad.get("prioritet"),
                       }); 
                    }
                    
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "Fel vid hämtning: " + e.getMessage());
        }
    }//GEN-LAST:event_StatusMenuActionPerformed

    private void UppdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UppdateButtonActionPerformed
    
    String datumFran = DateOne.getText().trim();
    String datumTill = DateTwo.getText().trim();
    String valdStatus = StatusMenu.getSelectedItem().toString();

    if (datumFran.isEmpty() || datumTill.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fyll i båda datumfälten.");
        return;
    }

    try {
        String sql = "SELECT pid, status, projektnamn, beskrivning, startdatum, slutdatum, kostnad, prioritet "
                   + "FROM projekt "
                   + "WHERE startdatum >= '" + datumFran + "' AND startdatum <= '" + datumTill + "'";

        // Lägg till statusfilter om det inte är "Alla"
        if (!valdStatus.equals("Alla")) {
            sql += " AND status = '" + valdStatus + "'";
        }

        ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);
        DefaultTableModel model = (DefaultTableModel) InfoProjectTable.getModel();
        model.setRowCount(0);

        for (HashMap<String, String> rad : resultat) {
            model.addRow(new Object[]{
                rad.get("pid"),
                rad.get("status"),
                rad.get("projektnamn"),
                rad.get("beskrivning"),
                rad.get("startdatum"),
                rad.get("slutdatum"),
                rad.get("kostnad"),
                rad.get("prioritet"),
            });
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Kunde inte filtrera projekt: " + e.getMessage());
    }
    }//GEN-LAST:event_UppdateButtonActionPerformed

    private void AndraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraUppgifterActionPerformed
    try {
    
        int pid = Integer.parseInt(pidTextField.getText().trim());
        
        RedigeraProjekt redigeraPanel = new RedigeraProjekt(idb, pid, this);
        Container parentProjekt = this.getParent();
        
        parentProjekt.removeAll(); // Ta bort nuvarande innehåll i panelen
        parentProjekt.add(redigeraPanel);
        parentProjekt.revalidate();
        parentProjekt.repaint();
    }
    catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ange ett giltigt heltal för Pid.", "Fel", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_AndraUppgifterActionPerformed

    private void addProjektButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjektButtonActionPerformed
        
        LaggTillProjekt laggTillPanel = new LaggTillProjekt(idb, this);
        Container parentProjekt = this.getParent();
        
        parentProjekt.removeAll(); // Ta bort nuvarande innehåll i panelen
        parentProjekt.add(laggTillPanel);
        parentProjekt.revalidate();
        parentProjekt.repaint();
    }//GEN-LAST:event_addProjektButtonActionPerformed

    private void StatistikKostnadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatistikKostnadActionPerformed
        try {
        // Hämta alla projektens kostnader med SQL-fråga
        String sql = "SELECT kostnad FROM projekt";
        // Hämtar resultatet som en lista av HashMaps (en rad = ett projekt)
        ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);
        
        // Variabler för att lagra totalkostnad, max/min och antal projekt
        double totalKostnad = 0;
        double maxKostnad = Double.MIN_VALUE;
        double minKostnad = Double.MAX_VALUE;

        int antalProjekt = 0;
        // Loopar igenom varje projekt och bearbetar kostnaden
        for (HashMap<String, String> rad : resultat) {
            double kostnad = Double.parseDouble(rad.get("kostnad"));

            totalKostnad += kostnad;
            maxKostnad = Math.max(maxKostnad, kostnad);
            minKostnad = Math.min(minKostnad, kostnad);

            antalProjekt++;
        }

        double medelKostnad = totalKostnad / antalProjekt;

        // Visa resultatet i en JOptionPane
        JOptionPane.showMessageDialog(this,
            "Kostnadsstatistik för alla projekt:\n" +
            "Totalkostnad: " + totalKostnad + " kr\n" +
            "Medelkostnad: " + String.format("%.2f", medelKostnad) + " kr\n" +
            "Högsta kostnad: " + maxKostnad + " kr\n" +
            "Lägsta kostnad: " + minKostnad + " kr",
            "Projektkostnad - Statistik",
            JOptionPane.INFORMATION_MESSAGE // en blå ikon 
        );

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Fel vid hämtning av kostnadsstatistik: " + e.getMessage());
    }
    }//GEN-LAST:event_StatistikKostnadActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        // TODO add your handling code here:
        Startsida startsida = new Startsida(parent, idb, aid);
        parent.visaPanel(startsida, "startsida");
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        try {
        // Steg 1: Fråga efter projektets ID (pid)
        String pidStr = JOptionPane.showInputDialog(this, "Ange projektets ID (pid) som ska tas bort:");

        if (pidStr == null || pidStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Du måste ange ett projekt-ID.");
            return;
        }

        int pid = Integer.parseInt(pidStr.trim());

        // Steg 2: Fråga användaren om bekräftelse
        int val = JOptionPane.showConfirmDialog(this,
            "Är du säker på att du vill ta bort projektet med ID " + pid + "?",
            "Bekräfta borttagning",
            JOptionPane.YES_NO_OPTION);

        if (val != JOptionPane.YES_OPTION) {
            return; // Användaren avbröt
        }

        // Steg 3: Kör DELETE-sats
        String sql = "DELETE FROM projekt WHERE pid = " + pid;

        idb.delete(sql);

        JOptionPane.showMessageDialog(this, "Projektet har tagits bort.");

        // Steg 4: Uppdatera tabellen
        hamtaAllaProjekt();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Projekt-ID måste vara ett heltal.");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Fel vid borttagning: " + e.getMessage());
    }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void addPartnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartnerButtonActionPerformed
        try {
        int radIndex = InfoProjectTable.getSelectedRow();
        if (radIndex == -1) {
            JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
            return;
        }

        String projektId = InfoProjectTable.getValueAt(radIndex, 0).toString();

        // Hämta redan kopplade partner_ids för projektet
        String koppladeFraga = "SELECT partner_pid FROM projekt_partner WHERE pid = " + projektId;
        ArrayList<HashMap<String, String>> koppladePartners = idb.fetchRows(koppladeFraga);
        HashSet<String> redanKoppladeIds = new HashSet<>();

        for (HashMap<String, String> rad : koppladePartners) {
            redanKoppladeIds.add(rad.get("partner_pid"));
        }

        // Hämta alla partners
        ArrayList<HashMap<String, String>> allaPartners = idb.fetchRows("SELECT pid, namn FROM partner");

        JComboBox<String> partnerBox = new JComboBox<>();
        HashMap<String, String> namnTillId = new HashMap<>();

        for (HashMap<String, String> partner : allaPartners) {
            String pid = partner.get("pid");
            String namn = partner.get("namn");

            // Bara lägg till partnern om den INTE redan är kopplad till projektet
            if (!redanKoppladeIds.contains(pid)) {
                partnerBox.addItem(namn);
                namnTillId.put(namn, pid);
            }
        }

        Object[] message = {
            "Välj partner att koppla till projektet:", partnerBox
        };

        int val = JOptionPane.showConfirmDialog(this, message, "Lägg till Partner", JOptionPane.OK_CANCEL_OPTION);
        if (val == JOptionPane.OK_OPTION) {
            String valtNamn = (String) partnerBox.getSelectedItem();
            String partnerId = namnTillId.get(valtNamn);

            String insertFraga = "INSERT INTO projekt_partner (pid, partner_pid) VALUES (" + projektId + ", " + partnerId + ")";
            idb.insert(insertFraga);

            JOptionPane.showMessageDialog(this, "Partner kopplad till projekt!");
            hamtaAllaProjekt(); // Uppdatera tabellen
        }

    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid koppling av partner: " + e.getMessage());
    }
    }//GEN-LAST:event_addPartnerButtonActionPerformed

    private void taBortPartnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortPartnerButtonActionPerformed
       try {
        int rad = InfoProjectTable.getSelectedRow();
        if (rad == -1) {
            JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
            return;
        }

        String projektId = InfoProjectTable.getValueAt(rad, 0).toString();

        // Hämta alla partners kopplade till projektet
        String sql = "SELECT pa.namn, pa.pid FROM partner pa " +
                     "JOIN projekt_partner pp ON pa.pid = pp.partner_pid " +
                     "WHERE pp.pid = " + projektId;

        ArrayList<HashMap<String, String>> partners = idb.fetchRows(sql);

        if (partners == null || partners.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Projektet har inga kopplade partners.");
            return;
        }

        // Lista partnernamn
        String[] partnerNamnLista = new String[partners.size()];
        for (int i = 0; i < partners.size(); i++) {
            partnerNamnLista[i] = partners.get(i).get("namn");
        }

        // Dialog för att välja partner att ta bort
        String valdPartner = (String) JOptionPane.showInputDialog(
            this,
            "Välj partner att ta bort:",
            "Ta bort partner",
            JOptionPane.QUESTION_MESSAGE,
            null,
            partnerNamnLista,
            partnerNamnLista[0]
        );

        if (valdPartner != null) {
            // Hitta partnerId baserat på det valda namnet
            for (HashMap<String, String> p : partners) {
                if (p.get("namn").equals(valdPartner)) {
                    String partnerId = p.get("pid");
                    String deleteSql = "DELETE FROM projekt_partner WHERE pid = " + projektId + " AND partner_pid = " + partnerId;
                    idb.delete(deleteSql);
                    JOptionPane.showMessageDialog(this, "Partnern togs bort från projektet.");
                    hamtaAllaProjekt(); // Uppdatera tabellen
                    break;
                }
            }
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid borttagning av partner: " + e.getMessage());
    }
    }//GEN-LAST:event_taBortPartnerButtonActionPerformed

    private void addHandlaggareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHandlaggareButtonActionPerformed
        try {
        int radIndex = InfoProjectTable.getSelectedRow();
        if (radIndex == -1) {
            JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
            return;
        }

        String projektId = InfoProjectTable.getValueAt(radIndex, 0).toString();

        // Hämta redan kopplade handläggare
        String koppladeFraga = "SELECT aid FROM ans_proj WHERE pid = '" + projektId + "'";
        System.out.println("Kör SQL: " + koppladeFraga);
        ArrayList<HashMap<String, String>> kopplade = idb.fetchRows(koppladeFraga);
        HashSet<String> redanKoppladeAid = new HashSet<>();
        for (HashMap<String, String> rad : kopplade) {
            redanKoppladeAid.add(rad.get("aid"));
        }

        // Hämta alla handläggare
        ArrayList<HashMap<String, String>> handlaggareLista = idb.fetchRows("SELECT anstalld.aid, fornamn, efternamn " +
        "FROM handlaggare " +
        "JOIN anstalld ON handlaggare.aid = anstalld.aid");

        JComboBox<String> handlerBox = new JComboBox<>();
        HashMap<String, String> namnTillAid = new HashMap<>();

        for (HashMap<String, String> h : handlaggareLista) {
            String hAid = h.get("aid");
            String namn = h.get("fornamn") + " " + h.get("efternamn");

            if (!redanKoppladeAid.contains(hAid)) {
                handlerBox.addItem(namn);
                namnTillAid.put(namn, hAid);
            }
        }

        if (handlerBox.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "Alla handläggare är redan kopplade till detta projekt.");
            return;
        }

        Object[] message = {
            "Välj handläggare att koppla till projektet:", handlerBox
        };

        int val = JOptionPane.showConfirmDialog(this, message, "Lägg till Handläggare", JOptionPane.OK_CANCEL_OPTION);
        if (val == JOptionPane.OK_OPTION) {
            String valtNamn = (String) handlerBox.getSelectedItem();
            String valdAid = namnTillAid.get(valtNamn);  // <-- bytt namn här

            String insertFraga = "INSERT INTO ans_proj (aid, pid) VALUES ('" + valdAid + "', '" + projektId + "')";
            idb.insert(insertFraga);

            JOptionPane.showMessageDialog(this, "Handläggare kopplad till projekt!");
            hamtaAllaProjekt(); // Uppdatera tabellen
        }

    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid koppling av handläggare: " + e.getMessage());
    }
    }//GEN-LAST:event_addHandlaggareButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AndraUppgifter;
    private javax.swing.JTextField DateOne;
    private javax.swing.JTextField DateTwo;
    private javax.swing.JLabel DatumLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable InfoProjectTable;
    private javax.swing.JButton StatistikKostnad;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JComboBox<String> StatusMenu;
    private javax.swing.JButton UppdateButton;
    private javax.swing.JButton addHandlaggareButton;
    private javax.swing.JButton addPartnerButton;
    private javax.swing.JButton addProjektButton;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField pidTextField;
    private javax.swing.JButton taBortHandlaggareButton;
    private javax.swing.JButton taBortPartnerButton;
    // End of variables declaration//GEN-END:variables
}
    
