package DataTypesAndVariablesMoreExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class FromLeftToTheRight3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            //String ints = scanner.nextLine();

            String[] numbers = scanner.nextLine().split(" ");
            long right = Long.parseLong(numbers[0]);
            long left = Long.parseLong(numbers[1]);

            while (left > 0.02 && right > 0.02) {

                   left += left % 10;;
                    left = left / 10;

                    right += right % 10;
                    right = right / 10;

            }
            if(left > right){
                System.out.println(left);
            } else {
                System.out.println(right);
            }
        }
    }
}

