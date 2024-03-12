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
public class Tenant_Complaint_Class {
    
    private int complaint_id;
    private int apt_num;
    private String building_name;
    private String tenant_email;
    private String complaint;
    


    //CLASS CONSTRUCTORS
    public Tenant_Complaint_Class(){}

    public Tenant_Complaint_Class(Integer ID, String B_NAME, Integer APT_NUM, String TENANT_EMAIL, String COMPLAINT){
        this.complaint_id = ID;
        this.apt_num = APT_NUM;
        this.building_name = B_NAME;
        this.tenant_email = TENANT_EMAIL;
        this.complaint = COMPLAINT;

    }

    public int getComplaint_id() {
        return complaint_id;
    }

    public void setComplaint_id(int complaint_id) {
        this.complaint_id = complaint_id;
    }

    public int getApt_num() {
        return apt_num;
    }

    public void setApt_num(int apt_num) {
        this.apt_num = apt_num;
    }
    
    public String getBuilding_Name() {
        return building_name;
    }

    public void setBuilding_Name(String building_name) {
        this.building_name = building_name;
    }

    public String getTenant_email() {
        return tenant_email;
    }

    public void setTenant_email(String tenant_email) {
        this.tenant_email = tenant_email;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }


    
    //ADD COMPLAINT FUNCTION
    public boolean addComplaint(Tenant_Complaint_Class complaint){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `tenant_complaint`(`buildingName`, `apartmentNo`, `tenant_email`, `complaint`) VALUES (?, ?, ?, ?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setString(1, complaint.getBuilding_Name());
            ps.setInt(2, complaint.getApt_num());
            ps.setString(3, complaint.getTenant_email());
            ps.setString(4, complaint.getComplaint());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Tenant_Complaint_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD COMPLAINT END
        
    
    //Method To Return An ArrayList Of COMPLAINTS
    public ArrayList<Tenant_Complaint_Class> complaintList(){
        ArrayList<Tenant_Complaint_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `tenant_complaint`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Tenant_Complaint_Class complaint;
            
            while(rs.next()){
                complaint = new Tenant_Complaint_Class(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                list.add(complaint);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Tenant_Complaint_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
