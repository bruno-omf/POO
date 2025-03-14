public class Veiculo {
    private String numeroPlaca;
    private String nomeDono;
    private String modeloCarro;
    private String fabricante;
    private double precoCarro;

    public Veiculo(String numeroPlaca, String nomeDono, String modeloCarro,
    String fabricante, double precoCarro) {
        this.numeroPlaca = numeroPlaca;
        this.nomeDono = nomeDono;
        this.modeloCarro = modeloCarro;
        this.fabricante = fabricante;
        this.precoCarro = precoCarro;
    }

    public String getNumPlaca() {
        return numeroPlaca;
    }

    public void setNumPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getDono() {
        return nomeDono;
    }

    public void setDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getModelo() {
        return modeloCarro;
    }

    public void setModelo(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return precoCarro;
    }

    public void setPreco(double precoCarro) {
        this.precoCarro = precoCarro;
    }
}
