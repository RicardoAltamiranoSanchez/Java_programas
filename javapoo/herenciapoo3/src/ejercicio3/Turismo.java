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
public class Turismo extends Automovil {
    private int puertas;
    public Turismo(String modelo,String matricula,String numero,int puertas)
    { super(modelo,matricula,numero);
      
               this.puertas=puertas;
    }
    @Override
    public String MostrarDatos()
    {
        return  "Modelo :"+modelo+"\nMatricula :"+matricula+"\nnumero :"+numero+"\nPuertas :"+puertas;
    }
    
}
