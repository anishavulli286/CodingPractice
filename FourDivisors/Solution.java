package FourDivisors;

import java.util.Scanner;

public class Solution {

    public static int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            int divSum = getFourDivisorSum(num);
            totalSum += divSum;
        }
        return totalSum;
    }

    private static int getFourDivisorSum(int n) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int d1 = i;
                int d2 = n / i;

                if (d1 == d2) {
                    count++;
                    sum += d1;
                } else {
                    count += 2;
                    sum += d1 + d2;
                }

                if (count > 4) return 0;
            }
        }
        return count == 4 ? sum : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of numbers: ");
        String n = sc.nextLine().trim();
        String values = n.substring(1,n.length() - 1);
        String[] parts = values.split(",");
        int[] nums = new int[parts.length];
        for(int i = 0; i<parts.length ; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }
        System.out.println("Output : " + sumFourDivisors(nums));
        sc.close();
    }
}
