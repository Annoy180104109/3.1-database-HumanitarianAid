/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class NeedyTop extends javax.swing.JFrame {

    /**
     * Creates new form NeedyTop
     */
    public NeedyTop() {
        //Login l=new Login();     
       // showId.setText(l.nd);   // TODO add your handling code here:
       
       
        // Login l=new Login();     
        //showId.setText("l.nd");  
       
       
       
       
        initComponents();
    }
 //String id;
    
       public NeedyTop(String id) {
         // id=this.id; 
        //Login l=new Login();     
       // showId.setText(l.nd);   // TODO add your handling code here:
       
      // showId.setText(id);
        // Login l=new Login();     
        //showId.setText("l.nd");  
       
       
       
       
        initComponents();
        
        showId.setText(id);
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showId = new javax.swing.JTextField();
        nprofile = new javax.swing.JButton();
        nproduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Log Out");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NEEDY HOME PAGE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 490, 70));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID.No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        showId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showIdActionPerformed(evt);
            }
        });
        getContentPane().add(showId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, 30));

        nprofile.setBackground(new java.awt.Color(102, 102, 102));
        nprofile.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nprofile.setForeground(new java.awt.Color(255, 255, 255));
        nprofile.setText("View Profile");
        nprofile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nprofileActionPerformed(evt);
            }
        });
        getContentPane().add(nprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 360, 50));

        nproduct.setBackground(new java.awt.Color(102, 102, 102));
        nproduct.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nproduct.setForeground(new java.awt.Color(255, 255, 255));
        nproduct.setText("View Available Products");
        nproduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nproductActionPerformed(evt);
            }
        });
        getContentPane().add(nproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 360, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1110, 1200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showIdActionPerformed
        //  Login l=new Login();
        //  showId.setText(l.nd);   // TODO add your handling code here:
    }//GEN-LAST:event_showIdActionPerformed

    private void nprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nprofileActionPerformed
        // TODO add your handling code here:
        //Login l=new Login();
        // showId.setText(l.nd);
        String x= showId.getText();
          NeedyProfile A = new NeedyProfile(x);
                          A.setVisible(true);
                          setVisible(false);

        // System.out.println(l.nd);
   ///        NeedyProfile d=new NeedyProfile();
   ///     d.show();
   ///     dispose();
        
        
        
        
        
    }//GEN-LAST:event_nprofileActionPerformed

    private void nproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nproductActionPerformed
        // TODO add your handling code here:

        
        String x= showId.getText();
        SearchProduct A = new SearchProduct(x);
                          A.setVisible(true);
                          setVisible(false);
    }//GEN-LAST:event_nproductActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       // showId.setText("l");
        Login l=new Login();
        //System.out.println(l.nd);
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
            java.util.logging.Logger.getLogger(NeedyTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeedyTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeedyTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeedyTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeedyTop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nproduct;
    private javax.swing.JButton nprofile;
    private javax.swing.JTextField showId;
    // End of variables declaration//GEN-END:variables
}
