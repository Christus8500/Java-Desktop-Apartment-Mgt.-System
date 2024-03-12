/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment_management_system;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.MysqlDataSource;


/**
 *
 * @author Christus
 */
public class Db_Connect {
    
    private static String servername = "localhost";
    private static String dbname = "amsproject_db";
    private static String username = "root";
    private static Integer portnumber = 3306;
    private static String password = "";
     
    
    //Method for the connection
    public static Connection Connect(){
        Connection connection = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try{
            connection = datasource.getConnection();
        }catch (SQLException ex){
            Logger.getLogger(Db_Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;       
    }
    // Connection Method End
    
}
