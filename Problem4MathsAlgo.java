// Find a Prime Numbers by using Sieve of Eratosthenes Algorithm

package problem4.mathsalgo;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4MathsAlgo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = input.nextInt();

        boolean[] isPrime = SieveofEratosthenes(n);

        /* 
            Print all numbers 
            false for non-prime numbers
            true for prime numbers
        */
//        for (int i = 0; i < isPrime.length; i++) {
//              System.out.println(i + " " + isPrime[i]);
//        }
        System.out.print("Prime Numbers : ");

        // Print only prime numbers
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean[] SieveofEratosthenes(int n) {

        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i] == true) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
