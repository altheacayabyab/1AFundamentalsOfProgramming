import javax.swing.JOptionPane;

public class JediJOption {
    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height (cm):"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        char citizen = JOptionPane.showInputDialog("Enter citizenship code (C/N):")
                .trim().toUpperCase().charAt(0);
        char recommend = JOptionPane.showInputDialog("Enter recommendee code (R/N):")
                .trim().toUpperCase().charAt(0);

        if (recommend == 'R' || (height >= 200 && age >= 21 && age <= 25 && citizen == 'C'))
            JOptionPane.showMessageDialog(null, "Applicant is ACCEPTED.");
        else
            JOptionPane.showMessageDialog(null, "Applicant is REJECTED.");
    }
}