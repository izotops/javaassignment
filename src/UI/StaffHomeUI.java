/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import eldershop.Eldershop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Admin
 */
public class StaffHomeUI extends JFrame{
    CustomLayout custLay=new CustomLayout();
    JLabel welcomeLab;
    JButton customerBtn,testingBtn,testing2Btn;
    JPanel panel;
    JPanel banner;
    StaffHomeUI(){
        setTitle("Staff");
        setIconImage(custLay.getLogo());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel=new JPanel(new GridBagLayout());
        welcomeLab=new JLabel("Welcome"+Eldershop.userName);
        welcomeLab.setVerticalTextPosition(SwingConstants.NORTH);
        welcomeLab.setFont(custLay.font);
        
        CustomLayout.addComp(panel, welcomeLab, 0, 0, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, 0, 0);
        add(panel);
        customerBtn=custLay.customButton(customerBtn, "View Customer List");
        customerBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                openCustUI();
            }
            
        });
        CustomLayout.addComp(panel, customerBtn, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, 0, 1);
        
        pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    private void openCustUI(){
        CustomerUI custUI=new CustomerUI(this);
        this.setVisible(false);
    }
}
