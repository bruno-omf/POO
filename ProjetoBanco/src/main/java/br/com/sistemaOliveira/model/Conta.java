package br.com.sistemaOliveira.model;

public class Conta {

    private String numero;
    private String nome;
    private double saldo;

    public Conta(String numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo= saldo;
    }
    public String getNumero()  {
        return numero;
    }
    public String getNome()  {
        return nome;
    }
    public double getSaldo()  {
        return saldo;
    }
    public void setNumero(String numero)  {
       this.numero = numero;
    }
    public void setNome(String numero)  {
        nome = numero;
    }
    public void setSaldo(double saldo)  {
        this.saldo = saldo;
    }
}