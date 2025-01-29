import java.util.*;
public class program_06{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        String mainString= adi.nextLine();
        String subString= adi.nextLine();
        int count = 0, index = 0;
        while ((index= mainString.indexOf(subString, index))!= -1) {
            count++;
            index+= subString.length();
        }
        System.out.println("Occurrences: " + count);
    }
}
