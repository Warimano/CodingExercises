package SectionFiveExercises;

public class IsEven {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbersCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; // Immediately starts the next iteration of the loop without any following code being executed
            }
            System.out.println("Even number " + number);
            evenNumbersCount++;
            if (evenNumbersCount >= 5) {
                break;
            }
        }
        System.out.println(evenNumbersCount + " even numbers found");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
