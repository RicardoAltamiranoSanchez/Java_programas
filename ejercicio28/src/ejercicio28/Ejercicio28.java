/*
diseñar un aplicacion que declare una tabla de 10 elementos
enteros ,leer mediante el teclado 8 numeros,despues se debe pedir un numero
y una posicion, insertalo en la posicion indicada,desplazando los que esten 
detras
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entry=new Scanner(System.in);
    int numeros[]=new int[10];
    int numero,posicion;
        System.out.println("Llenando arreglo");
        for(int n=0; n<8; n++)
        {
            
            System.out.print("Digite un  numero");
            numeros[n]=entry.nextInt();
        }
        System.out.println("Pidiendo la posicion");
        System.out.print("Digite el numero");
        numero=entry.nextInt();
        System.out.print("Digite la posicion");
        posicion=entry.nextInt();
        for(int n=7; n>=posicion; n--)
        {
            numeros[n+1]=numeros[n];
        }
        numeros[posicion]=numero;
        for(int n=0; n<9; n++)
        {
            System.out.println(n+":"+numeros[n]);
        }
        
        
    }
    
}
