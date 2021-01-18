/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Calculadora {
   //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multi;
    int divi;
    //Metodos
    public void pedir_datos()
    {
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
         numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
    }
    public void suma()
    {
        suma=numero1+numero2;
    }
    public void resta()
    {
        resta=numero1-numero2;
    }
    public void multiplicacion()
    {
        multi=numero1*numero2;
    }
    public void division()
    {
        divi=numero1/numero2;
    }
    public void mostrar_datos()
    {
        JOptionPane.showMessageDialog(null,"La suma "+suma
        + "\nLa resta"+resta
        +"\nLa multiplicacion"+multi+
         "\nLa division"+divi);
    }
    
}
