/*
construir un programa que dada una serie de vehiculos caracterizados por su marca
modelo y precio,imprima las propiedades del vehiculo mas barato
para ello se deberan  leer por teclado las caracteristicas de cada vehiculo y crear 
un clase que representen cada uno de ellos
 */
package ejercicio4;

/**
 *
 * @author ricar
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    public Vehiculo(String marca,String modelo,float precio)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    public float getPrecio()
    {
        return precio;
    }
    public String mostrar_datos()
    {
        return "Modelo "+modelo+"\nMarca"+marca+"\nPrecio"+precio;
    }
    public static int Autobarato(Vehiculo a[])
    {
        int indice=0;
        float precio=a[0].getPrecio();
        for(int n=1; n<a.length; n++)
        {
            if(a[n].getPrecio()<precio)
            {
                precio=a[n].getPrecio();
                indice=n;
            }
        }
        
        return indice;
    }
    
    
}
