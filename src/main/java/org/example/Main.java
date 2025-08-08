package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("diGITE A TEMPERATURA EM CELSIUS: ");
        double c = sc.nextDouble();
        double f = 9.0 * c / 5.0 + 32.0;
        System.out.printf("EQUIVALENTE EM FAHRENHEIT: %.1f%n ", f);

        sc.close();
    }
}    