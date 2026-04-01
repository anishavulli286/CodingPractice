package FindFirstOccurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstOccuranceSolution {

    public static int firstOccurance(List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = list.get(mid);

            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in)) {

            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            List<Integer> inputArray = new ArrayList<>();
            for (String inputArr1 : inputArr) {
                inputArray.add(Integer.valueOf(inputArr1));
            }
            int target = Integer.parseInt(sc.nextLine());

            int value = firstOccurance(inputArray, target);
            System.out.println(value);

        }
    }
}
