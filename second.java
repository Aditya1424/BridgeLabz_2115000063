import java.util.*;
public class second{
	public static void main(String []args){
		
		Scanner adi= new Scanner(System.in);
		int num1= adi.nextInt();
		int num2= adi.nextInt();
		int num3= adi.nextInt();
		
		
		if((num1<num2)&& (num1<num3)){
			System.out.println(num1+" is smallest");
		}
		else{
			System.out.println(num1+" is not smallest");
		}
			
	}
}