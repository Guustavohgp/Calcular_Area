package Calcular_Area.src.entities;

public class Retangulo extends Formas {

    private Double largura;
    private Double altura;

    public Retangulo() {
        super();
    }
    
    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
    @Override
    public String toString() {
        return "Retangulo [Área = " + String.format("%.2f", area()) + "]";
    }
}
