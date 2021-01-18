/*
 pide un numero(que debe estar entre 0 y 10) y mostrar la tabla de 
multiplicar de dicho numero
 */
package ejercicicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero;
       numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 10"));
       for(int n=1; n<=10; n++)
       {
           
           JOptionPane.showMessageDialog(null,"por"+n+"="+numero*n);
       }
    }
    
}
