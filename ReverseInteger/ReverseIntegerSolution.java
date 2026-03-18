package ReverseInteger;

import java.util.Scanner;

public class ReverseIntegerSolution {

    public static int reversedInteger(int number) {
        int num = Math.abs(number);
        int reverse = 0;

        while(num != 0) {
            int rem = num % 10;
            if(reverse > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            reverse = reverse*10 + rem;
            num = num / 10;
        }

        return (number < 0) ? (-reverse) : reverse;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to be reversed: ");
            int number = sc.nextInt();
            int result = reversedInteger(number);
            System.out.println("The reversed number is: " + result);
        }
    }

}
