package com.warimano.exercises.section.four;

public class SpeedConverter {

    public static void main(String[] args) {
        final int kmPerHour = 30;
        printConversion(kmPerHour);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return  -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.printf("%s km/h = %s mi/h", kilometersPerHour, milesPerHour);
        }
    }
}
