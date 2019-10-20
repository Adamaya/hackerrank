package practicequestion.timeconvertor;

import java.util.Scanner;

public class TimeConvertor {
    private double seconds;

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public TimeConvertor(double seconds) {
        this.seconds = seconds;
    }

    public int secondsToHours(double seconds) {
        int hours = (int) seconds / 60 / 60;
        return hours;
    }

    public int secondsToMinutes(double seconds) {
        int minutes = (int) seconds / 60 % 60;
        return minutes;
    }

    public int secondsToSeconds(double seconds) {
        int second = (int) seconds % 60;
        return second;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSeconds = input.nextDouble();
        TimeConvertor timeConvertor = new TimeConvertor(totalSeconds);
        int hours = timeConvertor.secondsToHours(totalSeconds);
        int minutes = timeConvertor.secondsToMinutes(totalSeconds);
        int seconds = timeConvertor.secondsToSeconds(totalSeconds);
        System.out.println(hours + " " + ((hours > 1) ? "hours" : "hour") + ", " + minutes + " " + ((minutes > 1) ? "minutes" : "minute") + " and " + seconds + " " + ((seconds > 1) ? "seconds" : "second"));
    }
}