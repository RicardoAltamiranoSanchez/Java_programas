/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasPersona;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class ControladorPersona implements ActionListener{
    private Vista vista;
    private Modelo persona;
    private ConsultasPersona modelo;
    
    public ControladorPersona(Vista vista,Modelo persona,ConsultasPersona modelo)
    {
        this.vista=vista;
        this.persona=persona;
        this.modelo=modelo;
        vista.boton_insertar.addActionListener(this);
        vista.boton_limpiar.addActionListener(this);
        vista.boton_buscar.addActionListener(this);
        vista.boton_modificar.addActionListener(this);
        vista.boton_eliminar.addActionListener(this);
    }
    public void iniciar()
    {
        vista.setTitle("CRUD MVC");
        vista.setLocationRelativeTo(null);
        vista.idpersona.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista.boton_insertar)/*ver que boton a seleccionado*/
        {
            persona.setClave(vista.caja_clave.getText());
            persona.setNombre(vista.caja_nombre.getText());
            persona.setDomicilio(vista.caja_domicilio.getText());
            persona.setCelular(vista.caja_celular.getText());
            persona.setCorreo(vista.caja_correo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.caja_fechadn.getText()));
            persona.setGenero(vista.combo_genero.getSelectedItem().toString());
            
            if(modelo.Insertar(persona)){
                JOptionPane.showMessageDialog(null,"registro insertado");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al insertar registro");
               Limpiar();
            }
            
        }
        if(ae.getSource()== vista.boton_limpiar)
        {
            Limpiar();
        }
        if(ae.getSource()==vista.boton_buscar){
            persona.setClave(vista.caja_buscar.getText());
            if(modelo.Buscar(persona)){
                vista.idpersona.setText(String.valueOf(persona.getIdpersona()));
                vista.caja_clave.setText(persona.getClave());
                vista.caja_nombre.setText(persona.getNombre());
                vista.caja_celular.setText(persona.getCelular());
                vista.caja_domicilio.setText(persona.getDomicilio());
                vista.caja_correo.setText(persona.getCorreo());
                vista.caja_fechadn.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.combo_genero.setSelectedItem(persona.getGenero());
            }else{
                JOptionPane.showMessageDialog(null,"No hay ningun registro con esa clave");
                Limpiar();
            }
            
            
            
        }
        if(ae.getSource()==vista.boton_modificar){
            persona.setIdpersona(Integer.parseInt(vista.idpersona.getText()));
            persona.setClave(vista.caja_clave.getText());
            persona.setNombre(vista.caja_nombre.getText());
            persona.setDomicilio(vista.caja_domicilio.getText());
            persona.setCelular(vista.caja_celular.getText());
            persona.setCorreo(vista.caja_correo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.caja_fechadn.getText()));
            persona.setGenero(vista.combo_genero.getSelectedItem().toString());
            
            if(modelo.Modificar(persona)){
                JOptionPane.showMessageDialog(null,"Registro modificado correctamente");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Error al modificar registro");
                Limpiar();
            }
            
            
        }
        if(ae.getSource() == vista.boton_eliminar){
            persona.setIdpersona(Integer.parseInt(vista.idpersona.getText()));
           if( modelo.Eliminar(persona)){
            JOptionPane.showMessageDialog(null,"El registro fue eliminado correctamente");
            Limpiar();      
        }else{
               JOptionPane.showMessageDialog(null,"Error al eliminar el registro");
               Limpiar();
           }
    }
    }
    public void Limpiar()
    {
        vista.idpersona.setText(null);
        vista.caja_clave.setText(null);
        vista.caja_nombre.setText(null);
        vista.caja_domicilio.setText(null);
        vista.caja_celular.setText(null);
        vista.caja_correo.setText(null);
        vista.caja_fechadn.setText(null);
        vista.combo_genero.setSelectedIndex(0);
        
    }
    
}
