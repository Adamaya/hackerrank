package ques.stringBufferBuilder;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine().trim();
        String newString = inputString.replace('a', '*');
        newString = newString.replace('e', '*');
        newString = newString.replace('i', '*');
        newString = newString.replace('o', '*');
        newString = newString.replace('u', '*');
        newString = newString.replace('A', '*');
        newString = newString.replace('E', '*');
        newString = newString.replace('I', '*');
        newString = newString.replace('O', '*');
        newString = newString.replace('U', '*');

    }
}
