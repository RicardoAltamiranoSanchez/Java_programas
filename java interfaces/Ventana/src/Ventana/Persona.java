/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author ricar
 */
public class Persona {
    private String nombre;
    private int edad;
    private  int dni;
    Persona(String nombre,int edad,int dni)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }
    public String getNombre()
    {
        return nombre;
        
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public int getEdad()
    {
        return edad;
    }
    public void getEdad(int edad)
    {
        this.edad=edad;
    }
    public int getDni()
    {
        return dni;
    }
    public void setDni(int dni)
    {
        this.dni=dni;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
    
    
    
    
    
    
    
    
}
