// Palindrome of a number

package problem3.mathsalgo;

import java.util.*;

public class Problem3MathsAlgo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int originalNum = input.nextInt();
        int num = originalNum, remainder, reversedNum = 0;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
