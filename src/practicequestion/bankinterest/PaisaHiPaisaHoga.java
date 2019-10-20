package practicequestion.bankinterest;

import java.util.Scanner;

public class PaisaHiPaisaHoga {
    private double principalMoney;
    private double rate;

    public PaisaHiPaisaHoga(double principalMoney, double rate) {
        this.principalMoney = principalMoney;
        this.rate = rate;
    }

    public double getPrincipalMoney() {
        return principalMoney;
    }

    public void setPrincipalMoney(double principalMoney) {
        this.principalMoney = principalMoney;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double duration(double rate) {
        double duration = 100 / rate;
        return duration;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principalMoney = input.nextDouble();
        double rate = input.nextDouble();
        PaisaHiPaisaHoga paisaHiPaisaHoga = new PaisaHiPaisaHoga(principalMoney, rate);

    }
}
