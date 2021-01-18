/*
 hacer un programa que calcule la suma d eu cuadralo (a+b)^2 =a^2+b^2+2ab;
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c,resultado;
       Scanner entrada=new Scanner (System.in);
        System.out.println("Digite la primera variable");
        a=entrada.nextInt();
        System.out.println("Digite la segunda variable");
        b=entrada.nextInt();
        a=(int)Math.pow(a,2);
        b=(int)Math.pow(b,2);
        c=2 * (a*b);
        resultado=a+b+c;
        System.out.println("El resultado es:"+resultado);
    }
    
}
