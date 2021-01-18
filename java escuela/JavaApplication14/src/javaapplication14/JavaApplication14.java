
package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         
       
        int a, b, c;
        System.out.println(" digite tu primer numero:");
        a = entrada.nextInt();
        System.out.println(" digite tu segundo numero:");
        b = entrada.nextInt();
        a *= 2;
        b *= 2;
        c = a+b;
        System.out.println("tu resultado es:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
