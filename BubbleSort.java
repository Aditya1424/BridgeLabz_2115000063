import java.util.*;
public class BubbleSort{
	public static void main(String[] args) {
		Scanner adi= new Scanner(System.in);
		int n=adi.nextInt();
		int a[]= new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]= adi.nextInt();
		}
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(a[j]>a[j+1]){
		            int temp= a[j];
		            a[j]= a[j+1];
		            a[j+1]= temp;
		           
		        }
		    }
		}
		
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
	}
}