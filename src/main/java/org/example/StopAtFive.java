package org.example;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;

        while (!stop) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number >= 0 && number <= 5) {
                stop = true;
            }
        }
    }
}
