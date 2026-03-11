package CodingPracticeForInterview.Problem1;

import java.util.HashMap;
import java.util.Scanner;

public class CountElements {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split("");
        HashMap<String,Integer> countMap = new HashMap<>();
        for(String s : inputArr) {
            // if(countMap.containsKey(s)) {
            //     int value = countMap.get(s);
            //     countMap.put(s, value+1);
            // } else {
            //     countMap.put(s,1);
            // }
            countMap.computeIfPresent(s, (key,val) -> val + 1);
            countMap.computeIfAbsent(s,  key -> 1);
        }
        System.err.println(countMap);
        sc.close();
    }
}
