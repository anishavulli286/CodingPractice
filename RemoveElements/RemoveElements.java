package RemoveElements;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;

        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of values");
        String s = sc.nextLine();
        System.out.println("Enter the element to be removed");
        int n = sc.nextInt();
        String[] str = s.split(",");
        int[] nums = new int[str.length];
        for(int i =0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }

        int result = removeElement(nums, n);
        System.out.println("Final output" + result);
        System.out.println("Array after removal: " +
        Arrays.toString(Arrays.copyOf(nums, result)));
        sc.close();
    }
}
