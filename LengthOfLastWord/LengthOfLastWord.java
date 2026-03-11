package LengthOfLastWord;

import java.util.Scanner;

public class LengthOfLastWord {
    
    public static int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        return splited[splited.length - 1].length();
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that needs to be validated with spaces: ");
        String input = sc.nextLine();

        int result = lengthOfLastWord(input);
        System.out.println("Result: " + result);
        sc.close();
    }

}
