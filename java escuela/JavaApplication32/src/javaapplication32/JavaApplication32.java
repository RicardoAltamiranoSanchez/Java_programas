
package javaapplication32;
import javax.swing.JOptionPane;
public class JavaApplication32 {

    
    public static void main(String[] args) {
        int numero,cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        while (numero>=0){
            cuadrado = (int)Math.pow(numero,2);
        JOptionPane.showMessageDialog(null,"el numero:"+numero+"elevado al cuadralo es:"+cuadrado);
        numero =Integer.parseInt(JOptionPane.showInputDialog("escriba otro numero:"));
        }
        
      
    }
    
}
