/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import mathsapp.HomePageGUI;

/**
 *
 * @author x13335131
 */
public class LCHigherQs3GUI extends javax.swing.JFrame {

    /**
     * Creates new form LCHigherQs3
     */
    public LCHigherQs3GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nextBtn = new javax.swing.JButton();
        question = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Opt1 = new javax.swing.JRadioButton();
        Opt2 = new javax.swing.JRadioButton();
        Opt3 = new javax.swing.JRadioButton();
        Opt4 = new javax.swing.JRadioButton();
        homeBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nextBtn.setText("next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 30));

        question.setBorder(null);
        question.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        question.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("A normal die is rolled \nand a spinner numbered \n1,2,3 is spun. How many \ndifferent outcomes are \npossible?\n");
        question.setViewportView(jTextArea1);

        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, 150));

        buttonGroup1.add(Opt1);
        Opt1.setText("12");
        jPanel1.add(Opt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        buttonGroup1.add(Opt2);
        Opt2.setText("18");
        jPanel1.add(Opt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        buttonGroup1.add(Opt3);
        Opt3.setText("24");
        jPanel1.add(Opt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        buttonGroup1.add(Opt4);
        Opt4.setText("32");
        jPanel1.add(Opt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 391, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        String ans="empty" ;
        if (Opt1.isSelected()){
            ans="12";
        }else if (Opt2.isSelected()){
            ans="18";
        }else if (Opt3.isSelected()){
            ans="24";
        }else if (Opt4.isSelected()){
            ans="32";
        }
       LeavingCertHigherControl.updateAns(ans, 2);
       LeavingCertHigherControl.validateQuestion3();
       LCHigherQs4GUI LCHQ4 = new LCHigherQs4GUI();
       LCHQ4.setVisible(true);
       dispose();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
       HomePageGUI myHomePageGUI = new HomePageGUI();
        myHomePageGUI.setVisible (true);
        dispose();
    }//GEN-LAST:event_homeBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Opt1;
    private javax.swing.JRadioButton Opt2;
    private javax.swing.JRadioButton Opt3;
    private javax.swing.JRadioButton Opt4;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JScrollPane question;
    // End of variables declaration//GEN-END:variables
}
