package SectionFourExercises;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int inputOne, int inputTwo, int inputThree) {
        if (inputOne < 0 || inputTwo < 0 || inputThree < 0) {
            System.out.println("Invalid Value");
        } else if (inputOne == inputTwo && inputTwo == inputThree) {
            System.out.println("All numbers are equal");
        } else if (inputOne != inputTwo && inputTwo != inputThree && inputThree != inputOne) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
