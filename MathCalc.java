import java.math.BigInteger;

public class MathCalc {
    // method to calculate permutations P(n, r)
    public static BigInteger permutations(int n, int r) {
        //Cannot use return factorial(n) / factorial(n - r);
        return factorial(n).divide(factorial(n - r));
    }

    // method to calculate combinations C(n, r)
    public static BigInteger combinations(int n, int r) {
        //Cannot use return factorial(n) / (factorial(r) * factorial(n - r));
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

    // method to calculate factorial
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE; // Need a base case
        for (int i = 1; i <= n; i++) {
            //Cannot use result *= i;
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
