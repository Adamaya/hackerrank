package ques.stringBufferBuilder;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        char findCharIndex = input.nextLine().charAt(0);
        System.out.println("Index of " + findCharIndex + " is at " + inputString.indexOf(findCharIndex));
    }
}
