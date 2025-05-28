import java.lang.Math;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getComprimento() {
        return 2*Math.PI * raio;
    }

    public String toString() {
        return "Circulo com raio " + raio + " e comprimento " + getComprimento();
    }
    

}