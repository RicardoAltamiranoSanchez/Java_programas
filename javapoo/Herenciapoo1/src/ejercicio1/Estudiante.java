/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ricar
 */
public class Estudiante extends Persona{
   private float notafinal;
   public Estudiante(String nombre,String dni,int edad,float notafinal)
   { super(nombre,dni,edad);
       this.notafinal=notafinal;
       
   }
   public void MostrarDatos()
   {
       System.out.print("Datos del estudiante");
       System.out.print("\n Nombre->"+getNombre()+"\nEdad->"+getEdad()+"\n Dni->"+getDni()+"\nNota final->"+notafinal+"\n");
   }
    
}
