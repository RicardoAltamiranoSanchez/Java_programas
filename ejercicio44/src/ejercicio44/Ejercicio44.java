/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio44;

/**
 *
 * @author ricar
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[][]=new int [5][5];
        System.out.println("Haciendo la matriz");
        for(int n=0; n<5; n++)
        {
            for(int m=0; m<5; m++)
            {
                if(n==0 || n==4)
                {
                    numeros[n][m]=1;
                }
                else if(m==0 || m==4)
                {
                    numeros[n][m]=1;
                }
                else
                {
                    numeros[n][m]=0;
                }
                
            }
        }
        System.out.println("Imprimiendo la matriz");
        for(int n=0; n<5; n++)
        {
            for(int m=0; m<5; m++)
            {
                System.out.print(numeros[n][m]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
