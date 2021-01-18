package ejercicio5;
public abstract class Poligono {
    private int numerodelados;
    public Poligono(int numerodelados)
    {
        this.numerodelados=numerodelados;
    }
    public int getNumerolados()
    {
        return numerodelados;
        
    }
    @Override
    public String toString()      
    {
     
        return "EL numero de lado es"+numerodelados;
    }
    public abstract double area();
    
}
