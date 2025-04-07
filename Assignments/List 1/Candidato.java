public class Candidato {
    private int numCandidato;
    private String nomeCandidato;
    private int qtdVotos;

    public Candidato(int numCandidato, String nomeCandidato) {
        this.numCandidato = numCandidato;
        this.nomeCandidato = nomeCandidato;
        this.qtdVotos = 0;
    }

    public void incrementarVotos() {
        this.qtdVotos++;
    }

    public int getNumero() {
        return numCandidato;
    }

    public String getNome() {
        return nomeCandidato;
    }

    public int getVotos() {
        return qtdVotos;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "numero=" + numCandidato +
                ", nome=" + nomeCandidato +
                ", votos=" + qtdVotos +
                "}";
    }

}
