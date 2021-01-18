/*
 metodo burbuja 
 */
package javaapplication36;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int numeros[],aux,ele;
        System.out.println("Digite el tamaño del arreglo");
        ele=entry.nextInt();
        numeros=new int[ele];
        System.out.println("llenando arreglo");
        for(int n=0;n<numeros.length; n++)
        {
            numeros[n]=entry.nextInt();
        }
        System.out.println("Ordenando arreglo");
        for(int n=0;n<(numeros.length-1); n++)
        {
            for(int j=0; j<(numeros.length-1); j++)
            {
                if(numeros[j]>numeros[j+1])
                {
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                    
                }
            }
        }
        System.out.println("imprimmiendo arreglo de forma ancedente");
        for(int n=0;n<numeros.length; n++)
        {
            System.out.println(n+":"+numeros[n]);
        }
        System.out.println("");
        System.out.println("imprimiendo de forma decedente");
        for(int n=(ele-1);n>=0; n--)
        {
            System.out.println(n+":"+numeros[n]);
              
        }
        
    }
    
}
