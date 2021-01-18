package javaapplication38;
import javax.swing.JOptionPane;
public class JavaApplication38 {
    public static void main(String[] args) {
    int numero,suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo=0,conteo_cero = 0;
    float prom_pos,prom_neg;
        for(int i=1;i<=10;i++){
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
         if (numero ==0){
            conteo_cero++;
        }
        else if(numero>0){
            suma_pos+=numero;
            conteo_pos++;
        }
        else{
            suma_neg+=numero;
            conteo_neg++;
        }
        if(conteo_pos==0){
            System.out.println("erro");
        }
        else{
            prom_pos=(float)suma_pos/conteo_pos;
            System.out.println("tu promedio es:"+prom_pos);
        }
        if(conteo_neg==0){
            System.out.println("error");
        }
        else{
            prom_neg=(float)suma_neg/conteo_neg;
            System.out.println("tu promedio negativo es:"+prom_neg);
        }
            System.out.println("la cantidad de ceros:"+conteo_cero);
    }
    }
    
}
