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
import sdgsweden.Validering;

/*
 * @author jonas
 */
public class ProjektChef extends javax.swing.JPanel {

    private InfDB idb;
    private MainFrame parent;
    private String aid;

    public ProjektChef(MainFrame parent, InfDB idb, String aid) {
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
        projektComboBox = new javax.swing.JComboBox<>();
        jLabelProjektAvdelning = new javax.swing.JLabel();
        avdelningLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        jLabelProjektVy = new javax.swing.JLabel();
        jPanelCenter = new javax.swing.JPanel();
        jScrollPaneProjektChef = new javax.swing.JScrollPane();
        InfoProjectTable = new javax.swing.JTable();
        jPanelSouth = new javax.swing.JPanel();
        addPartnerButton = new javax.swing.JButton();
        taBortPartnerButton = new javax.swing.JButton();
        addHandlaggareButton = new javax.swing.JButton();
        taBortHandlaggareButton = new javax.swing.JButton();
        DateOne = new javax.swing.JTextField();
        DatumLabel = new javax.swing.JLabel();
        jLabelStartdatum = new javax.swing.JLabel();
        DateTwo = new javax.swing.JTextField();
        jLabelSlutdatum = new javax.swing.JLabel();
        UppdateButton = new javax.swing.JButton();
        StatistikKostnad = new javax.swing.JButton();
        visaProjektchefButton = new javax.swing.JButton();
        visaLandInfoButton = new javax.swing.JButton();
        visaPartnerInfoButton = new javax.swing.JButton();
        AndraUppgifter = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(1300, 600));

        StatusMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alla", "Pågående", "Planerat", "Avslutat" }));
        StatusMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusMenuActionPerformed(evt);
            }
        });

        projektComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mina projekt", "Avdelningens projekt" }));
        projektComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektComboBoxActionPerformed(evt);
            }
        });

        jLabelProjektAvdelning.setText("Projekt");

        avdelningLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        avdelningLabel.setForeground(new java.awt.Color(255, 255, 255));
        avdelningLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        avdelningLabel.setToolTipText("");
        avdelningLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        avdelningLabel.setMaximumSize(new java.awt.Dimension(255, 25));
        avdelningLabel.setMinimumSize(new java.awt.Dimension(255, 25));
        avdelningLabel.setPreferredSize(new java.awt.Dimension(255, 25));

        StatusLabel.setText("Status");

        jLabelProjektVy.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelProjektVy.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProjektVy.setText("Projektchef");

        javax.swing.GroupLayout jPanelNorthLayout = new javax.swing.GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProjektVy, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addComponent(avdelningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addComponent(StatusLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProjektAvdelning)
                    .addComponent(projektComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelNorthLayout.setVerticalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusLabel)
                    .addComponent(jLabelProjektAvdelning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(avdelningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelProjektVy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCenter.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanelCenter.setLayout(new java.awt.BorderLayout());

        InfoProjectTable.setBackground(new java.awt.Color(204, 204, 204));
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
                false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InfoProjectTable.setToolTipText("");
        InfoProjectTable.getTableHeader().setReorderingAllowed(false);
        jScrollPaneProjektChef.setViewportView(InfoProjectTable);

        jPanelCenter.add(jScrollPaneProjektChef, java.awt.BorderLayout.CENTER);

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

        DateOne.setColumns(12);

        DatumLabel.setText("Sök datum (YYYY-MM-DD)");

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
            .addGroup(jPanelSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatumLabel)
                    .addGroup(jPanelSouthLayout.createSequentialGroup()
                        .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStartdatum))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSlutdatum)
                            .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UppdateButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(taBortHandlaggareButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(addHandlaggareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPartnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(taBortPartnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanelSouthLayout.setVerticalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPartnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addHandlaggareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBortPartnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBortHandlaggareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UppdateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStartdatum)
                    .addComponent(jLabelSlutdatum))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        StatistikKostnad.setText("Kostnadsstatistik");
        StatistikKostnad.setPreferredSize(new java.awt.Dimension(110, 25));
        StatistikKostnad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatistikKostnadActionPerformed(evt);
            }
        });

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

        AndraUppgifter.setText("Ändra Uppgifter");
        AndraUppgifter.setPreferredSize(new java.awt.Dimension(120, 25));
        AndraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndraUppgifterActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.setPreferredSize(new java.awt.Dimension(110, 25));
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(StatistikKostnad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(visaProjektchefButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(visaLandInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(visaPartnerInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AndraUppgifter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(StatistikKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visaProjektchefButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visaLandInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(visaPartnerInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AndraUppgifter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void hamtaAllaAktuellaProjekt() {
        // Metod för att hämta och visa all, relevant, info om ett projekt
        try {
            String valdStatus = StatusMenu.getSelectedItem().toString();
            String datumFran = DateOne.getText().trim();
            String datumTill = DateTwo.getText().trim();
            String valdVy = projektComboBox.getSelectedItem().toString(); // "Mina projekt" eller "Avdelningens projekt"

            String fraga
                    = "SELECT p.pid, p.status, p.projektnamn, p.beskrivning, p.startdatum, p.slutdatum, "
                    + "p.kostnad, p.prioritet, "
                    + "GROUP_CONCAT(DISTINCT pa.namn SEPARATOR ', ') AS partnernamn, "
                    + "GROUP_CONCAT(DISTINCT CONCAT(a.fornamn, ' ', a.efternamn) SEPARATOR ', ') AS handlaggare, "
                    + "l.namn "
                    + "FROM projekt p "
                    + "LEFT JOIN land l ON p.land = l.lid "
                    + "LEFT JOIN projekt_partner pp ON p.pid = pp.pid "
                    + "LEFT JOIN partner pa ON pp.partner_pid = pa.pid ";

            boolean harVillkor = false;

            // Hantera vyval
            if (valdVy.equals("Mina projekt")) {
                fraga += "LEFT JOIN ans_proj ap ON p.pid = ap.pid "
                        + "LEFT JOIN anstalld a ON ap.aid = a.aid "
                        + "WHERE p.projektchef = " + this.aid + " ";
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
                    rad.get("namn")
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
        // metod för att kolla ifall en anställd är projektchef eller inte.
        try {
            String sql = "SELECT pid FROM projekt WHERE projektchef = " + aid;
            String resultat = idb.fetchSingle(sql);
            return resultat != null; // true = personen är projektchef
        } catch (InfException e) {
            System.out.println("Fel i arProjektchef(): " + e.getMessage());
            return false;
        }
    }

    private void AndraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndraUppgifterActionPerformed
        // Metod för att ändra ett projekt som den inloggade är projektchef över. 
        int radIndex = InfoProjectTable.getSelectedRow();

        if (radIndex == -1) {
            JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
            return;
        }

        try {
            // Hämta pid från kolumn 0
            String projektId = InfoProjectTable.getValueAt(radIndex, 0).toString();
            int pid = Integer.parseInt(projektId);

            // Kontrollera att inloggad användare är projektchef
            String kontrollFraga = "SELECT pid FROM projekt "
                    + "WHERE pid = " + pid + " AND projektchef = " + aid;

            String resultat = idb.fetchSingle(kontrollFraga);
            if (resultat == null) {
                JOptionPane.showMessageDialog(this, "Du är inte projektchef för detta projekt och kan därför inte redigera det.");
                return;
            }

            // Om användaren är projektchef – öppna redigeringspanelen
            HanteraProjekt redigeraPanel = new HanteraProjekt(idb, this, pid);
            Container parentProjekt = this.getParent();
            parentProjekt.removeAll();
            parentProjekt.add(redigeraPanel);
            parentProjekt.revalidate();
            parentProjekt.repaint();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ogiltigt projekt-ID.", "Fel", JOptionPane.ERROR_MESSAGE);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(this, "Databasfel: " + e.getMessage(), "Fel", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AndraUppgifterActionPerformed

    private void StatistikKostnadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatistikKostnadActionPerformed
        try {
            // Hämta kostnader för projekt där den inloggade är projektchef över.
            String sql = "SELECT kostnad FROM projekt WHERE projektchef = " + aid;
            ArrayList<HashMap<String, String>> resultat = idb.fetchRows(sql);

            double totalKostnad = 0;
            double maxKostnad = Double.MIN_VALUE;
            double minKostnad = Double.MAX_VALUE;
            int antalProjekt = 0;

            for (HashMap<String, String> rad : resultat) {
                double kostnad = Double.parseDouble(rad.get("kostnad"));

                totalKostnad += kostnad;
                maxKostnad = Math.max(maxKostnad, kostnad);
                minKostnad = Math.min(minKostnad, kostnad);

                antalProjekt++;
            }

            double medelKostnad = totalKostnad / antalProjekt;

            JOptionPane.showMessageDialog(this,
                    "Kostnadsstatistik för dina projekt:\n"
                    + "Totalkostnad: " + totalKostnad + " kr\n"
                    + "Medelkostnad: " + String.format("%.2f", medelKostnad) + " kr\n"
                    + "Högsta kostnad: " + maxKostnad + " kr\n"
                    + "Lägsta kostnad: " + minKostnad + " kr",
                    "Projektkostnad - Statistik",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fel vid hämtning av kostnadsstatistik: " + e.getMessage());
        }
    }//GEN-LAST:event_StatistikKostnadActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        
        Startsida startsida = new Startsida(parent, idb, aid);
        parent.visaPanel(startsida, "startsida");
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void addPartnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartnerButtonActionPerformed
        // Metod för att lägga till en Partner till ett valt projekt i jTable
        try {
            int radIndex = InfoProjectTable.getSelectedRow();
            if (radIndex == -1) {
                JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
                return;
            }

            String projektId = InfoProjectTable.getValueAt(radIndex, 0).toString();

            // Kontrollera att användaren är projektchef
            String kontrollFraga = "SELECT pid FROM projekt WHERE pid = '" + projektId + "' AND projektchef = '" + aid + "'";
            String resultat = idb.fetchSingle(kontrollFraga);

            if (resultat == null) {
                JOptionPane.showMessageDialog(this, "Du är inte projektchef för detta projekt och kan därför inte lägga till partner.");
                return;
            }

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

                if (!redanKoppladeIds.contains(pid)) {
                    partnerBox.addItem(namn);
                    namnTillId.put(namn, pid);
                }
            }

            if (partnerBox.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "Alla partners är redan kopplade till detta projekt.");
                return;
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
        // Metod för att ta bort en partner från ett valt projekt i JTable
        try {
            int rad = InfoProjectTable.getSelectedRow();
            if (rad == -1) {
                JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
                return;
            }

            String projektId = InfoProjectTable.getValueAt(rad, 0).toString();

            // Kontrollera att användaren är projektchef
            String kontrollFraga = "SELECT pid FROM projekt WHERE pid = '" + projektId + "' AND projektchef = '" + aid + "'";
            String resultat = idb.fetchSingle(kontrollFraga);

            if (resultat == null) {
                JOptionPane.showMessageDialog(this, "Du är inte projektchef för detta projekt och kan därför inte ta bort partner.");
                return;
            }

            // Hämta alla partners kopplade till projektet
            String sql = "SELECT pa.namn, pa.pid FROM partner pa "
                    + "JOIN projekt_partner pp ON pa.pid = pp.partner_pid "
                    + "WHERE pp.pid = " + projektId;

            ArrayList<HashMap<String, String>> partners = idb.fetchRows(sql);

            if (partners == null || partners.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Projektet har inga kopplade partners.");
                return;
            }

            String[] partnerNamnLista = new String[partners.size()];
            for (int i = 0; i < partners.size(); i++) {
                partnerNamnLista[i] = partners.get(i).get("namn");
            }

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
        // Metod för att lägga till en handläggare till ett valt projekt i JTable
        try {
            int radIndex = InfoProjectTable.getSelectedRow();
            if (radIndex == -1) {
                JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
                return;
            }

            String projektId = InfoProjectTable.getValueAt(radIndex, 0).toString();

            // Kontrollera att användaren är projektchef för projektet
            String kontrollFraga = "SELECT pid FROM projekt WHERE pid = '" + projektId + "' AND projektchef = '" + aid + "'";
            String resultat = idb.fetchSingle(kontrollFraga);

            if (resultat == null) {
                JOptionPane.showMessageDialog(this, "Du är inte projektchef för detta projekt och kan därför inte lägga till handläggare.");
                return;
            }

            // Hämta redan kopplade handläggare
            String koppladeFraga = "SELECT aid FROM ans_proj WHERE pid = '" + projektId + "'";
            ArrayList<HashMap<String, String>> kopplade = idb.fetchRows(koppladeFraga);
            HashSet<String> redanKoppladeAid = new HashSet<>();
            for (HashMap<String, String> rad : kopplade) {
                redanKoppladeAid.add(rad.get("aid"));
            }

            // Hämta alla handläggare
            ArrayList<HashMap<String, String>> handlaggareLista = idb.fetchRows(
                    "SELECT anstalld.aid, fornamn, efternamn "
                    + "FROM handlaggare "
                    + "JOIN anstalld ON handlaggare.aid = anstalld.aid"
            );

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
                String valdAid = namnTillAid.get(valtNamn);

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
        // Metod för att ta bort en handläggare för ett valt projekt i JTable
        try {
            int radIndex = InfoProjectTable.getSelectedRow();
            if (radIndex == -1) {
                JOptionPane.showMessageDialog(this, "Välj ett projekt först.");
                return;
            }

            String projektId = InfoProjectTable.getValueAt(radIndex, 0).toString();

            // Kontrollera att användaren är projektchef för projektet
            String kontrollFraga = "SELECT pid FROM projekt WHERE pid = '" + projektId + "' AND projektchef = '" + aid + "'";
            String resultat = idb.fetchSingle(kontrollFraga);

            if (resultat == null) {
                JOptionPane.showMessageDialog(this, "Du är inte projektchef för detta projekt och kan därför inte ta bort handläggare.");
                return;
            }

            // Hämta handläggare som är kopplade till projektet
            String fraga = "SELECT anstalld.aid, anstalld.fornamn, anstalld.efternamn FROM ans_proj "
                    + "JOIN anstalld ON ans_proj.aid = anstalld.aid "
                    + "WHERE ans_proj.pid = " + projektId;

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


        // Kontrollera om datumen är i rätt format (om de är ifyllda)
        if (!datumFran.isEmpty() && !Validering.isValidAnstallningsdatum(datumFran)) {
            JOptionPane.showMessageDialog(this, "Startdatum måste vara i formatet ÅÅÅÅ-MM-DD.");
            return;
        }

        if (!datumTill.isEmpty() && !Validering.isValidAnstallningsdatum(datumTill)) {
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
        // Metod för att visa info om en partner
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
        // Metod för att visa info om ett land 
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
        // Metod för att visa info om aktuell projektchef för valt projekt i JTable
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
    private javax.swing.JButton AndraUppgifter;
    private javax.swing.JTextField DateOne;
    private javax.swing.JTextField DateTwo;
    private javax.swing.JLabel DatumLabel;
    private javax.swing.JTable InfoProjectTable;
    private javax.swing.JButton StatistikKostnad;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JComboBox<String> StatusMenu;
    private javax.swing.JButton UppdateButton;
    private javax.swing.JButton addHandlaggareButton;
    private javax.swing.JButton addPartnerButton;
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
    private javax.swing.JScrollPane jScrollPaneProjektChef;
    private javax.swing.JComboBox<String> projektComboBox;
    private javax.swing.JButton taBortHandlaggareButton;
    private javax.swing.JButton taBortPartnerButton;
    private javax.swing.JButton visaLandInfoButton;
    private javax.swing.JButton visaPartnerInfoButton;
    private javax.swing.JButton visaProjektchefButton;
    // End of variables declaration//GEN-END:variables
}
