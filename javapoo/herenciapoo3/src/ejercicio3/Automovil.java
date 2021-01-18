
package ejercicio3;


public class Automovil {
    protected String modelo;
    protected String matricula;
    protected String numero;
    public  Automovil(String modelo,String matricula,String numero)
    {
        this.modelo=modelo;
        this.matricula=matricula;
        this.numero=numero;
    }
    public String getModelo()
    {
        return modelo;
    }
    public String getMatricula()
    {
        return matricula;
    }
    public String getNumero()
    {
        return numero;
    }
    public String MostrarDatos()
    {
        return "Modelo :"+modelo+"\nMatricula :"+matricula+"\nnumero :"+numero;
    }
    
}
