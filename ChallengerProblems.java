import java.io.*;
import java.nio.charset.StandardCharsets;

public class ChallengerProblems{
    public static void main(String[] args) {
        measureStringPerformance();
        countWordsInFile("largefile.txt");
    }

    public static void measureStringPerformance() {
        int n =1000000;
        String text= "hello";

        long startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1e6 + " ms");
    }

    public static void countWordsInFile(String fileName) {
        int wordCount= 0;
        try (InputStreamReader in= new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(in)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Total word count in file: " + wordCount);
        } 
          
          catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
