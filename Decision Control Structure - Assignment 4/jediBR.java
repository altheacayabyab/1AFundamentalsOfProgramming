import java.io.*;

public class JediBR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter height (cm): ");
        double height = Double.parseDouble(br.readLine());
        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter citizenship code (C/N): ");
        char citizen = br.readLine().trim().toUpperCase().charAt(0);
        System.out.print("Enter recommendee code (R/N): ");
        char recommend = br.readLine().trim().toUpperCase().charAt(0);

        if (recommend == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizen == 'C'))
            System.out.println("Applicant is ACCEPTED.");
        else
            System.out.println("Applicant is REJECTED.");
    }
}