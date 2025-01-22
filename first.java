import java.util.*;
public class first{
	public static void main(String []args){
		
		Scanner adi= new Scanner(System.in);
		int num= adi.nextInt();
		
		if(num%5==0){
			System.out.println("Divisible by 5");
		}
		else{
			System.out.println("Not divisible by 5");
		}
			
	}
}