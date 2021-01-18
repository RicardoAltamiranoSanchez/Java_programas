/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerecio;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner entry=new Scanner(System.in);
        int opcion;
        int lado1,lado2;
        PerimetroyArea pa;
        System.out.println("Pidiendo datos");
        System.out.println("1 si  no es cuadralo \n 2 si es cuadrado");
        opcion=entry.nextInt();
        if(opcion==1)
        {
            System.out.println("Digite su primer lado");
            lado1=entry.nextInt();
            System.out.println("Digite su segundo lado");
            lado2=entry.nextInt();
           pa=new PerimetroyArea(lado1,lado2);
            pa.Perimetro();
            pa.Area();
            pa.mostrar_datos();
            System.out.println("");
        }
        else if(opcion ==2)
        {
             System.out.println("Digite su  lado");
            lado1=entry.nextInt();
           pa=new PerimetroyArea(lado1); 
           pa.Perimetro();
           pa.Area();
           pa.mostrar_datos();
            System.out.println("");
            
        }else
        {
            System.out.println("Esa opcion no existe");
        }
        
        
        
        
    }
    
}
