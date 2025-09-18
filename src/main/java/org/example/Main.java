package org.example;

import org.example.entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("# BEM VINDO(A) AO BANCO BELEPOC #");
        System.out.println();

        System.out.print("QUAL O NOME DO TITULAR : ");
        contaBancaria.titular = sc.nextLine();
        System.out.print("QUAL O NUMERO DA CONTA : ");
        contaBancaria.numeroConta = sc.nextInt();
        System.out.println();

        System.out.println("1 - DADOS DA CONTA: ");
        int escolha = sc.nextInt();
        System.out.println(contaBancaria.toString(escolha));

//        double valorDeposito = sc.nextDouble();
//        System.out.println(String.format("%.3f", contaBancaria.depositar(valorDeposito)));
//        System.out.println();
//
//        System.out.println("QUAL O VALOR DO SAQUE? ");
//        double valorRetirar = sc.nextDouble();
//        System.out.println(contaBancaria.toString() + contaBancaria.sacar(valorRetirar));

        sc.close();
    }
}