package ques.stringBufferBuilder;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean flag = true;
        while (flag = true) {
            try {
                String inputString = input.nextLine();
                int subStringRange = input.nextInt();
                System.out.println(inputString.substring(0, subStringRange));
            } catch (NoSuchElementException e) {
                System.out.println("please enter the valid entry");
            }
        }


    }
}
