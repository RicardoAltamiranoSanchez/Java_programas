
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Estados {
    
    private int idestados;
    private String nombreE;

    public int getIdestados() {
        return idestados;
    }

    public void setIdestados(int idestados) {
        this.idestados = idestados;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String toString()
    {
        return this.nombreE;
    }
    
    public Vector<Estados> mostrarEstados(Integer idpais) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<Estados> vectorestados = new Vector<Estados>();
        Estados estado= null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConexion();
            ps = conexion.prepareStatement("Select * from  estados where idpaisesE="+idpais);
            rs = ps.executeQuery();
            estado= new Estados();
            estado.setIdestados(0);
            estado.setNombreE("Seleccione un estado");
            vectorestados.add(estado);
            while (rs.next()) {
                estado = new Estados();
                estado.setIdestados(rs.getInt("idestado"));
                estado.setNombreE(rs.getString("nombreE"));
                vectorestados.add(estado);

            }
            rs.close();

        } catch (Exception ex) {
            System.err.println("Error ," + ex);
        }
        return vectorestados;
    }

}
