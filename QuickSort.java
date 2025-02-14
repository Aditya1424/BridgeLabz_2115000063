import java.util.*;
public class QuickSort{
	public static void main(String[] args) {
		int n= adi.nextInt();
		int[] arr =new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]= adi.nextInt();
		}
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void sort(int[] arr,int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pi = partition(arr, si, ei);
		sort(arr, si, pi-1);
		sort(arr, pi+1, ei);
		
		
	}

	public static int partition(int[] arr, int si, int ei) {
		int item = arr[ei];
		int pi=si;
		for (int i = si; i <ei; i++) {
			if(arr[i]<=item) {
				int temp = arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
				pi++;
			}
		}
		int temp = arr[pi];
		arr[pi]=arr[ei];
		arr[ei]=temp;
		return pi;
		
	}

}