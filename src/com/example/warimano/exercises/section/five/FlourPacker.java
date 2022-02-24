package com.example.warimano.exercises.section.five;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // false | false
        System.out.println(canPack(1, 0, 5)); // true | true
        System.out.println(canPack(0, 5, 4)); // true | false
        System.out.println(canPack(2, 2, 11)); // true | false
        System.out.println(canPack(-3, 2, 12)); // false | false
        System.out.println(canPack(0, 5, 5)); // true
        System.out.println(canPack(2, 10, 18)); // true
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (bigCount * 5 + smallCount < goal) {
            return false;
        }

        return goal % 5 <= smallCount;

    }

}
