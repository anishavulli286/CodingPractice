package NthInteger;

import java.util.Scanner;

public class NthIntegerSolution {

    public static int findPosition(int position) {
        int result = 0;
        int digiLength = 1;
        int count = 9;
        int start = 1;
        while(position > digiLength * count) {
            position -= digiLength * count;
            digiLength++;
            count *= 10;
            start *= 10;
        } 
        long number = start + (position - 1) / digiLength;
        int digitIndex = (position - 1) % digiLength;

        result = String.valueOf(number).charAt(digitIndex) - '0';
       
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the position to find the digit: ");
            int pos = sc.nextInt();
            int result = findPosition(pos);
            System.out.println("The digit at position " + pos + " is: " + result);
        }
    }
}
