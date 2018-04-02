/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldershop;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class ConnectionManager{
   private static String url = "jdbc:mysql://localhost:3306/pharmx";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "12345678";
    private static Connection con;
    

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
                System.out.println("Connected."); 
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."+ ex.getMessage());
               JOptionPane.showMessageDialog(null,"Failed to create the database connection."+ ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
               System.exit(0);
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
}