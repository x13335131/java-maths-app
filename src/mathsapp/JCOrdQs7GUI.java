/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathsapp;

import mathsapp.HomePageGUI;
import mathsapp.JuniorCertOrdinaryControl;

/**
 *
 * @author x13335131
 */
public class JCOrdQs7GUI extends javax.swing.JFrame {

    /**
     * Creates new form JCOrdQs7
     */
    public JCOrdQs7GUI() {
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
        question = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        question.setBorder(null);
        question.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        question.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("If x = 3, \nfind the value of: \n4x + 5 \n");
        question.setViewportView(jTextArea1);

        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        opt1.setText("18");
        jPanel1.add(opt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        opt2.setText("12");
        jPanel1.add(opt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        opt3.setText("17");
        jPanel1.add(opt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        nextBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nextBtn.setText("next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 30));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 40, 40));

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        jPanel1.add(backgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        HomePageGUI myHomePageGUI = new HomePageGUI();
        myHomePageGUI.setVisible (true);
        dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
       String ans="empty" ;
        if (opt1.isSelected()){
            ans="18";
        }else if (opt2.isSelected()){
            ans="12";
        }else if (opt3.isSelected()){
            ans="17";
        }
       JuniorCertOrdinaryControl.updateAns(ans, 6);
       JuniorCertOrdinaryControl.validateQuestion7();
       JCOrdQs8GUI JCOrdQ8 = new JCOrdQs8GUI();
       JCOrdQ8.setVisible(true);
       dispose();
    }//GEN-LAST:event_nextBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JScrollPane question;
    // End of variables declaration//GEN-END:variables
}
