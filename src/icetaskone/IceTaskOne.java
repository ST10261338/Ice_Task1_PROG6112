/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskone;

import javax.swing.JOptionPane;

/**
 *
 * @author matth
 */
public class IceTaskOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //select whic class you want to use
        int choice;
        Bird bd = new Bird();
        Reptile rep = new Reptile();
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please"
        + " enter what kind of animal you have:\n" + "1) Reptile\n" +"2) Bird"));
        
        switch (choice) {
            case 1: rep.execute();break;
            case 2: bd.execute(); break;
        }
    }
}
