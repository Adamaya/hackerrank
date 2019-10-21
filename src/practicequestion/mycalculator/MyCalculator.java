package practicequestion.mycalculator;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) throws NegativeCustomException, ZeroCustomException {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double p = input.nextDouble();
        if (n < 0) {
            throw new NegativeCustomException(n);
        } else if (p < 0) {
            throw new NegativeCustomException(p);
        } else if (n == 0 || p == 0) {
            throw new ZeroCustomException();
        }

    }
}
