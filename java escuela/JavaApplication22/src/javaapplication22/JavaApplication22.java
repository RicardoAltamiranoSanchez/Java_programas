
package javaapplication22;

import javax.swing.JOptionPane;
public class JavaApplication22 {

     
    public static void main(String[] args) {
        int horastrabajadas;
        float salariototal;
        
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("digite la s horas trabajadas:"));
        if (horastrabajadas <= 40){
            salariototal= horastrabajadas * 16;
        }
        else {
            salariototal =  (40*16) + ( horastrabajadas-40)*20;
            JOptionPane.showMessageDialog(null,"El salario total es:"+salariototal);
        }
    }
    
}
