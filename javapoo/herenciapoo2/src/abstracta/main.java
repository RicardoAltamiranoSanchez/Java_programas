/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author ricar
 */
public class main {
    public static void main(String [] args)
    {
        Planta planta=new Planta();
        Animal_Carnivoro animalC=new Animal_Carnivoro();
        Animal_Herbivoro animalh=new Animal_Herbivoro();
        
        planta.comer();
      
        animalC.comer();
       
        animalh.comer();
        
        
        
    
        
        
    }
    
    
}
