import javax.swing.JOptionPane;

public class PayJOption {
    public static void main(String[] args) {
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly rate:"));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));

        double gross = rate * hours;
        double pct;
        if (gross <= 2000) pct = 0.10;
        else if (gross <= 4000) pct = 0.12;
        else if (gross <= 10000) pct = 0.15;
        else pct = 0.20;

        double tax = gross * pct;
        double net = gross - tax;
        String result = String.format(
            "Gross Pay: Php %.2f%nWithholding Tax (%.0f%%): Php %.2f%nNet Pay: Php %.2f",
            gross, pct * 100, tax, net);
        JOptionPane.showMessageDialog(null, result);
    }
}