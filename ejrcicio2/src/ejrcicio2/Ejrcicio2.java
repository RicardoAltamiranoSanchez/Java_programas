/*una compañia de venntas de autos usados paga asu personal de ventas  un salario de 1000
mensuales,mas una comision  de 150 por cada auto vendido  mas del 5% del valor de venta por 
cada mes el capturista de la empresa ingresa en la computadora los datos prtinentes
hacer un programa  que calcule e imprima el salario mensual  de un vendedor dado
*/
package ejrcicio2;

import java.util.Scanner;

public class Ejrcicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double salario_mensual=1000;
        double comision ;
        int valor;
        Scanner entrada= new Scanner(System.in);
        System.out.println("DIgite los autos veniddos");
        comision=entrada.nextInt();
        comision*=150;
        System.out.println("Digite el valor de venta de este mes");
        valor=entrada.nextInt();
        valor*= .05;
        salario_mensual=comision+valor;
        System.out.println("Salario final  del vendedor es:"+salario_mensual);
        
    }
    
}
