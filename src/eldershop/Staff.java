/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldershop;

/**
 *
 * @author Admin
 */
public class Staff {
    private int ID;
    private String name;
    private String password;
    
    public Staff(int ID,String name, String password){
        this.name=name;
        this.ID=ID;
        this.password=password;
    }
    
    public String getName(){
        return name;
    }
    
}
