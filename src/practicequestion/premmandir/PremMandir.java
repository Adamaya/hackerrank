package practicequestion.premmandir;

import java.util.Scanner;

public class PremMandir {
    private double mileage;

    public PremMandir(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double doesCarIsEfficient(double mileage) {
        double cost = (12 / mileage) * 80 + (1 * 12);
        return cost;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }
}