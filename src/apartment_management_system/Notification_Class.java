/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment_management_system;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christus
 */
public class Notification_Class {
    
    private String template_name;
    private String description;
    private String subject;
    private String email;
    
    
    //GETERS AND SETERS
    public String getTemplate_Name(){
        return template_name;
    }
    
    public void setTemplate_Name(String TEMP_NAME){
        this.template_name = TEMP_NAME;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String DESCRIPTION){
        this.description = DESCRIPTION;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void setSubject(String SUBJECT){
        this.subject = SUBJECT;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String EMAIL){
        this.email = EMAIL;
    }


    //CLASS CONSTRUCTORS
    public Notification_Class(){}

    public Notification_Class(String TEMP_NAME, String DESCRIPTION, String SUBJECT, String EMAIL){
        this.template_name = TEMP_NAME;
        this.description = DESCRIPTION;
        this.subject = SUBJECT;
        this.email = EMAIL;

    }
    
    //ADD NOTIFICATION TEMPLATE FUNCTION
    public boolean addNotification(Notification_Class notification){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `notificationtemplate`(`templateName`, `description`, `subject`, `emailAddress`) VALUES (?, ?, ?, ?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setString(1, notification.getTemplate_Name());
            ps.setString(2, notification.getDescription());
            ps.setString(3, notification.getSubject());
            ps.setString(4, notification.getEmail());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Notification_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD NOTIFICATION TEMPLATE END
        
    
    //EDIT NOTIFICATION TEMPLATE FUNCTION
    public boolean editNotification(Notification_Class notification){
        PreparedStatement ps;
        
        String edit_query = "UPDATE `notificationtemplate` SET `description`= ?,`subject`=?,`emailAddress`= ? WHERE `templateName` = ?";
        try {
            ps = Db_Connect.Connect().prepareStatement(edit_query);
            ps.setString(1, notification.getDescription());
            ps.setString(2, notification.getSubject());
            ps.setString(3, notification.getEmail());
            ps.setString(4, notification.getTemplate_Name());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Notification_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//EDIT NOTIFICATION TEMPLATE END
    
    
    //DELETE NOTIFICATION TEMPLATE FUNCTION
    public boolean deleteNotification(Notification_Class notification){
        PreparedStatement ps;
        
        String edit_query = "DELETE FROM `notificationtemplate` WHERE `templateName` = ?";
        try {
            ps = Db_Connect.Connect().prepareStatement(edit_query);
            ps.setString(1, notification.getTemplate_Name());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Notification_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//DELETE NOTIFICATION TEMPLATE END
    
    
    //Method To Return An ArrayList Of Notifications
    public ArrayList<Notification_Class> notificationList(){
        ArrayList<Notification_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `notificationtemplate`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Notification_Class notification;
            
            while(rs.next()){
                notification = new Notification_Class(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(notification);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Notification_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

}