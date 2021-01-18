/*
 leer los datos correspodientes a dos tablas de 12 elementos
numericos , y mezclarlos  en una tercera forma:
3 de la tabla A ,3 de la otra B otros 3 de A,otros 3  de la B etc;
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner (System.in);
       int a[],b[],c[];
       int cantidad;
        System.out.println("Digite la cantidad de elementos");
        cantidad=entry.nextInt();
        a=new int[cantidad];
        b=new int[cantidad];
        c=new int[a.length+b.length];
        System.out.println("Para el primer arreglo");
        for(int n=0; n<a.length; n++)
        {
            System.out.println("  Digite un numero");
            a[n]=entry.nextInt();
            
        }
         System.out.println("Para el segundo arreglo");
        for(int n=0; n<b.length; n++)
        {
            System.out.println("  Digite un numero");
            b[n]=entry.nextInt();
            
        }
        int j=0;
        for(int n=0; n<a.length;n++)
        {
            c[j]=a[n];
            j++;
            c[j]=b[n];
            j++;
        }
         System.out.println("El tercer arreglo");
        for(int n=0; n<c.length; n++)
        {
            System.out.print("["+n+"]="+c[n]);
            
        }
        
        
        
        
       
    }
    
}
