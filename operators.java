import java.util.*;

public class operators {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		int a = adi.nextInt();
		int b =adi.nextInt();
		int c=adi.nextInt();
		
		int res1= a + b *c;
		int res2= a * b + c;
		int res3= c + a / b;
		int res4= a % b + c;
        System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}