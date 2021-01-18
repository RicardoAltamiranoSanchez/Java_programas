/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio43;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int matriz1[][]=new int[5][9];
         int matriz2[][]=new int[9][5];
         System.out.println("Llenado la matriz 1");
         for(int n=0; n<5; n++)
         {
             for(int m=0; m<9;m++)
             {
                 System.out.print("Digite un numero  "+"["+n+"]["+m+"]:");
                 matriz1[n][m]=entry.nextInt();
             }
         }
         System.out.println("Mostrando la  matriz original");
         for(int n=0; n<5; n++)
         {
             for(int m=0; m<9;m++)
             {
                 System.out.print(matriz1[n][m]+" ");
                 
                 
             }
             System.out.println("");
         }
         System.out.println("Haciendo la transpuesta");
         for(int n=0; n<5; n++)
         {
             for(int m=0; m<9;m++)
             {
                 matriz2[m][n]=matriz1[n][m];
             }
         }
         
             System.out.println("Imprimiendo la matriz transpuesta");
         for(int n=0; n<9; n++)
         {
             for(int m=0; m<5;m++)
             {
                 System.out.print(matriz2[n][m]+" ");
                 
             }
             System.out.println("");
         }
         System.out.println("");
         
    }
    
}
