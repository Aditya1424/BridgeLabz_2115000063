import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		int n1 = adi.nextInt();
		int n2 =adi.nextInt();
		
        int temp= n1;
		n1= n2;
		n2= temp;
		
        System.out.println(n1+" "+n2);
	}
}