/*
leer  10 enteros ordenados crecientemente,leer  N y buscarlo en la tabla se debe mostrar la 
posicion en la que se encuentra si no esta indicarlo con un mensaje
 */
package ejercicio34;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int numeros[],numero;
        numeros=new int[10];
        boolean creciente=false;
        System.out.println("Llenando el arreglo");
        do{
        for(int n=0; n<10; n++)
        {
            System.out.println("Digite un numero");
            numeros[n]=entry.nextInt();
            
        }   
        for(int n=0; n<9; n++)
            {
                if(numeros[n]<numeros[n+1])
                {
                    creciente =true;
                }
                else if(numeros[n]>numeros[n+1])
                {
                    creciente=false;
                }
            
            }
        if(creciente==false)
        {
            System.out.println("El arreglo  no esta ordenado crecientemente,vuelva a digitarlo");
        }
        }while(!creciente);
        System.out.println("pidiendo numero");
        System.out.println("Digite un numero");
        numero=entry.nextInt();
        int m=0;
        while(m<10 && numeros[m]<numero)
        {
            m++;
        }
        if(m==10)
        {
            System.out.println("no se encontro el numero");
            
        }
        else if(numeros[m]==numero)
        {
            System.out.println("Numero encontrado en la posicion"+m);  
        }else
        {
            System.out.println("No se encontro el numero");
        }
        
    }
    
}
