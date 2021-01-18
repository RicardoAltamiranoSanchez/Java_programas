/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Objeto {
    String modelo;
    String color;
    int km;
    
    public static void main(String[] args)
    {
        Objeto nu1= new Objeto();
        JOptionPane.showMessageDialog(null,"LLenado los datos");
        nu1.color="Rojo";
        nu1.modelo="audi";
        nu1.km=1999;
        System.out.println("color"+nu1.color);
        System.out.println("color"+nu1.modelo);
        System.out.println("color"+nu1.km);
        
    }
}
