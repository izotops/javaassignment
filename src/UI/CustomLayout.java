/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.awt.*;

import javax.swing.*;
/**
 *
 * @author Admin
 */
public class CustomLayout {
    public static final String logoPath="/images/logo/Logo_Final.png";
    public Font font = new Font("Century Gothic", 1, 14);
      //Jpanel,JComponent,int x,int y, int width, int height, int anchor, int fill
    public static void addComp(JPanel panel, JComponent component, int x,int y,int width,int height, int anchor, int fill,float weightx,float weighty ){
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth =width;
        gbc.gridheight=height;
        gbc.insets=new Insets(1,1,1,1);
        gbc.anchor=anchor;
        gbc.fill = fill;
        gbc.weightx=weightx;
        gbc.weighty=weighty;
        panel.add(component,gbc);
    }
    
    public JButton buttonIconR(JButton btn,String text,String imgPath){
        btn = new JButton(new ImageIcon(getClass().getResource(imgPath)));
        btn.setVerticalTextPosition(SwingConstants.CENTER);
        btn.setHorizontalTextPosition(SwingConstants.LEFT);
        btn.setMargin(new Insets(0, 0, 0, 0));
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setFont(font);
        btn.setText(text);
        return btn;
        
    }
     public JButton buttonIconL(JButton btn,String text,String imgPath){
        btn = new JButton(new ImageIcon(getClass().getResource(imgPath)));
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setMargin(new Insets(0, 0, 0, 0));
        btn.setText(text);
        btn.setFont(font);
        return btn;
    }
    
    public JButton customButton(JButton btn,String text){
        btn = new JButton(text);
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setMargin(new Insets(0, 0, 0, 0));
        btn.setFont(font);
        return btn;
        
    }
    
    public Image getLogo(){
        Image img= new ImageIcon(getClass().getResource(logoPath)).getImage();
        return img;
    }
}
