/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author ricar
 */
public class Triangulo {
    private double base;
    private double lado;
    public Triangulo(double base,double lado)
    {
        this.base=base;
        this.lado=lado;
    }
    public double getPerimetro()
    {
        double perimetro;
        perimetro=(2*lado)+base;
        return perimetro;
    }
    public double getArea()
    {
        double area;
        area=(base*Math.sqrt(lado*lado)-(base*base)/4)/2;
        return area;
    }
    
}
