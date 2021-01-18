
package javaapplication18;
import javax.swing.JOptionPane;
     

public class JavaApplication18 {
    public static void main(String[] args) {
         int dato;
         dato = Integer.parseInt( JOptionPane.showInputDialog( " digite un numero entre 1 y 5:"));
         switch (dato){
             case 1:JOptionPane.showMessageDialog(null, " es el numero 1:");
             break;
             case 2:JOptionPane.showMessageDialog(null, "es el numero 2:");
             break;
             case 3:JOptionPane.showMessageDialog( null," este  es el  numero  3:");
             break;
             case 4:JOptionPane.showMessageDialog(null,"este es el caso 4:");
             break;
             case 5:JOptionPane.showMessageDialog(null," este es el caso 5:");
             break;
             default: JOptionPane.showMessageDialog(null,"el numero n o esta en el rango de 1 a 5");    
         }
        
    }
    
}
