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
public class Furgoneta extends Automovil{
    private float carga;
    public Furgoneta(String modelo,String matricula,String numero,float carga)
    {
        super(modelo,matricula,numero);
        this.carga=carga;
    }
    @Override
    public String MostrarDatos()
    {
        return "Modelo :"+modelo+"\nMatricula :"+matricula+"\nnumero :"+numero+"\ncarga :"+carga;
    }
    
}
