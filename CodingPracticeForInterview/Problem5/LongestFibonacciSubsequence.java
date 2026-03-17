package CodingPracticeForInterview.Problem5;
import java.util.*;

public class LongestFibonacciSubsequence {
    public static int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = arr[i], y = arr[j];
                int length = 2;

                while (set.contains(x + y)) {
                    int z = x + y;
                    x = y;
                    y = z;
                    length++;
                }

                if (length > 2) maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = lenLongestFibSubseq(arr);
        System.out.println("Length of longest Fibonacci-like subsequence: " + result);

        sc.close();
    }
}
