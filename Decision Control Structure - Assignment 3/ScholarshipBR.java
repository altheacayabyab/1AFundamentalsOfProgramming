import java.io.*;

public class ScholarshipBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());
        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.print("Enter entrance exam score: ");
        double exam = Double.parseDouble(br.readLine());

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