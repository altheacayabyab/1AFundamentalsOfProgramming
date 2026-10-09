import javax.swing.JOptionPane;

public class LeapYearJOption {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year:"));

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            JOptionPane.showMessageDialog(null, year + " is a leap year.");
        else
            JOptionPane.showMessageDialog(null, year + " is not a leap year.");
    }
}