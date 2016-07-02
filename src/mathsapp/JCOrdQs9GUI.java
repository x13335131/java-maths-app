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
public class JCOrdQs9GUI extends javax.swing.JFrame {

    /**
     * Creates new form JCOrdQs9
     */
    public JCOrdQs9GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        question = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        qsPicLbl = new javax.swing.JLabel();
        answerTf = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        backgroundBtn = new javax.swing.JLabel();

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
        jTextArea1.setText("Which triangle is \nisosceles? \nThe measurements of the\nsides of four triangles \nare as follows:");
        question.setViewportView(jTextArea1);

        jPanel1.add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, 110));

        qsPicLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/Qs9JCOrd.PNG"))); // NOI18N
        jPanel1.add(qsPicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        answerTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(answerTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 140, 30));

        clearBtn.setText("clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 80, -1));

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

        backgroundBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        jPanel1.add(backgroundBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

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
        String ans = answerTf.getText();
       JuniorCertOrdinaryControl.updateAns(ans, 8);
       JuniorCertOrdinaryControl.validateQuestion9();
       JCOrdQs10GUI JCOrdQ10 = new JCOrdQs10GUI();
       JCOrdQ10.setVisible(true);
       dispose();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
       answerTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTf;
    private javax.swing.JLabel backgroundBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel qsPicLbl;
    private javax.swing.JScrollPane question;
    // End of variables declaration//GEN-END:variables
}
