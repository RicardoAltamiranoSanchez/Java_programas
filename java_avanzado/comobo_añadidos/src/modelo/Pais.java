
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Pais {

    private int idpais;
    private String nombre;

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }

    public Vector<Pais> mostrarPaises() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<Pais> vectorpaises = new Vector<Pais>();
        Pais pais = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConexion();
            ps = conexion.prepareStatement("Select * from paises");
            rs = ps.executeQuery();
            pais = new Pais();
            pais.setIdpais(0);
            pais.setNombre("Seleccione un pais");
            vectorpaises.add(pais);
            while (rs.next()) {
                pais = new Pais();
                pais.setIdpais(rs.getInt("idpaises"));
                pais.setNombre(rs.getString("nombre"));
                vectorpaises.add(pais);

            }
            rs.close();

        } catch (Exception ex) {
            System.err.println("Error ," + ex);
        }
        return vectorpaises;
    }

}
