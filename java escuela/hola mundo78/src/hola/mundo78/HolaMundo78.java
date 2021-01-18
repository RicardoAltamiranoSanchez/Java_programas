/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo78;

/**
 *
 * @author Ricardo
 */import java.util.Scanner;
public class HolaMundo78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =  new Scanner (System.in);
         int entero;
          System.out.print( "escribe un numero: ");
          entero = entrada.nextInt(); 
           System.out.println( " tu numero es: "+entero);
        // TODO code application logic here
    }
    
}
