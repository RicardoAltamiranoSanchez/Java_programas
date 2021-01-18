/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class main {
    
        public static int ganador(Atleta a[])
        {
            float tiempo;
            int indice=0;
            tiempo=a[indice].getTiempo();
            for(int n=1;n<a.length; n++ )
            {
                if(a[n].getTiempo()<tiempo)
                {
                    tiempo=a[n].getTiempo();
                    indice=n;
                }
            }
            return indice;
        }
    public static void main(String[] args)
    {
        
        String nombre;
        int numero;
        float tiempo;
        int cantidad;
        int indice=0;
        Scanner entry=new Scanner(System.in);
        System.out.print("Digite la cantidad de atletas que va ingresar");
        cantidad=entry.nextInt();
        Atleta at[]=new Atleta[cantidad];
        for(int n=0; n<at.length;n++)
        {
            System.out.println("Ingresando datos del atleta :"+(n+1));
            System.out.print("Ingrese su numero   ");
            numero=entry.nextInt();
            
            entry.nextLine();
            System.out.print("Ingrese su nombre  ");
            nombre=entry.nextLine();
            System.out.print("Ingrese el tiempo  ");
            tiempo=entry.nextFloat();
             at[n]=new Atleta(nombre,numero,tiempo);
        }
        indice=ganador(at);
        System.out.println("El atleta ganador es");
        System.out.println(at[indice].mostrar_datos());
        
        
    }
}
