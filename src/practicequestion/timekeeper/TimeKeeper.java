package practicequestion.timekeeper;

public class TimeKeeper {
    private double hour;
    private double minute;
    private double seconds;

    public TimeKeeper(double hour, double minute, double seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    public double getSeconds() {
        return seconds;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public double numberOfSecondsFromMidnight() {
        double seconds = getHour() * 3600 + getMinute() * 60 + getSeconds();
        return seconds;
    }

    public double percentageOfDayThatHavePassed(double totalSeconds) {
        double percentage = (totalSeconds / 86400) * 100;

    }
}
