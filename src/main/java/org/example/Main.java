package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double total,num1 ,num2 = 0;

        for(int x = 0 ; x < n; x++){
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            total = num1 / num2;
            if(num2 == 0){
                System.out.println("Divisão impossivel");
            }else{
                System.out.println(total);
            }

        }

    }
}