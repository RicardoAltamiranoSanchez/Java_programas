
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQL_usuario {
 
    public boolean registrar(Usuario usuario){
        Conexion con=new Conexion();
        PreparedStatement ps=null;
        try{
            Connection conexion= con.getConexion();
            ps=conexion.prepareStatement("insert into nuevos_u (nombre_usuario,constraseña,nombre,correo,id_u2)values(?,?,?,?,?)");
            ps.setString(1,usuario.getNombre_usuario());
            ps.setString(2,usuario.getContraseña());
            ps.setString(3,usuario.getNombre());
            ps.setString(4,usuario.getCorreo());
            ps.setInt(5,usuario.getIdtipo_usuario());
           ps.executeUpdate();
           return true;
            
        }catch(Exception ex){
            return false;
        }
            
        
    }
    
    //verificamos usuario si un usuario ya existe
        public int verificar_usuario(String usuario){
        Conexion con=new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            Connection conexion= con.getConexion();
            ps=conexion.prepareStatement("select count(id_n) from nuevos_u where nombre_usuario=?");
            ps.setString(1,usuario);
            
         rs= ps.executeQuery();
         if(rs.next())
         {
             return rs.getInt(1);
         }
           return 1;
            
        }catch(Exception ex){
            return 1;
        }
            
        
    }
        public boolean comprobar_email(String correo){
             Pattern patron = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
             
           Matcher matcher=patron.matcher(correo);
           return matcher.find();
        }
        public boolean Iniciar_Sesion(Usuario usuario){
        Conexion con=new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
           /* Connection conexion= con.getConexion(); para entrar normal
            ps=conexion.prepareStatement("select id_n,nombre_usuario,constraseña,nombre,id_u2 from nuevos_u where nombre_usuario=?");
            ps.setString(1,usuario.getNombre_usuario());*/
             //aqui asignamos privilegios de usuarios 
             Connection conexion= con.getConexion(); 
            ps=conexion.prepareStatement("select us.id_n,us.nombre_usuario,us.constraseña,us.nombre,us.id_u2,t.nombre from nuevos_u as us inner join tipos_u as t on id_u2=t.id_u where nombre_usuario=?");
            ps.setString(1,usuario.getNombre_usuario());
         rs= ps.executeQuery();
         if(rs.next())
         {
             if(usuario.getContraseña().equals(rs.getString("constraseña"))){
                 //ponemos un update para modificar el ultimo inicio de sesion
                 
                 ps=conexion.prepareStatement("update nuevos_u set ultima_sension=? where id_n=?");
                 ps.setString(1,usuario.getUltima_sesion());
                 ps.setInt(2,rs.getInt("id_n"));
                 ps.executeUpdate();
                 
                 
                 /*usuario.setId(rs.getInt("id_n"));
                 usuario.setNombre(rs.getString("nombre"));
                 usuario.setIdtipo_usuario(rs.getInt("id_u2"));*///cuando es normal
                 //cuando asignamos privilegios a al usuario
                 usuario.setId(rs.getInt("us.id_n"));
                 usuario.setNombre(rs.getString("us.nombre"));
                 usuario.setIdtipo_usuario(rs.getInt("us.id_u2"));
                 usuario.setRolusuario(rs.getString("t.nombre"));
                 return true;
             }else{
                 return false;
             }
             
         }
           return false;
            
        }catch(Exception ex){
            return false;
        }
            
        
    }
}
