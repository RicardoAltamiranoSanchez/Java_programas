/*
en mega plaza se hace 20% de descuento alos clientes cuya compra supere los 300
¿cual sera la cantidad que pagara una persona por su compra?
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double compra,descuento;
       compra=Double.parseDouble(JOptionPane.showInputDialog("Digite el total de la compra"));
       if(compra>=300)
       {
           descuento=compra *.25;
           compra-=descuento;
           JOptionPane.showMessageDialog(null,"su compra con descuento del 25% es:"+compra);
       }
       else
       {
           JOptionPane.showMessageDialog(null,"su costo total es :"+compra);
       }
    }
    
}
