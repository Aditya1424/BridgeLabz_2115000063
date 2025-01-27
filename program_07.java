import java.util.*;

public class program_07{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		int n= adi.nextInt();
		System.out.println(check(n));
	}
	
	public static int check(int n){
	            int sum=0;
				if(n>0){
				    for(int i=1;i<=n;i++){
				        sum+=i;
				    }
				}
		        
		return sum;
	}
}

