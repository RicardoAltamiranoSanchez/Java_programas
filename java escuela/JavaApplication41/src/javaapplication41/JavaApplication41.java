
package javaapplication41;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication41 {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
    int nelmentos;

    int nelementos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos de srreglo:"));
    char[]letras =new char [nelementos];
    System.out.println("digite los elementos de l arreglo:");
    for (int i=0;i<nelementos;i++){
        System.out.println((i+1)+".digite un caracter:");
        letras[i]=entrada.next().charAt(0);
            System.out.println("\nlos caracteres del erreglo son:");
        
    }
    }
          for(int i=0;i<nelementos;i++){
            System.out.println(letras[i]);
}

}
