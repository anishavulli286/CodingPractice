package ZigZagConversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static String zigZagConvertor(String s, int numRows) {
         if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int index = 0;
        int d = 1;
        @SuppressWarnings("unchecked")
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for(char c : s.toCharArray()) {
            rows[index].add(c);
            if(index == 0) {
                d = 1;
            }
            else if (index == numRows - 1){
                d = -1;
            }
            index += d;
        }
        StringBuilder result = new StringBuilder();
        for(List<Character> row : rows) {
            for(char c :  row) {
                result.append(c);
            }
        }
        return result.toString();
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();

        String result = zigZagConvertor(s,numRows);
        System.out.println("Result: " + result);
        sc.close();
    }
}
