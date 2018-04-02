/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Admin
 */



public class HomeUI extends JFrame{
    private JLabel adminLab;
    private JPanel adminPan;
    private JPanel staffPan;
    private JLabel banHead;
    private JPanel bannerPan;
    private JPanel container;
    private JLabel jLabel1;
    private JLabel staffLab;
    CustomLayout custLay=new CustomLayout();
    
    public HomeUI(){
        
        bannerPan = new JPanel();
        banHead = new JLabel();
        staffPan = new JPanel();
        staffLab = new JLabel();
        adminPan = new JPanel();
        adminLab = new JLabel();
        container = new JPanel();

        
           
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ElderShop");
        setIconImage(custLay.getLogo());
        setBackground(new Color(255, 255, 255));
        setMinimumSize(new Dimension(530, 310));
        setPreferredSize(new Dimension(530, 310));
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        bannerPan.setBackground(new Color(204, 204, 204));

        banHead.setFont(new Font("Century Gothic", 1, 24)); // NOI18N
        banHead.setForeground(new Color(255, 255, 255));
        banHead.setText("Welcome to Eldershop");
        
        bannerPan.add(banHead);

        getContentPane().add(bannerPan);
        bannerPan.setBounds(0, 0, 540, 50);

        staffPan.setBackground(new Color(204, 204, 204));

        staffLab.setFont(new Font("Century Gothic", 1, 14)); // NOI18N
        staffLab.setForeground(new Color(255, 255, 255));
        staffLab.setIcon(new ImageIcon(getClass().getResource("/images/material/account_circle_white_96x96.png"))); // NOI18N
        staffLab.setText("STAFF");
        staffPan.add(staffLab);
        staffPan.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
                staffLabMouseClicked(evt);
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
               JPanel parent = (JPanel)e.getSource();
                parent.setBackground(Color.gray);
                parent.revalidate();
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                JPanel parent = (JPanel)e.getSource();
                parent.setBackground(new Color(204, 204, 204));
                parent.revalidate();
            }


            
        });
        getContentPane().add(staffPan);
        staffPan.setBounds(270, 130, 160, 100);

        adminPan.setBackground(new Color(204, 204, 204));

        adminLab.setFont(new Font("Century Gothic", 1, 14)); // NOI18N
        adminLab.setForeground(new Color(255, 255, 255));
        adminLab.setIcon(new ImageIcon(getClass().getResource("/images/material/supervisor_account_white_96x96.png"))); // NOI18N
        adminLab.setText("ADMIN");
        adminPan.add(adminLab);
        adminPan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                adminLabMouseClicked(evt);
                
            }
            
             @Override
            public void mouseEntered(MouseEvent e) {
               JPanel parent = (JPanel)e.getSource();
                parent.setBackground(Color.gray);
                parent.revalidate();
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                JPanel parent = (JPanel)e.getSource();
                parent.setBackground(new Color(204, 204, 204));
                parent.revalidate();
            }
        });

        getContentPane().add(adminPan);
        adminPan.setBounds(90, 130, 160, 100);

        container.setBackground(new Color(255, 255, 255));
        container.setLayout(null);
        getContentPane().add(container);
        container.setBounds(0, 0, 530, 310);
        setVisible(true);
    }
    
    private void adminLabMouseClicked(MouseEvent evt){
        CustomLogin cusLogin=new CustomLogin();
        this.dispose();
    }
    
    private void staffLabMouseClicked(MouseEvent evt){
        CustomLogin cusLogin=new CustomLogin();
        this.dispose();
    }
}
