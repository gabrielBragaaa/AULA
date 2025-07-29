package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor Inteiro : ");
       int impar = sc.nextInt();
        System.out.println("Insira o valor minimo: ");
        for (int x = sc.nextInt(); x <= impar; x++){
            if (x % 2 != 0) {
                System.out.println(x);

            }

        }
    }
}