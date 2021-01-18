/*
 crear y cargar una matriz de tamaño
3x3 traspornela y mostrarla
 */
package ejercico40;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author ricar
 */
public class Ejercico40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entry=new Scanner(System.in);
       int numeros1[][],nfilas,ncolum;
       nfilas=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas"));
       ncolum=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
       numeros1=new int[nfilas][ncolum];
       for(int n=0; n<nfilas; n++)
       {
           for(int m=0; m<ncolum; m++)
           {
               System.out.println("Digite un  numero");
               numeros1[n][m]=entry.nextInt();
           }
       }
        System.out.println("Imprimiendo matriz original");
       for(int n=0; n<nfilas; n++)
       {
           for(int m=0; m<ncolum; m++)
           {
               System.out.print(numeros1[n][m]);
               
           }
           System.out.println("");
       }
       int aux;
       for(int n=0; n<nfilas; n++)
       {
           for(int m=0; m<n; m++)
           {
               aux=numeros1[n][m];
               numeros1[n][m]=numeros1[m][n];
               numeros1[m][n]=aux;
               
               
           }
       }
        System.out.println("Imprimiendo matriz transpuesta");
       for(int n=0; n<nfilas; n++)
       {
           for(int m=0; m<ncolum; m++)
           {
               System.out.print(numeros1[n][m]);
               
           }
           System.out.println("");
       } 
       
    }
    
}
