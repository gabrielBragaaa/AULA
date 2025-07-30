package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valorTeiro = sc.nextInt();
        double caso1, caso2, caso3 = 0;
        double media = 0;
        double total = 0;

        for (int x = 1; x <= valorTeiro; x++) {
            caso1 = sc.nextDouble();
            media =caso1 * 2 + caso1 * 3 + caso1 * 5;
            total = media / 10;
        }
        System.out.println(total);
        sc.close();//pesquisar depois
    }
}