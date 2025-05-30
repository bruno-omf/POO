package HomePractices.polimorfismo;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private double descontoAVista;

    public Produto(int codigo, String nome, double preco, double descontoAVista) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.descontoAVista = descontoAVista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return descontoAVista;
    }

    public void setDesconto(double descontoAVista) {
        this.descontoAVista = descontoAVista;
    }

    public String descricao() {
        return "O nome da classe é Produto e o valor dos atributos são: " +
        "codigo: " + codigo +
        "nome: " + nome +
        "preco: " + preco +
        "descontoAVista: " + descontoAVista;
    }
}
