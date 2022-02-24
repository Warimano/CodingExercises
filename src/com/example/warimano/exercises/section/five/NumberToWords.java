package com.example.warimano.exercises.section.five;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println("########################################");
        numberToWords(123);
        System.out.println("########################################");
        numberToWords(1010);
        System.out.println("########################################");
        numberToWords(1000);
        System.out.println("########################################");
        numberToWords(-12);
        System.out.println("########################################");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("########################################");
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int noDigitsInNumber = getDigitCount(number);
        int reversed = reverse(number);
        for (int i = noDigitsInNumber; i > 0; i--) {
            int digitToPrint = reversed % 10;
            switch (digitToPrint) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversed /= 10;
        }

    }

    public static int reverse(int numberToReverse) {
        int reversed = 0;
        while (numberToReverse != 0) {
            int digit = numberToReverse % 10;
            reversed = reversed * 10 + digit;
            numberToReverse /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }

}
