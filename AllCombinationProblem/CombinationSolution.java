package AllCombinationProblem;

import java.util.*;

public class CombinationSolution {

    public static int findCombinations(int n, int start) {
       if(n == 0) {
        return 1;
       }

       int count = 0;

        for (int i = start; i <= n; i++) {
            count += findCombinations(n - i, i);
        }

        return count;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number for which we need combinations: ");
            int number = sc.nextInt();
            int result = findCombinations(number,1);
            System.out.println("The number of combinations are: " + result);
        }
    }

}
