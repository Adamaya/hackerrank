package practicequestion.valueofpi;

import java.util.Scanner;

public class ValueOfPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double sum = 0;
        for (double i = 1; i < number + 1; i++) {

            int j = (i % 2 == 0) ? -1 : 1;
            sum = sum + j * (1 / (2 * i - 1));
        }
    }
}
