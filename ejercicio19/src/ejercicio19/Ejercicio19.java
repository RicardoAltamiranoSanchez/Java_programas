/*
hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce
el precio por litro.solo existen tres productos con precios:
1- 0,6$ /litro
2- 3 $/litro
3 1,25 E/litro
 */
package ejercicio19;

import javax.swing.JOptionPane;

/*
 *
 * @author ricar
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float prod1 = 0,prod2,prod3;
        float fac_prod1=0,fac_prod2=0,fac_prod3=0;
        int cont1=0,cont2=0,cont3=0,opcion;
        float sum1=0,sum2=0,sum3=0;
        for(int n=0; n<5; n++)
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Codigo de producto\n"
                    + "1 en pesos\n"
                    + "2 en dolares\n"
                    + "3 en euros"));
            switch(opcion)
            {
                case 1:
                    prod1=Float.parseFloat(JOptionPane.showInputDialog("Digite los litros"));
                    fac_prod1=(float) (prod1*0.6);
                   sum1+=fac_prod1;
                   cont1++;
                   break;
                   case 2:
                    prod2=Float.parseFloat(JOptionPane.showInputDialog("Digite los litros"));
                    fac_prod2=(float) (prod2*3);
                   sum2+=fac_prod2;
                   cont2++;
                   break;
                   case 3:
                    prod3=Float.parseFloat(JOptionPane.showInputDialog("Digite los litros"));
                    fac_prod3=(float) (prod3*1.25);
                   sum3+=fac_prod3;
                   cont3++;
                   break;
                   default  :JOptionPane.showMessageDialog(null,"Esa opcion no existe");
                   break;
            }
           
        }
         JOptionPane.showMessageDialog(null,"producto uno\n"
                    + "pedidos vendidos"+cont1+
                    "\n total de ganancias"+sum1);
            JOptionPane.showMessageDialog(null,"producto uno\n"
                    + "pedidos vendidos"+cont2+
                    "\n total de ganancias"+sum2);
            JOptionPane.showMessageDialog(null,"producto uno\n"
                    + "pedidos vendidos"+cont3+
                    "\n total de ganancias"+sum3);
        
    }
    
}
