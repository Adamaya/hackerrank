package practicequestion.numbercounter;

import java.util.Scanner;

public class Numbercounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 1; i < number + 1; i++) {
            sum = sum + i;
        }
        for (int i = 1; i < number + 1; i++) {
            if (i < number)
                sb.append(i + "+");
            else
                sb.append(i + "=");
        }

    }
}
