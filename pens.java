import java.util.*;
public class pens{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		int pens = adi.nextInt();
		int students= adi.nextInt();
		
		int distributed = pens/students;
		int rem = pens%students;
		
		System.out.println("Pens per students: "+distributed+ " and remaining pens: "+rem);
	}
}