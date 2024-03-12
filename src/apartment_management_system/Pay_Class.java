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
public class Pay_Class {
    
    private int pay_id;
    private String date;
    private String amount;
    private int apt_num;
    


    //CLASS CONSTRUCTORS
    public Pay_Class(){}

    public Pay_Class(Integer ID, String DATE, String AMOUNT, Integer APT_NUM){
        this.pay_id = ID;
        this.date = DATE;
        this.amount = AMOUNT;
        this.apt_num = APT_NUM;

    }

    public int getPay_id() {
        return pay_id;
    }

    public void setPay_id(int pay_id) {
        this.pay_id = pay_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getApt_num() {
        return apt_num;
    }

    public void setApt_num(int apt_num) {
        this.apt_num = apt_num;
    }

    
    
    
    //ADD PAY FUNCTION
    public boolean addPay(Pay_Class pay){
        PreparedStatement ps;
        
        String add_query = "INSERT INTO `payment`( `payDate`, `payAmount`, `apartmentNumber`) VALUES (?, ?, ?)";
        try {
            ps = Db_Connect.Connect().prepareStatement(add_query);
            ps.setString(1, pay.getDate());
            ps.setString(2, pay.getAmount());
            ps.setInt(3, pay.getApt_num());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Pay_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//ADD PAY END
        
    
    //EDIT PAY FUNCTION
    public boolean editPay(Pay_Class pay){
        PreparedStatement ps;
        
        String edit_query = "UPDATE `payment` SET `payDate`= ?,`payAmount`= ?,`apartmentNumber`= ? WHERE `payID` = ?";
        try {
            ps = Db_Connect.Connect().prepareStatement(edit_query);
            ps.setString(1, pay.getDate());
            ps.setString(2, pay.getAmount());
            ps.setInt(3, pay.getApt_num());
            ps.setInt(4, pay.getPay_id());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Pay_Class.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//EDIT PAY END
    
    //Method To Return An ArrayList Of Payments
    public ArrayList<Pay_Class> payList(){
        ArrayList<Pay_Class> list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `payment`";
        
        try {
            st = Db_Connect.Connect().createStatement();
            rs = st.executeQuery(selectQuery);
            
            Pay_Class pay;
            
            while(rs.next()){
                pay = new Pay_Class(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                list.add(pay);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Pay_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
