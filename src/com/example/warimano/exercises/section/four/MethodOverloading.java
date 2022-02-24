package com.example.warimano.exercises.section.four;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(42));
        System.out.println(calcFeetAndInchesToCentimeters(157));
        System.out.println(calcFeetAndInchesToCentimeters(-100));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!(feet >= 0 || (inches >= 0 || inches <= 12))) {
            return -1;
        }
        double totalInches = inches + (feet * 12);
        return totalInches * 2.54d;
    }
    
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (!(inches >= 0)) {
            return -1;
        }
        double feet = inches / 12;
        return calcFeetAndInchesToCentimeters(feet, 0);
    }

}
