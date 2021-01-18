package javaapplication30;
import java.util.Scanner;
public class JavaApplication30 {

    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int i=1,contador;
        System.out.println("digite el numero:");
        contador = entrada.nextInt();
        do{
            System.out.println(i);
            i++;
        }while (i<=contador);
     
    }
    
}
