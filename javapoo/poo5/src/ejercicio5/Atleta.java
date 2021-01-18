/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author ricar
 */
public class Atleta {
    private String nombre;
    private int numero;
    private float tiempo;
    public Atleta(String nombre,int numero,float tiempo)
    {
        this.nombre=nombre;
        this.numero=numero;
        this.tiempo=tiempo;
    }
    public float getTiempo()
    {
        return tiempo;
    }
    public String mostrar_datos()
    {
        return "Nombre->"+nombre+"\nNumero"+numero+"\nTiempo"+tiempo;
    }
    
}
