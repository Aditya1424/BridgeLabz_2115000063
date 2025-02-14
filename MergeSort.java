import java.util.*;
public class MergeSort{
	public static void main(String[] args) {
		Scanner adi= new Scanner(System.in);
		int n=adi.nextInt();
		
		int a[]= new int[n];
		for(int i=0;i<n;i++){
		    a[i]= adi.nextInt();
		}
		
		a= merge(a, 0, a.length-1);
		
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
	}
	
	public static int[] merge(int arr[], int si,int ei){
	   
	   if(si==ei){
	       int a[]= new int[1];
	       a[0]= arr[si];
	       return a;
	   }
	   
	   int mid= (si+ei)/2;
	   
	   int fa[]= merge(arr,si, mid);
	   int sa[]= merge(arr, mid+1,ei);
	   
	   return mergeSortedArray(fa,sa);
	   
	}
	
	public static int []mergeSortedArray(int arr1[], int arr2[]){
	    
	    int n= arr1.length;
	    int m= arr2.length;
	    int ans[]= new int[n+m];
	    int i=0;
	    int j=0;
	    int k=0;
	    
	    while(i<n && j<m){
	        if(arr1[i]<arr2[j]){
	            ans[k]= arr1[i];
	            k++;
	            i++;
	        }
	        else{
	            ans[k]= arr2[j];
	            k++;
	            j++;
	        }
	    }
	    
	    while(i<n){
	        ans[k]=arr1[i];
	        k++;
	        i++;
	    }
	    
	    while(j<m){
	        ans[k]= arr2[j];
	        k++;
	        j++;
	    }
	    
	    return ans;
	}
	
	
}