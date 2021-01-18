/*
pedir dos numeros y decir cual es el mayor o sin son iguales
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2;
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite el sehundo numero"));
        if(numero1>numero2)
        {
            JOptionPane.showMessageDialog(null,"eL numero mayo es:"+numero1);
        }
        else if(numero2>numero1)
        {
            JOptionPane.showMessageDialog(null,"El numero mayor es:"+numero2);
        }
        else if(numero1==numero2)
        {
            JOptionPane.showMessageDialog(null,"Son iguales");
        }
    }
    
}
