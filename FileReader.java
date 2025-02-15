import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        String fileName = "file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
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