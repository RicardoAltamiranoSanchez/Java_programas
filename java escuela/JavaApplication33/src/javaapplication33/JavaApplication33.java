
package javaapplication33;

 import javax.swing.JOptionPane;
public class JavaApplication33 {

    public static void main(String[] args) {
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        while (numero !=0){//mientras el numero sea distinto a cero
    if(numero %
           2 ==0 ){//si esl numero es par
        System.out.println("el numero"+numero+" es par:");
    }
        else{
                System.out.println("el numero"+numero+"es impar:");
                }
                
                
    }
    
}
    }