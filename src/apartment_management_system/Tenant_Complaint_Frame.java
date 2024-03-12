/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apartment_management_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Christus
 */
public class Tenant_Complaint_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Property_Type_Frame
     */
    public Tenant_Complaint_Frame() {
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
        txt_apt_num = new javax.swing.JTextField();
        submit_complaint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_complaint = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txt_buildingName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        frame_title.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        frame_title.setText("     File Complaint");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frame_title, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(frame_title)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Apartment No:");

        txt_apt_num.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_apt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apt_numActionPerformed(evt);
            }
        });

        submit_complaint.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        submit_complaint.setText("Submit");
        submit_complaint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_complaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_complaintActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Email:");

        txt_email.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Complaint:");

        txt_complaint.setColumns(20);
        txt_complaint.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txt_complaint.setRows(5);
        jScrollPane2.setViewportView(txt_complaint);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Building Name:");

        txt_buildingName.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_buildingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buildingNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_email)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_apt_num)
                            .addComponent(txt_buildingName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buildingName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(submit_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Define a method to clear text fields
    private void clearTextFields() {
        txt_apt_num.setText("");
        txt_buildingName.setText("");
        txt_email.setText("");
        txt_complaint.setText("");
    }
    
    //Function To Check If The Building Name Exists
    private boolean checkBuildingExists(String buildingName) {
        try {
            String query = "SELECT COUNT(*) FROM `building` WHERE `buildingName` = ?";
            PreparedStatement ps = Db_Connect.Connect().prepareStatement(query);
            ps.setString(1, buildingName);
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
    
    //Function To Check If The Email Exists
    private boolean checkTenantEmail(String tenant_email) {
        try {
            String query = "SELECT COUNT(*) FROM `tenant` WHERE `email` = ?";
            PreparedStatement ps = Db_Connect.Connect().prepareStatement(query);
            ps.setString(1, tenant_email);
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
    
    
    private void txt_apt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apt_numActionPerformed

    private void submit_complaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_complaintActionPerformed
        // TODO add your handling code here:
        String aptNumText = txt_apt_num.getText();
        String b_name = txt_buildingName.getText();
        String email = txt_email.getText();
        String complain = txt_complaint.getText();

        if (!aptNumText.isBlank() && !b_name.isBlank() && !email.isBlank() && !complain.isBlank()) {
            // Check if aptNumText is a valid integer before parsing it
            try {
                int aptNum = Integer.parseInt(aptNumText);
                if (checkBuildingExists(b_name)) {
                    if (checkTenantEmail(email)) {
                        Tenant_Complaint_Class complaint = new Tenant_Complaint_Class(0, b_name, aptNum, email, complain);

                        if (new Tenant_Complaint_Class().addComplaint(complaint)) {
                            JOptionPane.showMessageDialog(null, "Complaint Submitted Successfully", "File Complaint", 1);
                            clearTextFields();
                            // Close the frame
                            setVisible(false);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Operation Failed", "File Complaint", 2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "This Email is Not Registered in Our System, Use The Email You Were Registered With", "Email Not Found", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Building Not Found. Please Check That the Building Name is Correct", "Building Not Found", 2);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Apartment Number must be a valid integer", "Invalid Apartment Number", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "All Fields Must Not Be Empty", "Empty Field", 2);
        }

    }//GEN-LAST:event_submit_complaintActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_buildingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buildingNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buildingNameActionPerformed

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
            java.util.logging.Logger.getLogger(Tenant_Complaint_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tenant_Complaint_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tenant_Complaint_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tenant_Complaint_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tenant_Complaint_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frame_title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submit_complaint;
    private javax.swing.JTextField txt_apt_num;
    private javax.swing.JTextField txt_buildingName;
    private javax.swing.JTextArea txt_complaint;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}