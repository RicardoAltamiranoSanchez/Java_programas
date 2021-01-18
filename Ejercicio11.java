/*
 leer un numero e indicar si es positivo o negativo.el proceso se repetira
hasta que se introduzca un 0
 */
package ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero ;
         
        do
        {
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
            
            if(numero>0)
            {
                JOptionPane.showMessageDialog(null,"El numero es positivo");
            }
            else if(numero<0)
            {
                JOptionPane.showMessageDialog(null,"El numero es negativo");
            }
            else
            {
                
            }
            
        
        
        }while(numero!=0);
        
    }
    
}
