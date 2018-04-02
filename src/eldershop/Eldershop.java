/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldershop;

import UI.*;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Eldershop {
   private static Connection con=null;
   public static String userName;
   public static int ID;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       // TODO code application logic here
       con = ConnectionManager.getConnection();
       try {
           con.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"There was a problem when closing connection."+ ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
       }
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Error LAF");
        }
       HomeUI home=new HomeUI();
    }
    
    
    
    
}
