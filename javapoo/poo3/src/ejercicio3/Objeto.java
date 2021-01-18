/*
Construir un programa que perimita dirigir el movimiento de un objeto dentro de un tablero y actualice su posicion
dentro del mismmo.los movimientos posibles son de Arriba ,abajo,izquierda,derecha tras cada movimiento el programa mostrara 
la nueva direccion elegida y las cordenadas,de situacion del objeto dentro del tablero.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Objeto {
    
    private int y;
    private int x;
    public Objeto(int y,int x)
    {
        this.y=y;
        this.x=x;
    }
    public void setY(int Y)
    {
        this.y=Y;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int X)
    {
        this.x=X;
    }
    public int getX()
    {
        return x;
    }
    public void arriba(int y)
    {
        this.y+=y;
    }
    public void abajo(int y)
    {
        this.y-=y;
    }
    public void izquierda(int x)
    {
        this.x-=x;
    }
    public void derecha(int x)
    {
       this.x+=x;
    }
    public void mostrar()
    {
        JOptionPane.showMessageDialog(null,"En la coordenada Y:"+y+"\nEn la coordenada X:"+x);
       
    }
}
