
package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float participacion, primerexamen, segundoexamen, examenfinal, notafinal;
      //pedir los datos necesarios
        System.out.println("digite la nota de participacion:");
        
        participacion = entrada.nextFloat();
        System.out.print(" digite la nota del primer examen parcial:");
        primerexamen = entrada.nextFloat();
        System.out.print(" digite el segundo esxamen parcial:");
        segundoexamen = entrada.nextFloat();
        System.out.print("digite tu examen final:");
        examenfinal = entrada.nextFloat();
        participacion *= 0.10f;
        primerexamen *= 0.25f;
        segundoexamen *= 0.25f;
        examenfinal*= 0.40f;
        notafinal= participacion + primerexamen +segundoexamen+examenfinal;
        
        System.out.println("tu calificacion final:"+notafinal);
    }
    
}
