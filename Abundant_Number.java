import java.util.*;

public class Abundant_Number{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int num =adi.nextInt();

        int sum=0;
        int temp=num;
		
	    for(int i=1;i<temp;i++){
	        if(temp%i==0){
	            sum+=i;
	        }
	    }
		
		if(sum>num){
		    System.out.println("Abundant Number");
		}
		else{
		    System.out.println("Not an Abundant Number");
		}
		
		

    }
}