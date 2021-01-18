/*
queremos desarrollar unas aplicacion que nos ayude a gestionar las notas
de un centro educativo.cada grupo (o clase) esta compuesto por 5 alumnos 
.se pide leer la notas de primer,segundo trimestre,de un grupo
debemos mostrar al final la nota media del grupo.en cada trimestre y la media
del alumno que se encuentra en la posicion n(n se lee por teclado); 
 */
package ejercicios35;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicios35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        float primer[],segundo[],tercero[];
        float suma_primer=0,suma_segundo=0,suma_tercero=0;
        float prome_primer=0,prome_segundo=0,prome_tercero=0;
        int posicion=0;
        float suma_alu=0,prome_alum=0;
        
        primer=new float[5];
        segundo=new float[5];
        tercero=new float[5];
        System.out.println("Pidiendo notas de primer trimestre");
        for(int n=0; n<primer.length; n++)
        {
            System.out.println("Digite un numero");
            primer[n]=entry.nextFloat();
            suma_primer+=primer[n];
        }
        System.out.println("Pidiendo notas de segundo trimestre");
        for(int n=0; n<segundo.length; n++)
        {
            System.out.println("Digite un numero");
            segundo[n]=entry.nextFloat();
            suma_segundo+=segundo[n];
        }
        System.out.println("Pidiendo notas de tercer trimestre");
        for(int n=0; n<tercero.length; n++)
        {
            System.out.println("Digite un numero");
            tercero[n]=entry.nextFloat();
            suma_tercero+=tercero[n];
        }
        prome_primer=suma_primer/5;
        prome_segundo=suma_segundo/5;
        prome_tercero=suma_tercero/5;
       
        do
        {
          System.out.print("Digite la posicion del alumno de 0 a 4");
          posicion=entry.nextInt();
        }while(posicion<0 || posicion>4);
        suma_alu=primer[posicion]+segundo[posicion]+tercero[posicion];
        prome_alum=suma_alu/3;
        System.out.println("Mostrando los datos");
        System.out.println("El promedio del primer trimestre :"+prome_primer);
        System.out.println("El promedio del segundo trimestre :"+prome_segundo);
        System.out.println("El promedio del tercerotrimestre :"+prome_tercero);
        System.out.println("El promedio del alumno  :"+prome_alum);
        
    }
            
    
}
