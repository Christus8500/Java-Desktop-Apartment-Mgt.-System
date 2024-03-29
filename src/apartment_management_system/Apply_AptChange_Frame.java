/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apartment_management_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Christus
 */
public class Apply_AptChange_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Property_Type_Frame
     */
    public Apply_AptChange_Frame() {
        initComponents();
        
        
        Border bottom_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
        frame_title.setBorder(bottom_border);
        
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
        jPanel2 = new javax.swing.JPanel();
        frame_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_tenantID = new javax.swing.JTextField();
        submit_apply = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_new_apt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_reason = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txt_apt_num = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        frame_title.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        frame_title.setText("     Apply Change Apt ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(frame_title, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(frame_title)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText(" Tenant ID:");

        txt_tenantID.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_tenantID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenantIDActionPerformed(evt);
            }
        });

        submit_apply.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        submit_apply.setText("Submit");
        submit_apply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_applyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("New Apt:");

        txt_new_apt.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_new_apt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_new_aptActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Reason:");

        txt_reason.setColumns(20);
        txt_reason.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txt_reason.setRows(5);
        jScrollPane2.setViewportView(txt_reason);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Current Apt No:");

        txt_apt_num.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_apt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apt_numActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Date:");

        txt_date.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_tenantID)
                                    .addComponent(txt_apt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_new_apt)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submit_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenantID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_new_apt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(submit_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Definetxt_tenantIDo clear text fields
    private void clearTextFields() {
        txt_tenantID.setText("");
        txt_apt_num.setText("");
        txt_new_apt.setText("");
        txt_reason.setText("");
        txt_date.setDate(null);
    }
    
    //Function To Check If Tenant ID Exists
    private boolean checkTenantId(Integer tenant_id) {
        try {
            String query = "SELECT COUNT(*) FROM `tenant` WHERE `tenantID` = ?";
            PreparedStatement ps = Db_Connect.Connect().prepareStatement(query);
            ps.setInt(1, tenant_id);
            ResultSet rs = ps.executeQuery();

            rs.next();
            int count = rs.getInt(1);

            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the database error here
            return false;
        }
    }
    
    
    private void txt_tenantIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenantIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenantIDActionPerformed

    private void submit_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_applyActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String tenantIdText = txt_tenantID.getText();
        String currentAptNumText = txt_apt_num.getText();
        String newAptNumText = txt_new_apt.getText();
        String reason = txt_reason.getText();
        Date dateValue = txt_date.getDate(); // Get the date value

        if (tenantIdText.isEmpty() || currentAptNumText.isEmpty() || newAptNumText.isEmpty() || reason.isEmpty() || dateValue == null) {
            JOptionPane.showMessageDialog(null, "All Fields Must Not Be Empty", "Empty Field", 2);
        } else {
            try {
                int tenantId = Integer.parseInt(tenantIdText);
                int currentAptNum = Integer.parseInt(currentAptNumText);
                int newAptNum = Integer.parseInt(newAptNumText);

                if (checkTenantId(tenantId)) {
                    String date = dateFormat.format(dateValue); // Format the date

                    Apply_AptChange_Class apply = new Apply_AptChange_Class(0, tenantId, currentAptNum, newAptNum, reason, date);

                    if (new Apply_AptChange_Class().addApply(apply)) {
                        JOptionPane.showMessageDialog(null, "Application Submitted Successfully", "Change Apt", 1);
                        clearTextFields();
                        // Close the frame
                        setVisible(false);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Operation Failed", "Change Apt", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "This ID is Not Registered in Our System, Use The ID You Were Registered With", "ID Not Found", 2);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input for tenant ID, current apt number, or new apt number.", "Invalid Input", 2);
            }
        }
    }//GEN-LAST:event_submit_applyActionPerformed

    private void txt_new_aptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_new_aptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_new_aptActionPerformed

    private void txt_apt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apt_numActionPerformed

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
            java.util.logging.Logger.getLogger(Apply_AptChange_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apply_AptChange_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apply_AptChange_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apply_AptChange_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apply_AptChange_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frame_title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submit_apply;
    private javax.swing.JTextField txt_apt_num;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_new_apt;
    private javax.swing.JTextArea txt_reason;
    private javax.swing.JTextField txt_tenantID;
    // End of variables declaration//GEN-END:variables
}
