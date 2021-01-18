/*
 leer 5 numeros ,guardalos en un arreglo y mostrarlos
en el orden inverso al introducido
 */
package ejercicio23;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
      int[] numeros=new int[5];
      //int nelementos;
     // nelementos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos que hay"));
     JOptionPane.showMessageDialog(null,"Digite los numeros");
      for(int n=0; n<5; n++)
      {
          System.out.println("Digite un numero");
          numeros[n]=entry.nextInt();
          
      }
      for(int m =4; m>=0; m--)
      {
          System.out.println(+numeros[m]);
      }
    }
    
}
