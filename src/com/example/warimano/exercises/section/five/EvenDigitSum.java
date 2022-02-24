package com.example.warimano.exercises.section.five;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            int smallestDigit = number % 10;
            if (smallestDigit % 2 == 0) {
                sum += smallestDigit;
            }
            number /= 10;
        }
        return sum;
    }

}
