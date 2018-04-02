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

/**
 *
 * @author Admin
 */
public class CustomLogin extends JFrame {

    private int ID;
    private boolean validateUser, validatePass;
    private String userName = "testing";
    Font font = new Font("Century Gothic", 1, 14);
    JLabel accImage;
    JLabel userLab, passLab;
    JTextField userField;
    JPasswordField passField;
    JButton loginBtn;
    JButton backBtn;
    GridBagLayout grid = new GridBagLayout();

    CustomLayout cusLay = new CustomLayout();

    public CustomLogin() {

        setTitle("Login Staff");

        this.setIconImage(cusLay.getLogo());

        this.setMinimumSize(new Dimension(450, 400));
        this.setPreferredSize(new Dimension(500, 400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        accImage = new JLabel();
        accImage.setIcon(new ImageIcon(getClass().getResource("/images/material/account_circle_grey_192x192.png")));
        JPanel panel = new JPanel(grid);
        panel.setBackground(new Color(240, 240, 240));
        CustomLayout.addComp(panel, accImage, 0, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE, 0, 0);
        add(panel);

        userLab = new JLabel("User ID:");
        passLab = new JLabel("Password:");
        userLab.setFont(font);
        passLab.setFont(font);
        userField = new JTextField(30);
        userField.setToolTipText("Your ID(digits only)");
        userField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                validateUserField();
            }

        });
        passField = new JPasswordField(30);

        CustomLayout.addComp(panel, userLab, 0, 2, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE, 0, 0);
        CustomLayout.addComp(panel, userField, 1, 2, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, 0, 0);
        CustomLayout.addComp(panel, passLab, 0, 3, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE, 0, 0);
        CustomLayout.addComp(panel, passField, 1, 3, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE, 0, 0);
        loginBtn = cusLay.buttonIconR(loginBtn, "Login", "/images/material/navigate_next_black_36x36.png");
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (userField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Please fill all fields!", "Invalid", JOptionPane.WARNING_MESSAGE);
                } else if (validateUserField()) {
                    login();
                }
            }

        });
        backBtn = cusLay.buttonIconL(backBtn, "Back", "/images/material/navigate_before_black_36x36.png");
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backAction();
            }

        });
        JPanel butPan = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        butPan.setBackground(new Color(240, 240, 240));
        butPan.add(backBtn);
        butPan.add(loginBtn);

        CustomLayout.addComp(panel, butPan, 1, 4, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE, 0, 0);

        pack();
        //setSize(600, 350);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    private void login() {
        Eldershop.ID = ID;
        Eldershop.userName = userName;
        StaffHomeUI staffHome = new StaffHomeUI();
        this.dispose();
    }

    private boolean validateUserField() {
        if (userField.getText().length() == 0) {
            return false;
        }
        try {
            ID = Integer.parseInt(userField.getText());
            System.out.println("An integer");
            if (ID < 0) {
                JOptionPane.showMessageDialog(null, "Invalid ID", "Invalid", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Insert digits only", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void backAction() {
        HomeUI home = new HomeUI();
        this.dispose();
    }

}
