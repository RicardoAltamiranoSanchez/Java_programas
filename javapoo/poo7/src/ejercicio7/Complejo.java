/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author ricar
 */
public class Complejo {
    private double a; 
    private double b;
    public Complejo(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    
    public Complejo suma(Complejo c)
    {
        Complejo suma=new Complejo(a+c.getA(),b+c.getB());
        return suma;
    }
    public Complejo multi(Complejo c)
    {
        Complejo mul=new Complejo((a*c.getA())-(b*c.getB()),(a*c.getB())+(b*c.getA()));
        return mul;
    }
    public boolean igual(Complejo c)
    {
        boolean igu=false;
        if(a==c.getA() && b==c.getB())
        {
            igu=true;
        }
        return igu;
    }
    public Complejo mul_en(int x)
    {
        Complejo m=new Complejo(a*x,b*x);
        return m;
    }
    
}
