package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            sum += element;
            if (sum == numbers[i]){
                counter++;
            }
        }
        if(sum > 0){
            System.out.println(counter);
        } else {
            System.out.println("no");
        }
    }
}

