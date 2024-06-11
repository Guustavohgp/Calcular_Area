package entities;

public class Quadrado extends Formas{
    private Double lado;

    public Quadrado(){
        super();
    }
    
    public Quadrado(Double lado) {
        this.lado = lado;
    }
    
    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }   
    @Override
    public String toString() {
        return "Quadrado [Área = " + String.format("%.2f", area()) + "]";
    }
}
