package org.example;

import java.util.Scanner;

public class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = Integer.parseInt(scanner.next());

        for (int i = 1; i <= 10; i++) {
            int result = multiply(num, i);
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
