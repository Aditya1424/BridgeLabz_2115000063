import java.util.*;
public class SearchNegative{
	public static void main(String[] args) {
		Scanner adi= new Scanner(System.in);
		int n= adi.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]= adi.nextInt();
		    
		}
		
		System.out.println(firstNegative(a));
	}
	
	public static int firstNegative(int a[]){
	    for(int i=0;i<a.length;i++){
	        if(a[i]<0){
	            return i;
	        }
	    }
	    
	    return -1;
	}
}