package practicequestion.mycalculator;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double p = input.nextDouble();
        System.out.println(Math.pow(n, p));
    }
}
