package practicequestion.jionewplan;

import java.util.Scanner;

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
        double callAmount = (numberOfMinutes - 300) * 1.2;
        double gstAmount = (callAmount * 18) / 100;
        bill = callAmount + gstAmount;
        return bill;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfMinutes = input.nextInt();
        input.close();
        MonthlyBillCalculator monthlyBillCalculator = new MonthlyBillCalculator(numberOfMinutes);
        if (monthlyBillCalculator.MonthlyBill(numberOfMinutes) < 0) {
            System.out.println("Monthly Bill: 0");
        } else {
            System.out.println("Monthly Bill: " + monthlyBillCalculator.MonthlyBill(numberOfMinutes));
        }

    }
}