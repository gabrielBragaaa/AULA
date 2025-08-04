package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            if (n % x == 0) {
                System.out.println(x);
            }
        }
    }
}