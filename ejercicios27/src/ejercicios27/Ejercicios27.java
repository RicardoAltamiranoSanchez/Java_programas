/*
 leer por teclado  una serie de 10 numeros enteros la aplicacion
debe indicarnos si los numeros estan ordenados de forma crecientemente
decreciente o desordenados
 */
package ejercicios27;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicios27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
       int numero[]=new int[10];
       boolean creciente=false;
       boolean descreciente=false;
        System.out.println("Llenado arreglo ");
        for(int n=0; n<numero.length; n++)
        {
            System.out.println("DIgite un numero");
            numero[n]=entry.nextInt();
        }
        for(int n=0; n<numero.length-1; n++)
        {
            if(numero[n]<numero[n+1])
            {
                creciente=true;
            }
            else if(numero[n]>numero[n+1])
            {
                descreciente=true;
            }
        }
        if(creciente==true && descreciente==false)
        {
            System.out.println("El arreglo es creciente");
        }
        else if(creciente==false && descreciente==true)
        {
            System.out.println("El arreglo es descreciente");
        }
        if(creciente==true  && descreciente==true)
        {
            System.out.println("El arreglo esta desordenado");
        }
        if(creciente==false && descreciente==false)
        {
            System.out.println("los numero son iguales");
        }
       
    }
    
}
