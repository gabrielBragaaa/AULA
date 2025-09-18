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
        System.out.print("Qual o nome do titular: ");
        contaBancaria.titular = sc.nextLine();
        

    }
}