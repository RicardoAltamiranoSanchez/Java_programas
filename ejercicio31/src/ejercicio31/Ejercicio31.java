/*
leer 5 elementos numericos que se introduciran ordenados de forma
creciente.estos los guardaremos en una tabla de tamaño 10.leer
un numero N,e insertarlo en el lugar adecuado para que la
tabla continue ordenada
*/
package ejercicio31;

import java.util.Scanner;


public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry =new Scanner(System.in);
        int numeros[]=new int[10];
        int numero;
        boolean creciente=false;
        int sitio_numero=0;
        int j=0;
        System.out.println("llenado arreglo");
        
       
        do{
            for(int n=0; n<5; n++)
            {
               System.out.print("Digite un numero");
                  numeros[n]=entry.nextInt();
            }
            for(int n=0; n<4; n++)
            {
                if(numeros[n]<numeros[n+1])
                {
                    creciente =true;
                }
                else if(numeros[n]>numeros[n+1])
                {
                    creciente =false;
                    break;
                }
                
            }
            if(creciente==false)
            {
                System.out.println("el arreglo no esta creciente vuelva a digitar los numeros");
            }
    
    
        }while(!creciente);
         System.out.println("Digite el numero que quiere ingresar");
        numero=entry.nextInt();
        while(numeros[j]<numero && j<5)
        {
           sitio_numero++;
            j++;
        }
        for(int n=4; n>=sitio_numero; n--)
        {
            numeros[n+1]=numeros[n];
        }
        numeros[sitio_numero]=numero;
        for(int n=0; n<6;n++)
        {
            System.out.println(n+"->"+numeros[n]);
        }
    } 
    
    
    
}
