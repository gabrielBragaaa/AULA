package org.example.entities;

public class ContaBancaria {

    public int numeroConta;
    public String titular;
    public double saldo;
    public double limiteEmprestimo = 1000;


    public String toString(){
        return "Sr.(a) "
                + titular
                +" de numero de conta "
                + numeroConta
                + ", seu saldo atual é de $ "
                + saldo
                + ", com disponibilidade de emprestimo de $ "
                + limiteEmprestimo;

    }
    public double depositar(double valor) {
        return saldo += valor ;
    }

    public double sacar(double valorRetirado) {
        return saldo -= valorRetirado;
    }
    public double emprestimor(double valorRetirado){
        return  limiteEmprestimo -= valorRetirado;

    }
    public double atualizarSaldoEmprestimo(double valorReti){
        return saldo += valorReti;
    }


}
