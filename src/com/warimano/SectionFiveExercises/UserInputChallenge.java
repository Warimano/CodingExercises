package com.warimano.SectionFiveExercises;

import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {}

    // My first solution
    public static void ifElseSolution() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 digits, one at a time:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Enter number #%d: ", i);
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid number");
                i--;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("sum = " + sum);
    }

    public static void whileSolution() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.printf("Enter number #%d: ", count + 1);
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);

        scanner.close();
    }

}
