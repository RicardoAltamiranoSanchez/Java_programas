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
public class ventanainventario {
   private String clave,producto,cantidad,costo,caducidad;

    public ventanainventario(String clave, String producto, String cantidad, String costo, String caducidad) {
        this.clave = clave;
        this.producto = producto;
        this.cantidad = cantidad;
        this.costo = costo;
        this.caducidad = caducidad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
   @Override
    public String toString ()
    {
        return producto;
    }
    
}
