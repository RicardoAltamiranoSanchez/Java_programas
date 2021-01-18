/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class main {
    public static void main(String [] args)
    {
        Scanner entry=new Scanner (System.in);
        int cantidad,barato;
        String modelo,marca;
        float precio;
        System.out.println("Cuantos vehiculos va ingresar");
        cantidad=entry.nextInt();
        Vehiculo v[]=new Vehiculo[cantidad];
        System.out.print("Pidiendo los datos del vehiculo");
        for(int n=0; n<v.length; n++)
        {
            entry.nextLine();
            System.out.println("Llenado datos del auto:"+(n+1));
            System.out.println("\nDigite el  modelo");
            modelo=entry.nextLine();
            System.out.println("Digite la marca");
            marca=entry.nextLine();
            System.out.println("\nDigite el  precio");
            precio=entry.nextInt();
            v[n]=new Vehiculo(modelo,marca,precio);
        }
        barato= Vehiculo.Autobarato(v);
        System.out.println("Auto mas barato:"+v[barato].mostrar_datos());
            
        
       
        
    }
    
}
