// Compute Factorial (BigInteger Class)

package problem6.mathsalgo;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem6MathsAlgo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = input.nextInt();
        System.out.println(factorial(n));
    }

    static BigInteger factorial(int n) {

        BigInteger fact = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
