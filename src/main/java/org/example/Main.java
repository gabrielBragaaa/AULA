package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCli = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println(" 1.Alcool \n 2.Gasolina \n 3.Diesel \n 4.Fim");

        while (numCli != 4) {

            System.out.println("Tipo de Abastecimento: ");
            numCli = sc.nextInt();

            if (numCli == 1) {
                alcool += 1;
            } else if (numCli == 2) {
                gasolina += 1;
            } else if (numCli == 3) {
                diesel += 1;

            } else {
                System.out.println("CODIGO INVALIDO :(");
            }
        }
        
        System.out.println("Alcool : " + alcool);
        System.out.println("Gasolina : " + gasolina);
        System.out.println("Diesel : " + diesel);
        System.out.println("MUITO OBRIGADO :)");
        
        sc.close();
    }
}
