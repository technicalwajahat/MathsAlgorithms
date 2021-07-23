// Factorial of a number

package problem1.mathsalgo;

import java.util.*;

public class Problem1MathsAlgo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = input.nextInt();
        long fact = 1;

        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial : " + fact);
    }
}