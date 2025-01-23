import java.util.*;

public class Armstrong_Number{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num =adi.nextInt();

        int sum=0;
        int temp=num;
		
		while(temp!=0){
			int rem= temp%10;
			sum+=Math.pow(rem,3);
			temp/=10;
		}
		
		if(num==sum){
		    System.out.println("Armstrong Number");
		}
		else{
		    System.out.println("Not an Armstrong Number");
		}
		
		

    }
}