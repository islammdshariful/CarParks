/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

import database.DatabaseManagement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import systemView.View;
//import systemView.View;
/**
 *
 * @author Aspire
 */
public class Park extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
            
    public  JTextField ss1;
    public  JTextField ss2;
    public  JTextField ss3;
    public  JTextField ss4;
    public  JTextField ss5;
    public  JTextField ss6;
    public  JTextField ss7;
    public  JTextField ss8;
    public  JTextField ss9;
    public  JTextField ss10;
    public  JTextField ss11;
    public  JTextField ss12;
    public  JTextField ss13;
    public  JTextField ss14;
    public  JTextField ss15;
    public  JTextField ss16;
    public  JTextField ss17;
    public  JTextField ss18;
    public  JTextField ss19;
    public  JTextField ss20;
    public  JTextField ss21;
    public  JTextField ss22;    
    public  JTextField ss23;
    public  JTextField ss24; 
    public  JTextField ss25;
    public  JTextField ss26;    
    public  JTextField ss27;
    public  JTextField ss28;     
    public  JTextField ss29;
    public  JTextField ss30;    
    public  JTextField ss31;
    public  JTextField ss32;    
    public  JTextField ss33;
    public  JTextField ss34; 
    public  JTextField ss35;
    public  JTextField ss36;    
    public  JTextField ss37;
    public  JTextField ss38;     
    public  JTextField ss39;
    public  JTextField ss40; 
    public  JTextField ss41;
    public  JTextField ss42;    
    public  JTextField ss43;
    public  JTextField ss44; 
    public  JTextField ss45;
    public  JTextField ss46;    
    public  JTextField ss47;
    public  JTextField ss48;     
    public  JTextField ss49;
    public  JTextField ss50; 
    public  JTextField ss51;
    public  JTextField ss52;    
    public  JTextField ss53;
    public  JTextField ss54; 
    public  JTextField ss55;
    public  JTextField ss56;    
    public  JTextField ss57;
    public  JTextField ss58;     
    public  JTextField ss59;
    public  JTextField ss60; 
    public  JTextField ss61;
    public  JTextField ss62;    
    public  JTextField ss63;
    public  JTextField ss64; 
    public  JTextField ss65;
    public  JTextField ss66;    
    public  JTextField ss67;
    public  JTextField ss68;     
    public  JTextField ss69;
    public  JTextField ss70; 
    public  JTextField ss71;
    public  JTextField ss72;    
    public  JTextField ss73;
    public  JTextField ss74; 
    public  JTextField ss75;
    public  JTextField ss76;    
    public  JTextField ss77;
    public  JTextField ss78;     
    public  JTextField ss79;
    public  JTextField ss80; 
    public  JTextField ss81;
    public  JTextField ss82;    
    public  JTextField ss83;
    public  JTextField ss84; 
    public  JTextField ss85;
    public  JTextField ss86;    
    public  JTextField ss87;
    public  JTextField ss88;     
    public  JTextField ss89;
    public  JTextField ss90; 
    public  JTextField ss91;
    public  JTextField ss92;    
    public  JTextField ss93;
    public  JTextField ss94; 
    public  JTextField ss95;
    public  JTextField ss96;    
    public  JTextField ss97;
    public  JTextField ss98;     
    public  JTextField ss99;
    public  JTextField ss100; 
    public  JTextField ss101; 
    public  JTextField ss102; 
    public  JTextField ss103; 
    public  JTextField ss104; 
    public  JTextField ss105; 
    public  JTextField ss106; 
    public  JTextField ss107; 
    public  JTextField ss108; 
    public  JTextField ss109; 
    public  JTextField ss110; 
    public  JTextField ss111; 
    public  JTextField ss112; 
    public  JTextField ss113; 
    public  JTextField ss114; 
    public  JTextField ss115; 
    public  JTextField ss116; 
    public  JTextField ss117; 
    public  JTextField ss118; 
    public  JTextField ss119; 
    public  JTextField ss120;
    public  JTextField ss121;
    public  JTextField ss122;
    public  JTextField ss123;
    public  JTextField ss124;
    public  JTextField ss125;
    public  JTextField ss126;
    public  JTextField ss127;
    public  JTextField ss128;
    public  JTextField ss129;
    public  JTextField ss130;
    public  JTextField ss131; 
    public  JTextField ss132; 
    public  JTextField ss133; 
    public  JTextField ss134; 
    public  JTextField ss135; 
    public  JTextField ss136; 
    public  JTextField ss137; 
    public  JTextField ss138; 
    public  JTextField ss139; 
    public  JTextField ss140; 
    public  JTextField ss141; 
    public  JTextField ss142; 
    public  JTextField ss143; 
    public  JTextField ss144; 
    public  JTextField ss145; 
    public  JTextField ss146; 
    public  JTextField ss147; 
    public  JTextField ss148; 
    public  JTextField ss149; 
    public  JTextField ss150; 
    public  JTextField ss151; 
    public  JTextField ss152; 
    public  JTextField ss153; 
    public  JTextField ss154;

    public Park() {
        initComponents();
    }

    
    public Park(JTextField s1, JTextField s2, JTextField s3, JTextField s4, JTextField s5, JTextField s6, JTextField s7,
             JTextField s8, JTextField s9, JTextField s10, JTextField s11, JTextField s12, JTextField s13, JTextField s14,
              JTextField s15, JTextField s16, JTextField s17, JTextField s18, JTextField s19, JTextField s20,
                 JTextField s21, JTextField s22, JTextField s23, JTextField s24, JTextField s25, JTextField s26, JTextField s27,
                  JTextField s28, JTextField s29, JTextField s30, JTextField s31, JTextField s32, JTextField s33, JTextField s34,
                   JTextField s35, JTextField s36, JTextField s37, JTextField s38, JTextField s39, JTextField s40,
                 JTextField s41, JTextField s42, JTextField s43, JTextField s44, JTextField s45, JTextField s46, JTextField s47,
                  JTextField s48, JTextField s49, JTextField s50, JTextField s51, JTextField s52, JTextField s53, JTextField s54,
                   JTextField s55, JTextField s56, JTextField s57, JTextField s58, JTextField s59, JTextField s60,
                 JTextField s61, JTextField s62, JTextField s63, JTextField s64, JTextField s65, JTextField s66, JTextField s67,
                  JTextField s68, JTextField s69, JTextField s70, JTextField s71, JTextField s72, JTextField s73, JTextField s74,
                   JTextField s75, JTextField s76, JTextField s77, JTextField s78, JTextField s79, JTextField s80,
                 JTextField s81, JTextField s82, JTextField s83, JTextField s84, JTextField s85, JTextField s86, JTextField s87,
                  JTextField s88, JTextField s89, JTextField s90, JTextField s91, JTextField s92, JTextField s93, JTextField s94,
                   JTextField s95, JTextField s96, JTextField s97, JTextField s98, JTextField s99, JTextField s100,
                 JTextField s101, JTextField s102, JTextField s103, JTextField s104, JTextField s105, JTextField s106, JTextField s107,
                  JTextField s108, JTextField s109, JTextField s110, JTextField s111, JTextField s112, JTextField s113, JTextField s114,
                   JTextField s115, JTextField s116, JTextField s117, JTextField s118, JTextField s119, JTextField s120,
                   
                 JTextField s121, JTextField s122, JTextField s123, JTextField s124, JTextField s125, JTextField s126, JTextField s127, JTextField s128,
                  JTextField s129, JTextField s130, JTextField s131, JTextField s132, JTextField s133, JTextField s134, JTextField s135, JTextField s136,
                   JTextField s137, JTextField s138, JTextField s139, JTextField s140,
                 JTextField s141, JTextField s142, JTextField s143, JTextField s144, JTextField s145, JTextField s146, JTextField s147,
                  JTextField s148, JTextField s149, JTextField s150, JTextField s151, JTextField s152, JTextField s153, JTextField s154) {
        initComponents();
        this.ss1 = s1;
        this.ss2 = s2; 
        this.ss3 = s3; 
        this.ss4 = s4; 
        this.ss5 = s5; 
        this.ss6 = s6; 
        this.ss7 = s7; 
        this.ss8 = s8; 
        this.ss9 = s9;
        this.ss10 = s10; 
        this.ss11 = s11;
        this.ss12 = s12; 
        this.ss13 = s13; 
        this.ss14 = s14; 
        this.ss15 = s15; 
        this.ss16 = s16; 
        this.ss17 = s17; 
        this.ss18 = s18; 
        this.ss19 = s19;
        this.ss20 = s20; 
        this.ss21 = s21;
        this.ss22 = s22; 
        this.ss23 = s23; 
        this.ss24 = s24; 
        this.ss25 = s25; 
        this.ss26 = s26; 
        this.ss27 = s27; 
        this.ss28 = s28; 
        this.ss29 = s29;
        this.ss30 = s30; 
        this.ss31 = s31;
        this.ss32 = s32; 
        this.ss33 = s33; 
        this.ss34 = s34; 
        this.ss35 = s35; 
        this.ss36 = s36; 
        this.ss37 = s37; 
        this.ss38 = s38; 
        this.ss39 = s39;
        this.ss40 = s40; 
        this.ss41 = s41;
        this.ss42 = s42; 
        this.ss43 = s43; 
        this.ss44 = s44; 
        this.ss45 = s45; 
        this.ss46 = s46; 
        this.ss47 = s47; 
        this.ss48 = s48; 
        this.ss49 = s49;
        this.ss50 = s50; 
        this.ss51 = s51;
        this.ss52 = s52; 
        this.ss53 = s53; 
        this.ss54 = s54; 
        this.ss55 = s55; 
        this.ss56 = s56; 
        this.ss57 = s57; 
        this.ss58 = s58; 
        this.ss59 = s59;
        this.ss60 = s60; 
        this.ss61 = s61;
        this.ss62 = s62; 
        this.ss63 = s63; 
        this.ss64 = s64; 
        this.ss65 = s65; 
        this.ss66 = s66; 
        this.ss67 = s67; 
        this.ss68 = s68; 
        this.ss69 = s69;
        this.ss70 = s70;
        this.ss71 = s71;
        this.ss72 = s72; 
        this.ss73 = s73; 
        this.ss74 = s74; 
        this.ss75 = s75; 
        this.ss76 = s76; 
        this.ss77 = s77; 
        this.ss78 = s78; 
        this.ss79 = s79;
        this.ss80 = s80; 
        this.ss81 = s81;
        this.ss82 = s82; 
        this.ss83 = s83; 
        this.ss84 = s84; 
        this.ss85 = s85; 
        this.ss86 = s86; 
        this.ss87 = s87; 
        this.ss88 = s88; 
        this.ss89 = s89;
        this.ss90 = s90; 
        this.ss91 = s91;
        this.ss92 = s92; 
        this.ss93 = s93; 
        this.ss94 = s94; 
        this.ss95 = s95; 
        this.ss96 = s96; 
        this.ss97 = s97; 
        this.ss98 = s98; 
        this.ss99 = s99;
        this.ss100 = s100; 
        this.ss101 = s101;
        this.ss102 = s102; 
        this.ss103 = s103; 
        this.ss104 = s104; 
        this.ss105 = s105; 
        this.ss106 = s106; 
        this.ss107 = s107; 
        this.ss108 = s108; 
        this.ss109 = s109;
        this.ss110 = s110; 
        this.ss111 = s111;
        this.ss112 = s112; 
        this.ss113 = s113; 
        this.ss114 = s114; 
        this.ss115 = s115; 
        this.ss116 = s116; 
        this.ss117 = s117; 
        this.ss118 = s118; 
        this.ss119 = s119;
        this.ss120 = s120; 
        this.ss121 = s121;
        this.ss122 = s122; 
        this.ss123 = s123; 
        this.ss124 = s124; 
        this.ss125 = s125; 
        this.ss126 = s126; 
        this.ss127 = s127; 
        this.ss128 = s128; 
        this.ss129 = s129;
        this.ss130 = s130; 
        this.ss131 = s131;
        this.ss132 = s132; 
        this.ss133 = s133; 
        this.ss134 = s134; 
        this.ss135 = s135; 
        this.ss136 = s136; 
        this.ss137 = s137; 
        this.ss138 = s138; 
        this.ss139 = s139;
        this.ss140 = s140; 
        this.ss141 = s141;
        this.ss142 = s142; 
        this.ss143 = s143; 
        this.ss144 = s144; 
        this.ss145 = s145; 
        this.ss146 = s146; 
        this.ss147 = s147; 
        this.ss148 = s148; 
        this.ss149 = s149;
        this.ss150 = s150; 
        this.ss151 = s151;
        this.ss152 = s152; 
        this.ss153 = s153; 
        this.ss154 = s154;
    }
    
    DatabaseManagement database = new DatabaseManagement();
    View v = new View();
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookSlot = new javax.swing.JPanel();
        IDLabel = new javax.swing.JLabel();
        SlotLabel = new javax.swing.JLabel();
        MemberID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        BookButton = new javax.swing.JButton();
        SlotBox = new javax.swing.JComboBox<>();
        SlotTime = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Park");
        setResizable(false);

        BookSlot.setBackground(new java.awt.Color(86, 101, 115));
        BookSlot.setPreferredSize(new java.awt.Dimension(600, 430));

        IDLabel.setForeground(new java.awt.Color(255, 255, 255));
        IDLabel.setText("ID:");

        SlotLabel.setForeground(new java.awt.Color(255, 255, 255));
        SlotLabel.setText("Slot:");

        MemberID.setBorder(null);
        MemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Slot");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeLabel.setText("Time:");

        ResetButton.setBackground(new java.awt.Color(86, 101, 115));
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restart-icon-18-16.png"))); // NOI18N
        ResetButton.setBorder(null);
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        BookButton.setBackground(new java.awt.Color(204, 255, 204));
        BookButton.setForeground(new java.awt.Color(255, 255, 255));
        BookButton.setText("Book");
        BookButton.setBorder(null);
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        SlotBox.setBackground(new java.awt.Color(86, 101, 115));
        SlotBox.setForeground(new java.awt.Color(255, 255, 255));
        SlotBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154" }));

        SlotTime.setModel(new SpinnerDateModel());
        //JSpinner.DateEditor de = new JSpinner.DateEditor(SlotTime, "HH:mm");

        javax.swing.GroupLayout BookSlotLayout = new javax.swing.GroupLayout(BookSlot);
        BookSlot.setLayout(BookSlotLayout);
        BookSlotLayout.setHorizontalGroup(
            BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookSlotLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SlotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeLabel))
                .addGap(47, 47, 47)
                .addGroup(BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookSlotLayout.createSequentialGroup()
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BookSlotLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59))
                    .addComponent(MemberID, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(SlotBox, 0, 135, Short.MAX_VALUE)
                    .addComponent(SlotTime))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        BookSlotLayout.setVerticalGroup(
            BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookSlotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SlotLabel)
                    .addComponent(SlotBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeLabel)
                    .addComponent(SlotTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(BookSlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(BookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookSlot, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookSlot, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(321, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberIDActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
      
        MemberID.setText(""); 
        SlotBox.setSelectedIndex(0);
        
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed

        String bSlot = SlotBox.getSelectedItem().toString();
        String bID = MemberID.getText();
        String Slottime = SlotTime.getValue().toString();

        Boolean flag = false;
        Boolean flag2 = false;
        ArrayList carlist = new ArrayList();
        ArrayList carhistory = new ArrayList();
        
        String query1 = "select *  from carlist where ID = '" + bID + "';";
        ResultSet  result1 = database.execQuery(query1);

        String query2 = "select * from member where id ='" + bID + "';";
        ResultSet  result2 = database.execQuery(query2);
        
        try{
            while(result1.next()){
            String ID2 = result1.getString("ID");
            flag2 = true;
        }
        }catch(HeadlessException | SQLException e){
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
            

        Boolean empty =  bID.isEmpty() || bSlot.isEmpty() || Slottime.isEmpty();
        if(empty){
            JOptionPane.showMessageDialog(rootPane,"Plase fill all the feilds"," Error !",JOptionPane . ERROR_MESSAGE);
        }
        else if(flag2){
                   JOptionPane.showMessageDialog(rootPane,"Car already available in the park"," Error !",JOptionPane . ERROR_MESSAGE);
        }
        else{
            try{       
                while(result2.next()){
                    
                    String Name = result2.getString("Name");
                    String ID = result2.getString("ID");
                    String Email = result2.getString("EmailAddress");
                    String CarID = result2.getString("CarID");
                    String CarName = result2.getString("CarName");
                    String CarModel = result2.getString("CarModel");
                    String CarColor = result2.getString("CarColor");

                    flag = true;

                    carlist.add(bSlot);
                    carlist.add(Name);
                    carlist.add(ID);
                    carlist.add(CarID);
                    carlist.add(CarName);
                    carlist.add(CarModel);
                    carlist.add(CarColor);
                    carlist.add(Slottime);
                    
                    carhistory.add(bSlot);
                    carhistory.add(Name);
                    carhistory.add(ID);
                    carhistory.add(Email);
                    carhistory.add(CarID);
                    carhistory.add(CarName);
                    carhistory.add(CarModel);
                    carhistory.add(CarColor);
                    carhistory.add(Slottime);
                    
                    
                    switch(bSlot){
                        case "1" : ss1.setBackground(new Color(231,76,60));
                                    break;
                        case "2" : ss2.setBackground(new Color(231,76,60));
                                    break;
                        case "3" : ss3.setBackground(new Color(231,76,60));
                                    break;
                        case "4" : ss4.setBackground(new Color(231,76,60));
                                    break;
                        case "5" : ss5.setBackground(new Color(231,76,60));
                                    break;
                        case "6" : ss6.setBackground(new Color(231,76,60));
                                    break;
                        case "7" : ss7.setBackground(new Color(231,76,60));
                                    break;
                        case "8" : ss8.setBackground(new Color(231,76,60));
                                    break;
                        case "9" : ss9.setBackground(new Color(231,76,60));
                                    break;
                        case "10" : ss10.setBackground(new Color(231,76,60));
                                    break;
                        case "11" : ss11.setBackground(new Color(231,76,60));
                                    break;
                        case "12" : ss12.setBackground(new Color(231,76,60));
                                    break;
                        case "13" : ss13.setBackground(new Color(231,76,60));
                                    break;
                        case "14" : ss14.setBackground(new Color(231,76,60));
                                    break;
                        case "15" : ss15.setBackground(new Color(231,76,60));
                                    break;
                        case "16" : ss16.setBackground(new Color(231,76,60));
                                    break;
                        case "17" : ss17.setBackground(new Color(231,76,60));
                                    break;
                        case "18" : ss18.setBackground(new Color(231,76,60));
                                    break;
                        case "19" : ss19.setBackground(new Color(231,76,60));
                                    break;
                        case "20" : ss20.setBackground(new Color(231,76,60));
                                    break;
                        case "21" : ss21.setBackground(new Color(231,76,60));
                                    break;
                        case "22" : ss22.setBackground(new Color(231,76,60));
                                    break; 
                        case "23" : ss23.setBackground(new Color(231,76,60));
                                    break; 
                        case "24" : ss24.setBackground(new Color(231,76,60));
                                    break; 
                        case "25" : ss25.setBackground(new Color(231,76,60));
                                    break; 
                        case "26" : ss26.setBackground(new Color(231,76,60));
                                    break; 
                        case "27" : ss27.setBackground(new Color(231,76,60));
                                    break; 
                        case "28" : ss28.setBackground(new Color(231,76,60));
                                    break; 
                        case "29" : ss29.setBackground(new Color(231,76,60));
                                    break; 
                        case "30" : ss30.setBackground(new Color(231,76,60));
                                    break;  
                        case "31" : ss31.setBackground(new Color(231,76,60));
                                    break;
                        case "32" : ss32.setBackground(new Color(231,76,60));
                                    break; 
                        case "33" : ss33.setBackground(new Color(231,76,60));
                                    break; 
                        case "34" : ss34.setBackground(new Color(231,76,60));
                                    break; 
                        case "35" : ss35.setBackground(new Color(231,76,60));
                                    break; 
                        case "36" : ss36.setBackground(new Color(231,76,60));
                                    break; 
                        case "37" : ss37.setBackground(new Color(231,76,60));
                                    break; 
                        case "38" : ss38.setBackground(new Color(231,76,60));
                                    break; 
                        case "39" : ss39.setBackground(new Color(231,76,60));
                                    break; 
                        case "40" : ss40.setBackground(new Color(231,76,60));
                                    break; 
                        case "41" : ss41.setBackground(new Color(231,76,60));
                                    break;
                        case "42" : ss42.setBackground(new Color(231,76,60));
                                    break; 
                        case "43" : ss43.setBackground(new Color(231,76,60));
                                    break; 
                        case "44" : ss44.setBackground(new Color(231,76,60));
                                    break; 
                        case "45" : ss45.setBackground(new Color(231,76,60));
                                    break; 
                        case "46" : ss46.setBackground(new Color(231,76,60));
                                    break; 
                        case "47" : ss47.setBackground(new Color(231,76,60));
                                    break; 
                        case "48" : ss48.setBackground(new Color(231,76,60));
                                    break; 
                        case "49" : ss49.setBackground(new Color(231,76,60));
                                    break; 
                        case "50" : ss50.setBackground(new Color(231,76,60));
                                    break;       
                        case "51" : ss51.setBackground(new Color(231,76,60));
                                    break;
                        case "52" : ss52.setBackground(new Color(231,76,60));
                                    break; 
                        case "53" : ss53.setBackground(new Color(231,76,60));
                                    break; 
                        case "54" : ss54.setBackground(new Color(231,76,60));
                                    break; 
                        case "55" : ss55.setBackground(new Color(231,76,60));
                                    break; 
                        case "56" : ss56.setBackground(new Color(231,76,60));
                                    break; 
                        case "57" : ss57.setBackground(new Color(231,76,60));
                                    break; 
                        case "58" : ss58.setBackground(new Color(231,76,60));
                                    break; 
                        case "59" : ss59.setBackground(new Color(231,76,60));
                                    break; 
                        case "60" : ss60.setBackground(new Color(231,76,60));
                                    break;  
                        case "61" : ss61.setBackground(new Color(231,76,60));
                                    break;
                        case "62" : ss62.setBackground(new Color(231,76,60));
                                    break; 
                        case "63" : ss63.setBackground(new Color(231,76,60));
                                    break; 
                        case "64" : ss64.setBackground(new Color(231,76,60));
                                    break; 
                        case "65" : ss65.setBackground(new Color(231,76,60));
                                    break; 
                        case "66" : ss66.setBackground(new Color(231,76,60));
                                    break; 
                        case "67" : ss67.setBackground(new Color(231,76,60));
                                    break; 
                        case "68" : ss68.setBackground(new Color(231,76,60));
                                    break; 
                        case "69" : ss69.setBackground(new Color(231,76,60));
                                    break; 
                        case "70" : ss70.setBackground(new Color(231,76,60));
                                    break;   
                        case "71" : ss71.setBackground(new Color(231,76,60));
                                    break;
                        case "72" : ss72.setBackground(new Color(231,76,60));
                                    break; 
                        case "73" : ss73.setBackground(new Color(231,76,60));
                                    break; 
                        case "74" : ss74.setBackground(new Color(231,76,60));
                                    break; 
                        case "75" : ss75.setBackground(new Color(231,76,60));
                                    break; 
                        case "76" : ss76.setBackground(new Color(231,76,60));
                                    break; 
                        case "77" : ss77.setBackground(new Color(231,76,60));
                                    break; 
                        case "78" : ss78.setBackground(new Color(231,76,60));
                                    break; 
                        case "79" : ss79.setBackground(new Color(231,76,60));
                                    break; 
                        case "80" : ss80.setBackground(new Color(231,76,60));
                                    break;   
                        case "81" : ss81.setBackground(new Color(231,76,60));
                                    break;
                        case "82" : ss82.setBackground(new Color(231,76,60));
                                    break; 
                        case "83" : ss83.setBackground(new Color(231,76,60));
                                    break; 
                        case "84" : ss84.setBackground(new Color(231,76,60));
                                    break; 
                        case "85" : ss85.setBackground(new Color(231,76,60));
                                    break; 
                        case "86" : ss86.setBackground(new Color(231,76,60));
                                    break; 
                        case "87" : ss87.setBackground(new Color(231,76,60));
                                    break; 
                        case "88" : ss88.setBackground(new Color(231,76,60));
                                    break; 
                        case "89" : ss89.setBackground(new Color(231,76,60));
                                    break; 
                        case "90" : ss90.setBackground(new Color(231,76,60));
                                    break;    
                        case "91" : ss91.setBackground(new Color(231,76,60));
                                    break;
                        case "92" : ss92.setBackground(new Color(231,76,60));
                                    break; 
                        case "93" : ss93.setBackground(new Color(231,76,60));
                                    break; 
                        case "94" : ss94.setBackground(new Color(231,76,60));
                                    break; 
                        case "95" : ss95.setBackground(new Color(231,76,60));
                                    break; 
                        case "96" : ss96.setBackground(new Color(231,76,60));
                                    break; 
                        case "97" : ss97.setBackground(new Color(231,76,60));
                                    break; 
                        case "98" : ss98.setBackground(new Color(231,76,60));
                                    break; 
                        case "99" : ss99.setBackground(new Color(231,76,60));
                                    break; 
                        case "100" : ss100.setBackground(new Color(231,76,60));
                                    break; 
                        case "101" : ss101.setBackground(new Color(231,76,60));
                                    break;
                        case "102" : ss102.setBackground(new Color(231,76,60));
                                    break; 
                        case "103" : ss103.setBackground(new Color(231,76,60));
                                    break; 
                        case "104" : ss104.setBackground(new Color(231,76,60));
                                    break; 
                        case "105" : ss105.setBackground(new Color(231,76,60));
                                    break; 
                        case "106" : ss106.setBackground(new Color(231,76,60));
                                    break; 
                        case "107" : ss107.setBackground(new Color(231,76,60));
                                    break; 
                        case "108" : ss108.setBackground(new Color(231,76,60));
                                    break; 
                        case "109" : ss109.setBackground(new Color(231,76,60));
                                    break; 
                        case "110" : ss110.setBackground(new Color(231,76,60));
                                    break;    
                        case "111" : ss111.setBackground(new Color(231,76,60));
                                    break;
                        case "112" : ss112.setBackground(new Color(231,76,60));
                                    break;
                        case "113" : ss113.setBackground(new Color(231,76,60));
                                    break;
                        case "114" : ss114.setBackground(new Color(231,76,60));
                                    break;    
                        case "115" : ss115.setBackground(new Color(231,76,60));
                                    break;
                        case "116" : ss116.setBackground(new Color(231,76,60));
                                    break;
                        case "117" : ss117.setBackground(new Color(231,76,60));
                                    break;
                        case "118" : ss118.setBackground(new Color(231,76,60));
                                    break;    
                        case "119" : ss119.setBackground(new Color(231,76,60));
                                    break;
                        case "120" : ss120.setBackground(new Color(231,76,60));
                                    break;
                        case "121" : ss121.setBackground(new Color(231,76,60));
                                    break;
                        case "122" : ss122.setBackground(new Color(231,76,60));
                                    break;
                        case "123" : ss123.setBackground(new Color(231,76,60));
                                    break;
                        case "124" : ss124.setBackground(new Color(231,76,60));
                                    break;
                        case "125" : ss125.setBackground(new Color(231,76,60));
                                    break;
                        case "126" : ss126.setBackground(new Color(231,76,60));
                                    break;
                        case "127" : ss127.setBackground(new Color(231,76,60));
                                    break;
                        case "128" : ss128.setBackground(new Color(231,76,60));
                                    break;
                        case "129" : ss129.setBackground(new Color(231,76,60));
                                    break;
                        case "130" : ss130.setBackground(new Color(231,76,60));
                                    break;
                        case "131" : ss131.setBackground(new Color(231,76,60));
                                    break;
                        case "132" : ss132.setBackground(new Color(231,76,60));
                                    break;
                        case "133" : ss133.setBackground(new Color(231,76,60));
                                    break;
                        case "134" : ss134.setBackground(new Color(231,76,60));
                                    break;
                        case "135" : ss135.setBackground(new Color(231,76,60));
                                    break;
                        case "136" : ss136.setBackground(new Color(231,76,60));
                                    break;
                        case "137" : ss137.setBackground(new Color(231,76,60));
                                    break;
                        case "138" : ss138.setBackground(new Color(231,76,60));
                                    break;
                        case "139" : ss139.setBackground(new Color(231,76,60));
                                    break;
                        case "140" : ss140.setBackground(new Color(231,76,60));
                                    break;
                        case "141" : ss141.setBackground(new Color(231,76,60));
                                    break;
                        case "142" : ss142.setBackground(new Color(231,76,60));
                                    break;
                        case "143" : ss143.setBackground(new Color(231,76,60));
                                    break;
                        case "144" : ss144.setBackground(new Color(231,76,60));
                                    break;
                        case "145" : ss145.setBackground(new Color(231,76,60));
                                    break;
                        case "146" : ss146.setBackground(new Color(231,76,60));
                                    break;
                        case "147" : ss147.setBackground(new Color(231,76,60));
                                    break;
                        case "148" : ss148.setBackground(new Color(231,76,60));
                                    break;
                        case "149" : ss149.setBackground(new Color(231,76,60));
                                    break;
                        case "150" : ss150.setBackground(new Color(231,76,60));
                                    break;
                        case "151" : ss151.setBackground(new Color(231,76,60));
                                    break;
                        case "152" : ss152.setBackground(new Color(231,76,60));
                                    break;
                        case "153" : ss153.setBackground(new Color(231,76,60));
                                    break;
                        case "154" : ss154.setBackground(new Color(231,76,60));
                                    break;
                    }       
                }
                if(!flag){
                    JOptionPane.showMessageDialog(rootPane,"No such type member  available"," Error !",JOptionPane . ERROR_MESSAGE);
                }else{
                    database.InsertIntoCarList(carlist);
                    database.InsertIntoCarHistory(carhistory);
                    System.out.println(carlist);
                }

            }catch(HeadlessException | SQLException e){
                System.out.println("Error: " + e);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Park.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Park().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookButton;
    private javax.swing.JPanel BookSlot;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField MemberID;
    private javax.swing.JButton ResetButton;
    private javax.swing.JComboBox<String> SlotBox;
    private javax.swing.JLabel SlotLabel;
    private javax.swing.JSpinner SlotTime;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
