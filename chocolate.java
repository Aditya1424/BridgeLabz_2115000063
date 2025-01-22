import java.util.*;

public class chocolate {
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
		int n =adi.nextInt();
		int m= adi.nextInt();
		
		int chocolate= n/m;
		int rem= n%m;
		
		System.out.println(chocolate);
		System.out.println(rem);
		
	}
}