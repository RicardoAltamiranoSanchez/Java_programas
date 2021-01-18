package javaapplication23;
import javax.swing.JOptionPane;
public class JavaApplication23 {
    public static void main(String[] args) {
     int n1,n2,n3;
     n1 = Integer.parseInt(JOptionPane.showInputDialog(" digite un numero:"));
     n2 =Integer.parseInt(JOptionPane.showInputDialog(" digite un numero:"));
     n3 =Integer.parseInt(JOptionPane.showInputDialog(" digite un numero:"));
      if( (n1>n2) && (n2>n3)){
        JOptionPane.showMessageDialog(null,"orden:"+n1+"_"+n2+"_"+n3);
    }
      else if((n1>n3) && (n3>n2)){
          JOptionPane.showMessageDialog(null,"orden:"+n1+"_"+n3+"_"+n2);
      }
      else if ((n2>n1)&& (n1>n3)){
          JOptionPane.showMessageDialog(null,"orden:"+n2+"_"+n1+"_"+n3);
      }
      else if ((n2>n3) && (n3>n1)){
          JOptionPane.showMessageDialog(null,"orden:"+n2+"_"+n3+"_"+n1);
      }
      else if ((n3>n1)&& (n1>n2)){
          JOptionPane.showMessageDialog(null,"orden"+n3+"_"+n2+"_"+n1);
      }
      else {
          JOptionPane.showMessageDialog(null,"orden"+n3+"_"+n1+"_"+n2);
      }
    }
    
}
