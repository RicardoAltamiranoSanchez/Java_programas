/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class main {
    public static double mayor(Triangulo tr[])
    {
        double area;
        area=tr[0].getArea();
        for(int n=1; n<tr.length; n++)
        {
            if(tr[n].getArea()>area)
            {
                area=tr[n].getArea();
            }
        }
        return area;
    }
    public static void main( String[] args)
    {
        double base;
        double lado;
        int cantidad;
        Scanner entry=new Scanner(System.in);
        System.out.println("Digite la cantidad de triangulos que va ingresar");
        cantidad=entry.nextInt();
        Triangulo t []=new Triangulo[cantidad];
        for(int n=0; n<t.length; n++)
        {
            System.out.println("Pidiendo datos del triangulo  "+(n+1)+":");
            System.out.print("Ingrese su base");
            base=entry.nextDouble();
            System.out.print("Ingrese su lado");
            lado=entry.nextDouble();
            t[n]=new Triangulo(base,lado);
        }
        
        System.out.println("Mostrando el perimetro y area de cada triangulo");
        for(int n=0; n<t.length; n++)
        {
            System.out.println("Traingulo  "+(n+1)+":");
            System.out.println("Perimetro :"+t[n].getPerimetro());
            System.out.println("Area  :"+t[n].getArea());
        }
        System.out.println("Mostrando el area mayor de los triangulos");
        System.out.print(mayor(t));
        
        
    }
    
}
