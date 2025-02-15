import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriter {
    public static void main(String[] args) {
        String fileName = "output.txt";
        
        try (InputStreamReader isr = new InputStreamReader(System.in, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr);
             FileWriter writer = new FileWriter(fileName)) {
            
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Input saved to " + fileName);
        } 
        
        catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
