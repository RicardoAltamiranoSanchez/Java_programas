
package javaapplication31;

import java.util.Scanner;

public class JavaApplication31 {

  
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int contador;
        System.out.println("digite la cantidad de terminos:");
        contador = entrada.nextInt();
        
        for(int i=1; i<=contador; i++){// (int i=10 i>=1; i--)
            System.out.println(i);
            
        }
   
    }
    
}
