/*
metodo insercion
 */
package insercion37;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Insercion37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entry=new Scanner(System.in);
       int numeros[],aux,pos,ele;
        System.out.println("Digite el numero d elementos");
        ele=entry.nextInt();
        numeros=new int[ele];
        for(int n=0; n<numeros.length; n++)
        {
            System.out.println("Digite un numero");
            numeros[n]=entry.nextInt();
        }
        
        System.out.println("Ordenando el arreglo");
        for(int i=0; i<ele; i++)
        {
            pos=i;
            aux=numeros[i];
            while((pos>0) && (numeros[pos-1]>aux))
            {
                numeros[pos]=numeros[pos-1];
                pos--;
            }
            numeros[pos]=aux;
        }
        System.out.println("Imprimiendo arreglo");
        for(int n=0; n<ele; n++)
        {
            System.out.println(n+":"+numeros[n]);
        }
        
    }
    
}
