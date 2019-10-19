package _16Oct2019;

import java.util.Scanner;

class LED {
    private String color;
    private boolean working;

    public LED(String color, boolean working) {
        this.color = color;
        this.working = working;
    }

    public LED(boolean working) {
        this.working = working;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}

class LEDStrip {
    private LED[] listOfLed;

    public LEDStrip(LED[] listOfLed) {
        this.listOfLed = listOfLed;
    }

    private int lengthOfStrip() {
        return listOfLed.length;
    }

    public LED[] getListOfLed() {
        return listOfLed;
    }

    public void setListOfLed(LED[] listOfLed) {
        this.listOfLed = listOfLed;
    }

    private int numberOfDefectiveLEDs() {
        int workingLed = 0;
        for (int i = 0; i < lengthOfStrip(); i++) {
            if (!listOfLed[i].isWorking()) {
                workingLed++;
            }
        }
        return workingLed;
    }

    private boolean isDefective() {
        return numberOfDefectiveLEDs() > lengthOfStrip() / 2;
    }

    public String stripStatus() {
        return isDefective() ? "This strip is defective." : "This Strip is not defective";
    }
}
public class LEDques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfLed = input.nextInt();

        LED[] ledArray = new LED[numberOfLed];
        for (int i = 0; i < numberOfLed; i++) {
            String color = input.next();
            boolean working = input.nextBoolean();
            ledArray[i] = new LED(color, working);
        }

    }
}
