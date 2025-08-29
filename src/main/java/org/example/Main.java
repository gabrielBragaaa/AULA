package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//Função padrão

        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showPrint(higher);

        sc.close();
    }

    public static int max(int w, int z, int y) {
        int aux;
        if (w > z && w > y) {
            aux = w;
        } else if (z > y) {
            aux = z;
        } else {
            aux = y;
        }
        return aux;
    }

    public static void showPrint(int result) {
        System.out.println("O maior numero é : " + result);
    }
}    