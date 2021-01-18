/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Escuela2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nombre;
        int edad;
        float altura;
          JOptionPane.showMessageDialog(null,"Digite el  nombre");
          nombre=sc.nextLine();
          JOptionPane.showMessageDialog(null,"Su edad");
          edad=sc.nextInt();
          JOptionPane.showMessageDialog(null,"Su altura");
          altura=sc.nextFloat();
          
          JOptionPane.showMessageDialog(null,"Nombre :"+nombre
                  +"\n edad :"+edad
                   +"\nAltura"+altura);
          
        
        
        
    }
    
}
