package com.warimano.SectionFiveExercises;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println(calculateInterest(10_000d, i));
        }

        System.out.println("==========================================");

        for (int i = 8; i > 1; i--) {
            System.out.println(calculateInterest(10_000d, i));
        }

        System.out.println("==========================================");


        int primeCount = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                primeCount++;
                System.out.println(i);
            }
            if (primeCount >= 10) {
                break;
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
