/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Main {
    public static void main(String [] args)
    {
        Objeto o=new Objeto(0,0);
       
        int opcion=0;
        int y,x;
        while(opcion!=5)
        {
           
            opcion=Integer.parseInt(JOptionPane.showInputDialog( "MENU:"+
                    "\n1 ARRIBA"+
                    "\n2  ABAJO"+
                    "\n3  IZQUIERDA"+
                    "\n4 DERECHA"+
                    "\n 5 SALIR"+
                    "\nDigite la opcion"));
            switch(opcion)
            {
                case 1:
                    y=Integer.parseInt(JOptionPane.showInputDialog("Digite las posiciones que quieres recorrer"));
                    o.arriba(y);
                    break;
                    case 2:
                    y=Integer.parseInt(JOptionPane.showInputDialog("Digite las posiciones que quieres recorrer"));
                    o.abajo(y);
                    break;
                    case 3:
                    x=Integer.parseInt(JOptionPane.showInputDialog("Digite las posiciones que quieres recorrer"));
                    o.izquierda(x);
                    break;
                    case 4:
                    x=Integer.parseInt(JOptionPane.showInputDialog("Digite las posiciones que quieres recorrer"));
                    o.derecha(x);
                    break;
                    case 5:
                      
                    JOptionPane.showMessageDialog(null,"ADIOS");
                    break;
                    default:JOptionPane.showMessageDialog(null,"Esa opcion no existe");
                    break;
            }
            o.mostrar();
        }
        
    }
    
}
