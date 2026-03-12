package CodingPracticeForInterview.Problem3;

import java.util.Scanner;

public class SecondLargestInteger {

    public static int largestNumber(int[] arr) {
       int secondLargest = 0;
       int largest = 0;

       for(int a : arr) {
        if(a > largest) {
            secondLargest = largest;
            largest = a;
        } else if (a > secondLargest && a != largest) {
            secondLargest = a;
        }
       }
       return secondLargest;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = sc.nextInt();
        System.out.println("Enter numbers");
        int[] inputArr = new int[length];
        for(int i = 0; i < length; i++) {
            inputArr[i] = sc.nextInt();
        }
        int finalOutput = largestNumber(inputArr);
        System.out.println("Second largest Number is: " + finalOutput);
        sc.close();
    }
}
