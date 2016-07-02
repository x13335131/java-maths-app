/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

/**
 *
 * @author x14428818
 */
public class ConJnr extends javax.swing.JFrame {

    /**
     * Creates new form Theorems1
     */
    public ConJnr() {
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

        Logo = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        home = new javax.swing.JButton();
        Construction1 = new javax.swing.JButton();
        Construction2 = new javax.swing.JButton();
        Construction3 = new javax.swing.JButton();
        Construction4 = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Construction5 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();
        home1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/purple logo.JPG"))); // NOI18N
        Logo.setText("jLabel1");
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 70));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/back.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 40, 40));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 40, 40));

        Construction1.setBackground(new java.awt.Color(255, 255, 204));
        Construction1.setForeground(new java.awt.Color(0, 153, 51));
        Construction1.setText("Construction 1");
        Construction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Construction1ActionPerformed(evt);
            }
        });
        getContentPane().add(Construction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 160, 30));

        Construction2.setBackground(new java.awt.Color(255, 255, 204));
        Construction2.setForeground(new java.awt.Color(0, 153, 51));
        Construction2.setText("Construction 2");
        Construction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Construction2ActionPerformed(evt);
            }
        });
        getContentPane().add(Construction2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, 30));

        Construction3.setBackground(new java.awt.Color(255, 255, 204));
        Construction3.setForeground(new java.awt.Color(0, 153, 51));
        Construction3.setText("Construction 3");
        Construction3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Construction3ActionPerformed(evt);
            }
        });
        getContentPane().add(Construction3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, 30));

        Construction4.setBackground(new java.awt.Color(255, 255, 204));
        Construction4.setForeground(new java.awt.Color(0, 153, 51));
        Construction4.setText("Construction 4");
        Construction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Construction4ActionPerformed(evt);
            }
        });
        getContentPane().add(Construction4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 160, 30));

        Search.setBackground(new java.awt.Color(255, 255, 204));
        Search.setForeground(new java.awt.Color(0, 153, 51));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 80, 20));

        Construction5.setBackground(new java.awt.Color(255, 255, 204));
        Construction5.setForeground(new java.awt.Color(0, 153, 51));
        Construction5.setText("Construction 5");
        Construction5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Construction5ActionPerformed(evt);
            }
        });
        getContentPane().add(Construction5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 160, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/background.jpg"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 391, 480));
        Background.getAccessibleContext().setAccessibleName("background");

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsapp/home.png"))); // NOI18N
        home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home1ActionPerformed(evt);
            }
        });
        getContentPane().add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 40, 40));

        setSize(new java.awt.Dimension(407, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Construction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Construction1ActionPerformed
        Construction1 myConstruction1 = new Construction1();
        myConstruction1.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_Construction1ActionPerformed

    private void Construction3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Construction3ActionPerformed
        Construction3 myConstruction3 = new Construction3();
        myConstruction3.setVisible(true);
        dispose();
    }//GEN-LAST:event_Construction3ActionPerformed

    private void Construction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Construction4ActionPerformed
        Construction4 myConstruction4 = new Construction4();
        myConstruction4.setVisible(true);
        dispose();
    }//GEN-LAST:event_Construction4ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        ConstructionsGUI myConstructions = new ConstructionsGUI();
        myConstructions.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        HomePageGUI myHomePage = new HomePageGUI();
        myHomePage.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void Construction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Construction2ActionPerformed
        Construction2 myConstruction2 = new Construction2();
        myConstruction2.setVisible(true);
        dispose();
    }//GEN-LAST:event_Construction2ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        ConSearch myConSearch = new ConSearch();
        myConSearch.setVisible(true);
        dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void Construction5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Construction5ActionPerformed
        Construction5 myConstruction5 = new Construction5();
        myConstruction5.setVisible(true);
        dispose();
    }//GEN-LAST:event_Construction5ActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_home1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConJnr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConJnr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConJnr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConJnr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConJnr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Construction1;
    private javax.swing.JButton Construction2;
    private javax.swing.JButton Construction3;
    private javax.swing.JButton Construction4;
    private javax.swing.JButton Construction5;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Search;
    private javax.swing.JButton home;
    private javax.swing.JButton home1;
    // End of variables declaration//GEN-END:variables
}