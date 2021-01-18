/* hacer un programa que calcule una ecuacion de segundo grado
ax^2+bx+c=0;

x=-b-+ raizb^2-4ac/2a

*/
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        double a,b,c,x1,x2;
        double a2,b2;
        System.out.println("Digite a");
        a=entry.nextDouble();
        System.out.println("Digite b");
        b=entry.nextDouble();
        System.out.println("Digite c");
        c=entry.nextDouble();
        b2=b;
        b2*=b2;
        a2=-4*(a*c);
        a2-=b2;
        a2=Math.sqrt(2);
        a2/=2*a;
        x1=-b-a2;
        x2=-b+a2;
        System.out.println("EL primer resultadoe es"+x1);
        System.out.println("\n el segundo resultado es"+x2);
        
    }
    
}
