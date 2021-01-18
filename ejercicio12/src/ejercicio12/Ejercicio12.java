/*
 pedir numeros hasta que se  teclee uno negativo y mostrar cuantos numeros
se han introducido
 */
package ejercicio12;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,i=0;
        Scanner entry = new Scanner(System.in);
        
        do {
            System.out.println("Digite un numero");
            num=entry.nextInt();
            i++;
        } while(num>=0);
        
        System.out.println("los numero digitalos son:"+i);
    }
    
}
