package practicequestion.jionewplan;

public class MonthlyBillCalculator {
    private int numberOfMinutes;

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public MonthlyBillCalculator(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public double MonthlyBill(int numberOfMinutes) {
        if (numberOfMinutes <= 300) {
            double bill = 0;
        } else if (numberOfMinutes > 300) {

        }
    }
}
