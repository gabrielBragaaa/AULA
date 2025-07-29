package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int interValor = 0;
        int in = 0;
        int out = 0;
        for (int x = 1 ; x <= n; x++){
           interValor = sc.nextInt();
            if (interValor >=10 && interValor<= 20){
               in +=1;
            }else{
                out += 1;
            }

        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}