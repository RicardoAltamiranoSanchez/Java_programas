/*
pedir una nota de 0 a 10 y mostrarla de forma insuficiente,suficiente,bien notable ,sobresaliente
 */
package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        nota=Integer.parseInt(JOptionPane.showInputDialog("Digite la nota"));
        switch(nota)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                    JOptionPane.showMessageDialog(null,"Insuficiente"); 
            break;
            case 6:
                JOptionPane.showMessageDialog(null,"Suficiente");
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null,"Bien");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Notable");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"Sobresaliente");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
                break;
        }
    }
    
}
