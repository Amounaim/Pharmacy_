/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

/**
 *
 * @author amiratechnologier
 */
import sun.audio.*;
import java.io.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.sql.*;
import java.text.SimpleDateFormat;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import project_java.ADDMED;
import project_java.MODMED;
import project_java.MODMED2;
import project_java.ViewCarte;
import project_java.javaconnect;
import project_java.login;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class ViewMeds extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form ViewMeds
     */
    public ViewMeds() {
        setUndecorated(true);
        initComponents();
        conn=javaconnect.ConnecrDb();
        Update_table();
        setLocationRelativeTo(null);
    }

    public void Update_table(){
        try{
            String sql = "select * from meds";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        tableMED.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public JLabel getCNLABEL() {
        return CNLABEL;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        VIEWMD1 = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        AddTocard = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Profile = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        CNLABEL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMED = new javax.swing.JTable();
        Search = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        ViewMedicine = new javax.swing.JButton();
        MusicB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Customer");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pharmacist.png"))); // NOI18N

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Dashbord");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        VIEWMD1.setBackground(new java.awt.Color(51, 51, 51));
        VIEWMD1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        VIEWMD1.setForeground(new java.awt.Color(204, 204, 204));
        VIEWMD1.setText("View Medicine");
        VIEWMD1.setBorder(null);
        VIEWMD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VIEWMD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIEWMD1ActionPerformed(evt);
            }
        });

        LogOut.setBackground(new java.awt.Color(51, 51, 51));
        LogOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LogOut.setForeground(new java.awt.Color(204, 204, 204));
        LogOut.setText("Log Out");
        LogOut.setBorder(null);
        LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        AddTocard.setBackground(new java.awt.Color(51, 51, 51));
        AddTocard.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AddTocard.setForeground(new java.awt.Color(204, 204, 204));
        AddTocard.setText("Add to Card");
        AddTocard.setBorder(null);
        AddTocard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddTocard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTocardActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/layout.png"))); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil.png"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (1).png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pharmacy (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MYPHARMACY");

        Profile.setBackground(new java.awt.Color(51, 51, 51));
        Profile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Profile.setForeground(new java.awt.Color(204, 204, 204));
        Profile.setText("Profile");
        Profile.setBorder(null);
        Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/complaint.png"))); // NOI18N

        CNLABEL.setForeground(new java.awt.Color(255, 255, 255));
        CNLABEL.setText("USERNAME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(CNLABEL)
                                        .addGap(108, 108, 108))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel25)
                                                        .addComponent(jLabel28))
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel31))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(VIEWMD1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                    .addComponent(AddTocard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(67, 67, 67)))))
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel32)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CNLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VIEWMD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddTocard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(4, 4, 4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(42, 42, 42)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 310, 590);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        Close.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(1101, 6, 46, 36);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1110, 70, 70, 70);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1080, 520, 70, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1100, 440, 70, 70);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1090, 250, 70, 70);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1110, 370, 70, 70);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1110, 160, 70, 70);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(1110, 70, 70, 70);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(1010, 530, 70, 70);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1010, 530, 70, 70);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("View Medicine");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 60, 230, 60);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tableMED.setBackground(new java.awt.Color(102, 153, 255));
        tableMED.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableMED.setForeground(new java.awt.Color(51, 51, 51));
        tableMED.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12/1/2018", "Expresso POS", "Kenya", null},
                {"12/1/2018", "ROM Gen", "US", null},
                {"12/1/2018", "Text Ed", "UK", null},
                {"12/1/2018", "Mola Con", "China", null}
            },
            new String [] {
                "Date", "Item", "Location", "Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableMED.setGridColor(new java.awt.Color(255, 255, 255));
        tableMED.setRowHeight(22);
        tableMED.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMEDMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tableMEDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMEDMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableMED);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(350, 200, 690, 280);

        Search.setBackground(new java.awt.Color(102, 102, 102));
        Search.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchKeyPressed(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(550, 140, 300, 20);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifying-glass.png"))); // NOI18N
        jPanel1.add(jLabel35);
        jLabel35.setBounds(510, 130, 32, 32);

        ViewMedicine.setBackground(new java.awt.Color(0, 255, 0));
        ViewMedicine.setText("View Medicine");
        ViewMedicine.setBorder(null);
        ViewMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMedicineActionPerformed(evt);
            }
        });
        jPanel1.add(ViewMedicine);
        ViewMedicine.setBounds(580, 510, 250, 40);

        MusicB.setBackground(new java.awt.Color(102, 204, 255));
        MusicB.setText("Music");
        MusicB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicBActionPerformed(evt);
            }
        });
        jPanel1.add(MusicB);
        MusicB.setBounds(950, 140, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void VIEWMD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIEWMD1ActionPerformed
        setVisible(false);
        ViewMeds VM = new ViewMeds();
        VM.CNLABEL.setText(CNLABEL.getText());
        VM.setVisible(true);
    }//GEN-LAST:event_VIEWMD1ActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        login lg = new login();
        lg.setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void AddTocardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTocardActionPerformed
        setVisible(false);
        ViewCarte Ct= new  ViewCarte();
        Ct.getCstNom().setText(CNLABEL.getText());
        Ct.setVisible(true);
       
    }//GEN-LAST:event_AddTocardActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
        setVisible(false);
        CustomerProfile Ct= new  CustomerProfile();
        Ct.getJLBUSER().setText(CNLABEL.getText());
        Ct.setVisible(true);
        
    }//GEN-LAST:event_ProfileActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseMouseClicked

    private void tableMEDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMEDMouseClicked
           
    }//GEN-LAST:event_tableMEDMouseClicked

    private void tableMEDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMEDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMEDMouseExited

    private void tableMEDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMEDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMEDMousePressed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

    }//GEN-LAST:event_SearchActionPerformed

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed
        try{
            String h='%'+Search.getText()+'%';
            String sql = "select * from meds where med_name  like '"+h+"'";
            pst=conn.prepareStatement(sql);
            //pst.setString(1,jTextFieldSearch.getText());
            //JOptionPane.showMessageDialog(null,jTextFieldSearch.getText());
            rs=pst.executeQuery();
            tableMED.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "not selected "+e);
        }

    }//GEN-LAST:event_SearchKeyPressed

    private void ViewMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMedicineActionPerformed
         try{
            MODMEDC md=new MODMEDC();
            int row =tableMED.getSelectedRow();
            String Table_click=(tableMED.getModel().getValueAt(row, 0).toString());
            String sql = "select * from meds where med_id='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("med_id");
                md.getjTextFieldMEDID().setText(add1);
                String add2=rs.getString("med_name");
                md.getjTextFieldMEDNAME().setText(add2);
                String add3=rs.getString("med_number");
                md.getjTextFieldMEDNUMB().setText(add3);
                String add4=rs.getString("med_man");
                md.getjTextFieldDATEMAN().setText(add4);
                String add5=rs.getString("med_exp");
                md.getjTextFieldDATEEXP().setText(add5);
                String add6=rs.getString("med_qt");
                md.getjTextFieldQUAN().setText(add6);
                String add7=rs.getString("med_price");
                md.getjTextFieldPRC().setText(add7);
                md.getjLabel1().setText(CNLABEL.getText());// nakhdo
                md.setVisible(true );
               // MODMEDC md2=new MODMEDC();
               /* JOptionPane.showMessageDialog(null, md.getjTextFieldDATEMAN().getText());
                
                ViewCarte  vct=new ViewCarte();
           
            DefaultTableModel model=(DefaultTableModel)vct.getTable().getModel();
            model.addRow(new Object[]{md.getjTextFieldMEDID().getText(),md.getjTextFieldMEDNAME().getText(),
            md.getjTextFieldMEDNUMB().getText(),md.getjTextFieldDATEMAN().getText(),
            md.getjTextFieldDATEEXP().getText(),md.getjTextFieldPRC().getText()});
            vct.setVisible(true); */
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_ViewMedicineActionPerformed

    private void MusicBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicBActionPerformed
       
       /* InputStream in;
        try{
            in=new FileInputStream(new File("C:\\Users\\amiratechnologier\\Music\\epigRca.mp3"));
            AudioStream audios =new AudioStream(in);
            AudioPlayer.player.start(audios);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        } */
         try{
             JFXPanel j=new JFXPanel();
             String uri =new File("C:\\Users\\amiratechnologier\\Music\\epigRca.mp3").toURI().toString();
             new MediaPlayer(new Media(uri)).play();
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_MusicBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMeds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMeds().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTocard;
    private javax.swing.JLabel CNLABEL;
    private javax.swing.JLabel Close;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton MusicB;
    private javax.swing.JButton Profile;
    private javax.swing.JTextField Search;
    private javax.swing.JButton VIEWMD1;
    private javax.swing.JButton ViewMedicine;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMED;
    // End of variables declaration//GEN-END:variables
}
