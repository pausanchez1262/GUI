/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class UseOptionPanes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"What is your name?");
        int choice = JOptionPane.showConfirmDialog(null, "Do you like cake, " + name + "?");
        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Of course! who doesn't?");
        }else{
            JOptionPane.showMessageDialog(null, "We'll have to agree to disagree");
        }
    }
    
}
