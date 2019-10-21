package practicequestion.mycalculator;

public class NegativeCustomException extends Exception {
    private double numberDetails;

    NegativeCustomException(double number) {
        numberDetails = number;
    }

    public String toString() {
        return "n and p must not be negative";
    }
}
