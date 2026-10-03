import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NSAT score: ");
        double nsat = sc.nextDouble();
        System.out.print("Enter parents' monthly salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter entrance exam score: ");
        double exam = sc.nextDouble();

        double avg = (nsat + exam) / 2;
        String result;
        if (salary > 10000 || nsat < 90 || exam < 85)
            result = "Rejected";
        else if (salary <= 3500 && avg >= 91)
            result = "Accepted";
        else
            result = "For further study";

        System.out.println("Application status: " + result);
    }
}