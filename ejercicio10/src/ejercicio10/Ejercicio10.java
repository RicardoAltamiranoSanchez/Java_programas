/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author ricar
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        float gramos,deca,hecto,kilo;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Conversion de  masa\n"
                + "1 Decagramo\n"
                + "2 hectogramoi\n"
                + "3 kilogramo\n"
                + "4 salir"));
        
        
            
            
        switch(opcion)
                {
            case 1:
                gramos=Float.parseFloat(JOptionPane.showInputDialog("Digite loas gramos"));
               deca=gramos*10;
               JOptionPane.showMessageDialog(null,"En decagramos son"+deca);
               break;
            case 2:
                 gramos=Float.parseFloat(JOptionPane.showInputDialog("Digite loas gramos"));
               hecto=gramos*100;
               JOptionPane.showMessageDialog(null,"En hectogramos son"+hecto);
               break;
            case 3:
                 gramos=Float.parseFloat(JOptionPane.showInputDialog("Digite loas gramos"));
               kilo=gramos*1000;
               JOptionPane.showMessageDialog(null,"En kilogramos son"+kilo);
               break;
            case 4:break;
            default: JOptionPane.showMessageDialog(null," Esa opcion no existe");
                    break;
                }
       
        
        
    }
    
}
