package com.example.warimano.exercises.section.four;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE;
        }

        int hours = minutes / 60;
        String hourString = "" + hours;
        if (hours < 10) {
            hourString = "0" + hourString;
        }

        int minutesLeft = minutes % 60;
        String minutesString = "" + hours;
        if (minutesLeft < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = "" + seconds;
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return String.format("%sh %sm %ss", hourString, minutesString, secondsString);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE;
        }
        int minutes = seconds / 60;
        int secondLeft = seconds % 60;
        return getDurationString(minutes, secondLeft);
    }

}
