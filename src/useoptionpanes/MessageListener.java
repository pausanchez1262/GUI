/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */

    public class MessageListener implements ActionListener{
        
        JTextField field;
        
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, field.getText());
        }
        
        public MessageListener(JTextField field){
            this.field = field;
        }
    }
