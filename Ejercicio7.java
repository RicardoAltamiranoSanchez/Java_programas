/*
pedir un  numero entre 0 y 99 999 y decir cuantas cifras tiene
 */
package ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long numero;
       numero=Long.parseLong(JOptionPane.showInputDialog("Digte un  numero"));
       if(numero>=0 && numero<=9)
       {
           JOptionPane.showMessageDialog(null,"tiene una cifra");
       }
       else if(numero>=10 && numero<=99)
       {
           JOptionPane.showMessageDialog(null,"El numero tiene dos cifras");
       }
       else if(numero>=100 && numero<=999)
       {
           JOptionPane.showMessageDialog(null,"El numero tiene tres cifras");
       }
       else if(numero>=1000 && numero<=9999)
       {
           JOptionPane.showMessageDialog(null,"El numero tiene cuatro cifras");
       }
       else if(numero>=10000 && numero<=99999)
       {
           JOptionPane.showMessageDialog(null,"El numero tiene cinco cifras");
       }
       else 
       {
           JOptionPane.showMessageDialog(null,"Error");
       }
    }
    
}
