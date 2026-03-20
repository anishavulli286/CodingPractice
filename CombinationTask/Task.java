package CombinationTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
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
