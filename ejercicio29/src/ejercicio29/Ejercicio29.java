/*
crear un programa que lea por teclado una tabla de 10 numeros
enteros y la desplace una posicion hacia abajo:el primer pasa
a ser el segundo,el segundo pasa a ser el tercero y asi sucesivamente
el ultimo pasa ser el primero
 */
package ejercicio29;

import java.util.Scanner;

public class Ejercicio29 {


    public static void main(String[] args) {
     
        Scanner entry=new Scanner(System.in);
        int numeros[]=new int[10];
        System.out.println("Llenando arreglo");
        for(int n=0; n<numeros.length; n++)
        {
            System.out.print("Digite un numero");
            numeros[n]=entry.nextInt();
        }
        int ultimo=numeros[9];
        System.out.println("Moviendo arreglo");
        for(int n=8; n>=0; n--)
        {
            numeros[n+1]=numeros[n];
            
       
        }
        numeros[0]=ultimo;
        System.out.println("Imprimiendo arreglo");
        for (int n=0;n<numeros.length;n++)
        {
            System.out.println(n+":"+numeros[n]);
        }
        
    }
    
}
