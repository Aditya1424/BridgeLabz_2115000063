import java.util.*;

public class operators_2 {
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
		double a = adi.nextDouble();
		double b =adi.nextDouble();
		double c=adi.nextDouble();
		
		double res1= a + b *c;
		double res2= a * b + c;
		double res3= c + a / b;
		double res4= a % b + c;
        System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}