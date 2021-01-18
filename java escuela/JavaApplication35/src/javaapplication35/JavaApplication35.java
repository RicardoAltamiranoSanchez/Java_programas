
package javaapplication35;

import javax.swing.JOptionPane;

public class JavaApplication35 {

    public static void main(String[] args) {
        int numero,elementos =0, suma=0 ;
        float promedio;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        while(numero>=0){
            suma = suma + numero;//suma interativa
            elementos++;//aumentamos uno a elementos
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite otro numero:"));
        }
        if(elementos==0){
            System.out.println("error!!la division entre ceros no existe");
    }
        else{
            promedio =(float)suma/elementos;
            System.out.println("\ntu promedio es:"+promedio);
        }
    
}
