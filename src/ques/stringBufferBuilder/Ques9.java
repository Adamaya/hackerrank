package ques.stringBufferBuilder;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        int sumUpper = 0;
        int sumLower = 0;
        Scanner input = new Scanner(System.in);
        char[] inputCharArray = input.nextLine().toCharArray();
        for (int i = 0; i < inputCharArray.length; i++) {
            int val = inputCharArray[i];
            if (val >= 65 && val <= 90) {
                sumUpper += val;
            } else if (val >= 97 && val <= 122) {
                sumLower += val;
            }

        }
        int absval = sumLower - sumUpper;
        System.out.println("Absolute Value: " + absval);
    }
}
