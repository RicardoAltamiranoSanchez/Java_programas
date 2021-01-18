/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrcicio38;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejrcicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        int numeros[],tamaño,aux,pos;
        System.out.println("Digite el tamaño del arreglo");
        tamaño=entry.nextInt();
        numeros=new int[tamaño];
        System.out.println("llenando arreglo");
        for(int n=0; n<numeros.length; n++)
        {
            System.out.println("Digite un numero");
            numeros[n]=entry.nextInt();
            
        }
        System.out.println("Ordenando arreglo");
        for(int n=0; n<numeros.length; n++)
        {
            pos=n;
            aux=numeros[n];
            while(pos>0 && numeros[pos-1]>aux)
            {
                numeros[pos]=numeros[pos-1];
                pos--;
            }
            numeros[pos]=aux;
        }
        
        System.out.println("Imprimiendo arreglo ya ordenado");
        for(int n=0; n<numeros.length;n++)
        {
            System.out.println(n+":"+numeros[n]);
        }
        
    }
    
}
