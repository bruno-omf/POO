public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

    public Pessoa(String nome, int idade, double altura,
    double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }
    //metodo para calcular imc
    public double calcIMC() {
        return peso / (altura*altura);
    }
    //metodo para definir a categoria do imc
    public String categoriaIMC(double imc) {
        String categoria = null;
        if (imc <= 18.5) {
            categoria = "Abaixo do peso normal";
        } else if (imc < 18.5 || imc <= 25){
            categoria = "Peso normal";
        } else if (imc < 25 || imc <= 30) {
            categoria = "Acima do peso normal";
        } else if (imc > 30) {
            categoria = "Obesidade";
        }
        return categoria;
    }
    //metodo toString
    public String toString() {
        return "Pessoa [Nome: " + nome +
                ", Idade: " + idade +
                ", Altura: " + altura +
                ", Peso: " + peso +
                ", Sexo: " + sexo +
                ", IMC: " + categoriaIMC(calcIMC()) +
                "]";
    }
}
