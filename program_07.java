import java.util.*;
public class program_07{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        String s=adi.nextLine();
        StringBuilder sb= new StringBuilder();
        for (char c :s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            else {
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb);
    }
}
