/*
crear un matriz de tamaño 7x7
y rellenarla de forma que los
elementos  de la diagonal principal
sean 1 y el resto 0
 */
package ejercicio41;

/**
 *
 * @author ricar
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[][]=new int[7][7];
        
        for (int n=0; n<7; n++)
        {
            for(int m=0; m<7; m++)
            {
                if(n==m)
                {
                    numeros[n][m]=1;
                }
                else
                {
                    numeros[n][m]=0;
                }
            }
        }
        for(int n=0; n<7; n++)
        {
            for(int m=0; m<7; m++)
            {
                System.out.print(numeros[n][m]);
            }
            System.out.println("");
        }
        
        
    }
    
}
