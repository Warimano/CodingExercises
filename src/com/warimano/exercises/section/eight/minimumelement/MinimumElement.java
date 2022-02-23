package com.warimano.exercises.section.eight.minimumelement;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        scanner.close();
        return integer;
    }

    private static int[] readElements(int elements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[elements];
        for (int i = 0; i < elements; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            min = Math.min(min, i);
        }
        return min;
    }

}
