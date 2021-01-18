/*
sumar las filas y las columnas
 */
package ejercicio42;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int numeros[][];
        int nfilas,ncolum;
        nfilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        ncolum=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de colum"));
        numeros=new int[nfilas][ncolum];
        System.out.println("Llenando la matriz");
        for(int n=0; n<nfilas; n++)
        {
            for(int m=0; m<ncolum; m++)
            {
                numeros[n][m]=entry.nextInt();
            }
            
        }
        System.out.println("Imprimiendo el arreglo");
        for(int n=0; n<nfilas; n++)
        {
            for(int m=0; m<ncolum; m++)
            {
                System.out.print(numeros[n][m]);
            }
            System.out.println("");
            
        }
        System.out.println("Suma de filas");
        
        for(int n=0; n<nfilas; n++)
        {
            int suma_filas=0;
            
            for(int m=0; m<ncolum; m++)
            {
                suma_filas+=numeros[n][m];
            }
            System.out.println("La suma de cada fila:"+suma_filas);
            
        }
           System.out.println("Suma de columnas");
        
        for(int n=0; n<ncolum; n++)
        {
            int suma_colum=0;
            
            for(int m=0; m<nfilas; m++)
            {
                suma_colum+=numeros[n][m];
            }
            System.out.println("La suma de cada fila:"+suma_colum);
            
        }
        
        
        
        
        
    }
    
}
