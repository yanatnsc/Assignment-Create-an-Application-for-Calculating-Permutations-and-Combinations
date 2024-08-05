//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigInteger; // Otherwise will see ArithmeticException error for big numbers
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        int r = -1;

        // Get user input for n and r
        while (n < 0) {
            System.out.print("Please enter an non-negative integer for total items (n): ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Error: n must be an non-negative integer");
            }
        }

        while (r < 0 || r > n) {
            System.out.print("Please enter an integer for items to be chosen or arranged (r). Please make sure that r <= n: ");
            r = scanner.nextInt();
            if (r < 0) {
                System.out.println("Error: r must be an non-negative integer");
            } else if (r > n) {
                System.out.println("Error: r must be less than or equal to n");
            }
        }

        // Calculate permutations and combinations
        BigInteger perm = MathCalc.permutations(n, r);
        BigInteger comb = MathCalc.combinations(n, r);

        // Display the results
        System.out.println("P(" + n + ", " + r + ") = " + perm);
        System.out.println("C(" + n + ", " + r + ") = " + comb);

        scanner.close();
    }

    // Test case 1: n = -1
    // Test case 2: n = 1, r = 2
    // Test case 3: n = 25, r = 10 -- Had to change to BigInteger.
    // Permutation Validation https://www.calculatorsoup.com/calculators/discretemathematics/permutations.php
    // Combination Validation https://www.calculatorsoup.com/calculators/discretemathematics/combinations.php
}