import java.util.Scanner;

public class JediScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter citizenship code (C/N): ");
        char citizen = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter recommendee code (R/N): ");
        char recommend = sc.next().toUpperCase().charAt(0);

        if (recommend == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizen == 'C'))
            System.out.println("Applicant is ACCEPTED.");
        else
            System.out.println("Applicant is REJECTED.");
    }
}