package CombinationTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Task {
    String taskName;
    Date start;
    Date end;

    public Task(String name, String start, String end) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        this.taskName = name;
        this.start = sdf.parse(start);
        this.end = sdf.parse(end);
    }
}

public class TasksSolution {
     public static List<String> findClosestTasks(List<Task> tasks) {
        int n = tasks.size();

        // Sort tasks by start date
        List<Task> sorted = new ArrayList<>(tasks);
        sorted.sort(Comparator.comparing(t -> t.start));

        List<String> result = new ArrayList<>();

        for (Task current : tasks) {
            String closest = "Not Found";

            int left = 0, right = n - 1;

            // Binary search for smallest start >= current.end
            while (left <= right) {
                int mid = (left + right) / 2;

                if (!sorted.get(mid).start.before(current.end)) {
                    closest = sorted.get(mid).taskName;
                    right = mid - 1; // try to find smaller valid start
                } else {
                    left = mid + 1;
                }
            }

            result.add(closest);
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        List<Task> tasks = Arrays.asList(
            new Task("Task A", "6/9/2022", "6/12/2022"),
            new Task("Task B", "6/21/2022", "6/30/2022"),
            new Task("Task C", "6/6/2022", "6/7/2022"),
            new Task("Task D", "6/1/2022", "6/2/2022")
        );

        List<String> result = findClosestTasks(tasks);
        System.out.println(result);
    }
}
