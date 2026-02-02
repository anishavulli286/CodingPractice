package RemoveDuplicates;

import java.util.Scanner;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length == 0) return count;

        for(int i = 0; i < nums.length; i++) {
            if(nums[count] != nums[i]) {
                count++;
                nums[i] = nums[count];
            }
        }

        return count+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of values");
        String s = sc.nextLine();
        String[] str = s.split(",");
        int[] nums = new int[str.length];
        for(int i =0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }

        int result = removeDuplicates(nums);

        System.out.println("Final output" + result);
    }   
}