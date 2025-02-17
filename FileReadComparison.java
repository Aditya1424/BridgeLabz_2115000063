import java.io.*;
public class FileReadComparison{
    public static void main(String[] args) throws IOException {
        String filePath= "largeFile.txt"; 

        long start = System.nanoTime();
        FileReader fr = new FileReader(filePath);
        while (fr.read()!= -1) {
        }
        fr.close();
        System.out.println("FileReader: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        InputStreamReader in = new InputStreamReader(new FileInputStream(filePath));
        while (in.read() != -1) {
        }


        System.out.println("InputStreamReader: " +(System.nanoTime() - start) / 1e6 + " ms");
    }
}

