package MeasureAngle;

import java.util.Scanner;

public class AngleSolution {

    public static int degreesCalucation(int hours, int mins) {
        if (hours == 12) hours = 0;
        if (mins == 60) {
            mins = 0;
            hours += 1;
        }

        // Calculate the positions of the hands in degrees
        // Hour hand: 30 degrees per hour + 0.5 degrees per minute
        // Minute hand: 6 degrees per minute
        double hourAngle = (hours * 30) + (mins * 0.5);
        double minuteAngle = mins * 6;

        double diff = Math.abs(hourAngle - minuteAngle);

        // Return the smaller angle
        return (int) Math.min(diff, 360 - diff);
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter time in hours and mins :");
            String time = sc.nextLine();
            String[] timeSplit = time.split(" ");
            int hours = Integer.parseInt(timeSplit[0]);
            int mins = Integer.parseInt(timeSplit[1]);
            int result = degreesCalucation(hours, mins);
            System.out.println(result);
        }
    }

}
