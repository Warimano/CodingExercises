package com.warimano.SectionFiveExercises;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar1(5);
        System.out.println();
        System.out.println("#####################################");
        System.out.println();
        printSquareStar1(8);
    }

    public static void printSquareStar(int number){
        if(number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }

    // My first solution: note the last condition in the if statement "column == (number - 1 - row + 1)" and compare to above
    public static void printSquareStar1(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for (int row = 0; row <= number - 1; row++) {
            for (int column = 0; column <= number - 1; column++) {
                if (row == 0 || row == number - 1 || column == 0 || column == number - 1 || row == column || column == (number - 1 - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
