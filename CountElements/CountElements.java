package CountElements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountElements {

    public static int countElements(List<Integer> responseTimes) {
        if(responseTimes.isEmpty()) return 0;
        double sum = responseTimes.get(0);
        int count = 0;
        
        for(int i = 1; i < responseTimes.size() ; i++) {
            double avg = sum / i;
            if(responseTimes.get(i)  > avg) {
                count++;
            }
            sum += responseTimes.get(i);
        }
        
        return count;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers sepearated by space");
        String[] arr = sc.nextLine().split((" "));
        List<Integer> numList = new ArrayList<>();
        for (String arr1 : arr) {
            numList.add(Integer.valueOf(arr1));
        }
        int count = countElements(numList);
        System.out.println("Count of values: " + count);
        sc.close();
    }
}
