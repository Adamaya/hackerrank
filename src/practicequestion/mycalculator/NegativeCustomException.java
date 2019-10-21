package practicequestion.mycalculator;

public class NegativeCustomException extends Exception {
    private double numberDetails;

    NegativeCustomException(double number) {
        numberDetails = number;
    }

    public String toString() {
        return numberDetails + " Negative number not Allowed";
    }
}
