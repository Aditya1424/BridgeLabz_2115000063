import java.io.*;
public class UserInfo{
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_info.txt")) {

            String name = reader.readLine();
            String age = reader.readLine();
            String language = reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("User information saved successfully");
        } 
		
		catch (IOException e) {
            System.out.println("Error reading input or writing to file: " + e.getMessage());
        }
    }
}