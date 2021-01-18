/*
 pedir calificaciones y decir la final si hay un suspenso
 */
package ejercicio22;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float cali;
       boolean suspenso=false;
       for(int n=0; n<5; n++)
       {
           cali=Float.parseFloat(JOptionPane.showInputDialog("Digite la calificacion  "));
           if(cali<=5)
           {
               suspenso=true;
           }
           
       }
       if(suspenso==true)
           {
               JOptionPane.showMessageDialog(null,"SI hay suspenso");
           }
           else
           {
               JOptionPane.showMessageDialog(null,"No hay suspenso");
           }
    }
    
}
