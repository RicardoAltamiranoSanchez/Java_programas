
package Modelo;
public class Usuario {
    private int id;
    private String nombre_usuario;
    private String contraseña;
    private String nombre;
    private String correo;
    private String ultima_sesion;
    private int idtipo_usuario;
    private String rolusuario;//es cuando asignamos privilegios 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUltima_sesion() {
        return ultima_sesion;
    }

    public void setUltima_sesion(String ultima_sesion) {
        this.ultima_sesion = ultima_sesion;
    }

    public int getIdtipo_usuario() {
        return idtipo_usuario;
    }

    public void setIdtipo_usuario(int idtipo_usuario) {
        this.idtipo_usuario = idtipo_usuario;
    }

    public String getRolusuario() {
        return rolusuario;
    }

    public void setRolusuario(String rolusuario) {
        this.rolusuario = rolusuario;
    }
    
    
}
