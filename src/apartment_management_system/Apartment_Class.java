/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment_management_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Christus
 */
public class Apartment_Class {
    
    private int apt_num;
    private String apt_size;
    private String apt_type;
    private String rental_fee;
    private String building_name;
    
    
    //GETERS AND SETERS
    public Integer getAptNum(){
        return apt_num;
    }
    
    public void setAptNum(Integer APTNUM){
        this.apt_num = APTNUM;
    }
    
    public String getAptSize(){
        return apt_size;
    }
    
    public void setAptSize(String APTSIZE){
        this.apt_size = APTSIZE;
    }
    
    public String getAptType(){
        return apt_type;
    }
    
    public void setAptType(String APTTYPE){
        this.apt_type = APTTYPE;
    }
    
    public String getRentalFee(){
        return rental_fee;
    }
    
    public void setRentalFee(String RENTALFEE){
        this.rental_fee = RENTALFEE;
    }
    
    public String getBName(){
        return building_name;
    }
    
    public void setBName(String BNAME){
        this.building_name = BNAME;
    }
    
    //CLASS CONSTRUCTORS
    public Apartment_Class(){}
    
    public Apartment_Class(Integer APTNUM, String APTSIZE, String APTTYPE, String RENTALFEE, String BNAME){
        this.apt_num = APTNUM;
        this.apt_size = APTSIZE;
        this.apt_type = APTTYPE;
        this.rental_fee = RENTALFEE;
        this.building_name = BNAME;
    }
    
    
    //INSERT, EDIT, REMOVE APARTMENT FUNCTION
    public boolean executeQueryType(String queryType, Apartment_Class type){
        PreparedStatement ps;
        
        //ADD APARTMENT
        if(queryType.equals("add")){
            String add_query = "INSERT INTO `apartment`(`apartmentNumber`, `size`, `aptType`, `rentalFee`, `buildingName`) VALUES (?, ?, ?, ?, ?)";
            try {
                ps = Db_Connect.Connect().prepareStatement(add_query);
                ps.setInt(1, type.getAptNum());
                ps.setString(2, type.getAptSize());
                ps.setString(3, type.getAptType());
                ps.setString(4, type.getRentalFee());
                ps.setString(5, type.getBName());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Apartment_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//ADD APARTMENT END
        
        //EDIT APARTMENT
        else if(queryType.equals("edit")){
            String edit_query = "UPDATE `apartment` SET `size`=?,`aptType`=?,`rentalFee`=?,`buildingName`=? WHERE `apartmentNumber` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(edit_query);
                ps.setString(1, type.getAptSize());
                ps.setString(2, type.getAptType());
                ps.setString(3, type.getRentalFee());
                ps.setString(4, type.getBName());
                ps.setInt(5, type.getAptNum());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Apartment_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//EDIT APARTMENT END
        
        //REMOVE APARTMENT
        else if(queryType.equals("remove")){
            String remove_query = "DELETE FROM `apartment` WHERE `apartmentNumber` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(remove_query);
                ps.setInt(1, type.getAptNum());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Apartment_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//REMOVE APARTMENT END
        else{
            JOptionPane.showMessageDialog(null, "Select Your Preferred Action", "Invalid Action", 2);
            return false;
        }
        
    }
    
    //Method To Return An ArrayList Of Apartments
    public ArrayList<Apartment_Class> apartmentList(){
        ArrayList<Apartment_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `apartment`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Apartment_Class apartment;
            
            while(rs.next()){
                apartment = new Apartment_Class(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                list.add(apartment);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Apartment_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    
}
