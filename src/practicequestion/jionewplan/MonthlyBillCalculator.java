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
        double bill;
        if (numberOfMinutes <= 300) {
            bill = 0;
        } else if (numberOfMinutes > 300) {
            double callAmount = (300 - numberOfMinutes) * 1.2;
            double gstAmount = (callAmount * 18) / 100;
            bill = callAmount + gstAmount;
        }

    }
}
