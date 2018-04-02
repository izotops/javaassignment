/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldershop;


import java.sql.Time;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Admin
 */
public class Customer extends User{
   private String address,district; 
    private Timestamp regDate; 
    private String IP;
    private Timestamp lastLogin;
    private int activate;

    public Customer(int ID,String firstName, String lastName, String email, String city, Date dob, int phoneNumber, int zipCode, String gender,String address, String district,Timestamp regDate,Timestamp lastLogin,String IP,int activate) {
        super(ID,firstName, lastName, email, city, dob, phoneNumber, zipCode, gender);
        this.address=address;
        this.district=district;
        this.regDate=regDate;
        this.IP=IP;
        this.lastLogin=lastLogin;
        this.activate=activate;
    }
    
   public String getAddress(){
       return address;
   }
   
   public String getDistrict(){
       return district;
   }
    
   
   public String getIP(){
       return IP;
   }
   
   
   
   public Timestamp getRegDate(){
       return regDate;
   }
   
   public Timestamp getLastLogin(){
       return lastLogin;
   }
  
   public int getActivate(){
       return activate;
   }
    
    
    
    
    
}
