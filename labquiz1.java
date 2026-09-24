import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class labquiz1{
 
    		   public static void main(String[] args){
        				BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {
            //Read an integer
            System.out.print("Enter your birthyear: ");
            String birthyearInput = dataln.readLine(); //Read as String
            int birthyear = Integer.parseInt(birthyearInput); //Convert to int
           int currentyear = Calendar.getInstance().get(Calendar.YEAR);
           int result = (currentyear - birthyear);
           System.out.println("You were born last " + birthyearInput + ".");
           System.out.println("You are now " + result + ".");
             String currentYearString = "2026";
            int currentYear = Integer.parseInt(currentYearString);

        }catch (IOException e) {
            System.err.println("Error reading input stream.");

        }catch (NumberFormatException e) {  
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }}