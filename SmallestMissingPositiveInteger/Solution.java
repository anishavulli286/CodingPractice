package SmallestMissingPositiveInteger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static int findSmallestMissingPositive(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int missing = 1;
        while (true) {
            if (!set.contains(missing)) {
                return missing;
            }
            missing++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers sepearated by space");
        String[] arr = sc.nextLine().split((" "));
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            numList.add(Integer.parseInt(arr[i]));
        }
        int count = findSmallestMissingPositive(numList);
        System.out.println("Missing Smallest Integer: " + count);
        sc.close();
    }
}
