/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import eldershop.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class CustomerUI extends JFrame{
    private static ArrayList<Customer> cusList;
    private JPanel panel;
    private JButton deleteBtn,backBtn;
    private JTable table;
    private JScrollPane scrollTable;
    private Object[][] initRow={};
    private String[] columnTitle={"ID","First Name", "Last Name", "Email", "City", "DOB", "Phone Number" ,"Postal Code" ,  "Gender" ,"Address", "District","Registration Date" ,"last Login" ,"IP","Activated"};
    private DefaultTableModel tModel;
    StaffHomeUI homeUI;
    GridBagLayout grid = new GridBagLayout();

    CustomLayout cusLay = new CustomLayout();
    
    public CustomerUI(StaffHomeUI homeUI){
        setTitle("Customer Details");
        this.setIconImage(cusLay.getLogo());
        this.homeUI=homeUI;
        tModel=new DefaultTableModel(initRow,columnTitle);
        table=new JTable();
        table.setModel(tModel);
        scrollTable=new JScrollPane(table);
        panel = new JPanel(grid);
        panel.setBackground(new Color(240, 240, 240));
        CustomLayout.addComp(panel, scrollTable, 0, 0, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, 1, 1);
        add(panel);
        deleteBtn=cusLay.customButton(deleteBtn, "Delete");
        CustomLayout.addComp(panel, deleteBtn, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, 0, 0);
        backBtn=cusLay.customButton(backBtn, "Back");
        backBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                back();
            }
            
        });
        CustomLayout.addComp(panel, backBtn, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE, 0, 0);
        fillTable();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
    
    private void fillTable(){
        cusList=CustomerManager.getCustomerList();
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        Object[] col=new Object[15];
        for(Customer customer:cusList){
            col[0] =customer.getID();
            col[1] =customer.getFirstName();
            col[2] =customer.getLastName();
            col[3] =customer.getEmail();
            col[4] =customer.getCity();
            col[5] =customer.getDob();
            col[6] =customer.getPhoneNumber();
            col[7] =customer.getZipCode();
            col[8] =customer.getGender();
            col[9] =customer.getAddress();
            col[10] =customer.getDistrict();
            col[11] =customer.getRegDate();
            col[12] =customer.getLastLogin();
            col[13] =customer.getIP();
            col[14] =customer.getActivate();
            model.addRow(col);
        }
    }
    
    
    private void back(){
        this.setVisible(false);
        homeUI.setVisible(true);
        this.dispose();
    }
    
    
}


