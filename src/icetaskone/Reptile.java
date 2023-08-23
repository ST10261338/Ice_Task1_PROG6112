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
public class Reptile extends Animal{
    private double bloodTemp;

    public double getBloodTemp() {
        return bloodTemp;
    }

    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
    public void rept(){
        System.out.println("This is a reptile");
    }
    @Override
    protected void input(){
        setSpecies(JOptionPane.showInputDialog(null, "Enter Reptile Species"));
        setIDtag(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter animal ID")));
        setBloodTemp(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter blood temp")));
        output();
    }
    @Override
    protected void output() {
        JOptionPane.showMessageDialog(null, "Reptile\n" + "Species: " + getSpecies() +"\nIDtag: "+ getIDtag()
              + "\nBlood Temp: " + getBloodTemp());
        
    }
}
