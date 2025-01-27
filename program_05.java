import java.util.*;

public class program_05{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		
		int n= adi.nextInt();
		System.out.println(check(n));
	}
	
	public static int check(int n){
				if(n>0){
				    return 1;
				}
		        
		        if(n<0){
		            return -1;
		        }
		        
		  return 0;
	}
}

