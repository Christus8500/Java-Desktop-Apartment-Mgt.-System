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
public class Apply_AptChange_Class {
    
    private int apply_id;
    private int tenant_id;
    private int current_apt_num;
    private int new_apt_num;
    private String reason;
    private String date;
    


    //CLASS CONSTRUCTORS
    public Apply_AptChange_Class(){}

    public Apply_AptChange_Class(Integer ID, Integer TENANTID, Integer CURRENT_APT_NUM, Integer NEW_APT_NUM, String REASON, String DATE){
        this.apply_id = ID;
        this.tenant_id = TENANTID;
        this.current_apt_num = CURRENT_APT_NUM;
        this.new_apt_num = NEW_APT_NUM;
        this.reason = REASON;
        this.date = DATE;
    }

    public int getApply_id() {
        return apply_id;
    }

    public void setApply_id(int apply_id) {
        this.apply_id = apply_id;
    }

    public int getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(int tenant_id) {
        this.tenant_id = tenant_id;
    }

    public int getCurrent_apt_num() {
        return current_apt_num;
    }

    public void setCurrent_apt_num(int current_apt_num) {
        this.current_apt_num = current_apt_num;
    }

    public int getNew_apt_num() {
        return new_apt_num;
    }

    public void setNew_apt_num(int new_apt_num) {
        this.new_apt_num = new_apt_num;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    //ADD TENANT APPLICATION FUNCTION
    public boolean addApply(Apply_AptChange_Class apply){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `apt_change_apply`(`tenantID`, `currentApt`, `newApt`, `reason`, `date`) VALUES (?, ?, ?, ?, ?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setInt(1, apply.getTenant_id());
            ps.setInt(2, apply.getCurrent_apt_num());
            ps.setInt(3, apply.getNew_apt_num());
            ps.setString(4, apply.getReason());
            ps.setString(5, apply.getDate());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Apply_AptChange_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD TENANT APPLICATION END
        
    
    //Method To Return An ArrayList Of TENANT APPLICATION
    public ArrayList<Apply_AptChange_Class> applyList(){
        ArrayList<Apply_AptChange_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `apt_change_apply`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Apply_AptChange_Class apply;
            
            while(rs.next()){
                apply = new Apply_AptChange_Class(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                list.add(apply);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Apply_AptChange_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
