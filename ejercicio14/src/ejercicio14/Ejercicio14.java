/*
 pedir un numero n,y mostrar todos lo numeros del 1 al n
 */
package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,m=1;
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(m!=n)
        {
            JOptionPane.showMessageDialog(null,"numero:"+m);
            m++;
            
        }
        JOptionPane.showMessageDialog(null,"numero:"+n);
        
    }
    
}
