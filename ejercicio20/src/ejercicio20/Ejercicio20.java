/*
 peidr un numero de n de usuarios de sueldos
y mostrar el mayor de ello

 */
package ejercicio20;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float sueldo,mayor=0, menor=1000;
       for(int n=0; n<5; n++)
       {
           sueldo=Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo"));
           if(sueldo>=mayor)
           {
              mayor=sueldo;
              
           }
           else if(sueldo<=menor)
           {
               menor=sueldo;
           }
         
       }
         JOptionPane.showMessageDialog(null,"sueldo mayor:"+mayor);
           JOptionPane.showMessageDialog(null,"sueldo menor:"+menor);
    }
    
}
