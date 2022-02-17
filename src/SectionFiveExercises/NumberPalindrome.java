package SectionFiveExercises;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) { // a palindrome is when a number is the same as originalNumber backwards i.e. 12321 or 121
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        System.out.println(reversedNumber);
        return originalNumber == reversedNumber;
    }

}
