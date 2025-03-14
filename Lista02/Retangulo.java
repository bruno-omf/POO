public class Retangulo {
    //a = b * h
    //p = 2(b+h)
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcArea() {
        return base * altura;
    }

    public double calcPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString(){
        return "Retangulo [Largura: " + base +
                ", Altura: " + altura +
                ", Area: " + calcArea() +
                ", Perimetro: " + calcPerimetro() +
                "]"; 
    }
}
