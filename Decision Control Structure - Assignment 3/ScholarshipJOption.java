import javax.swing.JOptionPane;

public class ScholarshipJOption {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT score:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' monthly salary:"));
        double exam = Double.parseDouble(JOptionPane.showInputDialog("Enter entrance exam score:"));

        double avg = (nsat + exam) / 2;
        String result;
        if (salary > 10000 || nsat < 90 || exam < 85)
            result = "Rejected";
        else if (salary <= 3500 && avg >= 91)
            result = "Accepted";
        else
            result = "For further study";

        JOptionPane.showMessageDialog(null, "Application status: " + result);
    }
}