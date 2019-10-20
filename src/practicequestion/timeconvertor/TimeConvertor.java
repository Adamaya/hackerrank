package practicequestion.timeconvertor;

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
}

class Main {

}