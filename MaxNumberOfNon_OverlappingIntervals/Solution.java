package MaxNumberOfNon_OverlappingIntervals;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of intervals
        List<List<Integer>> intervals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            List<Integer> interval = new ArrayList<>();
            interval.add(start);
            interval.add(end);

            intervals.add(interval);
        }

        // Call your function
        int result = maxNonOverlapping(intervals);
        System.out.println(result);

        sc.close();
    }

    public static int maxNonOverlapping(List<List<Integer>> intervals) {
        if (intervals == null || intervals.isEmpty()) return 0;

        intervals.sort((a, b) -> a.get(1) - b.get(1));

        int count = 1;
        int prevEnd = intervals.get(0).get(1);

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).get(0) >= prevEnd) {
                count++;
                prevEnd = intervals.get(i).get(1);
            }
        }

        return count;
    }
}