
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
        jPanelCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InfoProjectTable = new javax.swing.JTable();
        jPanelSouth = new javax.swing.JPanel();
        addPartnerButton = new javax.swing.JButton();
        taBortPartnerButton = new javax.swing.JButton();
        addHandlaggareButton = new javax.swing.JButton();
        taBortHandlaggareButton = new javax.swing.JButton();
        StatistikKostnad = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        AndraUppgifter = new javax.swing.JButton();
        pidTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addProjektButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

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
        jLabelProjektVy.setText("Projekt Vy");

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
                    .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProjektAvdelning)
                    .addComponent(projektComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
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
                .addComponent(avdelningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        addPartnerButton.setText("Lägg till Partner");
        addPartnerButton.setMaximumSize(new java.awt.Dimension(110, 25));
        addPartnerButton.setMinimumSize(new java.awt.Dimension(110, 25));
        addPartnerButton.setPreferredSize(new java.awt.Dimension(110, 25));
        addPartnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartnerButtonActionPerformed(evt);
            }
        });

        taBortPartnerButton.setText("Ta bort Partner");
        taBortPartnerButton.setMaximumSize(new java.awt.Dimension(110, 25));
        taBortPartnerButton.setMinimumSize(new java.awt.Dimension(110, 25));
        taBortPartnerButton.setPreferredSize(new java.awt.Dimension(110, 25));
        taBortPartnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortPartnerButtonActionPerformed(evt);
            }
        });

        addHandlaggareButton.setText("Lägg till Handläggare");
        addHandlaggareButton.setPreferredSize(new java.awt.Dimension(140, 25));
        addHandlaggareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHandlaggareButtonActionPerformed(evt);
            }
        });

        taBortHandlaggareButton.setText("Ta bort Handläggare");
        taBortHandlaggareButton.setPreferredSize(new java.awt.Dimension(140, 25));
        taBortHandlaggareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortHandlaggareButtonActionPerformed(evt);
            }
        });

        StatistikKostnad.setText("Total kostnad");
        StatistikKostnad.setPreferredSize(new java.awt.Dimension(110, 25));
        StatistikKostnad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistikKostnadActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.setPreferredSize(new java.awt.Dimension(110, 25));
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        AndraUppgifter.setText("Ändra Uppgifter");
        AndraUppgifter.setPreferredSize(new java.awt.Dimension(120, 25));
        AndraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraUppgifterActionPerformed(evt);
            }
        });

        pidTextField.setColumns(2);

        jLabel1.setText("Pid");

        addProjektButton.setText("Lägg till Projekt");
        addProjektButton.setPreferredSize(new java.awt.Dimension(120, 25));
        addProjektButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjektButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Ta bort Projekt");
        DeleteButton.setPreferredSize(new java.awt.Dimension(120, 25));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSouthLayout = new javax.swing.GroupLayout(jPanelSouth);
        jPanelSouth.setLayout(jPanelSouthLayout);
        jPanelSouthLayout.setHorizontalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSouthLayout.createSequentialGroup()
                        .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSouthLayout.createSequentialGroup()
                                .addComponent(AndraUppgifter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StatistikKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanelSouthLayout.createSequentialGroup()
                                .addComponent(addProjektButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addHandlaggareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taBortHandlaggareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSouthLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSouthLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addPartnerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taBortPartnerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanelSouthLayout.createSequentialGroup()
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelSouthLayout.setVerticalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPartnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addHandlaggareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatistikKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AndraUppgifter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBortPartnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBortHandlaggareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProjektButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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
                            .addComponent(jPanelCenter, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))))
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

        String fraga = 
            "SELECT DISTINCT p.pid, p.status, p.projektnamn, p.beskrivning, p.startdatum, p.slutdatum, p.kostnad, p.prioritet, " +
            "GROUP_CONCAT(DISTINCT pa.namn SEPARATOR ', ') AS partnernamn, " +
            "GROUP_CONCAT(DISTINCT CONCAT(a.fornamn, ' ', a.efternamn) SEPARATOR ', ') AS handlaggare " +
            "FROM projekt p " +
            "LEFT JOIN projekt_partner pp ON p.pid = pp.pid " +
            "LEFT JOIN partner pa ON pp.partner_pid = pa.pid " +
            "LEFT JOIN ans_proj ap ON p.pid = ap.pid " +
            "LEFT JOIN anstalld a ON ap.aid = a.aid ";

        boolean harVillkor = false;

        // Koppling till aid eller avdelning
        if (valdVy.equals("Mina projekt")) {
            fraga += "WHERE ap.aid = " + this.aid + " ";
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
            model.addRow(new Object[] {
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
        System.out.println("Användarens aid: " + aid);
        String sql = "SELECT av.namn AS avdelning " +
                     "FROM anstalld a " +
                     "JOIN avdelning av ON a.avdelning = av.avdid " +
                     "WHERE a.aid = " + aid;

        HashMap<String, String> resultat = idb.fetchRow(sql);
        System.out.println("SQL-fråga: " + sql);
        System.out.println("Resultat från SQL: " + resultat);

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
        hamtaAllaAktuellaProjekt();

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
            hamtaAllaAktuellaProjekt(); // Uppdatera tabellen
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
                    hamtaAllaAktuellaProjekt(); // Uppdatera tabellen
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
            hamtaAllaAktuellaProjekt(); // Uppdatera tabellen
        }

    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid koppling av handläggare: " + e.getMessage());
    }
    }//GEN-LAST:event_addHandlaggareButtonActionPerformed

    private void taBortHandlaggareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortHandlaggareButtonActionPerformed
        try {
        int radIndex = InfoProjectTable.getSelectedRow();
        if (radIndex == -1) {
            JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
            return;
        }

        String projektId = InfoProjectTable.getValueAt(radIndex, 0).toString();

        // Hämta handläggare som är kopplade till projektet
        String fraga = "SELECT anstalld.aid, anstalld.fornamn, anstalld.efternamn FROM ans_proj " +
                       "JOIN anstalld ON ans_proj.aid = anstalld.aid " +
                       "WHERE ans_proj.pid = " + projektId;

        ArrayList<HashMap<String, String>> koppladeHandlaggare = idb.fetchRows(fraga);

        if (koppladeHandlaggare == null || koppladeHandlaggare.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Det finns inga handläggare kopplade till detta projekt.");
            return;
        }

        JComboBox<String> handlaggareBox = new JComboBox<>();
        HashMap<String, String> namnTillId = new HashMap<>();

        for (HashMap<String, String> h : koppladeHandlaggare) {
            String namn = h.get("fornamn") + " " + h.get("efternamn");
            String handlaggareAid = h.get("aid");
            handlaggareBox.addItem(namn);
            namnTillId.put(namn, handlaggareAid);
        }

        Object[] message = {
            "Välj handläggare att ta bort från projektet:", handlaggareBox
        };

        int val = JOptionPane.showConfirmDialog(this, message, "Ta bort Handläggare", JOptionPane.OK_CANCEL_OPTION);
        if (val == JOptionPane.OK_OPTION) {
            String valtNamn = (String) handlaggareBox.getSelectedItem();
            String valtHandlaggareId = namnTillId.get(valtNamn);

            String deleteFraga = "DELETE FROM ans_proj WHERE pid = " + projektId + " AND aid = " + valtHandlaggareId;
            idb.delete(deleteFraga);

            JOptionPane.showMessageDialog(this, "Handläggare borttagen från projektet.");
            hamtaAllaAktuellaProjekt(); // Uppdatera tabellen om det behövs
        }

    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid borttagning av handläggare: " + e.getMessage());
    }
    }//GEN-LAST:event_taBortHandlaggareButtonActionPerformed

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
    private javax.swing.JLabel avdelningLabel;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelProjektAvdelning;
    private javax.swing.JLabel jLabelProjektVy;
    private javax.swing.JLabel jLabelSlutdatum;
    private javax.swing.JLabel jLabelStartdatum;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelNorth;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pidTextField;
    private javax.swing.JComboBox<String> projektComboBox;
    private javax.swing.JButton taBortHandlaggareButton;
    private javax.swing.JButton taBortPartnerButton;
    // End of variables declaration//GEN-END:variables
}
    
