/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apartment_management_system;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christus
 */
public class Maintenance_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Property_Type_Frame
     */
    public Maintenance_Frame() {
        initComponents();
        
        
        Border bottom_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
        frame_title.setBorder(bottom_border);
        
        fillNotificationTable();
        fillTenantRequest();
        fillMaintenanceTable();
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
        add_maintenance = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_apt_num = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_temp_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        edit_maintenance = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintenance_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        request_table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        refresh_maintenance_table = new javax.swing.JButton();
        refresh_request_table = new javax.swing.JButton();
        txt_maintenance_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        notification_table = new javax.swing.JTable();
        refresh_notification_table = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        frame_title.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        frame_title.setText("     Maintenance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(554, 554, 554)
                .addComponent(frame_title, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(frame_title)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        add_maintenance.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        add_maintenance.setText("Add Maintenance");
        add_maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_maintenanceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Apt. No.:");

        txt_apt_num.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_apt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apt_numActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("Template Name:");

        txt_temp_name.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_temp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_temp_nameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Date:");

        txt_date.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        edit_maintenance.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        edit_maintenance.setText("Edit Maintenance");
        edit_maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_maintenanceActionPerformed(evt);
            }
        });

        maintenance_table.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        maintenance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        maintenance_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintenance_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(maintenance_table);

        request_table.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        request_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(request_table);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("Maintenance List");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Tenant Maintenance Request List");

        refresh_maintenance_table.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        refresh_maintenance_table.setText("Refresh Table");
        refresh_maintenance_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh_maintenance_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_maintenance_tableActionPerformed(evt);
            }
        });

        refresh_request_table.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        refresh_request_table.setText("Refresh Table");
        refresh_request_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh_request_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_request_tableActionPerformed(evt);
            }
        });

        txt_maintenance_id.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel1.setText("ID:");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("Notification Template List");

        notification_table.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        notification_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        notification_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notification_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(notification_table);

        refresh_notification_table.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        refresh_notification_table.setText("Refresh Table");
        refresh_notification_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh_notification_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_notification_tableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_apt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_maintenance_id, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_temp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_maintenance)
                            .addComponent(edit_maintenance))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(refresh_maintenance_table, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(refresh_request_table, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(refresh_notification_table, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_maintenance_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_apt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_temp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(add_maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_maintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh_maintenance_table, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh_request_table, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh_notification_table, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
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

    // Definetxt_tenantIDo clear text fields
    private void clearTextFields() {
        txt_maintenance_id.setText("");
        txt_apt_num.setText("");
        txt_date.setDate(null);
        txt_temp_name.setText("");
    }
    
    //Method to populate the Tenant Maintenance Request List table
    public void fillTenantRequest(){
        RequestMaintenance_Class request = new RequestMaintenance_Class();
        ArrayList<RequestMaintenance_Class> requestList = request.requestList();
        
        //JTable Columns
        String[] colNames = {"Apt Num.", "Description"};
        
        //JTable Rows
        //requestList.size() = size of the arraylist
        //2 = the number of columns
        Object[][] rows = new Object[requestList.size()][2];
        
        //add data from the list to the rows
        for(int i = 0; i < requestList.size(); i++){
            rows[i][0] = requestList.get(i).getApt_num();
            rows[i][1] = requestList.get(i).getDescription();
            
            DefaultTableModel model = new DefaultTableModel(rows, colNames);
            request_table.setModel(model);
            
        }
    }
    
    //Method to populate the Notification Template List table
    public void fillNotificationTable(){
        Notification_Class notification = new Notification_Class();
        ArrayList<Notification_Class> notificationList = notification.notificationList();
        
        //JTable Columns
        String[] colNames = {"Template Name", "Description"};
        
        //JTable Rows
        //notificationList.size() = size of the arraylist
        //2 = the number of columns
        Object[][] rows = new Object[notificationList.size()][2];
        
        //add data from the list to the rows
        for(int i = 0; i < notificationList.size(); i++){
            rows[i][0] = notificationList.get(i).getTemplate_Name();
            rows[i][1] = notificationList.get(i).getDescription();
            
            DefaultTableModel model = new DefaultTableModel(rows, colNames);
            notification_table.setModel(model);
            
        }
    }
    
    //Method to populate the Maintenance List table
    public void fillMaintenanceTable(){
        Maintenance_Class maintenance = new Maintenance_Class();
        ArrayList<Maintenance_Class> maintenanceList = maintenance.maintenanceList();
        
        //JTable Columns
        String[] colNames = {"ID", "Apt. No.", "Date", "Template Name"};
        
        //JTable Rows
        //maintenanceList.size() = size of the arraylist
        //4 = the number of columns
        Object[][] rows = new Object[maintenanceList.size()][4];
        
        //add data from the list to the rows
        for(int i = 0; i < maintenanceList.size(); i++){
            rows[i][0] = maintenanceList.get(i).getMaintenance_id();
            rows[i][1] = maintenanceList.get(i).getApt_num();
            rows[i][2] = maintenanceList.get(i).getDate();
            rows[i][3] = maintenanceList.get(i).getTemp_name();
            
            DefaultTableModel model = new DefaultTableModel(rows, colNames);
            maintenance_table.setModel(model);
            
        }
    }
    
    private void add_maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_maintenanceActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Get input values as strings
        String AptNumText = txt_apt_num.getText();
        Date selectedDate = txt_date.getDate(); // Assuming txt_date is a date picker
        String temp_name = txt_temp_name.getText();

        if (!AptNumText.isBlank() && selectedDate != null && !temp_name.isBlank()) {
            // Check if input strings can be parsed as integers
            try {
                int AptNum = Integer.parseInt(AptNumText);
                // Format the date
                String date = dateFormat.format(selectedDate);

                Maintenance_Class maintenance = new Maintenance_Class(0, AptNum, date, temp_name);

                if (new Maintenance_Class().addMaintenance(maintenance)) {
                    JOptionPane.showMessageDialog(null, "Record Created Successfully", "Maintenance", 1);
                    clearTextFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Operation Failed", "Maintenance", 2);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Apartment Number must be valid integers", "Invalid Input", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "All Fields Must Not Be Empty", "Empty Field", 2);
        }
    }//GEN-LAST:event_add_maintenanceActionPerformed

    private void txt_apt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apt_numActionPerformed

    private void txt_temp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_temp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_temp_nameActionPerformed

    private void edit_maintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_maintenanceActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        int maintenance_id = Integer.parseInt(txt_maintenance_id.getText());
        int aptNum = Integer.parseInt(txt_apt_num.getText());
        String date = dateFormat.format(txt_date.getDate());
        String temp_name = txt_temp_name.getText();
        
        
        Maintenance_Class maintenance = new Maintenance_Class(maintenance_id, aptNum, date, temp_name);
        
        if(new Maintenance_Class().editMaintenance(maintenance)){
            JOptionPane.showMessageDialog(null, "Lease Updated Successfully", "Update Change Apt", 1);
            clearTextFields();
        }else{
            JOptionPane.showMessageDialog(null, "Operation Failed", "Update Change Apt", 1);
        }
    }//GEN-LAST:event_edit_maintenanceActionPerformed

    private void refresh_maintenance_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_maintenance_tableActionPerformed
        // TODO add your handling code here:
        fillMaintenanceTable();
    }//GEN-LAST:event_refresh_maintenance_tableActionPerformed

    private void refresh_request_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_request_tableActionPerformed
        // TODO add your handling code here:
        fillTenantRequest();
    }//GEN-LAST:event_refresh_request_tableActionPerformed

    private void maintenance_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintenance_tableMouseClicked
        // TODO add your handling code here:
        //Fill The Form Field With The Selected Maintenance Data
        int selectedRowIndex = maintenance_table.getSelectedRow();
        txt_maintenance_id.setText(maintenance_table.getValueAt(selectedRowIndex, 0).toString());
        txt_apt_num.setText(maintenance_table.getValueAt(selectedRowIndex, 1).toString());
        // Correctly set the start date and end date
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date change_date = dateFormat.parse(maintenance_table.getValueAt(selectedRowIndex, 2).toString());
            txt_date.setDate(change_date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        txt_temp_name.setText(maintenance_table.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_maintenance_tableMouseClicked

    private void refresh_notification_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_notification_tableActionPerformed
        // TODO add your handling code here:
        fillNotificationTable();
    }//GEN-LAST:event_refresh_notification_tableActionPerformed

    private void notification_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notification_tableMouseClicked
        // TODO add your handling code here:
        //Fill The Form Field With The Selected Maintenance Data
        int selectedRowIndex = notification_table.getSelectedRow();
        txt_temp_name.setText(notification_table.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_notification_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Maintenance_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maintenance_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maintenance_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maintenance_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Maintenance_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_maintenance;
    private javax.swing.JButton edit_maintenance;
    private javax.swing.JLabel frame_title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable maintenance_table;
    private javax.swing.JTable notification_table;
    private javax.swing.JButton refresh_maintenance_table;
    private javax.swing.JButton refresh_notification_table;
    private javax.swing.JButton refresh_request_table;
    private javax.swing.JTable request_table;
    private javax.swing.JTextField txt_apt_num;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_maintenance_id;
    private javax.swing.JTextField txt_temp_name;
    // End of variables declaration//GEN-END:variables
}
