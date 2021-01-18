
package javaapplication25;
import javax.swing.JOptionPane;
public class JavaApplication25 {
    public static void main(String[] args) {
      int numero1,numero2,suma,resta,mult,div;
      char operacion;
      numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
      numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
      operacion = JOptionPane.showInputDialog(" digite la operacion que quieras realizar:").charAt(0);
      switch (operacion){
          case 's':
          case 'S': suma=numero1+numero2;
          JOptionPane.showMessageDialog(null,"tu resultado es:"+suma);
          break;
          case 'r':
          case'R': resta = numero1-numero2;
          JOptionPane.showMessageDialog(null,"tu resultado es:"+resta);
          break;
          case 'P':
          case 'p':
          case 'M':
          case'm':mult=numero1*numero2;
          JOptionPane.showMessageDialog(null,"tu resultado es:"+mult);
          break;
          case 'D':
          case 'd':div =numero1/numero2;
          JOptionPane.showMessageDialog(null,"tu resultado es:"+div);
          break;
          default: JOptionPane.showMessageDialog(null,"erro puto pendejo:");
      }
    }
    
}
