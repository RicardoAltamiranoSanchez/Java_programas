/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import javax.swing.JOptionPane;
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        cadena = JOptionPane.showInputDialog(" digite una cadena ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("dijite un entero:"));
        letra = JOptionPane.showInputDialog( " dijite un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un decimal"));
        
        JOptionPane.showMessageDialog(null," la cadena es"+cadena);
        JOptionPane.showMessageDialog(null,"Tu numero entero es"+entero);
        JOptionPane.showMessageDialog(null," tu letra es"+letra);
        JOptionPane.showMessageDialog(null," tu decimal es " +decimal);
    }
    
}
