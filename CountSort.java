import java.util.*;
public class CountSort{
	public static void main(String[] args) {
		Scanner adi= new Scanner(System.in);
		int n=adi.nextInt();
		
		int a[]= new int[n];
		for(int i=0;i<n;i++){
		    a[i]= adi.nextInt();
		}
		
		int res[]= sort(a);
		
		for(int i=0;i<res.length;i++){
		    System.out.print(res[i]+" ");
		}
		
	}
	
	public static int Max(int arr[]){
	    int max= Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>max){
	            max= arr[i];
	        }
	    }
	    return max;
	}
	
	public static int []sort(int arr[]){
	    int max= Max(arr);
	    int count[]= new int[max+1];
	    
	    for(int i=0;i<arr.length;i++){
	        count[arr[i]]++;
	    }
	    
	    int k=0;
	    for(int i=0;i<count.length;i++){
	        for(int j=0;j<count[i];j++){
	            arr[k++]=i;
	        }
	        
	    }
	    return arr;
	}
	
	
}