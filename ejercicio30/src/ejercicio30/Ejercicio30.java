/*
crear un programa que lea por teclado una tabla de diez
numeros enteros y desplace n posiciones en el arreglo
(N es digitado por el usuario)
 */
package ejercicio30;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entry=new Scanner(System.in);
       int numeros[]=new int[10];
       int pos=0;
       int vuelta=0;
        System.out.println("Llenando arreglo");
        for(int n=0; n<numeros.length; n++)
        {
            System.out.print("Digite un numero");
            numeros[n]=entry.nextInt();
        }
        System.out.println("Digite la posicion que deseas recorrer");
        pos=entry.nextInt();
        while(vuelta!=pos)
        {
            int ultimo=numeros[9];
             for(int n=8;n>=0; n--)
        {
            numeros[n+1]=numeros[n];
        }   
             numeros[0]=ultimo;
             vuelta++;
        }
    
        for(int n=0; n<numeros.length; n++)
        {
            System.out.println(n+":"+numeros[n]);
        }
        
    }
    
}
