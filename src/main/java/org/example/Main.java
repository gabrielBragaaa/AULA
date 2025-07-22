package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println();

        while (x != 0 && y != 0) {

            x = sc.nextInt();
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quandrante");
                System.out.println();
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
                System.out.println();
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
                System.out.println();
            } else {
                System.out.println("Quarto Quadrante");
                System.out.println();
            }
        }
        sc.close();
    }
}