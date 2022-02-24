package com.example.warimano.exercises.section.five;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(99));
        System.out.println(sumDigits(1_234));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int leastSignificantDigit = number % 10;
            sum += leastSignificantDigit;
            number /= 10;
        }
        return sum;
    }

}
