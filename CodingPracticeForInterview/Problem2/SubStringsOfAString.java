package CodingPracticeForInterview.Problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class SubStringsOfAString {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<String> finalList = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                finalList.add(input.substring(i,j));
            }
        }
        System.out.println(finalList);
        sc.close();
    }
    
}
