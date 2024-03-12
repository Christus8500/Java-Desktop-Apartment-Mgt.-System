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
public class RequestMaintenance_Class {
    
    private int request_id;
    private int apt_num;
    private String description;
    private String date;
    


    //CLASS CONSTRUCTORS
    public RequestMaintenance_Class(){}

    public RequestMaintenance_Class(Integer ID, Integer APT_NUM, String DESCRIPTION, String DATE){
        this.request_id = ID;
        this.apt_num = APT_NUM;
        this.description = DESCRIPTION;
        this.date = DATE;
    }

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public int getApt_num() {
        return apt_num;
    }

    public void setApt_num(int apt_num) {
        this.apt_num = apt_num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    //ADD TENANT REQUEST FUNCTION
    public boolean addRequest(RequestMaintenance_Class request){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `maintenance_request`( `apartmentNo`, `description`, `date`) VALUES (?,?,?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setInt(1, request.getApt_num());
            ps.setString(2, request.getDescription());
            ps.setString(3, request.getDate());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(RequestMaintenance_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD TENANT REQUEST END
        
    
    //Method To Return An ArrayList Of TENANT REQUEST
    public ArrayList<RequestMaintenance_Class> requestList(){
        ArrayList<RequestMaintenance_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `maintenance_request`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            RequestMaintenance_Class request;
            
            while(rs.next()){
                request = new RequestMaintenance_Class(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                list.add(request);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RequestMaintenance_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
