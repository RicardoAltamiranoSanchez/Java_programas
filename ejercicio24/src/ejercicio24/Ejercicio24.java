/*
leer 5 numeros por teclado,almacenados en un arreglo y acontinuacion realizar la media 
de los numeros positivos,la media de los negativos y contar el numero de ceros
 */
package ejercicio24;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float numeros[];
       int cont_pos=0;
       int cont_neg=0;
       int cantidad,m_positivo=0,m_negativo=0,contador_cero=0;
       cantidad=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del arrego"));
       numeros=new float[cantidad];
       for(int n=0;n<numeros.length;n++)
       {
           numeros[n]=Float.parseFloat(JOptionPane.showInputDialog("Digite un numero"));
           if(numeros[n]>0)
           {
               m_positivo+=numeros[n];
               cont_pos++;
           }
           else if(numeros[n]<0)
           {
               m_negativo+=numeros[n];
               cont_neg++;
           }
           else
               
           {
               contador_cero++;
           }
           
       }
       m_positivo/=cont_pos;
       m_negativo/=cont_neg;
       JOptionPane.showMessageDialog(null,"La media de los numero positivos es:"+m_positivo+"\ncantidad"+cont_pos);
       JOptionPane.showMessageDialog(null,"La media de los numero negativos es:"+m_negativo+"\ncantidad"+cont_neg);
       JOptionPane.showMessageDialog(null,"La cantidad de ceros son:"+contador_cero);
       
    }
    
}
