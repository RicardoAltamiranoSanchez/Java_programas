/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author ricar
 */
public class nuevousuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String constraseña;
   public nuevousuario(String nombre,String apellido,String correo,String telefono,String constraseña)
    { 
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.telefono=telefono;
        this.constraseña=constraseña;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getConstraseña() {
        return constraseña;
    }

    public void setConstraseña(String constraseña) {
        this.constraseña = constraseña;
    }
    
    
    
}
