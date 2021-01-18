
package ejercicio6;


public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;
    public Futbolista( String nombre,String apellido,int edad,int dorsal,String posicion)
    {
        super(nombre,apellido,edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }
    public int getDorsal()
    {
        return dorsal;
    }
    public String posicion()
    {
        return posicion;
    }
    @Override
    public  void Partido_de_futbol()
    {
 
        System.out.println("Esta jugando el partido de futbol");
    }
    @Override
    public void entrenamiento()
    {
      
        System.out.println("Esta Entrenando");
    }

    
    public void Entrevista()
    {
       System.out.println("Nombre->"+nombre+"\napellido->"+apellido+"\nEdad->"+edad
        +"\nDorsal->"+dorsal+"\nposicion->"+posicion);
        System.out.println("Esta Dando la entevista");
    }
    
}
