package org.example.entities;

public class ContaBancaria {

    public int numeroConta;
    public String titular;
    public double saldo;
    public int opcoesEscolha;


    public String toString(){
        return "Sr.(a) "
                + titular
                +" de numero de conta "
                + numeroConta
                + ", seu saldo atual é de $ "
                + saldo;

    }
    public double depositar(double valor) {
        return saldo += valor;
    }

    public double sacar(double valorRetirado) {
        return saldo -= valorRetirado;
    }

}
