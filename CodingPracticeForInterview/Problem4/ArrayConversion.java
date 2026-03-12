package CodingPracticeForInterview.Problem4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] outputArr = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                outputArr[index] = arr[i][j];
                index++;
            }
        }
        System.out.println("Output Array: " + Arrays.toString(outputArr));
    }

}
