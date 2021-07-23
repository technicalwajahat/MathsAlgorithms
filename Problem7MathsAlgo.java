// Modulo Arithmetics | Compute answer modulo 1000000007

package problem7.mathsalgo;

import java.util.Scanner;

public class Problem7MathsAlgo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n1 = input.nextInt();

        System.out.print("Enter Power : ");
        int n2 = input.nextInt();

        System.out.println("Power : " + fastPower(n1, n2, 1000000007));
    }

    static int fastPower(int a, int b, int n) {
        int res = 1;

        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res * a % n) % n;
            }
            a = (a % n * a % n) % n;
            b = b >> 1;
        }
        return res;
    }
}
