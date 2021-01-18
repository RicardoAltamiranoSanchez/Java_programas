
package javaapplication26;
import javax.swing.JOptionPane;
public class JavaApplication26 {
    public static void main(String[] args) {
     final int saldo inicial = 100;
     int opcion;
     float ingreso;
     
     opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido a tu cajero\n"
             + "1.ingrese dinero ala cuenta\n"
             +"2.retirar dinero al cuenta\n"
             +"3.salir"));
     switch (opcion){
         case 1:ingreso =Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad que quiere portar:");
         saldoactual=saldo_incial+ingreso;
         JOptionPane.showMesaggeDialog(null,"dinero en cuneta:"+saldoactual);
         break;
     }
            
    }
    
}
