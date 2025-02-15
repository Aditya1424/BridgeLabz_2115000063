import java.util.*;
public class ReverseString{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String s= adi.next();
		
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
	}
}
