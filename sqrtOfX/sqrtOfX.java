package sqrtOfX;
import java.util.Scanner;

class Solution {

    public static int sqrtOfX(int num) {
        if (num == 0){
            return num;
        }

        int left = 1;
        int right = num;
        int ans = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            long square = (long) mid * mid;
            if (square == num) {
                return mid;
            } else if (square < num) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Result: " + sqrtOfX(num));
        sc.close();
    }
}