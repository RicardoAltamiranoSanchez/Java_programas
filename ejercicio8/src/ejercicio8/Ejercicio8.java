/*
 pedir el dia y el mes de una fecha e indicar si la fecha es correcta.con los meses
de 28,30 y 31 dias.sin años  bisiestos
 */
package ejercicio8;

import javax.swing.JOptionPane;


/**
 *
 * @author ricar
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,año;
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        año=Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
        
        if(dia>0 && dia<31)
        {
            if(mes>1 && mes <12)
            {
                if(año !=0)
                {
                    JOptionPane.showMessageDialog(null,"Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null,"año incorrecto");
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"mes incorrecto");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Dia incorrecto");
            
        }
        
        
    }
    
}
