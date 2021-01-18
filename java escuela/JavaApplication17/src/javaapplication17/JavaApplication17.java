//setencia if
package javaapplication17;

import javax.swing.JOptionPane;


public class JavaApplication17 {

   
    public static void main(String[] args) {
        int numero,dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        if( numero !=dato){
        JOptionPane.showMessageDialog(null,"el numero es diferente 5");
        
    }
        else{ 
           JOptionPane.showMessageDialog ( null," el numero es igual 5");
    }
    
    
    
    }
