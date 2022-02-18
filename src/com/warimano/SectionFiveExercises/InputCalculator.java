package com.warimano.SectionFiveExercises;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
                avg = Math.round(((double) sum) / ((double) count));
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
