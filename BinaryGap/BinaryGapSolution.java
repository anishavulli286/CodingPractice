package BinaryGap;

import java.util.*;

public class BinaryGapSolution {

    public static int binaryGap (int n) {
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int max = 0;
            int count = 0;
            boolean start = false;
            for(char c : binary) {
                if(c == '1') {
                    if(start) {
                        max = Math.max(count, max);
                    }
                    start = true;
                    count = 0;
                } else if(c == '0' && start) {
                    count++;
                }
            }
            return max;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int result = binaryGap(n);
            System.out.println("The longest binary gap is: " + result);
        }
    }
}
