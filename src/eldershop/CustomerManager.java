/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldershop;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CustomerManager {
    
    
    
    //filter , order must be ASC or DESC
    public static ArrayList<Customer> getCustomerList(){
        ArrayList<Customer> customerList=new ArrayList();
        try (
         // Step 1: Allocate a database 'Connection' object
        Connection con = ConnectionManager.getConnection();
        // Step 2: Allocate a 'Statement' object in the Connection
         //Statement stmt = con.createStatement();
         PreparedStatement stmt=con.prepareStatement("select * from users"); 
      ) {
         // Step 3: Execute a SQL SELECT query, the query result
         //  is returned in a 'ResultSet' object.
         
         String strSelect = "SELECT * FROM users";
         
         
         System.out.println("The SQL query is: " + strSelect); // Echo For debugging
         System.out.println();
 
         //ResultSet rset = stmt.executeQuery(strSelect);
         ResultSet rset=stmt.executeQuery();
 
         // Step 4: Process the ResultSet by scrolling the cursor forward via next().
         //  For each row, retrieve the contents of the cells with getXxx(columnName).
         System.out.println("The records selected are:");
        
         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
            
            Customer customer=new Customer(rset.getInt("UserID"),rset.getString("FirstName"),rset.getString("LastName"),rset.getString("Email"),rset.getString("City"),rset.getDate("dob"),rset.getInt("Phone"),rset.getInt("Zip"),rset.getString("Gender"),rset.getString("Address"),rset.getString("District"),rset.getTimestamp("RegistrationDate"),rset.getTimestamp("LastLogin"),rset.getString("IP"),rset.getInt("Activated"));
            customerList.add(customer);
            
         }
         
 
      } catch(SQLException ex) {
        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
      }
        
        return customerList;
    }
}
