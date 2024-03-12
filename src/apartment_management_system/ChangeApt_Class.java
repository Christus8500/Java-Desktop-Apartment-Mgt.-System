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
public class ChangeApt_Class {
    
    private int apt_change_id;
    private int tenant_id;
    private int current_apt_num;
    private int new_apt_num;
    private String date;
    


    //CLASS CONSTRUCTORS
    public ChangeApt_Class(){}

    public ChangeApt_Class(Integer ID, Integer TENANTID, Integer CURRENT_APT_NUM, Integer NEW_APT_NUM, String DATE){
        this.apt_change_id = ID;
        this.tenant_id = TENANTID;
        this.current_apt_num = CURRENT_APT_NUM;
        this.new_apt_num = NEW_APT_NUM;
        this.date = DATE;
    }

    public int getApt_change_id() {
        return apt_change_id;
    }

    public void setApply_id(int apt_change_id) {
        this.apt_change_id = apt_change_id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    //ADD CHANGE APT FUNCTION
    public boolean addChange(ChangeApt_Class change){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `apartmentchange`(`tenantID`, `apartmentNumber`, `newAptNumber`, `changeDate`) VALUES (?, ?, ?, ?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setInt(1, change.getTenant_id());
            ps.setInt(2, change.getCurrent_apt_num());
            ps.setInt(3, change.getNew_apt_num());
            ps.setString(4, change.getDate());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(ChangeApt_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD CHANGE APT APPLICATION END
    
    
    //EDIT CHANGE APT FUNCTION
    public boolean editChange(ChangeApt_Class change){
        PreparedStatement ps;
        
        String edit_query = "UPDATE `apartmentchange` SET  `tenantID`= ?,`apartmentNumber`= ?,`newAptNumber`= ?,`changeDate`= ? WHERE `apartmentChangeID` = ?";
        try {
            ps = Db_Connect.Connect().prepareStatement(edit_query);
            ps.setInt(1, change.getTenant_id());
            ps.setInt(2, change.getCurrent_apt_num());
            ps.setInt(3, change.getNew_apt_num());
            ps.setString(4, change.getDate());
            ps.setInt(5, change.getApt_change_id());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(ChangeApt_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//EDIT CHANGE APT END
        
    
    //Method To Return An ArrayList Of APARTMENT CHANGE RECORDS
    public ArrayList<ChangeApt_Class> changeList(){
        ArrayList<ChangeApt_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `apartmentchange`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            ChangeApt_Class change;
            
            while(rs.next()){
                change = new ChangeApt_Class(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
                list.add(change);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ChangeApt_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
