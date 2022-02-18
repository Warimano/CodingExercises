package com.warimano.SectionFourExercises;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int first, int second, int third) {
        boolean teenPresent = false;
        if (isTeen(first)) {
            teenPresent = true;
        }
        if (isTeen(second)) {
            teenPresent = true;
        }
        if (isTeen(third)) {
            teenPresent = true;
        }
        return teenPresent;
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <=19;
    }

}
