package com.warimano.SectionFiveExercises;

import java.util.Random;

public class DayOfTheWeekChallenge {

    public static void main(String[] args) {

        int[] weekDays = new int[]{1, 2, 3, 4, 5, 6, 7};
        int dayToPrint = new Random().nextInt(weekDays.length);
        printDayOfTheWeek(weekDays[dayToPrint]);
        printDayOfTheWeekWithIf(weekDays[dayToPrint]);
    }

    public static void printDayOfTheWeek(int dayInput) {
        switch (dayInput) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayOfTheWeekWithIf(int dayInput) {
        if (dayInput == 1) {
            System.out.println("Monday");
        } else if (dayInput == 2) {
            System.out.println("Tuesday");
        } else if (dayInput == 3) {
            System.out.println("Wednesday");
        } else if (dayInput == 4) {
            System.out.println("Thursday");
        } else if (dayInput == 5) {
            System.out.println("Friday");
        } else if (dayInput == 6) {
            System.out.println("Saturday");
        } else if (dayInput == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }

}
