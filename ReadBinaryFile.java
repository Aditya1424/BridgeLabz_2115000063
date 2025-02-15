import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadBinaryFile{
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
		catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
