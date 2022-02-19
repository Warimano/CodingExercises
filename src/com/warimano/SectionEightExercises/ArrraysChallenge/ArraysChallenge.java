package com.warimano.SectionEightExercises.ArrraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
        System.out.println("###############################");
        System.out.println();
        System.out.println("###############################");
        int[] sorted = sortArray(array);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + number + " integers: ");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        int[] sorted = new int[array.length];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = array[array.length - 1 - i];
        }
        return sorted;
    }

}
