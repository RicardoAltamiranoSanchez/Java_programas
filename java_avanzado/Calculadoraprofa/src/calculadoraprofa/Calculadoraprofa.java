/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprofa;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Calculadoraprofa {
 public static void menu()
        {
            System.out.println("Bienvenido");
            System.out.println("\nOpciones");
            System.out.println("\n1 Suma");
            System.out.println("\n2 Resta");
            System.out.println("\n3 Multiplicacion");
            System.out.println("\n4 Division");
            System.out.println("\n5 Salir");
            
        }
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        Scanner entry=new Scanner (System.in);
        boolean salir=false;
       int opcion=0;
       float numero1,numero2;
       while(!salir)
       {
           
           menu();
           System.out.println("Digite la opcion");
           opcion=entry.nextInt();
           switch(opcion)
           {
               case 1:
                   System.out.println("Digite un numero");
                   numero1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   numero2=entry.nextFloat();
                   
                   JOptionPane.showMessageDialog(null,"La Suma es"+suma(numero1,numero2));
                   break;
                   case 2:
                   System.out.println("Digite un numero");
                   numero1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   numero2=entry.nextFloat();
                   
                   JOptionPane.showMessageDialog(null,"La Resta es"+resta(numero1,numero2));
                   break;
                   case 3:
                   System.out.println("Digite un numero");
                   numero1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   numero2=entry.nextFloat();
                   
                   JOptionPane.showMessageDialog(null,"La Multipicacion"+multiplicacion(numero1,numero2));
                   break;
                   case 4:
                   System.out.println("Digite un numero");
                   numero1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   numero2=entry.nextFloat();
                  
                   division(numero1,numero2);
                           
                   
                   break;
                   case 5:
                       salir=true;
                       
                               
                   break;
                   
                   default: JOptionPane.showMessageDialog(null,"Esa opcion no existe");
                   break;
           }
           
       }
        
    }
    public static float suma(float n1, float n2)
       {
          return n1+n2;
       }
    public static float resta(float n1, float n2)
       {
          return n1-n2;
       }
    public static float multiplicacion(float n1, float n2)
       {
          return n1*n2;
       }
    public static void division(float n1, float n2)
       {
           float division=n1/n2;
           
           JOptionPane.showMessageDialog(null,"La Divison"+division);
          
       }
    
}
