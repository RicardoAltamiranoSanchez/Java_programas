
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Ciudad {
    
    private int idciudad;
    private String nombreC;

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String toString()
    {
        return this.nombreC;
    }
    
    public Vector<Ciudad> mostrarEstados(Integer idestados) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<Ciudad> vectorciudad = new Vector<Ciudad>();
        Ciudad ciudad = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConexion();
            ps = conexion.prepareStatement("Select * from  ciudad where idestadosC="+idestados);
            rs = ps.executeQuery();
            ciudad= new Ciudad();
            ciudad.setIdciudad(0);
            ciudad.setNombreC("Seleccione un pais");
            vectorciudad.add(ciudad);
            while (rs.next()) {
                ciudad= new Ciudad();
                ciudad.setIdciudad(rs.getInt("idpaises"));
                ciudad.setNombreC(rs.getString("nombre"));
                vectorciudad.add(ciudad);

            }
            rs.close();

        } catch (Exception ex) {
            System.err.println("Error ," + ex);
        }
        return vectorciudad;
    }

}
