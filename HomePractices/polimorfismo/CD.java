package HomePractices.polimorfismo;
import HomePractices.polimorfismo.Produto;

public class CD extends Produto{
    private String nomeCantor;
    private String nomeProdutora;

    public CD(int codigo, String nome, double preco, double descontoAVista,
                    String nomeCantor, String nomeProdutora) {
        super(codigo, nome, preco, descontoAVista);
        this.nomeCantor = nomeCantor;
        this.nomeProdutora = nomeProdutora;
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }

    public String getNomeProdutora() {
        return nomeProdutora;
    }

    public void setNomeProdutora(String nomeProdutora) {
        this.nomeProdutora = nomeProdutora;
    }

    public String descricao() {
        return "O nome da classe é CD " + 
                " e o valor dos atributos dela são: " + 
                "Cantor: " + nomeCantor +
                "Produtora: " + nomeProdutora;
    }
}
