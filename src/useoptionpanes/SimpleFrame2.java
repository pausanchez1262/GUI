/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class SimpleFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("icon.gif");
        frame.setIconImage(icon);
        
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 120));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setTitle("A frame");
        frame.setLayout(new FlowLayout());
        
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("north"), BorderLayout.NORTH);
        frame.add(new JButton("south"), BorderLayout.SOUTH);
        frame.add(new JButton("west"), BorderLayout.WEST);
        frame.add(new JButton("east"), BorderLayout.EAST);
        frame.add(new JButton("center"), BorderLayout.CENTER);
        
        JLabel label = new JLabel(" ");
        JTextField field = new JTextField(5);
        
        JButton button1 = new JButton();
        button1.setText("I'm a button");
        button1.setBackground(Color.BLUE);
        frame.add(button1);
        
        button1.addActionListener(null);
        
        JButton button2 = new JButton();
        button2.setText("I'm a button");
        button2.setBackground(Color.RED);
        frame.add(button2);
        
        frame.setVisible(true);
    }
    
}
