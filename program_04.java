import java.util.*;

public class program_04{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double	a= adi.nextDouble();
		double	b= adi.nextDouble();
		double	c= adi.nextDouble();
		
        double rounds= 5000/perimeter(a,b,c);
		
		System.out.println(rounds);
	}
	public static double perimeter(double a,double b, double c){
				double peri= a+b+c;
				return peri;
		
	}
}