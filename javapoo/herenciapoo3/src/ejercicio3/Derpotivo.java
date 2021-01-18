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
public class Derpotivo extends Automovil {
    private int cilindros;
    public Derpotivo(String modelo,String matricula,String numero,int cilindros)
    {
        super(modelo,matricula,numero);
        this.cilindros=cilindros;
                
    }
    @Override
    public String MostrarDatos()
    {
        return "Modelo :"+modelo+"\nMatricula :"+matricula+"\nnumero :"+numero+"\ncilindros :"+cilindros;
    }
    
    
}
