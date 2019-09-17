import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class NumberFormater {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double payment=input.nextDouble();
        input.close();
        Locale indiaLocale=new Locale("en", "IN");
        NumberFormat india= NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("India "+india.format(payment));
        System.out.println("China "+china.format(payment));
        System.out.println("France "+france.format(payment));
        System.out.println("US "+us.format(payment));

    }
}
