package ValidateBracketsInString;

import java.util.*;

public class Solution {

    public static int validateString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return 0;
                }
            }
        }

        return stack.isEmpty() ? 1 : 0; 
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string to validate");
            String s = sc.nextLine();

            int result = validateString(s);
            System.out.println(result);
        }
    }
}
