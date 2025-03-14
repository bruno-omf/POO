package br.com.sistemaOliveira.service;

import java.util.Scanner;
import br.com.sistemaOliveira.model.Conta;
import br.com.sistemaOliveira.app.AppBanco;

public class ContaService {
    private static Conta contaBancaria = null;

    public static void inserirConta() {
        try (Scanner s = new Scanner(System.in)) {
            String numero = "", nome = "";
            System.out.println("Digite o número da conta:");
            numero = s.nextLine();
            System.out.println("Digite o nome do cliente:");
            nome = s.nextLine();
            System.out.println("Digite o saldo da conta:");
            double saldo = s.nextDouble();
            contaBancaria = new Conta(numero, nome, saldo);
            System.out.println("Conta criada com sucesso.");

            AppBanco.menu();
        }
    }

    public static void consultarConta() {
        if (contaBancaria != null) {
            System.out.println("Dados da conta: ");
            System.out.println("Número: " + contaBancaria.getNumero());
            System.out.println("Nome: " + contaBancaria.getNome());
            System.out.println("Saldo: " + contaBancaria.getSaldo());

            AppBanco.menu();
        } else {
            System.out.println("Conta inexistente");
            AppBanco.menu();
        }
    }

    public static void removerConta() {
        contaBancaria = null;
        System.out.println("Conta removida com sucesso.");
        AppBanco.menu();
    }
}
