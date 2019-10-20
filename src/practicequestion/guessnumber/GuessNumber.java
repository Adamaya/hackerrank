package practicequestion.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yourNumber = input.nextInt();
        input.close();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        if (number == yourNumber) {
            System.out.println("Yes, you are right, I was thinking of " + number + "!");
        }

    }
}
