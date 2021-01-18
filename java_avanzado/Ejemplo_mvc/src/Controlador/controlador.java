/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ricar
 */
public class controlador implements ActionListener {
    private Modelo modelo ;
    private Vista vista;
    public controlador(Modelo modelo,Vista vista)
    {
        this.vista =vista;
        this.modelo=modelo;
        vista.botonsuma.addActionListener(this);
    }
   public void Iniciar()
   {
       vista.setTitle("MVC ");
       vista.setLocationRelativeTo(null);
   }
    @Override
    public void actionPerformed(ActionEvent ae) {
        modelo.setNumero1(Integer.parseInt(vista.cajanumero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.cajanumero2.getText()));
        modelo.sumar();
        
        vista.cajasuma.setText( String.valueOf(modelo.getResultado()));    
    }
    
}
