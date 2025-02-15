import java.util.*;
public class PeakElement{
    public static int findPeak(int arr[]) {
        int left = 0;
		int right = arr.length-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } 
			else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        int n = adi.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = adi.nextInt();
        }
        
        int index = findPeak(arr);
        System.out.println(index);
    }
}
