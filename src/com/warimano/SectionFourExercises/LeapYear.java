package com.warimano.SectionFourExercises;

public class LeapYear {

    public static void main(String[] args) {
        //Screw this one!!!
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leapYear = true;
                    }
                } else {
                    leapYear = true;
                }
            }
        }
        return leapYear;
    }

    public static boolean isLeapYear1(int year) {
        boolean leapYear;
        if (year >= 1 && year <= 9999) {
            leapYear = stepOne(year);
        } else {
            leapYear = false;
        }
        return leapYear;
    }

    private static boolean isEvenelyDivisibleBy(int number, int divisibleBy) {
        return number % divisibleBy == 0;
    }
    private static boolean stepOne(int number) {
        if (isEvenelyDivisibleBy(number, 4)) {
            return stepTwo(number);
        } else {
            return stepFive();
        }
    }
    private static boolean stepTwo(int number) {
        if (isEvenelyDivisibleBy(number, 100)) {
            return stepThree(number);
        } else {
            return stepFour();
        }
    }
    private static boolean stepThree(int number) {
        if (isEvenelyDivisibleBy(number, 400)) {
            return stepFour();
        } else {
            return stepFive();
        }
    }
    private static boolean stepFour() {
        return true;
    }
    private static boolean stepFive() {
        return false;
    }
}
