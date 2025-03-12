/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz_excercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */

public class LoginPage extends JFrame implements ActionListener {
    JLabel tulisan = new JLabel("LOGIN PAGE");
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    LoginPage(){
        //setting frame
        setVisible(true);
        setSize(720, 480);
        setTitle("Title: Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(tulisan);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passwordTextField);
        add(loginButton);
        add(resetButton);
        
        tulisan.setBounds(210,20,150,24);
        usernameLabel.setBounds(20,84,440,12);
        passwordLabel.setBounds(20,152,440,12);
        usernameTextField.setBounds(18,100,440,32);
        passwordTextField.setBounds(20,170,440,32);
        loginButton.setBounds(50,220,200,32);
        resetButton.setBounds(50,275,200,32);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            //login button
            if(e.getSource() == loginButton){
                //code yang dijalankan jika diklik tombol button login
                String username = usernameTextField.getText();
                char[]passwordChar = passwordTextField.getPassword();
                String password = new String(passwordChar); 
            
                if(username.equals("adm") && password.equals("adm")){
                    JOptionPane.showMessageDialog(this, "Login success");
                    new MainMenuPage();
                    this.dispose(); //untuk nutup frame yang sebelumnya, jadinya login page auto ketutup, pindah ke home page
                }
                else {
                    JOptionPane.showMessageDialog(this, "Wrong username or password");
                }
            }
            //reset button
            else if(e.getSource() == resetButton){
                // kode yang dijalankan jika tombol reset diklik
                usernameTextField.setText("");
                passwordTextField.setText("");
            }
        } catch (Exception error){}
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}