
package ejercicio6;


public class Medico extends Persona{
    private String titulacion;
    private int años_experiencia;
    public Medico(String nombre,String apellido,int edad,String titulacion,int año_experiencia)
    {super(nombre,apellido,edad);
    
          this.titulacion=titulacion;
          this.años_experiencia=años_experiencia;
        
    }
    public String getTitulacion()
    {
        return titulacion;
    }
    public int getAños_Experiencia()
    {
        return años_experiencia;
    }
    @Override
     public void Partido_de_futbol()
     {
         System.out.println("  Da asisntencia");   
     }
    @Override
  public  void  entrenamiento()
  {
      System.out.println("Da masajes");
      
  }
  public void curarlesion()
  {
      System.out.println("Cura lesion");
  }
  
  
  
}
