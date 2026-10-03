import java.util.Scanner;

public class PayScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();

        double gross = rate * hours;
        double pct;
        if (gross <= 2000) pct = 0.10;
        else if (gross <= 4000) pct = 0.12;
        else if (gross <= 10000) pct = 0.15;
        else pct = 0.20;

        double tax = gross * pct;
        double net = gross - tax;
        System.out.printf("Gross Pay: Php %.2f%n", gross);
        System.out.printf("Withholding Tax (%.0f%%): Php %.2f%n", pct * 100, tax);
        System.out.printf("Net Pay: Php %.2f%n", net);
    }
}