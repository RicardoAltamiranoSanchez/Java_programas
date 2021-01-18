/*
 pedir  un numero y pedir su factorial
 */
package ejecicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejecicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0,res=0,numero2=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero para el factorila "));
        
        
        for( int n=1; n<=numero; n++)
        {
           numero2=numero*n;
            res+=numero2;
        }
        JOptionPane.showMessageDialog(null,"El factorial es :"+res);
    }
    
}
