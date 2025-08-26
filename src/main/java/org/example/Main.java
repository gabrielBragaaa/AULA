package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String original = "abcd EFGHIJ ABC abc DEFG  ";

        //Minusculo
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(1);

        System.out.println("Original: -" + original + " - ");
        System.out.println("ToLowerCase: -" + s01 + " -");
        System.out.println("ToUpperCase: -" + s02 + " -");
        System.out.println("Trim -"+ s03 + "-");
        System.out.println("Substring -" + s04 + "-");


    }
}    