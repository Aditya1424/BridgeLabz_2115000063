import java.util.*;
public class program_04{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String s= adi.next();
        
        System.out.println(removeDuplicates(s));
        
	}
	
	public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set= new HashSet<>();
        for (char c: str.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
