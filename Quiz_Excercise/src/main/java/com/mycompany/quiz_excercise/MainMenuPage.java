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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ASUS
 */
class MainMenuPage extends JFrame {
    JLabel smallRoomLabel = new JLabel("Small Room - Rp50,000/night");
    JLabel largeRoomLabel = new JLabel("Large Room - Rp100,000/night");
    JButton smallRoomButton = new JButton("Book Small Room");
    JButton largeRoomButton = new JButton("Book Large Room");
    
    public MainMenuPage() {
        setTitle("Hotel Booking - Main Menu Page");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        smallRoomLabel.setBounds(50,50,200,32);
        smallRoomButton.setBounds(50,75,200,32);
        largeRoomLabel.setBounds(50, 110, 200, 20);
        largeRoomButton.setBounds(50, 135, 200, 30);
        
        add(smallRoomLabel);
        add(smallRoomButton);
        add(largeRoomLabel);
        add(largeRoomButton);
        
        smallRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BookingPage(new SmallRoom());
            }
        });
        
        largeRoomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BookingPage(new LargeRoom());
            }
        });
        
        setVisible(true);
    }
}