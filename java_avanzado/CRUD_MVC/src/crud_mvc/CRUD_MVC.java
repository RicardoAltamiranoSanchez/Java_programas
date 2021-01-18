/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_mvc;

import Controlador.ControladorPersona;
import Modelo.ConsultasPersona;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author ricar
 */
public class CRUD_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vista vista =new Vista();
       Modelo persona=new Modelo();
       ConsultasPersona modelo= new ConsultasPersona();
       ControladorPersona controlador= new ControladorPersona(vista, persona, modelo);
       controlador.iniciar();
       vista.setVisible(true);
    }
    
}
