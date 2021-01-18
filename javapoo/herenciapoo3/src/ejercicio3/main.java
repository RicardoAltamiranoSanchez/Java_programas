/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author ricar
 */
public class main {
    public static void main(String[] args)
    {
        Automovil au[]=new Automovil[4];
         au[0]=new Automovil("34fdf","235kl","29832");
         au[1]=new Turismo("kj332","5r56","2938",4);
         au[2]=new Derpotivo("23we","56ej","3432",8);       
         au[3]=new Furgoneta("23ei","89kjk","8667hh",100.23f);
         for(Automovil a:au)
         {
             System.out.println(a.MostrarDatos());
         }
         
         
         
    }
    
}
