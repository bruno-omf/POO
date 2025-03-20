package aula04;

public class Livro extends Produto {
    private String autor;
    private String editora;

    //construtor
    public Livro(int codigo, String nome, double preco, double desc, String autor, String editora) {
        super(codigo, nome, preco, desc);
        this.autor = autor;
        this.editora = editora;
    }

    //metodos gets e sets
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    //metodo descricao
    public String descricao() {
        return "Eu sou um produto de codigo " + getCodigo() +
                ", nome = " + getNome() +
                ", preco = " + getPreco() +
                ", desconto = " + getDesconto() +
                ", autor = " + getAutor() +
                " e editora = " + getEditora();
    }
}