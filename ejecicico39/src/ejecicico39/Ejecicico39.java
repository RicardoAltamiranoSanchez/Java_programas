/*
crear y cargar dos matrices de tamaño
3X3 ,sumarlas  y mostrar su  suma;
 */
package ejecicico39;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejecicico39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner (System.in);
        int numeros1[][];
        int numeros2[][];
        
        int nfilas,ncolum;
        JOptionPane.showMessageDialog(null,"Para la primera matriz");
        nfilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        ncolum=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        numeros1=new int[nfilas][ncolum];
        JOptionPane.showMessageDialog(null,"Para la segunda matriz");
        nfilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        ncolum=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        numeros2=new int[nfilas][ncolum];
        System.out.println("pidiendo los datos de la primera matriz");
        for(int n=0; n<nfilas; n++) 
        {
            for(int m=0; m<ncolum; m++)
            {
                System.out.print("["+n+"]["+m+"]:");
                numeros1[n][m]=entry.nextInt();
            }
            
        }
        System.out.println("pidiendo los datos de la segunda matriz");
        for(int n=0; n<nfilas; n++) 
        {
            for(int m=0; m<ncolum; m++)
            {
                System.out.print("["+n+"]["+m+"]:");
                numeros2[n][m]=entry.nextInt();
            }
            
        }
        System.out.println("La suma");
        for(int n=0; n<nfilas; n++) 
        {
            for(int m=0; m<ncolum; m++)
            {
                
                numeros1[n][m]+=numeros2[n][m];
            }
            
        }
        System.out.println("Imprimiendo los datos");
        for(int n=0; n<nfilas; n++) 
        {
            for(int m=0; m<ncolum; m++)
            {
                System.out.println("["+n+"]["+m+"]:"+numeros1[n][m]);
                
            }
            
        }
                
                
    }
    
}
