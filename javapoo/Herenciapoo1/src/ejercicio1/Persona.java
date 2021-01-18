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
public class Persona {
    private String nombre;
    private String dni;
    private int edad;
    public Persona(String nombre,String dni,int edad)
    {
        this.nombre=nombre;
        this.dni=dni;
        this.edad=edad;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getDni()
    {
        return dni;
    }
    public int getEdad()
    {
        return edad;
    }
    
}
