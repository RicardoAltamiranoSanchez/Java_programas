/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Calcu {
   public static final Scanner entry=new Scanner (System.in); 
       static boolean salir=false;
    /**
     * @param args the command line arguments
     */

       
      
    public static void main(String[] args) {
       
        
       int opcion=0;
       while(!salir)
       {
           
           menu();
           System.out.println("\nDigite la opcion");
           opcion=entry.nextInt();
           operaciones(opcion);
           
       }
        
    }
    
    
    
    
    
    public static void menu()
        {
            System.out.println("Bienvenido ala Calculadora");
            System.out.println("\nOpciones");
            System.out.println("\n1 Suma");
            System.out.println("\n2 Resta");
            System.out.println("\n3 Multiplicacion");
            System.out.println("\n4 Division");
            System.out.println("\n5 Salir");
            
        }
     public static void operaciones(int opcion)
 {
     switch(opcion)
           {
        
         case 1:suma();break;
               case 2:resta();break;
               case 3:multiplicacion();break;
               case 4:division();break;
               case 5:salir=true;break;
               default: JOptionPane.showMessageDialog(null,"Esa opcion no existe");
               break;
           }
 }
    public static void  suma()
       {
                 System.out.println("Digite un numero");
                   float n1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   float n2=entry.nextFloat();
                   
          
           float suma=n1+n2;
           
          // System.out.println("La suma es:"+suma);
             JOptionPane.showMessageDialog(null,"La Suma"+suma);
       }
    public static void  resta()
       {
                     System.out.println("Digite un numero");
                   float n1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   float n2=entry.nextFloat();
                   
          
        
           float resta=n1-n2;
           
         
           //System.out.println("La resta es:"+resta);
          JOptionPane.showMessageDialog(null,"La Resta"+resta);
       }
    public static void  multiplicacion()
       {
                     System.out.println("Digite un numero");
                   float n1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   float n2=entry.nextFloat();
                   
          
          
           float multi=n1*n2;
           
           //System.out.println("La multiplicacion es:"+multi);
          JOptionPane.showMessageDialog(null,"La Multiplicacion"+multi);
       }
    public static void division()
       {
                     System.out.println("Digite un numero");
                   float n1=entry.nextFloat();
                   System.out.println("Digite un numero");
                   float n2=entry.nextFloat();
                   
          
           float division=n1/n2;
           
           //System.out.println("La division es:"+division);
          JOptionPane.showMessageDialog(null,"La Division"+division);
       }
    
}
