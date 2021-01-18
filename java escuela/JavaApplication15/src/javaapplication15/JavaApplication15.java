
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner ( System.in);        
        System.out.print("digite el numero de horas:");
    int horastotales,semanas,dias,horas;
        horastotales = entrada.nextInt();
        semanas = horastotales / 168;
        dias = horastotales%168 /24;
        horas =horastotales%24;
        System.out.println("\nEL EQUIVALENTE ES");
        System.out.println("semanas"+semanas);
        System.out.println("dias"+dias);
        System.out.println("horas"+horas);
        
    }
    
}
