
package javaapplication24;
import javax.swing.JOptionPane;
public class JavaApplication24 {
public static void main(String[] args) {
      int dia,mes,año;
      dia = Integer.parseInt(JOptionPane.showInputDialog("digite el dia"));
      mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes"));
      año = Integer.parseInt(JOptionPane.showInputDialog("digite el año"));
      if ((dia>=1) && (dia<=30)){
          if((mes>=1) && (mes<=12)){
              if(año !=0){
                  JOptionPane.showMessageDialog(null,"aqui si la fecha es correcta:");
              }
              else {
                  JOptionPane.showMessageDialog(null,"lña fecha incorrecta,año incorrecto:");
              }
      }
          else {
              JOptionPane.showMessageDialog(null,"fecha incorrecta mes:");
          }
          }
      else {
          JOptionPane.showMessageDialog(null,"la fecha es incorrecta:");
      }
    }
    
}
