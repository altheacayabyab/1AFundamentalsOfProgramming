import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

    public static void main(String[] args) {
        //The name or path of the file you want to create or overwrite
        String filePath = "output.txt";
        //Wrap a FileWrtier inside a BufferedWriter.
        //The try-with block ensures the file is closed amd saved automatically.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){

            // Write text to the file
            writer.write("This is the first line of text.");
            // newLine() adds a line break. It automatically uses the correct
            // line ending for your operating system (Windows vs. Mac/Linux).
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
            System.out.println("Data successfully writen to to the file!");
        }catch (IOException e){
            System.err.println("An error occurred while writing to the file");
            e.printStackTrace();
        }

    }
}