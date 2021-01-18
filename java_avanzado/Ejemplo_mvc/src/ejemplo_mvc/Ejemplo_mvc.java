/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_mvc;

import Controlador.controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author ricar
 */
public class Ejemplo_mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vista vista=new Vista();
        Modelo modelo =new Modelo();
        controlador controla= new controlador(modelo,vista);
        controla.Iniciar(); 
        vista.setVisible(true);
       
        
        
        
    }
    
}
