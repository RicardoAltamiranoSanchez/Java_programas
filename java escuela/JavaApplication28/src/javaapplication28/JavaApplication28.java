package javaapplication28;
import java.util.Scanner;
public class JavaApplication28 {
public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        int i=1,contador;
        System.out.println("digite cuantos numeros quieres en pantalla:");
        contador =entrada.nextInt();
        while(i<=contador){
            System.out.println(i);
            i++;
                
               
        }
        
    }
    
}
