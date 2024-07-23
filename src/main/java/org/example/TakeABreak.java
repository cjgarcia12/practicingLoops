package org.example;

import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bool1 = false;

        while (!bool1) {
            System.out.println("Do you want to take a break?");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {
                bool1 = true;
            }
        }
    }
}
