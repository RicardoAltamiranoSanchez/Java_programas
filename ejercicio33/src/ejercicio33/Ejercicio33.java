/*
leer dos series de 10 enteros,que estaran ordenados crecientemente
copiar(fusionar)las dos tablas en una tercera,de forma que sigan ordenados
 */
package ejercicio33;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int numeros1[]=new int[10];
        int numeros2[]=new int[10];
        int fusion[]=new int[20];
        boolean creciente=false;
        System.out.println("Arreglo uno");
        do
        {
            for(int n=0; n<10; n++)
            {
                System.out.println("Digite un numero");
                numeros1[n]=entry.nextInt();
              
            }
            for(int m=0;m<9; m++)
            {
             if(numeros1[m]<numeros1[m+1])
            {
                creciente=true;
            }
             else if(numeros1[m]>numeros1[m+1])
            {
               creciente=false;
            }    
             else
             {
                 creciente=false;
             }
            }
            if(creciente==false)
                
            {
                 System.out.println("El arreglo debe estar ordenado crecientemente");
            }
           
            
            
        }while(!creciente);
        System.out.println("Arreglo dos");
        do
        {
            for(int n=0; n<10; n++)
            {
                System.out.println("Digite un numero");
                numeros2[n]=entry.nextInt();
              
            }
            for(int m=0;m<9; m++)
            {
             if(numeros2[m]<numeros2[m+1])
            {
                creciente=true;
            }
             else if(numeros2[m]>numeros2[m+1])
            {
               creciente=false;
            }    
             else
             {
                 creciente=false;
             }
            }
            if(creciente==false)
                
            {
                 System.out.println("El arreglo debe estar ordenado crecientemente");
            }
           
            
            
        }while(!creciente);
        int j=0;
        int k=0;
        int f=0;
        while(j<10 && k<10)
        {
            if(numeros1[j]<numeros2[k])
            {
                fusion[f]=numeros1[j];
                j++;
                
            }
            else
            {
                fusion[f]=numeros2[k];
                k++;
            }
            f++;
            
        }
        if(j==10)
        {
            while(j<10){
            fusion[f]=numeros1[j];
            j++;
            f++;
            }
            
        }
        else
        {
            while(k<10)
            {
                fusion[f]=numeros2[k];
                k++;
                f++;
            }
        }
        System.out.println("Arreglo final");
        for(int n=0; n<=fusion.length;n++)
        {
            System.out.println(n+"->"+fusion[n]);
        }
       
    }
    
}
