package CheckNonIdenticalStringRotation;

import java.util.*;

public class StringRotation {

    public static boolean checkRotation(String s1, String s2) {
         if(s1.length() != s2.length()) {
            return false;
        }
        
        if(s1.equals(s2)) {
            return false;
        }
        
        String combined = s1 + s1;
        return combined.contains(s2);
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String input = sc.nextLine();
            System.out.println("Enter another string:");
            String input2 = sc.nextLine();
            Boolean check = checkRotation(input, input2);
            System.out.println(check);
        }
    }

}
