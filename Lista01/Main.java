
public class Main {
    public static void main(String[] args) {
        
        /*
        double soma = BibliotecaMat.adicionar(5.5, 4.2);

        double valores[] = {5, 10, 55, 25, 15.2};
        double media = BibliotecaMat.media(valores);
        System.out.println("Media: " + media); = BibliotecaMat.media(valores);
        System.out.println("Media: " + media);

        boolean primo = BibliotecaMat.ehPrimo(33);
        System.out.println("33 é primo? " + primo);
        */

        /*
        
        Pedido pedido1 = new Pedido(1, "Bruno", 35.90);
        System.out.println("Numero do pedido: " + pedido1.getNumeroPedido());
        System.out.println("Nome do cliente: " + pedido1.getNomeCliente());
        System.out.println("Valor do pedido: " + pedido1.getValorPedido());
        */
        
        /*
        Veiculo veiculo1 = new Veiculo("RZH2233", "Bruno", "BMW M8 Coupe 2023", "BMW", 1000000.500);
        System.out.println("Numero da placa: " + veiculo1.getNumPlaca());
        System.out.println("Nome do dono: " + veiculo1.getDono());
        System.out.println("Modelo do carro: " + veiculo1.getModelo());
        System.out.println("Fabricante: " + veiculo1.getFabricante());
        System.out.println("Preço do carro: " + veiculo1.getPreco());
        */

        Candidato candidato1 = new Candidato(20, "Pedro Calazans");

        candidato1.incrementarVotos();
        candidato1.incrementarVotos();
        candidato1.incrementarVotos();

        System.out.println(candidato1);
    }
}


    
