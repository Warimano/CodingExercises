package com.warimano.SectionFiveExercises;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int potato, int fries, int taterTots) { // I happened to be eating fries at this point
        if (!isValid(potato) || !isValid(fries) || !isValid(taterTots)) {
            return false;
        }

        int potatoLast = potato % 10;
        int friesLast = fries % 10;
        int taterTotsLast = taterTots % 10;

        return potatoLast == friesLast || friesLast == taterTotsLast || taterTotsLast == potatoLast;

    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1_000;
    }

}
