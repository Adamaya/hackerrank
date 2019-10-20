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



}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double seconds = input.nextDouble();
        TimeConvertor timeConvertor = new TimeConvertor(seconds);

    }
}