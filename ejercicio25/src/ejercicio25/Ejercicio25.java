/*
leer por teclado dos tablas de 10 numeros enteros y mezclarlas
 en un tercera de la forma. 1 de A,el 1 de B,2 en A,el 2 en B etc; 
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
       int numeros1[]=new int[5];
       int numeros2[]=new int[5];
       for(int n=0; n<=5; n++)
       {
           System.out.print("DIgite un numero tabla 1: "+n+"->");
           numeros1[n]=entry.nextInt();
           System.out.print("DIgite un numero tabla 2: "+n+"->");
           numeros2[n]=entry.nextInt();
           
           
       }
       for(int m=0; m<=5; m++)
       {
           System.out.println("DIgite un numero tabla 1"+m+"->"+  numeros1[m]);
           System.out.println("DIgite un numero tabla 2"+m+"->"+numeros2[m]);
           
           
           
       }
       
       
    }
    
}
