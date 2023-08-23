/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskone;

import javax.swing.JOptionPane;

/**
 *
 * @author matth
 */
public class Bird extends Animal{
    private int colour;

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }
    public void brd () {
        System.out.println("This is a bird");
    }
    @Override
    protected void input(){
        setSpecies(JOptionPane.showInputDialog(null, "Enter Bird Species"));
        setIDtag(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter animal ID")));
        setColour(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter bird colour:\n"
        + "1) Grey\n"+"2) white\n"+"3) black")));
        output();
    }
    @Override
    protected void output() {
        switch (getColour()) {
            case 1: JOptionPane.showMessageDialog(null, "Bird\n" + "Species: " + getSpecies() +"\nIDtag: "
                    + getIDtag() + "\nColour: Grey");break;
            case 2: JOptionPane.showMessageDialog(null, "Bird\n" + "Species: " + getSpecies() +"\nIDtag: "
                    + getIDtag() + "\nColour: white");break;
            case 3: JOptionPane.showMessageDialog(null, "Bird\n" + "Species: " + getSpecies() +"\nIDtag: "
                    + getIDtag() + "\nColour: Black");break;
    }
}
}