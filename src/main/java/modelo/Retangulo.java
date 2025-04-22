package modelo;

public class Retangulo extends Figura {

    private double altura;
    private double base;

    public Retangulo() {
        this("", 0, 0);
    }

    public Retangulo(String cor, double base, double altura) {
        super(cor);
        setBase(base);
        setAltura(altura);
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double getArea() {
        return (getBase() * getAltura());
    }
}