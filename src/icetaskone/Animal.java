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
public class Animal {
    private int IDtag;
    private String species;

    public int getIDtag() {
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void execute() {
        input();
    }
    protected void input(){
        setSpecies(JOptionPane.showInputDialog(null, ""));
    }
    protected void output(){
        JOptionPane.showConfirmDialog(null, getSpecies());
    }
}
