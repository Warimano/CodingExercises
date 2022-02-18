package com.warimano.SectionFiveExercises;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstInput, int secondInput) {
        if (firstInput < 10 || firstInput > 99 || secondInput < 10 || secondInput > 99) {
            return false;
        }
        int firstSingular = firstInput % 10;
        int firstTens = firstInput / 10;

        int secondSingular = secondInput % 10;
        int secondTens = secondInput / 10;

        return firstSingular == secondSingular || firstSingular == secondTens || firstTens == secondSingular || firstTens == secondTens;
    }

}
