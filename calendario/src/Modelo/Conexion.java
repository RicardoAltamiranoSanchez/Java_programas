
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
public static final String URL= "jdbc:mysql://localhost:3306/Tiempo?autoReconnet=true&useSSL=false";
public static final String usuario="root";
public static final String contraseña="Ricardo";

public Connection getConexion()
{
    Connection conexion=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conexion=DriverManager.getConnection(URL,usuario,contraseña);
        //JOptionPane.showMessageDialog(null,"Conexion existosa");
        
    }catch(Exception ex)
    {
        System.err.println("Error ,"+ex);
    }
    return conexion;
}
}
