/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment_management_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Christus
 */
public class Tenant_Class {
    
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private String phone;
    private String email;
    private String address;
    private String zipcode;
    
    
    //GETERS AND SETERS
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer ID){
        this.id = ID;
    }
    
    public String getFirstName(){
        return firstname;
    }
    
    public void setFirstName(String FNAME){
        this.firstname = FNAME;
    }
    
    public String getLastName(){
        return lastname;
    }
    
    public void setLastName(String LNAME){
        this.lastname = LNAME;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String PASSWORD){
        this.password = PASSWORD;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String PHONE){
        this.phone = PHONE;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String EMAIL){
        this.email = EMAIL;
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
    public Tenant_Class(){}
    
    public Tenant_Class(Integer ID, String FNAME, String LNAME, String PASSWORD, String PHONE, String EMAIL, String ADDRESS, String ZIPCODE){
        this.id = ID;
        this.firstname = FNAME;
        this.lastname = LNAME;
        this.password = PASSWORD;
        this.phone = PHONE;
        this.email = EMAIL;
        this.address = ADDRESS;
        this.zipcode = ZIPCODE;
    }
    
    
    //INSERT, EDIT, REMOVE EMPLOYEE FUNCTION
    public boolean executeQueryType(String queryType, Tenant_Class type){
        PreparedStatement ps;
        
        //ADD TENANT
        if(queryType.equals("add")){
            String add_query = "INSERT INTO `tenant`(`firstname`, `lastname`, `password`, `phone`, `email`, `currentAddress`, `cityStateZip`) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try {
                ps = Db_Connect.Connect().prepareStatement(add_query);
                ps.setString(1, type.getFirstName());
                ps.setString(2, type.getLastName());
                ps.setString(3, type.getPassword());
                ps.setString(4, type.getPhone());
                ps.setString(5, type.getEmail());
                ps.setString(6, type.getAddress());
                ps.setString(7, type.getZipcode());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Tenant_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//ADD TENANT END
        
        //EDIT TENANT
        else if(queryType.equals("edit")){
            String edit_query = "UPDATE `tenant` SET `firstname`= ?,`lastname`= ?,`password`= ?, `phone`= ?,`email`= ?, `currentAddress` = ?, `cityStateZip` = ? WHERE `tenantID` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(edit_query);
                ps.setString(1, type.getFirstName());
                ps.setString(2, type.getLastName());
                ps.setString(3, type.getPassword());
                ps.setString(4, type.getPhone());
                ps.setString(5, type.getEmail());
                ps.setString(6, type.getAddress());
                ps.setString(7, type.getZipcode());
                ps.setInt(8, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Tenant_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//EDIT TENANT END
        
        //REMOVE TENANT
        else if(queryType.equals("remove")){
            String remove_query = "DELETE FROM `tenant` WHERE `tenantID` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(remove_query);
                ps.setInt(1, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Tenant_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//REMOVE TENANT END
        else{
            JOptionPane.showMessageDialog(null, "Select Your Preferred Action", "Invalid Action", 2);
            return false;
        }
        
    }
    
    //Method To Return An ArrayList Of Tenants
    public ArrayList<Tenant_Class> tenantList(){
        ArrayList<Tenant_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `tenant`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Tenant_Class tenant;
            
            while(rs.next()){
                tenant = new Tenant_Class(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                list.add(tenant);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Tenant_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    
}
