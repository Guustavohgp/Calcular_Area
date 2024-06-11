package entities;

public class Circulo extends Formas{
    private Double raio;

    public Circulo(){
        super();
    }
    
    public Circulo(Double raio) {
        this.raio = raio;
    } 

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    @Override
    public double area() {
        return Math.PI * raio *raio;
    }  
    @Override
    public String toString() {
        return "Círculo [Área = " + String.format("%.2f", area()) + "]";
    }
}
