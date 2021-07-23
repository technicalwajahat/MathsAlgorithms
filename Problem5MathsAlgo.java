// Find GCD and LCM (by using GCD) of a two numbers

package problem5.mathsalgo;

import java.util.Scanner;

public class Problem5MathsAlgo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int n1 = input.nextInt();

        System.out.print("Enter 2nd Number : ");
        int n2 = input.nextInt();

        System.out.println("GCD of " + n1 + " and " + n2 + " is : " + GCD(n1, n2));

        System.out.println("LCM of " + n1 + " and " + n2 + " is : " + LCM(n1, n2, GCD(n1, n2)));
    }

    static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return GCD(n2, n1 % n2);
    }

    static int LCM(int n1, int n2, int gcd) {
        int lcm = (n1 * n2) / gcd;
        return lcm;
    }
}