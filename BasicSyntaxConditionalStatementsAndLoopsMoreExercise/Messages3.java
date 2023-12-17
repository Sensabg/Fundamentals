package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Messages3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int alphabetLength = alphabet.length();
        int n = Integer.parseInt(scanner.nextLine());

        String finalInput = "";
        int rank = 0;

        for (int i = 0; i < n; i++) {

            String numbers = scanner.nextLine();
            int numberLength = numbers.length();
            int digit = Integer.parseInt(numbers);

            if (numberLength == 2) {
                digit = digit / 10;
            } else if (numberLength == 3) {
                digit = digit / 100;
            } else if (numberLength == 4) {
                digit = digit / 1000;
            }

            int offset = digit * 3;

            if (numberLength == 4) {
                offset -= 3;
            } else if (numberLength == 3) {
                offset -= 4;
            } else if (numberLength == 2) {
                offset -= 5;
            } else if (numberLength == 1) {
                offset -= 6;
            }

            if (digit > 7 && digit <= 9) {
                offset++;
            }

            rank = offset;

            if (digit == 0) {
                finalInput += " ";
                rank = 0;
                continue;
            }

            for (int k = rank; k <= alphabetLength - 1; k++) {
                char alphabetic = alphabet.charAt(k);
                finalInput += alphabetic;
                break;
            }
        }
        System.out.println(finalInput);
    }
}
