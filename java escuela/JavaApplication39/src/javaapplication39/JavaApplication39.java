
package javaapplication39;
import javax.swing.JOptionPane;

public class JavaApplication39 {

    public static void main(String[] args) {
        int edad,sumaedad =0,conteomayor18=0,conteomayor175=0;
        float altura,sumaaltura =0,promedioedad=0,promedioaltura=0;
        for(int i=1;i<=5;i++){
            edad= Integer.parseInt(JOptionPane.showInputDialog("alumno"+i+"\ndigite su edad:"));
            altura =Float.parseFloat(JOptionPane.showInputDialog("alumno"+i+"\ndigite su estatura:"));
            sumaedad += edad;
            sumaaltura+=altura;
            if(edad>18){
                conteomayor18++;
            }
            if(altura>175){
                conteomayor175++;
            }
            promedioedad= (float) sumaedad/5;
            promedioaltura =(float) sumaaltura/5;
            System.out.println("promedio de edad es"+promedioedad);
            System.out.println("tu promedio de altura es"+promedioaltura);
            System.out.println("mayores a 18 años"+conteomayor18);
            System.out.println("conteo mayor a 1.75 son"+conteo);
        }
        
        
    }
    
}
