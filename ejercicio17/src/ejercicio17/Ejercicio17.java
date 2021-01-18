/*
pedir 10 sueldos  mostrar su suma y cuantos hay mayores de 1000
 */
package ejercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float suma=0,sueldo;
        int cont=0;
        for(int n=0; n<10; n++)
        {
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo"));
            suma+=sueldo;
            if(sueldo>=1000)
            {
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null,"La suma de los sueldos es="+suma);
        JOptionPane.showMessageDialog(null,"\nSueldos mayores a 1000="+cont);
    }
    
}
