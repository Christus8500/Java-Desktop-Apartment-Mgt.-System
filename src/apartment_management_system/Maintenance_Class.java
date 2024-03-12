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
public class Maintenance_Class {
    
    private int maintenance_id;
    private int apt_num;
    private String date;
    private String temp_name;
    


    //CLASS CONSTRUCTORS
    public Maintenance_Class(){}

    public Maintenance_Class(Integer ID, Integer APT_NUM, String DATE, String TEMP_NAME){
        this.maintenance_id = ID;
        this.apt_num = APT_NUM;
        this.date = DATE;
        this.temp_name = TEMP_NAME;
    }
    
       public int getMaintenance_id() {
        return maintenance_id;
    }

    public void setMaintenance_id(int maintenance_id) {
        this.maintenance_id = maintenance_id;
    }

    public int getApt_num() {
        return apt_num;
    }

    public void setApt_num(int apt_num) {
        this.apt_num = apt_num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemp_name() {
        return temp_name;
    }

    public void setTemp_name(String temp_name) {
        this.temp_name = temp_name;
    }

    
    //ADD MAINTENANCE FUNCTION
    public boolean addMaintenance(Maintenance_Class maintenance){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `maintenance`( `apartmentNumber`, `maintenanceDate`, `templateName`) VALUES (?, ?, ?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setInt(1, maintenance.getApt_num());
            ps.setString(2, maintenance.getDate());
            ps.setString(3, maintenance.getTemp_name());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Maintenance_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD MAINTENANCE END
    
    
    //EDIT MAINTENANCE FUNCTION
    public boolean editMaintenance(Maintenance_Class maintenance){
        PreparedStatement ps;
        
        String edit_query = "UPDATE `maintenance` SET  `apartmentNumber`= ?,`maintenanceDate`= ?,`templateName`= ? WHERE `maintenanceID` = ?";
        try {
            ps = Db_Connect.Connect().prepareStatement(edit_query);
            ps.setInt(1, maintenance.getApt_num());
            ps.setString(2, maintenance.getDate());
            ps.setString(3, maintenance.getTemp_name());
            ps.setInt(4, maintenance.getApt_num());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Maintenance_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//EDIT MAINTENANCE END
        
    
    //Method To Return An ArrayList Of MAINTENANCE RECORDS
    public ArrayList<Maintenance_Class> maintenanceList(){
        ArrayList<Maintenance_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `maintenance`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Maintenance_Class maintenance;
            
            while(rs.next()){
                maintenance = new Maintenance_Class(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                list.add(maintenance);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Maintenance_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
