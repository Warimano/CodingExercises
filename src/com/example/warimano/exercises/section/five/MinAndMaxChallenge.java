package com.example.warimano.exercises.section.five;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("To exit input anything BUT a number");
        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                scanner.nextLine();
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                System.out.println("Invalid number, exiting");
                break;
            }
        }
        System.out.printf("Min %d, Max %d", min, max);

        scanner.close();
    }

}
