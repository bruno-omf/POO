public class Pilha {
    private Object[] elementos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;

    public Pilha() {
        elementos = new Object[CAPACIDADE_INICIAL];
        tamanho = 0;
    }

    public boolean adicionar(Object o) {
        // se o tamanho atual for igual ao tamanho total do array
        if (tamanho == elementos.length) {
            // pilha cheia, nao é possivel adicionar mais elementos
            return false;
        }
        // se o elemento foi adicionado com sucesso à fila:
        elementos[tamanho] = o;
        tamanho ++;// na ultima iteração, tamanho será 3.
        // return true
        return true;
    }

    public void printElementos(){
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
    }

    public Object retirar() {
        if (estaVazia()) {
            return null;
        }
        tamanho--; // com tamanho iniciando em 3 (indice 3 nao existe no array, só vai até o 2), decremento para poder acessar o último índice (2)
        Object elemento = elementos[tamanho];
        elementos[tamanho] = null;

        return elemento;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

}
