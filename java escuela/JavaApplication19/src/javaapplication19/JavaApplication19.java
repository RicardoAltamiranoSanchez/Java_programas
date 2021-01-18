
package javaapplication19;
import javax.swing.JOptionPane;
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:")); 
        if ( numero%10 ==0){
            JOptionPane.showMessageDialog(null," el numero es multiplo de 10");}
        else{ 
            JOptionPane.showMessageDialog(null"el numero no es multiplo de 10");
        }
    
}
