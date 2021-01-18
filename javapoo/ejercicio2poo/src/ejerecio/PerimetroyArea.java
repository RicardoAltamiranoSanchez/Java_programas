/*
Construir un programa que calcule el area y el perimetro
de un cuadrilatero dada la longitud de sus dos lados.los valores
de longitud deberan introducirse por linea de ordenes ,si es un cuadralo
solo proporcionara la longitud de uno de sus lados  al constructor.
 */
package ejerecio;

/**
 *
 * @author ricar
 */
public class PerimetroyArea {
    private int lado1; 
    private int lado2;
    private  int area;
    private int perimetro;
    public  PerimetroyArea(int lado1,int lado2)
    {
        this.lado1=lado1;
        this.lado2=lado2;
       this.perimetro=0;
       this.area=0;
    }
    
    public PerimetroyArea(int lado1)
    {
        this.lado1=this.lado2=lado1;
    }
    
    public void setLado1(int lado1)
    {
        this.lado1=lado1;
    }
    public int getLado1()
    {
        return lado1;
    }
    public void setLado2(int lado2)
    {
        this.lado2=lado2;
    }
    public int getLado2()
    {
        return lado2;
    }
    public void Perimetro()
    {
        perimetro=2*(lado1+lado2);
    }
    public void Area()
    {
        area=lado1*lado2;
    }
    public void mostrar_datos()
    {
        System.out.println("El area es :"+area);
        System.out.println("El  perimetro es :"+perimetro);
    }
}
