 
package javaapplication12;
import java.util.Scanner;
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  entrada = new Scanner (System.in); 
        float lunes,martes,miercoles,jueves,viernes,sabado, suma;
        System.out.println("escribe cuanto ganas por cada dia de la semana");
        lunes =entrada.nextFloat();
        martes =entrada.nextFloat();
        miercoles = entrada.nextFloat();
        jueves = entrada.nextFloat();
        viernes = entrada.nextFloat();
        sabado = entrada.nextFloat();
        suma= lunes+martes+miercoles+jueves+viernes+sabado;
        System.out.println("\nlo que gana es"+suma);
        
        // TODO code application logic here
    }
    
}
