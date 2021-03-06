
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
public class Request extends javax.swing.JFrame {
    String pid;
    String q1;

    /**
     * Creates new form Request
     */
    public Request() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        request = new javax.swing.JTable();
        showrecord = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        request.setBackground(new java.awt.Color(204, 204, 204));
        request.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        request.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerailNo", "DonorId", "NeedyId", "ProductId", "ProductName", "Quantity", "Unit", "Date of request"
            }
        ));
        jScrollPane2.setViewportView(request);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1080, 340));

        showrecord.setBackground(new java.awt.Color(153, 153, 153));
        showrecord.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        showrecord.setText("Show All Data");
        showrecord.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 3, true));
        showrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showrecordActionPerformed(evt);
            }
        });
        getContentPane().add(showrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 390, 50));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("      Request FROM NEEDY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 480, 90));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 190, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter serial number of approved request: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 430, 60));

        ok.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ok.setText("Ok");
        ok.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 80, 40));

        Clear.setBackground(new java.awt.Color(153, 153, 153));
        Clear.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Clear.setText("ClearTable");
        Clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

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
                    .executeQuery("SELECT * FROM request");

            while (rs.next()) {
                String SL=String.valueOf(rs.getInt("SL"));
                System.out.println(SL);
                String D_id=String.valueOf(rs.getInt("D_id"));
                String N_id=String.valueOf(rs.getInt("N_id"));
                String P_id=String.valueOf(rs.getInt("P_id"));
                String q=String.valueOf(rs.getInt("quantity"));
                String pname=rs.getString("productname");
                String unit=rs.getString("unit");
                String date=rs.getString("requestdate");             

                String tbData[]={SL,D_id,N_id,P_id,pname,q,unit,date};

                DefaultTableModel tblModel=(DefaultTableModel)request.getModel();
                tblModel.addRow(tbData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_showrecordActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        AdminTop d=new AdminTop();
        d.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
        
         

         
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            
             String ida=id.getText();
          
            Statement statement = connection.createStatement();
            ResultSet rs = statement
            .executeQuery("SELECT * from request WHERE SL ='"+ida+"' ");

            while (rs.next()) {
                String D_id=String.valueOf(rs.getInt("D_id"));
                String N_id=String.valueOf(rs.getInt("N_id"));
                 pid=String.valueOf(rs.getInt("P_id"));
                 q1=String.valueOf(rs.getInt("quantity"));
                String pname=rs.getString("productname");
                String un=rs.getString("unit");                
                System.out.println(pname);
            
      
                   long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        
            //    System.out.println(pname);
            
         Statement statement1 = connection.createStatement();
            statement1.executeUpdate("insert into records (D_id,P_id,N_id,R_Quantity,R_productName,unit,DonationDate)"
                        + " values ('"+D_id+"','"+pid+"','"+N_id+"','"+q1+"','"+pname+"','"+un+"','"+date+"')");
            
            
       
            
          
            
            
            
           /////////////////////////////////////////////////////////////////////     
           
            }
            
                
                  System.out.println("product id");
       System.out.println(pid);    
      
           
           
           Statement statement3 = connection.createStatement();
            ResultSet rs3 = statement3
            .executeQuery("SELECT quantity FROM donationTable  where productid ='"+pid+"' ");
             while (rs3.next()) {
                String quan=String.valueOf(rs3.getInt("quantity"));
               
                 System.out.println("quantity from dt");
                 System.out.println(quan);
                 
                 System.out.println("quantity");
                 System.out.println(q1);
                 
                 int a=Integer.parseInt(quan);   
                 int b=Integer.parseInt(q1);                   
                 int result=a-b;                
                 System.out.println("result");                
                 System.out.println(result);
                 
                  Statement statement2 = connection.createStatement();

                  String sql1="UPDATE donationTABLE set quantity='"+result+"' WHERE productid ='"+pid+"'";
                 statement2.executeUpdate(sql1);
                  Statement statement4 = connection.createStatement();

                  String sql4="Delete  from request  WHERE SL ='"+ida+"'";
                 statement4.executeUpdate(sql4);
                 
                      
               
                 
                // insert into donationcount select distinct D_id,count(distinct N_id) from records group by D_id
                 
                 
                 
              }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code h

    }//GEN-LAST:event_okActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        // String tbData[]={p_id,p_type,p_name,p_quantity,pdate,D_id};
        request.setModel(new DefaultTableModel(null,new String [] {"SerailNo","DonorId","NeedyId","ProductId","ProductName","Quantity","Unit","Date of request	"}));
        //tblModel.addRow(tbData);
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton ok;
    private javax.swing.JTable request;
    private javax.swing.JButton showrecord;
    // End of variables declaration//GEN-END:variables
}
