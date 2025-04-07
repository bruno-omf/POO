public class Animal {
    private String especieAnimal;
    private int idadeAnimal;
    private boolean vacinado;
    private double precoDoAnimal;
    private String descricao;

    public Animal(String especieAnimal, int idadeAnimal, boolean vacinado,
    double precoDoAnimal, String descricao) {
        this.especieAnimal = especieAnimal;
        this.idadeAnimal = idadeAnimal;
        this.vacinado = vacinado;
        this.precoDoAnimal = precoDoAnimal;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Especie=" + especieAnimal +
                ", Idade=" + idadeAnimal +
                ", Vacinado=" + vacinado +
                ", Preco=" + precoDoAnimal +
                ", Descricao=" + descricao +
                "}";
    }
}