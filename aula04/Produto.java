package aula04;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private double desconto;

    public Produto(int codigo, String nome, double preco, double desc)  {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.desconto = desc;
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
        return desconto;
    }

    public void setDesconto(double desc) {
        this.desconto = desc;
    }

    public String descricao()  {
        return "Eu sou um produto de código" + getCodigo() + ", nome = " + getNome() + ", preço = " +getPreco()  + 
        " e desconto para pagamento a vista = " + getDesconto() + " %";
    }
 }

 