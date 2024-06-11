package entities;

public class Trapezio extends Formas {

    private Double basemaior ;
    private Double basemenor;
    private Double altura;

    public Trapezio() {
        super();
    }

    public Trapezio(Double basemaior, Double basemenor, Double altura) {
        this.basemaior = basemaior;
        this.basemenor = basemenor;
        this.altura = altura;
    }

    public Double getBasemaior() {
        return basemaior;
    }

    public void setBasemaior(Double basemaior) {
        this.basemaior = basemaior;
    }

    public Double getBasemenor() {
        return basemenor;
    }

    public void setBasemenor(Double basemenor) {
        this.basemenor = basemenor;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
    return (basemaior+basemenor)*altura /2 ;
    }
    @Override
    public String toString() {
        return "Trapézio [Area = " + area() + "]";
    }

}
