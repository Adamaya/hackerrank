package practicequestion.tempratureconvertor;

import java.util.Scanner;

public class TempratureConvertor {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public TempratureConvertor(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double celsiusToFahrenheit(double tempInCelsius) {
        double fahrenheit = tempInCelsius * (9 / 5) + 32;
        return fahrenheit;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        TempratureConvertor tempratureConvertor = new TempratureConvertor(celsius);
        System.out.println(tempratureConvertor.getCelsius() + " C = " + tempratureConvertor.celsiusToFahrenheit(celsius) + "F");
    }
}