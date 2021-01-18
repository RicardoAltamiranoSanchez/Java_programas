
package javaapplication21;

import javax.swing.JOptionPane;

public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char letra;
       letra = JOptionPane.showInputDialog(" digite una letra:").charAt(0);
       if ( Character.isUpperCase (letra)){
           JOptionPane.showMessageDialog(null,"es una letra masyuscula");
       }
       else {
           JOptionPane.showMessageDialog(null,"es una letra minuscula");
       }
    }
    
}
