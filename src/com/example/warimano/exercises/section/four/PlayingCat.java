package com.example.warimano.exercises.section.four;

public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperTemp;
        if (summer) {
            upperTemp = 45;
        } else {
            upperTemp = 35;
        }
        return temperature >= 25 && temperature <= upperTemp;
    }

}
