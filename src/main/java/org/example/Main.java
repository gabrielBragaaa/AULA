package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fatorial = 1;

        for (int x = 1; x <= n; x++) {
            fatorial *= x;// este valor ira receber o este resultado durante N vezes.
        }
        System.out.println(fatorial);
        sc.close();
    }
}