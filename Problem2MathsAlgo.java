// Count trailing zeroes in factorial of a number 

package problem2.mathsalgo;

import java.util.Scanner;

public class Problem2MathsAlgo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        long n = input.nextInt();
        long res = 0;
        
        for (int i = 5; i <= n; i *= 5) {
            res += n/i; 
        }
        System.out.println("Trailing zeroes of a " + n + " : " + res); 
    }
}