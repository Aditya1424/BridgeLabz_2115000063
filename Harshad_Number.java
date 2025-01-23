import java.util.*;

public class Harshad_Number{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num =adi.nextInt();

        int sum=0;
        int temp=num;
		
		while(temp!=0){
			int rem= temp%10;
			sum+=rem;
			temp/=10;
		}
		
		if(num%sum==0){
		    System.out.println("Harshad Number");
		}
		else{
		    System.out.println("Not a Harshad Number");
		}
		
		

    }
}