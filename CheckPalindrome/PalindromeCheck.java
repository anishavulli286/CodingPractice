package CheckPalindrome;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        String newString = sb.toString().toLowerCase();
        String reversed = new StringBuilder(newString).reverse().toString().toLowerCase();
        return newString.equals(reversed);
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String input = sc.nextLine();
            boolean check = checkPalindrome(input);
            System.out.println(check ? "Palindrome" : "Not Palindrome");
        }
    }

}
