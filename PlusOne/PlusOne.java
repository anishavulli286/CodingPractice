/*

Description:
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

*/ 

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
    
    // Start from the last digit
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits; // done
        }
        digits[i] = 0; // carry over
    }
    
    // If all digits were 9, we need a bigger array
    int[] result = new int[n + 1];
    result[0] = 1; // e.g., 999 + 1 = 1000
    return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces (e.g., 1 2 3):");
        String line = scanner.nextLine();
        String[] parts = line.trim().split("\s+");

        int[] digits = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            digits[i] = Integer.parseInt(parts[i]);
        }

        int[] result = plusOne(digits);

        System.out.println("Output: " + Arrays.toString(result));
        scanner.close();
    }
}
