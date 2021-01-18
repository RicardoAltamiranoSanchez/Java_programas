/*
 leer  10  enteros en una tabla.guardar en otra tabla  los elementos pares de la primera
y acontinuacion los elementos impares
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        
        int numeros[]=new int[10];
        int pares[];
        int impares[];
        int cont_par=0;
        int cont_impar=0;
        System.out.println("Llenando arreglo");
        for(int n=0; n<10; n++)
        {
            System.out.println("Digite un numero");
            numeros[n]=entry.nextInt();
            if(numeros[n]%2==0)
            {
                cont_par++;
                
                
            }
            else
            {
                cont_impar++;
            }
        }
        pares=new int[cont_par];
        impares=new int[cont_impar];
        cont_par=0;
        cont_impar=0;
      for(int n=0; n<10; n++)
        {
            if(numeros[n]%2==0)
            {
               pares[cont_par]=numeros[n];                
                cont_par++;
            }
            else
            {
                impares[cont_impar]=numeros[n];
                cont_impar++;
            }
        }
            System.out.println("PARES:");
            for(int m=0; m<cont_par; m++)
                    
                {
                    System.out.println(m+"->"+pares[m]);
                }
            System.out.println("IMPARES");
              for(int m=0; m<cont_impar; m++)
                    
                {
                    System.out.println(m+"->"+impares[m]);
                }
                
                
        
      
    }
}
