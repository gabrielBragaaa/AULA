package org.example;

import org.example.entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();

        int opcao = -1;

        System.out.println("# BEM VINDO(A) AO BANCO BELEPOC #");
        System.out.println();

        System.out.print("QUAL O NOME DO TITULAR : ");
        contaBancaria.titular = sc.nextLine();
        System.out.print("QUAL O NUMERO DA CONTA : ");
        contaBancaria.numeroConta = sc.nextInt();
        System.out.println();

        while (opcao != 0) {
            System.out.println("# MENU #  \n 1- DADOS DA CONTA \n 2- DEPOSITAR NA CONTA \n 3- SACAR VALOR \n 4- SOLICITAR EMPRESTIMO \n 0- SAIR");
            System.out.println();

            opcao = sc.nextInt();
            System.out.println();

            if (opcao == 1) {
                System.out.println(contaBancaria.toString());
                System.out.println();

            } else if (opcao == 2) {
                System.out.print("QUAL O VALOR QUER DEPOSITAR $ ");
                double depositar = sc.nextDouble();
                contaBancaria.depositar(depositar);
                System.out.println("DEPOSITO FEITO COM SUCESSO!");
                System.out.println();

            } else if (opcao == 3) {
                System.out.println("QUAL VALOR VOÇE QUER SACAR ? $");
                double sacar = sc.nextDouble();
                contaBancaria.sacar(sacar);
                System.out.println("SAQUE EFETUADO COM SUCESSO! ");
                System.out.println();

            } else if (opcao == 4) {
                System.out.println("VOCE TEM $ " + contaBancaria.limiteEmprestimo + " DE LIMITE DE EMPRESTMO.");
                System.out.println("QUANTO VOCE DESEJA PEGAR DE EMPRESTIMO? ");
                double valorDeEmprestimo = sc.nextDouble();
                contaBancaria.emprestimor(valorDeEmprestimo);
                System.out.println("LIMITE DE EMPRESTIMO ATUALIZDO ! $ " + contaBancaria.limiteEmprestimo);
                System.out.println("SEU SALDO ATUAL É DE $ " + contaBancaria.atualizarSaldoEmprestimo(valorDeEmprestimo));

            } else if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
                System.out.println("OPÇÃO INEXISTENTE! :(");
                System.out.println();
            }
        }
        System.out.println("ATE LOGO! :)");
        sc.close();
    } 
}