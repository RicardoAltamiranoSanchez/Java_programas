
package ejercicio6;


public class Entrenador extends Persona {
    private String estrategia;
    public Entrenador(String nombre,String apellido,int edad,String estrategia)
    {super(nombre,apellido,edad);
            this.estrategia=estrategia;
        
    }
    public String getEstrategia()
    {
        return estrategia;
    }
    @Override
     public  void Partido_de_futbol()
     {
         System.out.println("Dirige el partido de futbol");
     }
    @Override
  public  void  entrenamiento()
  {
      System.out.println("Dirige el entrenamiento");
      
  }
  public void PlanificarEntrenamineto()
  {
      
        System.out.println("planifica la nueva estrategia");
  }
    
}
