/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ricar
 */
public class Modelo {
   private int numero1;
   private int numero2;
   private int resultado;

   public int getNumero1()
   {
       return numero1;
   }
   public void setNumero1(int numero)
   {
       this.numero1=numero;
   }
   public int getNumero2()
   {
       return numero2;
   }
   public void setNumero2(int numero)
   {
       this.numero2=numero;
   }
   public int getResultado()
   {
       return resultado;
   }
   public void setResultado(int resultado)
   {
       this.resultado=resultado;
   }
   public int sumar()
   {
       resultado=numero1+numero2;
       return resultado;
       
   }
   
    
}
