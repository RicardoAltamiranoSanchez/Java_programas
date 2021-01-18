
package javaapplication10;
import java.util.Scanner;

public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        
        float nota1,nota2,nota3,suma;
        System.out.println(" digite 3 calificaciones");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        suma = nota1+nota2+nota3;
        System.out.println("\nla suma es"+suma);
         
    }
    
}
