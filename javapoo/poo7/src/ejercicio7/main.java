/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class main {
    public static void menu()
    {
        System.out.println("Menu de operaciones de comlejos");
        System.out.println("1 calcular la suma");
        System.out.println("2 calcular la multiplicacion");
        System.out.println("3 calcular si son iguales");
        System.out.println("4 mulltiplicacion con un entero");
        System.out.println("5 salir");
        System.out.println("Digite la opcion");
        
    }
    
    public static void main(String[] args)
    {
        Scanner entry=new Scanner(System.in);
        double a,b,c,d;
        int opcion,numero;
        Complejo numero1,numero2,suma,mult;
        do{
            
            menu();
            opcion=entry.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Primer numero complejo");
                    System.out.print("Digite el primer numero real  :");
                    a=entry.nextInt();
                    System.out.print("Digite el  primer numero imaginario  :");
                    b=entry.nextInt();
                    System.out.println("Primer segundo complejo");
                    System.out.print("Digite el segundo numero real  :");
                    c=entry.nextInt();
                    System.out.print("Digite el  segundo numero imaginario  :");
                    d=entry.nextInt();
                    
                    
                   
                    numero1=new Complejo(a,b);
                    numero2=new Complejo(c,d);
                    
                    suma=numero1.suma(numero2);
                    System.out.println("La suma es ->"+suma.getA()+"numero imaginario"+suma.getB()+"i");
                    break;
                case 2:
                    System.out.println("Primer numero complejo");
                    System.out.print("Digite el primer numero real  :");
                    a=entry.nextInt();
                    System.out.print("Digite el  primer numero imaginario  :");
                    b=entry.nextInt();
                    System.out.println("Primer segundo complejo");
                    System.out.print("Digite el segundo numero real  :");
                    c=entry.nextInt();
                    System.out.print("Digite el  segundo numero imaginario  :");
                    d=entry.nextInt();
                    
                    
                   
                    numero1=new Complejo(a,b);
                    numero2=new Complejo(c,d);
                    mult=numero1.multi(numero2);
                    System.out.println("la multiplicacion->"+mult.getA()+"numero imaginario "+mult.getB()+"i");
                    break;
                case 3:
                    System.out.println("Primer numero complejo");
                    System.out.print("Digite el primer numero real  :");
                    a=entry.nextInt();
                    System.out.print("Digite el  primer numero imaginario  :");
                    b=entry.nextInt();
                    System.out.println("Primer segundo complejo");
                    System.out.print("Digite el segundo numero real  :");
                    c=entry.nextInt();
                    System.out.print("Digite el  segundo numero imaginario  :");
                    d=entry.nextInt();
                    
                    
                   
                    numero1=new Complejo(a,b);
                    numero2=new Complejo(c,d);
                    if(numero1.igual(numero2))
                    {
                        System.out.print("Son iguales");
                    }
                    else
                    {
                        System.out.print("No son iguales");
                    }
                    
                    break;
                case 4:
                    System.out.println("pidiendo datos del numero complejo");
                    System.out.print("Digite el  numero real  :");
                    a=entry.nextInt();
                    System.out.print("Digite el   numero imaginario  :");
                    b=entry.nextInt();
                    System.out.println("Digite el numero entero");
                    int entero=entry.nextInt();
                    numero1=new Complejo(a,b);
                    mult=numero1.mul_en(entero);
                    System.out.println("multiplicacion  :"
                            + ""+mult.getA()+"  -"+mult.getB());
                    break;
                case 5:break;
                default: System.out.println("Error");break;    
            }
            
        }while(opcion!=5);
        
    }
    
}
