package br.com.sistemaOliveira.app;

import java.util.*;
import br.com.sistemaOliveira.service.ContaService;

public class AppBanco {
    private static final Scanner ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        System.out.println("Tchau...");
    }

    public static void menu() {
        int opcao = 0;
        boolean wait = true;

        while (opcao != 9) {
            System.out.println("\nSistema Bancário Oliveira");
            System.out.println("Digite sua opção:");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Consultar Conta");
            System.out.println("3 - Alterar Dados da Conta");
            System.out.println("4 - Remover Conta");
            System.out.println("5 - Exibir todas as contas");
            System.out.println("9 - Sair do Sistema");
            System.out.print("Opção escolhida:");

            opcao = ENTRADA.nextInt();
            switch (opcao) {
                case 1:
                    ContaService.inserirConta();
                    break;
                case 2:
                    ContaService.consultarConta();
                    break;
                case 3:
                    //chamar funcao de alterar dados da conta
                    System.out.println("Função não implementada.");
                    break;
                case 4:
                    ContaService.removerConta();
                    break;
                case 5:
                    //chamar funcao de exibir todas as contas
                    System.out.println("Função não implementada.");
                    break;
                case 9:
                    //sair do app banco
                    wait = false;
                    break;
            }
            if (wait) {
                try {
                    Thread.sleep(3000);
                }
                catch(Exception exc) {
                    exc.printStackTrace();
                }
            }
        }
    }
}
