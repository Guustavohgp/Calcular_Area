package entities;

public class Triangulo extends Formas {
    private Double altura;
    private Double largura;

    public Triangulo() {
        super();
    }

    public Triangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
       return (largura * altura) /2 ;
    }
    @Override
    public String toString() {
        return "Triangulo [Area = " + area() + "]";
    }
    
}
