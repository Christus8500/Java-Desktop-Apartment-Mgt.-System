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
public class Employee_Class {
    
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private String phone;
    private String email;
    
    
    //GETERS AND SETERS
    public Integer getId(){
        return id;
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
        return this.email;
    }
    
    public void setEmail(String EMAIL){
        this.email = EMAIL;
    }
    
    //CLASS CONSTRUCTORS
    public Employee_Class(){}
    
    public Employee_Class(Integer ID, String FNAME, String LNAME, String PASSWORD, String PHONE, String EMAIL){
        this.id = ID;
        this.firstname = FNAME;
        this.lastname = LNAME;
        this.password = PASSWORD;
        this.phone = PHONE;
        this.email = EMAIL;
    }
    
    
    //INSERT, EDIT, REMOVE EMPLOYEE FUNCTION
    public boolean executeQueryType(String queryType, Employee_Class type){
        PreparedStatement ps;
        
        //ADD EMPLOYEE
        if(queryType.equals("add")){
            String add_query = "INSERT INTO `employee`(`firstname`, `lastname`, `password`, `phone`, `email`) VALUES (?, ?, ?, ?, ?)";
            try {
                ps = Db_Connect.Connect().prepareStatement(add_query);
                ps.setString(1, type.getFirstName());
                ps.setString(2, type.getLastName());
                ps.setString(3, type.getPassword());
                ps.setString(4, type.getPhone());
                ps.setString(5, type.getEmail());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Employee_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//ADD EMPLOYEE END
        
        //EDIT EMPLOYEE
        else if(queryType.equals("edit")){
            String edit_query = "UPDATE `employee` SET `firstname`= ?,`lastname`= ?,`password`= ?, `phone`= ?,`email`= ? WHERE `employeeID` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(edit_query);
                ps.setString(1, type.getFirstName());
                ps.setString(2, type.getLastName());
                ps.setString(3, type.getPassword());
                ps.setString(4, type.getPhone());
                ps.setString(5, type.getEmail());
                ps.setInt(6, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Employee_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//EDIT EMPLOYEE END
        
        //REMOVE EMPLOYEE
        else if(queryType.equals("remove")){
            String remove_query = "DELETE FROM `employee` WHERE `employeeID` = ?";
            try {
                ps = Db_Connect.Connect().prepareStatement(remove_query);
                ps.setInt(1, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(Employee_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }//REMOVE EMPLOYEE END
        else{
            JOptionPane.showMessageDialog(null, "Select Your Preferred Action", "Invalid Action", 2);
            return false;
        }
        
    }
    
    //Method To Return An ArrayList Of Employees
    public ArrayList<Employee_Class> employeeList(){
        ArrayList<Employee_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `employee`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Employee_Class employee;
            
            while(rs.next()){
                employee = new Employee_Class(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(employee);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Employee_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
    
}
