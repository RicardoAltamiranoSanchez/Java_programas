
package ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
   static Scanner entry=new Scanner(System.in);
   static ArrayList<Persona> persona=new ArrayList<Persona>();
   static Persona futbolista1=new Futbolista("Cristiano","Ronaldo",32,10,"Delantero");
   static Persona futbolista2=new Futbolista("Mesi","Boludo",33,11,"Delantero");
   static Persona medico=new Medico("Gerardo","minery",55,"Lic.Terapeutica",30);
   static Persona entrenador=new Entrenador("Gatuso","Miau",45,"Ofensiva");
   
   
   
    public static void main(String [] args)
    {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(medico);
        persona.add(entrenador);
        menu();
        
    }
    
   public static void menu()
   {
       
       int opcion;
       do{
           System.out.println("\t..Menu");
           System.out.println("1 Viaje de equipo");
           System.out.println("2  Entrenamiento");
           System.out.println("3 Partido");
           System.out.println("4 Planificar  entrenamiento");
           System.out.println("5 Entrevista");
           System.out.println("6 Curar lesion");
           System.out.println("7 Salir ");
           System.out.print("Digite la opcion");
           opcion=entry.nextInt();
           switch(opcion)
           {
               case 1:
                      System.out.println("");
                      Viaje_equipo();
                   break;
               case 2:
                      System.out.println(" ");
                      entrenamiento_equipo();
                   break;
               case 3:
                   System.out.println("");
                   partido_equipo();
                   break;
               case 4:
                   System.out.println("");
                   planificar_equipo();
                   break;
               case 5:
                   System.out.println("");
                   entrevista_equipo();
                   break;
               case 6:
                   System.out.println("");
                   curalesion_equipo();
                   break;
               case 7:
                   break;
               default :System.out.println("Esa opcion no existe");break;
           }
           
       }while(opcion!=7);  
   }
   public static void Viaje_equipo()
   {
       for(Persona equipo:persona)
       {
           System.out.print(equipo.getNombre()+" "+equipo.getApellido()+"->");
           equipo.viajar();
       }
   }
   
   public static void entrenamiento_equipo()
   {
       for(Persona equipo:persona)
       {
           System.out.print(equipo.getNombre()+" "+equipo.getApellido()+"->");
           equipo.entrenamiento();
       }
   }
   public static void partido_equipo()
   {
       for(Persona equipo:persona)
       {
           System.out.print(equipo.getNombre()+" "+equipo.getApellido()+"->");
           equipo.Partido_de_futbol();
       }
   }
   
   public static void planificar_equipo()
   {
       
           System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+"->");
           ((Entrenador)entrenador).PlanificarEntrenamineto();
   }
      public static void entrevista_equipo()
   {
       
           System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+"->");
           ((Futbolista)futbolista1).Entrevista();
           System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+"->");
           ((Futbolista)futbolista2).Entrevista();
   }
   public static void curalesion_equipo()
   {
       
           System.out.print(medico.getNombre()+" "+medico.getApellido()+"->");
          ((Medico)medico).curarlesion();
   } 
    
   
   
    
}
