
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1a
 */
public class nottaken extends javax.swing.JFrame {

    /**
     * Creates new form nottaken
     */
    public nottaken() {
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

        showrecord = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DD = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showrecord.setBackground(new java.awt.Color(153, 153, 153));
        showrecord.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        showrecord.setText("Show All Data");
        showrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showrecordActionPerformed(evt);
            }
        });
        getContentPane().add(showrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 300, 40));

        DD.setBackground(new java.awt.Color(204, 204, 204));
        DD.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Quantity", "Unit", "Date Of Donation", "Donor Id"
            }
        ));
        jScrollPane2.setViewportView(DD);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1090, 370));

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UNREQUESTED PRODUCTS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 480, 90));

        Clear.setBackground(new java.awt.Color(153, 153, 153));
        Clear.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Clear.setText("ClearTable");
        Clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 120, 40));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showrecordActionPerformed

          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            
            ResultSet rs = statement
            .executeQuery("Select * from donationtable where productname not in (Select Distinct r_productname from records)");

            while (rs.next()) {
                String pid=String.valueOf(rs.getInt("productid"));
              
                String pname=rs.getString("productname");
                String qty=String.valueOf(rs.getInt("quantity"));
                String d=rs.getString("dateofdonation");

                String did=String.valueOf(rs.getInt("D_id"));

                String u=rs.getString("unit");
             

                String tbData[]={pid,pname,qty,u,d,did};

                DefaultTableModel tblModel=(DefaultTableModel)DD.getModel();
                tblModel.addRow(tbData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_showrecordActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        // String tbData[]={p_id,p_type,p_name,p_quantity,pdate,D_id};
        DD.setModel(new DefaultTableModel(null,new String [] {"Donor Id","Product Id","Product Type","Product Name","Quantity","Unit","Date Of Donation"}));
        //tblModel.addRow(tbData);
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        AdminTop d=new AdminTop();
        d.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(nottaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nottaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nottaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nottaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nottaken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTable DD;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton showrecord;
    // End of variables declaration//GEN-END:variables
}
