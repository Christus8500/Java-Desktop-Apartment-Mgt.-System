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
public class Lease_Class {
    
    private int lease_id;
    private int tenant_id;
    private int apt_num;
    private String start_date;
    private String end_date;
    private String monthly_rent;
    private String sec_deposit;
    private String status;
    


    //CLASS CONSTRUCTORS
    public Lease_Class(){}

    public Lease_Class(Integer ID, Integer TENANT_ID, Integer APT_NUM, String START_DATE, String END_DATE, String MONTHLY_RENT, String SEC_DEPOSIT, String STATUS){
        this.lease_id = ID;
        this.tenant_id = TENANT_ID;
        this.apt_num = APT_NUM;
        this.start_date = START_DATE;
        this.end_date = END_DATE;
        this.monthly_rent = MONTHLY_RENT;
        this.sec_deposit = SEC_DEPOSIT;
        this.status = STATUS;

    }

    public int getLease_id() {
        return lease_id;
    }

    public void setLease_id(int lease_id) {
        this.lease_id = lease_id;
    }

    public int getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(int tenant_id) {
        this.tenant_id = tenant_id;
    }

    public int getApt_num() {
        return apt_num;
    }

    public void setApt_num(int apt_num) {
        this.apt_num = apt_num;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getMonthly_rent() {
        return monthly_rent;
    }

    public void setMonthly_rent(String monthly_rent) {
        this.monthly_rent = monthly_rent;
    }

    public String getSec_deposit() {
        return sec_deposit;
    }

    public void setSec_deposit(String sec_deposit) {
        this.sec_deposit = sec_deposit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    //ADD LEASE FUNCTION
    public boolean addLease(Lease_Class lease){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `lease`(`tenantID`, `apartmentNumber`, `startDate`, `endDate`, `MonthlyRent`, `securityDeposit`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setInt(1, lease.getTenant_id());
            ps.setInt(2, lease.getApt_num());
            ps.setString(3, lease.getStart_date());
            ps.setString(4, lease.getEnd_date());
            ps.setString(5, lease.getMonthly_rent());
            ps.setString(6, lease.getSec_deposit());
            ps.setString(7, lease.getStatus());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Lease_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD LEASE END
        
    
    //EDIT LEASE FUNCTION
    public boolean editLease(Lease_Class lease){
        PreparedStatement ps;
        
        String edit_query = "UPDATE `lease` SET `tenantID`= ?,`apartmentNumber`= ?,`startDate`= ?,`endDate`= ?,`MonthlyRent`= ?,`securityDeposit`= ?,`status`= ? WHERE `leaseID` = ?";
        try {
            ps = Db_Connect.Connect().prepareStatement(edit_query);
            ps.setInt(1, lease.getTenant_id());
            ps.setInt(2, lease.getApt_num());
            ps.setString(3, lease.getStart_date());
            ps.setString(4, lease.getEnd_date());
            ps.setString(5, lease.getMonthly_rent());
            ps.setString(6, lease.getSec_deposit());
            ps.setString(7, lease.getStatus());
            ps.setInt(8, lease.getLease_id());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Lease_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//EDIT LEASE END
    
    //Method To Return An ArrayList Of Lease
    public ArrayList<Lease_Class> leaseList(){
        ArrayList<Lease_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `lease`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Lease_Class lease;
            
            while(rs.next()){
                lease = new Lease_Class(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
                list.add(lease);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Lease_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
