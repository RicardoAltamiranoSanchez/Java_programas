/*
 pedir numeros hasta que se teclee un cero,mostrar la suma de todos los numeros
introducidos
 */
package ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0,suma=0;
        do 
        {
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            suma+=numero;
            
        }while(numero!=0);
        JOptionPane.showMessageDialog(null,"La suma total es:"+suma);
    }
    
}
