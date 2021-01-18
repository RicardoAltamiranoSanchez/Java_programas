
package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    
    static ArrayList<Poligono> poligono=new  ArrayList<Poligono>();
    static Scanner entry=new Scanner(System.in); 
    
    public static void main(String [] args)
    {
        
        llenarArreglo();
        MostrarDatos();
        
    }
     public static  void llenarArreglo()
    {
        boolean respuesta=true;
        char op;
        int opcion;
        do{
            do {
                System.out.println("Que poligono deseas");
                System.out.println("1 Rectangulo");
                System.out.println("2 Triangulo");
                System.out.println("Digite la opcion");
                opcion=entry.nextInt();
                
                
            }while(opcion<1 || opcion>2);
            
            switch(opcion)
              {
                case 1:
                    LlenarRectangulo();
                    break;
                case 2:
                    llenarTriangulo();
                    break;
                        
              }
            
            
            
            System.out.println("Deseas seguir ingresando");
            System.out.println("SI /NO");
            System.out.println("Digite la opcion");
            op=entry.next().charAt(0);
            if((op=='s') || (op=='S') )
            {
                respuesta=false;
            }
            if((op=='N') || (op=='n') )
            {
                respuesta=true;
            }
            
            
        }while(!respuesta);
     
            
        
    }
        public static void  llenarTriangulo()
        {
            double lado1,lado2,lado3;
            System.out.println("Llanado triangulo");
            System.out.println("Digite su primer lado");
            lado1=entry.nextDouble();
            System.out.println("Digite su segundo lado");
            lado2=entry.nextDouble();
            System.out.println("Digite su tercer lado");
            lado3=entry.nextDouble();
            Triangulo triangulo=new Triangulo(lado1,lado2,lado3);
            
            poligono.add(triangulo);
            
        }
        public static void LlenarRectangulo()
        {
            double lado1,lado2;
            System.out.println("Llenado Rectangulo");
            System.out.println("Digite su primer lado");
            lado1=entry.nextDouble();
            System.out.println("Digite su segundo lado");
            lado2=entry.nextDouble();
            Rectangulo rectangulo= new Rectangulo(lado1,lado2);
            poligono.add(rectangulo);
        }
       
        public static void MostrarDatos()
        {
            for(Poligono p:poligono)
            {
                System.out.println(p.toString());
                System.out.println("Area :"+p.area());
            }
        }
    
}
