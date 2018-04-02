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
public class User {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String city; 
    private Date dob;
    private int phoneNumber,zipCode;
    private String gender;
    
    public User(int ID, String firstName,String lastName, String email, String city, Date dob, int phoneNumber, int zipCode, String gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.city=city;
        this.dob=dob;
        this.phoneNumber=phoneNumber;
        this.zipCode=zipCode;
        this.gender=gender;
        
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public void setCity(String city){
        this.city=city;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    
    public void setZipCode(int zipCode){
        this.zipCode=zipCode;
    }
    public void setDob(Date dob){
        this.dob=dob;
    }
    
    public void setGender(String gender){
        this.gender=gender;
    }
    
    
    
     public String getFirstName(){
        return firstName ;
    }
    
    public String getLastName(){
        return lastName ;
    }
    
    public String getCity(){
        return city ;
    }
    public String getEmail(){
        return email ;
    }
    public int getPhoneNumber(){
        return phoneNumber ;
    }
    
    public int getZipCode(){
        return zipCode;
    }
    public Date getDob(){
        return dob;
    }
    
    public String getGender(){
        return gender;
    }
    
    public int getID(){
        return ID;
    }
}
