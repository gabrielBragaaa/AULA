package org.example;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("DIGITE A TEMPERATURA EM CELSIUS: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("EQUIVALENTE EM FAHRENHEIT: %.1f%n ", f);
            System.out.print("VOÇE QUER CONTINUAR (S / N) ? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n' && resp != 'N');

        System.out.println();
        System.out.println("ATÉ LOGO :)");
        sc.close();
    }
}    