import java.util.Scanner;

public class PizzasParlorBilling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input
        System.out.print("Enter gross bill: ");
        double grossBill = input.nextDouble();
        
        System.out.print("Enter amount given by customer: ");
        double amountGiven = input.nextDouble();
        
        // Computation
        double serviceCharge = grossBill * 0.12;  // 12%
        double salesTax = grossBill * 0.07;       // 7%
        double netBill = grossBill + serviceCharge + salesTax;
        double change = amountGiven - netBill;
        
        // Output
        System.out.println("\n--- MY'S PIZZA PARLOR BILL ---");
        System.out.printf("Gross Bill:           ₱%.2f%n", grossBill);
        System.out.printf("Service Charge 12%%:   ₱%.2f%n", serviceCharge);
        System.out.printf("Sales Tax 7%%:         ₱%.2f%n", salesTax);
        System.out.printf("Net Bill:             ₱%.2f%n", netBill);
        System.out.printf("Amount Given:         ₱%.2f%n", amountGiven);
        System.out.printf("Change:               ₱%.2f%n", change);
        
        input.close();
    }
}