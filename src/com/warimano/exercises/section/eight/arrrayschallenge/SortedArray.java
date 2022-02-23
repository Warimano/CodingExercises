package com.warimano.exercises.section.eight.arrrayschallenge;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        int[] sorted = sortIntegers(array);
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
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int[] sorted = new int[array.length];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = array[array.length - 1 - i];
        }
        return sorted;
    }

}
