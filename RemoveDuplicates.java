import java.util.*;
public class RemoveDuplicates{
	
    public static String removeDuplicates(String s) {
        StringBuilder sb= new StringBuilder();
        HashSet<Character>seen = new HashSet<>();
        
        for (char c :s.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        String s= adi.nextLine();      
        String res= removeDuplicates(s);
        System.out.println(res);
    }
}