package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isZero = false;

        while (!isZero) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Number must be a positive number");
            } else if (number == 0) {
                isZero = true;
            } else {
                System.out.println("Number is " + number);
            }

        }
    }
}
