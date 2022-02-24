package com.example.warimano.exercises.section.five;

public class SwitchExercise {

    public static void main(String[] args) {

        char value = 'A';

        switch (value) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found char: " + value);
                break;
            default:
                System.out.println("No handled char found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "september":
                System.out.println("Sep");
                break;
            default:
                System.out.println("Month not found");
                break;
        }

    }



}
