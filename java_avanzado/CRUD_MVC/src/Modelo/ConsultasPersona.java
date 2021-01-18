
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ricar
 */
public class ConsultasPersona extends Conexion {
    PreparedStatement ps;//para consultar
    ResultSet rs;//para resivir datos
    
    public boolean Insertar(Modelo persona)
    {
        Connection conexion=getConexion();
        try{
            ps=conexion.prepareStatement("insert into persona(clave,nombre,domicilio,celular,correo_electronico,fecha_nacimiento,genero) values(?,?,?,?,?,?,?) ");
            ps.setString(1,persona.getClave());
            ps.setString(2,persona.getNombre());
            ps.setString(3,persona.getDomicilio());
            ps.setString(4,persona.getCelular());
            ps.setString(5,persona.getCorreo());
            ps.setDate(6,persona.getFecha_nacimiento());
            ps.setString(7,persona.getGenero());
            int resultado =ps.executeUpdate();//hacer una inserccion
            if(resultado>0){
                return true;
            }
            else {
                return false;
            }
            
                
        }catch(Exception ex)
        {
            System.err.println("Error ,"+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                System.err.println("Error ,"+ex);
            }
        }
        
    }
    public boolean Buscar(Modelo persona)
    {
        Connection conexion=getConexion();
        try{
            ps=conexion.prepareStatement("Select *from persona where clave=?");
            ps.setString(1,persona.getClave());
            rs=ps.executeQuery();
            if(rs.next())
            {
                persona.setIdpersona(rs.getInt("idpersona"));
                persona.setClave(rs.getString("clave"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDomicilio(rs.getString("domicilio"));
                persona.setCelular(rs.getString("celular"));
                persona.setCorreo(rs.getString("correo_electronico"));
                persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                persona.setGenero(rs.getString("genero"));
                return true;
            }else{
                return false;
            }
                
        }catch(Exception ex)
        {
            System.err.println("Error ,"+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                System.err.println("Error ,"+ex);
            }
        }
        
    }
    public boolean Modificar(Modelo persona)
    {
        Connection conexion=getConexion();
        try{
            ps=conexion.prepareStatement("update persona set clave=?,nombre=?,domicilio=?,celular=?,correo_electronico=?,fecha_nacimiento=?,genero=? where idpersona=? ");
            ps.setString(1,persona.getClave());
            ps.setString(2,persona.getNombre());
            ps.setString(3,persona.getDomicilio());
            ps.setString(4,persona.getCelular());
            ps.setString(5,persona.getCorreo());
            ps.setDate(6,persona.getFecha_nacimiento());
            ps.setString(7,persona.getGenero());
            ps.setInt(8,persona.getIdpersona());
            int resultado =ps.executeUpdate();//hacer una inserccion
            if(resultado>0){
                return true;
            }
            else {
                return false;
            }
            
                
        }catch(Exception ex)
        {
            System.err.println("Error ,"+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                System.err.println("Error ,"+ex);
            }
        }
        
    }
     public boolean Eliminar(Modelo persona)
    {
        Connection conexion=getConexion();
        try{
            ps=conexion.prepareStatement("delete from persona  where idpersona=? ");
            ps.setInt(1,persona.getIdpersona());
            
            int resultado =ps.executeUpdate();//hacer una inserccion
            if(resultado>0){
                return true;
            }
            else {
                return false;
            }
            
                
        }catch(Exception ex)
        {
            System.err.println("Error ,"+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                System.err.println("Error ,"+ex);
            }
        }
        
    }
     
     
}
