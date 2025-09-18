package org.example.entities;

public class ContaBancaria {

    public int numeroConta;
    public String titular;
    public double saldo;
    public int opcoesEscolha;

    public int toString(int opcoesEscolha) {
        while (opcoesEscolha != 0) {
            if (opcoesEscolha == 1) {
                System.out.println("Sr.a "
                        + titular
                        + " de numero de conta "
                        + numeroConta
                        + ", seu saldo atual é de $ ");
            } else {
                System.out.print("DIGITE O VALOR A SER DEPOSITADO : $ ");
            }
        }
        return opcoesEscolha;
    }

    public double depositar(double valor) {
        return saldo += valor;
    }

    public double sacar(double valorRetirado) {
        return saldo -= valorRetirado;
    }

}
