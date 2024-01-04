package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegersTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int lastElementIndex = numbers.length - 1;

        for (int j = 0; j < lastElementIndex; j++) {
            if (numbers[j] > numbers[j + 1] && numbers[lastElementIndex] < numbers[j]){
                System.out.print(numbers[j] + " ");
            }
        }
        System.out.println(numbers[lastElementIndex]);
    }
}
