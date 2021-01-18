
package javaapplication20;

import javax.swing.JOptionPane;

public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero ;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un mnumero:"));
        
        if( numero%10 ==0){
            JOptionPane.showMessageDialog(null,"el numero"+numero+"es multiplo de 10");
        }
        else {
             JOptionPane.showMessageDialog(null,"no es multiplo de 10");
    }
    
}
