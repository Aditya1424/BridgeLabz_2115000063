import java.io.*;
public class WordCount{
    public static void main(String[] args) {
        String fileName ="example.txt";
        String targetWord ="example";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
