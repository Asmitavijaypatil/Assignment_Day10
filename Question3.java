

import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    public Time findDifference(Time otherTime) {
        int totalMinutes1 = this.hours * 60 + this.minutes;
        int totalMinutes2 = otherTime.hours * 60 + otherTime.minutes;
        int difference = Math.abs(totalMinutes1 - totalMinutes2);

        int diffHours = difference / 60;
        int diffMinutes = difference % 60;

        return new Time(diffHours, diffMinutes);
    }
    public void displayTime() {
        System.out.println("Time: " + hours + " hours and " + minutes + " minutes");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first time:");
        System.out.print("Hours: ");
        int hours1 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes1 = scanner.nextInt();

        Time time1 = new Time(hours1, minutes1);

        System.out.println("Enter the second time:");
        System.out.print("Hours: ");
        int hours2 = scanner.nextInt();
        System.out.print("Minutes: ");
        int minutes2 = scanner.nextInt();

        Time time2 = new Time(hours2, minutes2);

        Time difference = time1.findDifference(time2);

        System.out.println("Time 1:");
        time1.displayTime();
        System.out.println("Time 2:");
        time2.displayTime();
        System.out.println("Time difference using member function:");
        difference.displayTime();
    }
}