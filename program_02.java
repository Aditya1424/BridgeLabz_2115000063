import java.util.*;

public class program_02{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		int n= adi.nextInt();
		System.out.println(combinations(n));
	}
	
	public static int combinations(int n){
				int com= (n*(n-1))/2;
				return com;
		
	}
}