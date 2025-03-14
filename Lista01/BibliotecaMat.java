public final class BibliotecaMat {
    private BibliotecaMat() {
        throw new UnsupportedOperationException("Esta classe nao pode ser instanciada.");
    }

    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public static double media(double valores[]) {
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma = soma + valores[i];
        }
        return soma / valores.length;
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) { // se encontrar outro divisor para "num" além de 1 e ele mesmo
                return false; // retorne false porque "num" nao é primo.
            }
        }
        return true;
    }
}