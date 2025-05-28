package HomePractices.polimorfismo;
import HomePractices.polimorfismo.Produto;

public class Livro extends Produto{
    private String nomeAutor;
    private String nomeEditora;

    public Livro(int codigo, String nome, double preco, double descontoAVista,
                    String nomeAutor, String nomeEditora) {
        super(codigo, nome, preco, descontoAVista);
        this.nomeAutor = nomeAutor;
        this.nomeEditora = nomeEditora;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String descricao() {
        return "O nome da classe é Livro " + 
                " e o valor dos atributos dela são: " + 
                "Autor: " + getNomeAutor() +
                "Editora: " + getNomeEditora();
    }
}
