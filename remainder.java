import java.util.*;

public class remainder {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		int n1 = adi.nextInt();
		int n2 =adi.nextInt();
		
        int q= n1/n2;
		int rem = n1%n2;
        System.out.println("Quotient: " +q + " and Remainder is: " +rem);
	}
}