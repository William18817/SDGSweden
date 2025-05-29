package sdgsweden;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import sdgsweden.admin.AdminPanel;
import sdgsweden.projekt.ProjektChef;
import sdgsweden.projekt.Projekt;

public class Startsida extends javax.swing.JPanel {

    private MainFrame parent; // Referens till MainFrame - används för att byta JPanel i fönstret.
    private InfDB idb; // Databasanslutningen
    private String aid;// ID för inloggad användare

    public Startsida(MainFrame parent, InfDB idb, String aid) {
        this.parent = parent;
        this.idb = idb;
        this.aid = aid;
        initComponents();

        LbTillGlobalaMalen.setText("<html><font color='white'><u>Lär dig mer här!</u></font></html>");

        initHandCursorForAllaLabels();
    }

    //Arraylist som ger oss en loop och gör koden lättare att underhålla.
    private void initHandCursorForAllaLabels() {
        javax.swing.JLabel[] labels = {
            LbMal1, LbMal2, LbMal3, LbMal4, LbMal5,
            LbMal6, LbMal7, LbMal8, LbMal9, LbMal10,
            LbMal11, LbMal12, LbMal13, LbMal14, LbMal15,
            LbMal16, LbMal17, LbTillGlobalaMalen
        };

        for (javax.swing.JLabel lbl : labels) {
            sattHandCursorPaLabel(lbl);
        }
    }

    private void sattHandCursorPaLabel(javax.swing.JLabel label) {
        label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProjektChef = new javax.swing.JButton();
        LbStartsida = new java.awt.Label();
        btnMittKonto = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnLoggaUt_v2 = new javax.swing.JButton();
        btnProjektAlla = new javax.swing.JButton();
        btnPersonal = new javax.swing.JButton();
        LbMal1 = new javax.swing.JLabel();
        LbMal2 = new javax.swing.JLabel();
        LbMal3 = new javax.swing.JLabel();
        LbMal4 = new javax.swing.JLabel();
        LbMal5 = new javax.swing.JLabel();
        LbMal6 = new javax.swing.JLabel();
        LbMal7 = new javax.swing.JLabel();
        LbMal8 = new javax.swing.JLabel();
        LbMal9 = new javax.swing.JLabel();
        LbMal10 = new javax.swing.JLabel();
        LbMal11 = new javax.swing.JLabel();
        LbMal12 = new javax.swing.JLabel();
        LbMal13 = new javax.swing.JLabel();
        LbMal14 = new javax.swing.JLabel();
        LbMal15 = new javax.swing.JLabel();
        LbMal16 = new javax.swing.JLabel();
        LbMal17 = new javax.swing.JLabel();
        LbLarDigMer = new java.awt.Label();
        LbTillGlobalaMalen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnProjektChef.setText("Projektchef");
        btnProjektChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjektChefActionPerformed(evt);
            }
        });

        LbStartsida.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LbStartsida.setText("STARTSIDA");

        btnMittKonto.setText("Mitt Konto");
        btnMittKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMittKontoActionPerformed(evt);
            }
        });

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnLoggaUt_v2.setText("Logga ut");
        btnLoggaUt_v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUt_v2ActionPerformed(evt);
            }
        });

        btnProjektAlla.setText("Projekt");
        btnProjektAlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjektAllaActionPerformed(evt);
            }
        });

        btnPersonal.setText("Personal");
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });

        LbMal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 1 (Ny).jpg"))); // NOI18N
        LbMal1.setText("jLabel1");
        LbMal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal1MouseClicked(evt);
            }
        });

        LbMal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 2(Ny).jpg"))); // NOI18N
        LbMal2.setText("jLabel2");
        LbMal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal2MouseClicked(evt);
            }
        });

        LbMal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 3.jpg"))); // NOI18N
        LbMal3.setText("jLabel3");
        LbMal3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal3MouseClicked(evt);
            }
        });

        LbMal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 4.jpg"))); // NOI18N
        LbMal4.setText("jLabel4");
        LbMal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal4MouseClicked(evt);
            }
        });

        LbMal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 5.jpg"))); // NOI18N
        LbMal5.setText("jLabel5");
        LbMal5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal5MouseClicked(evt);
            }
        });

        LbMal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 6.jpg"))); // NOI18N
        LbMal6.setText("jLabel6");
        LbMal6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal6MouseClicked(evt);
            }
        });

        LbMal7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 7.jpg"))); // NOI18N
        LbMal7.setText("jLabel7");
        LbMal7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal7MouseClicked(evt);
            }
        });

        LbMal8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 8.jpg"))); // NOI18N
        LbMal8.setText("jLabel8");
        LbMal8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal8MouseClicked(evt);
            }
        });

        LbMal9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 9.jpg"))); // NOI18N
        LbMal9.setText("jLabel9");
        LbMal9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal9MouseClicked(evt);
            }
        });

        LbMal10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 10.jpg"))); // NOI18N
        LbMal10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal10MouseClicked(evt);
            }
        });

        LbMal11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 11.jpg"))); // NOI18N
        LbMal11.setText("jLabel11");
        LbMal11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal11MouseClicked(evt);
            }
        });

        LbMal12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 12.jpg"))); // NOI18N
        LbMal12.setText("jLabel12");
        LbMal12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal12MouseClicked(evt);
            }
        });

        LbMal13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 13.jpg"))); // NOI18N
        LbMal13.setText("jLabel13");
        LbMal13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal13MouseClicked(evt);
            }
        });

        LbMal14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 14.jpg"))); // NOI18N
        LbMal14.setText("jLabel14");
        LbMal14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal14MouseClicked(evt);
            }
        });

        LbMal15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 15.jpg"))); // NOI18N
        LbMal15.setText("jLabel15");
        LbMal15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal15MouseClicked(evt);
            }
        });

        LbMal16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 16.jpg"))); // NOI18N
        LbMal16.setText("jLabel16");
        LbMal16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal16MouseClicked(evt);
            }
        });

        LbMal17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/ikon 17(NY).jpg"))); // NOI18N
        LbMal17.setText("jLabel17");
        LbMal17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbMal17MouseClicked(evt);
            }
        });

        LbLarDigMer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LbLarDigMer.setText("Tryck på ett av de Globala Målen för att lära dig mer:");

        LbTillGlobalaMalen.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        LbTillGlobalaMalen.setText("Eller lär dig mer här!");
        LbTillGlobalaMalen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbTillGlobalaMalenMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdgsweden/bilder/global-goals-logo-lite-större.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProjektChef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProjektAlla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMittKonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLoggaUt_v2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbMal16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LbMal11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(LbMal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LbMal6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbMal2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LbMal3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LbMal4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LbMal5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LbMal17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(LbTillGlobalaMalen))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LbMal12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LbMal13, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(LbMal7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LbMal8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LbMal9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbMal14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LbMal10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbMal15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(LbStartsida, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbLarDigMer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbStartsida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbLarDigMer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbMal1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbMal2)
                                    .addComponent(LbMal3)
                                    .addComponent(LbMal4)
                                    .addComponent(LbMal5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbMal6)
                                    .addComponent(LbMal7)
                                    .addComponent(LbMal8)
                                    .addComponent(LbMal9)
                                    .addComponent(LbMal10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LbMal11)
                                    .addComponent(LbMal12)
                                    .addComponent(LbMal13)
                                    .addComponent(LbMal14)
                                    .addComponent(LbMal15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LbMal16)
                                        .addComponent(LbMal17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LbTillGlobalaMalen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProjektChef, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProjektAlla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMittKonto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoggaUt_v2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        LbStartsida.getAccessibleContext().setAccessibleName("Startsida");
    }// </editor-fold>//GEN-END:initComponents

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

    public boolean arAdmin(String aid) {
        try {
            String sql = "SELECT aid FROM admin WHERE aid = " + aid;
            String resultat = idb.fetchSingle(sql);
            return resultat != null; // true = personen är admin
        } catch (InfException e) {
            System.out.println("Fel i arAdmin(): " + e.getMessage());
            return false;
        }
    }

    private void btnProjektChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjektChefActionPerformed
        if (arProjektchef(aid)) {
            ProjektChef projektPanel = new ProjektChef(parent, idb, aid);
            parent.visaPanel(projektPanel, "projekt");
        } else {
            JOptionPane.showMessageDialog(null, "Du måste vara projektchef för att öppna detta.");
        }
    }//GEN-LAST:event_btnProjektChefActionPerformed

    private void btnMittKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMittKontoActionPerformed

        MittKonto mittKontoPanel = new MittKonto(idb, aid);
        parent.visaPanel(mittKontoPanel, "mittkonto");

    }//GEN-LAST:event_btnMittKontoActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        if (arAdmin(aid)) {
            AdminPanel adminPanel = new AdminPanel(parent, idb, aid);
            parent.visaPanel(adminPanel, "admin");
        } else {
            JOptionPane.showMessageDialog(null, "Du måste vara administratör för att öppna detta.");
        }
    }//GEN-LAST:event_btnAdminActionPerformed


    private void btnLoggaUt_v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUt_v2ActionPerformed
        // stänger Jframen som innehåller den här panelen, alltså MainFrame.
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        //Öppnar inloggning igen
        new Inloggning(idb).setVisible(true);
    }//GEN-LAST:event_btnLoggaUt_v2ActionPerformed

    private void btnProjektAllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjektAllaActionPerformed
        Projekt projektPanel = new Projekt(parent, idb, aid);
        parent.visaPanel(projektPanel, "projekt");
    }//GEN-LAST:event_btnProjektAllaActionPerformed

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
        Personal personalPanel = new Personal(parent, idb, aid);
        parent.visaPanel(personalPanel, "personal");
    }//GEN-LAST:event_btnPersonalActionPerformed

    private void LbMal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal1MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 1: INGEN FATTIGDOM. \n "
                + "Fattigdom omfattar fler dimensioner än den ekonomiska. Fattigdom innebär även brist på frihet, inflytande, hälsa, utbildning och säkerhet.\n "
                + "Det brukar kallas för multidimensionell fattigdom. Idag lever 1,1 miljarder människor i multidimensionell fattigdom och av dessa är hälften under 18 år.\n "
                + "Brist på mat, sjukvård, säkerhet och rent vatten dödar tusentals människor varjeÂ dag, men det blir bättre och sedan 1990 har den extrema fattigdomen halverats.\n "
                + "Mål 1 handlar om att avskaffa fattigdom i alla dess former och ge alla människor i världen chans till ett värdigt och tryggt liv.");
    }//GEN-LAST:event_LbMal1MouseClicked

    private void LbMal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal2MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 2: INGEN HUNGER. \n"
                + " Hunger är en av de främsta dödsorsakerna i världen och idag lever ungefär 821 miljoner människor i världen i hunger. \n"
                + " Brist på mat är en mänsklig katastrof som har långsiktiga effekter för människors hälsa och samhällens möjlighet till utveckling och tillväxt. \n"
                + " Vår planet har försett oss med enorma resurser, men ojämlik tillgång och ineffektiv hantering lämnar miljontals människor undernärda. \n"
                + " Tillgång till tillräcklig och näringsriktig mat är en mänsklig rättighet som varje stat har en skyldighet att tillförsäkra sina medborgare. \n"
                + " Genom att främja ett hållbart jordbruk med modern teknik och rättvisa distributionssystem kan vi säkerställa tillgång till tillräcklig och näringsriktig mat för alla.");
    }//GEN-LAST:event_LbMal2MouseClicked

    private void LbMal3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal3MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 3: GOD HÄLSA OCH VÄLBEFINNANDE. \n"
                + " God hälsa är en grundläggande förutsättning för människors möjlighet att nå sin fulla potential och att bidra till samhällets utveckling.\n"
                + " Människors hälsa påverkas av ekonomiska, ekologiska och sociala faktorer och mål 3 inkluderar alla dimensioner och människor i alla åldrar.\n"
                + " Under de senaste decennierna har stora framsteg gjorts för att förbättra människors hälsa globalt, till exempel så har barndödligheten minskat med 50% sedan 1990.\n"
                + " Investeringar i hälsa genom förebyggande insatser och modern och effektiv vård för alla gynnar samhällets utveckling i stort, \n"
                + " och skapar förutsättningar för människors grundläggande rättigheter till välbefinnande.");
    }//GEN-LAST:event_LbMal3MouseClicked

    private void LbMal4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal4MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 4: GOD UTBILDNING FÖR ALLA. \n"
                + " Utbildning är en grundläggande mänsklig rättighet. \n"
                + " Trots det beräknas fortfarande 774 miljoner människor i världen inte kunna skriva och läsa, varav två tredjedelar är kvinnor.\n"
                + " Forskning visar att inkluderande utbildning av god kvalitet för alla är en av de viktigaste grunderna för välstånd, hälsa och jämställdhet i varje samhälle.\n"
                + " Utbildningssystem världen över måste möta människors behov under hela livet, \n"
                + "  från förskola, grundskola, gymnasium och högre utbildning, \n"
                + " samt alla människors lika möjlighet till livslångt lärande som gynnar deltagande i arbets- och samhällsliv.\n"
                + " Utbildning är nyckeln till välstånd och öppnar en värld av möjligheter som gör det möjligt för var och en av oss att bidra till ett hållbart samhälle.\n");
    }//GEN-LAST:event_LbMal4MouseClicked

    private void LbMal5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal5MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 5: JÄMNSTÄLLDHET. \n"
                + " Jämställdhet mellan kvinnor och män är en förutsättning för en hållbar och fredlig utveckling.\n"
                + " Jämställdhet handlar om en rättvis fördelning av makt, inflytande och resurser. \n"
                + " Alla former av våld, diskriminering och skadliga sedvänjor mot kvinnor och flickor drabbar såväl individen som hela samhället.\n"
                + " Det har bevisats om och om igen att politisk, ekonomisk och social jämlikhet mellan kvinnor och män bidrar till alla dimensioner av hållbar utveckling.\n"
                + " Att leva ett liv fritt från våld och diskriminering är en grundläggande mänsklig rättighet och helt avgörande för att människor och samhällen ska utveckla sin fulla potential.\n");
    }//GEN-LAST:event_LbMal5MouseClicked

    private void LbMal6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal6MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 6: RENT VATTEN OCH SANITET FÖR ALLA. \n"
                + " Vatten är en grundförutsättning för allt levande på jorden, och därmed också en förutsättning för människors hälsa och en hållbar utveckling.\n"
                + " Vatten är också en förutsättning för världens livsmedelsproduktion och energiproduktion och brist på vatten kan därför bli orsak till konflikt, både inom och mellan länder.\n"
                + " Men vatten är inte nödvändigtvis en källa till konflikt, vattentillgångar kan också fungera som enande kraft som stärker samarbete och skapar lösningar för fred.\n"
                + " En av tre personer världen över lever idag utan tillgång till grundläggande sanitet, vilket orsakar sjukdom och skapar en ohälsosam miljö som särskilt drabbar människor som lever i fattigdom. \n"
                + " I synnerhet drabbas kvinnor och flickor som ofta ansvarar för familjens vattenförsörjning, vilket leder till förlorade inkomstmöjligheter och missade skoldagar. \n"
                + " Tillgång till rent vatten och sanitet för alla är grundläggande för människors hälsa och utveckling.\n");
    }//GEN-LAST:event_LbMal6MouseClicked

    private void LbMal7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal7MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 7: HÅLLBAR ENERGI FÖR ALLA. \n"
                + " Tillgång till hållbar, tillförlitlig och förnybar energi och rena bränslen är en förutsättning för att kunna möta flera av de utmaningar världen står inför idag,\n"
                + " som fattigdom, klimatförändringar och en inkluderande tillväxt. \n"
                + " En stor del av jordens befolkning har inte tillgång till el, samtidigt som efterfrågan på energi globalt väntas öka med 37 procent till år 2040.\n"
                + " En stor andel våra utsläpp av växthusgaser kommer från sättet vi utvinner, omvandlar och använder fossil energi, \n"
                + " men förnybara energilösningar blir billigare, mer tillförlitliga och effektivare varje dag. \n"
                + " Genom att ändra hur vi producerar och konsumerar energi kan vi säkerställa tillgång till el och energitjänster för alla utan att vi skadar vår planet.\n");
    }//GEN-LAST:event_LbMal7MouseClicked

    private void LbMal8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal8MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 8: ANSTÄNDINGA ARBETSVILKOR OCH EKONOMISK TILLVÄXT. \n"
                + " Idag befinner sig mer än hälften av världens arbetstagare i osäkra anställningar, ofta med dålig lön och begränsad tillgång till både utbildning och socialförsäkringar\n"
                + " Under de kommande 20 åren väntas dessutom den globala arbetskraften öka med 800 miljoner människor, \n"
                + " vilket kräver stora ansträngningar för att skapa nya jobb som också är hållbara för människa och miljö.\n"
                + " Anständiga arbetsvillkor främjar en hållbar ekonomisk tillväxt och är en positiv kraft för hela planeten. \n"
                + " Vi måste skydda arbetstagarnas rättigheter och en gång för alla stoppa modernt slaveri, människohandel och barnarbete. \n"
                + " Genom att skapa goda förutsättningar för innovation och entreprenörskap, \n"
                + " samt säkerställa anständiga arbetsvillkor för alla gynnas en hållbar ekonomisk tillväxt som inkluderar hela samhället.\n");
    }//GEN-LAST:event_LbMal8MouseClicked

    private void LbMal9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal9MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 9: HÅLLBAR INDUSTRI, INNOATIONER OCH INFRASTRUKTUR. \n"
                + " En fungerande och stabil infrastruktur är grunden för alla framgångsrika samhällen.\n"
                + "  För att möta framtida utmaningar som vi människor och vår planet står inför måste våra industrier och infrastrukturer göras mer inkluderande och hållbara.\n"
                + " Innovation och teknologiska framsteg är nyckeln till att finna hållbara lösningar för såväl ekonomiska som miljömässiga utmaningar. \n"
                + " Det bidrar dessutom till att skapa nya marknader och arbetstillfällen som kan bidra till en effektiv och jämlik resursanvändning.\n");
    }//GEN-LAST:event_LbMal9MouseClicked

    private void LbMal10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal10MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 10: MINSKAD OJÄMNLIKHET. \n"
                + " Grunden för ett hållbart samhälle är en rättvis fördelning av resurser och såväl ekonomiskt, socialt och politiskt inflytande i samhället.\n"
                + " Globala målens ledord är Leave No One Behind och mål 10 belyser vikten av att verka för ett samhälle där ingen lämnas utanför i utvecklingen.\n"
                + " Ett jämlikt samhälle bygger på principen om allas lika rättigheter och möjligheter oberoende av t.ex. kön, etnicitet, religion, funktionsvariation, ålder och annan ställning. \n"
                + " Även om många länder har haft en positiv ekonomisk utveckling med minskad fattigdom under de senaste decennierna, så har klyftorna ökat både inom och mellan länder. \n"
                + " Jämlikhet minskar risken för konflikter och främjar alla människors möjlighet att delta i och påverka samhällsutvecklingen.\n");
    }//GEN-LAST:event_LbMal10MouseClicked

    private void LbMal11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal11MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 11: HÅLLBARA STÄDER OCH SAMHÄLLEN. \n"
                + " Över hälften av världens befolkning bor i urbana områden, och andelen väntas stiga till 70 procent år 2050\n"
                + " Växande städer kan skapa nya möjligheter för ekonomisk tillväxt, men kan också bidra till ökade sociala klyftor och påfrestningar på ekosystem.\n"
                + " Den snabba och stora inflyttningen till städer ställer nya krav som behöver bemötas på ett ekologiskt, ekonomiskt och socialt hållbart sätt.\n"
                + " Hållbar stadsutveckling omfattar hållbart byggande och hållbar planering av bostäder, \n"
                + " nfrastruktur, offentliga platser, transporter, återvinning och säkrare kemikaliehantering som i sin tur kräver ny teknik och samarbete mellan flera sektorer\n"
                + " Inkluderande och innovativ stadsplanering behövs för att göra städerna säkra och hållbara för framtiden.\n");
    }//GEN-LAST:event_LbMal11MouseClicked

    private void LbMal12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal12MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 12: HÅLLBAR KONSUMTION OCH PRODUKTION. \n"
                + " Vår planet har försett oss med ett överflöd av naturresurser, men vi människor har inte nyttjat det på ett ansvarsfullt sätt och konsumerar nu långt bortom vad vår planet klarar av\n"
                + " Visste du exempelvis att 1/3 av den mat som produceras slängs? \n"
                + "  Att uppnå hållbar utveckling kräver att vi minskar vårt ekologiska fotavtryck genom att ändra hur vi producerar och konsumerar varor och resurser.\n"
                + " Hållbar konsumtion innebär inte bara miljöfördelar utan även sociala och ekonomiska fördelar såsom ökad konkurrenskraft, \n"
                + " tillväxt på såväl den lokala som globala marknaden, ökad sysselsättning, förbättrad hälsa och minskad fattigdom.\n"
                + " Omställning till en hållbar konsumtion och produktion av varor är en nödvändighet för att minska vår negativa påverkan på klimat, miljö och människors hälsa.\n");
    }//GEN-LAST:event_LbMal12MouseClicked

    private void LbMal13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal13MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 13: BEKÄMPA KLIMATFÖRÄNDRINGAR. \n"
                + " Klimatförändringarna är ett verkligt och obestridligt hot mot hela vår civilisation.\n"
                + " Utsläppen av växthusgaser fortsätter att stiga och som följd riskerar vi att nå en genomsnittlig global uppvärmning som överstiger två grader, \n"
                + " vilket skulle få allvarliga konsekvenser för ekosystem, havsförsurning, mänsklig säkerhet, matproduktion, vattentillgång, hälsa och ökad risk för naturkatastrofer.\n"
                + " Effekterna är redan nu synliga och kommer att bli katastrofala såvida vi inte agerar nu.\n"
                + " Genom utbildning, innovation och efterlevnad av våra klimatförpliktelser kan vi göra nödvändiga förändringar för att skydda planeten.\n"
                + " Dessa förändringar ger också stora möjligheter att modernisera vår infrastruktur som kommer att skapa nya arbetstillfällen och främja välstånd över hela världen.\n"
                + " Det globala arbetet för att uppnå mål 13 och bekämpa klimatförändringarna konkretiseras ytterligare i Klimatkonventionen och Parisavtalet. \n"
                + " Klimatkonventionen är en global konvention med åtgärder för att stoppa klimatförändringarna.\n"
                + " Klimatkonventionen undertecknades vid FN:s konferens om miljö och utveckling i Rio 1992.\n"
                + " Till Klimatkonventionen hör Parisavtalet, ett globalt klimatavtal som trädde i kraft 2016.\n"
                + " Parisavtalet slår fast att den globala temperaturökningen ska begränsas till under två grader, med strävan efter att begränsa den till 1,5 grader.\n"
                + " Detta ska framförallt uppnås genom att minska utsläppen av växthusgaser. \n"
                + "  En annan del av avtalet handlar om att ge stöd till dem som drabbas av klimatförändringarnas effekter och öka möjligheterna till klimatanpassning.\n");
    }//GEN-LAST:event_LbMal13MouseClicked

    private void LbMal14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal14MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 14: HAV OCH MARINA RESURSER. \n"
                + " Världens hav – deras temperatur, kemi, strömmar och liv – driver globala system som gör jorden beboelig för mänskligheten.\n"
                + " Haven täcker 70 procent av vår planet och över tre miljarder människor är beroende av den marina och kustnära biologiska mångfalden för sin försörjning. \n"
                + " Hur vi hanterar våra hav är avgörande för mänskligheten som helhet och för att balansera effekterna av klimatförändringarna.\n"
                + " verfiske, försurning, gifter och föroreningar är några av de problem som drabbar våra hav idag.\n"
                + " Visste du till exempel att åtta miljoner ton plast hamnar i haven varje år? \n"
                + " Fortsätter det i denna takt kommer haven att bestå av mer plast än fisk år 2050.\n"
                + " Vi måste skydda våra hav och säkerställa hållbar användning av havsbaserade resurser och ekosystem. Vi har alltid behövt haven. \n"
                + " Nu behöver haven oss.\n");
    }//GEN-LAST:event_LbMal14MouseClicked

    private void LbMal15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal15MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 15: EKOSYSTEM OCH BIOLOGISKT MÅNGFALD. \n"
                + " Hållbara ekosystem och biologisk mångfald är grunden för vårt liv på jorden.\n"
                + " Att tillgodose mänsklighetens behov av livsmedel, energi, vatten, mineraler och råmaterial utan att skada den biologiska mångfalden \n "
                + " och säkerställa hållbart nyttjande ekosystemtjänster är en avgörande utmaning för vår överlevnad.\n"
                + " Ekosystem på land såsom skogar, våtmarker, torrmarker och berg utgör livsmiljöer för miljontals arter samtidigt som de renar luft och vatten.\n"
                + " Markförstöring och avskogning leder till ökade halter av växthusgaser och hotar såväl klimatet som djurarters överlevnad.\n"
                + " Visste du exempelvis att populationerna av vilda ryggradsdjur har minskat med 60 procent på 44 år?\n"
                + " Vi är alla en del av jordens ekosystem och spelar alla en viktig roll för att bevara livsmiljöer som säkerställer överlevnad av växt- och djurarter på land.\n");
    }//GEN-LAST:event_LbMal15MouseClicked

    private void LbMal16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal16MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 16: FREDLIGA OCH INKLUDERNADE SAMHÄLLEN. \n"
                + " Fredliga samhällen och frihet från våld utgör både ett mål och ett medel för hållbar utveckling.\n"
                + " Inkluderande, ansvarsfulla och rättvisa institutioner är grunden för en god samhällsstyrning fri från konflikter, korruption och våld.\n"
                + " Alla människor är lika inför lagen och ska ha lika tillgång till rättvisa och möjligheter att utöva inflytande och ansvarsutkrävande över beslutsfattande.\n"
                + " Inga varaktiga framsteg kan nås i en kontext präglad av konflikt och våld. \n"
                + " Våld innebär inte bara mänskligt lidande, det raserar också grunden för samhällets ekonomiska, miljömässiga och sociala utveckling\n"
                + " De länder som är drabbade av krig och utdragna konflikter är de länder som har svårast att lyfta sin befolkning ur fattigdom.\n"
                + " Att stärka rättsstatsprincipen och främja mänskliga rättigheter är nyckeln till fredliga, inkluderande och hållbara samhällen.\n");
    }//GEN-LAST:event_LbMal16MouseClicked

    private void LbMal17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbMal17MouseClicked
        JOptionPane.showMessageDialog(this, "MÅL 17: GENOMFÖRANDE OCH GLOBALT PARTNERSKAP. \n"
                + " Världen är idag mer sammankopplad än någonsin tidigare och Globala målen kan bara förverkligas genom globalt partnerskap och samarbete.\n"
                + " Genomförandet av målen kräver global solidaritet, kapacitetsutveckling och mobilisering av ekonomiska resurser för att säkerställa att inget land eller någon grupp lämnas utanför i utvecklingen.\n"
                + " Internationella investeringar och samordnad politik behövs för att säkerställa nyskapande teknisk utveckling, rättvis handel, tillförlitlig uppföljning och stöd vid humanitära kriser. \n"
                + "  Utbyte av kunskap, expertis, teknik och finansiella resurser är samtliga viktiga komponenter för att målen ska nås, i synnerhet för att tillgodose behoven hos de fattigaste och mest sårbara länderna.\n"
                + " Mål 17 utgör en verktygslåda för hur Globala målen ska kunna bli verklighet.\n");
    }//GEN-LAST:event_LbMal17MouseClicked

    private void LbTillGlobalaMalenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbTillGlobalaMalenMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI("https://globalamalen.se/"));
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Kunde inte öppna webbsidan.");
        }

    }//GEN-LAST:event_LbTillGlobalaMalenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label LbLarDigMer;
    private javax.swing.JLabel LbMal1;
    private javax.swing.JLabel LbMal10;
    private javax.swing.JLabel LbMal11;
    private javax.swing.JLabel LbMal12;
    private javax.swing.JLabel LbMal13;
    private javax.swing.JLabel LbMal14;
    private javax.swing.JLabel LbMal15;
    private javax.swing.JLabel LbMal16;
    private javax.swing.JLabel LbMal17;
    private javax.swing.JLabel LbMal2;
    private javax.swing.JLabel LbMal3;
    private javax.swing.JLabel LbMal4;
    private javax.swing.JLabel LbMal5;
    private javax.swing.JLabel LbMal6;
    private javax.swing.JLabel LbMal7;
    private javax.swing.JLabel LbMal8;
    private javax.swing.JLabel LbMal9;
    private java.awt.Label LbStartsida;
    private javax.swing.JLabel LbTillGlobalaMalen;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnLoggaUt_v2;
    private javax.swing.JButton btnMittKonto;
    private javax.swing.JButton btnPersonal;
    private javax.swing.JButton btnProjektAlla;
    private javax.swing.JButton btnProjektChef;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
