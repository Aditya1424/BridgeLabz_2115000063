import java.util.*;

public class simple_interest{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		double	p= adi.nextDouble();
		double	r= adi.nextDouble();
		double	t= adi.nextDouble();
		
		double si= (p*r*t)/100;
		
		System.out.println(si);
	}
}