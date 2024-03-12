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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Christus
 */
public class Building_Class {
    private int landlord_id;
    private String building_name;
    private String address;
    private String zipcode;
    
    
    //GETERS AND SETERS
    public Integer getLandlord_Id(){
        return landlord_id;
    }
    
    public void setLanlord_Id(Integer LANDLORD){
        this.landlord_id = LANDLORD;
    }
    
    public String getBuildingName(){
        return building_name;
    }
    
    public void setBuildingName(String BNAME){
        this.building_name = BNAME;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String ADDRESS){
        this.address = ADDRESS;
    }
    
    public String getZipcode(){
        return zipcode;
    }
    
    public void setZipcode(String ZIPCODE){
        this.zipcode = ZIPCODE;
    }
    
    //CLASS CONSTRUCTORS
    public Building_Class(){}
    
    public Building_Class(Integer LANDLORD, String BNAME, String ADDRESS, String ZIPCODE){
        this.landlord_id = LANDLORD;
        this.building_name = BNAME;
        this.address = ADDRESS;
        this.zipcode = ZIPCODE;
    }
    
    
    //INSERT, EDIT, REMOVE EMPLOYEE FUNCTION
    public boolean executeQueryType(String queryType, Building_Class type){
        PreparedStatement ps;
        
        //ADD BUILDING
        if(queryType.equals("add")){
            String add_query = "INSERT INTO `building`(`landlordID`, `buildingName`, `address`, `cityStateZip`) VALUES (?, ?, ?, ?)";
            try {
                ps = Db_Connect.Connect().prepareStatement(add_query);
                ps.setInt(1, type.getLandlord_Id());
                ps.setString(2, type.getBuildingName());
                ps.setString(3, type.getAddress());
                ps.setString(4, type.getZipcode());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Building_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//ADD BUILDING END
        
        //EDIT BUILDING
        else if(queryType.equals("edit")){
            String edit_query = "UPDATE `building` SET `landlordID`= ?,`address`= ?,`cityStateZip`= ?, WHERE `buildingName` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(edit_query);
                ps.setInt(1, type.getLandlord_Id());
                ps.setString(2, type.getAddress());
                ps.setString(3, type.getZipcode());
                ps.setString(4, type.getBuildingName());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Building_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//EDIT BUILDING END
        
        //REMOVE BUILDING
        else if(queryType.equals("remove")){
            String remove_query = "DELETE FROM `building` WHERE `buildingName` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(remove_query);
                ps.setString(1, type.getBuildingName());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Building_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//REMOVE BUILDING END
        else{
            JOptionPane.showMessageDialog(null, "Select Your Preferred Action", "Invalid Action", 2);
            return false;
        }
        
    }
    
    
    //Method To Return A List of All The Building in a HashMap
    public HashMap<String, Integer> getBuildingMap() {
        HashMap<String, Integer> map = new HashMap<>();

        Statement st;
        ResultSet rs;

        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery("SELECT * FROM `building`");

            Building_Class building;

            while (rs.next()) {
                int landlordId = rs.getInt(1); // Assuming the first column is the landlord_id
                String buildingName = rs.getString(2);
                String address = rs.getString(3);
                String zipcode = rs.getString(4);

                map.put(buildingName, landlordId);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Building_Class.class.getName()).log(Level.SEVERE, null, ex);
        }

        return map;
    }
    
    //Method To Return An ArrayList Of Buidings
    public ArrayList<Building_Class> buildingList(){
        ArrayList<Building_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `building`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Building_Class building;
            
            while(rs.next()){
                building = new Building_Class(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(building);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Building_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
