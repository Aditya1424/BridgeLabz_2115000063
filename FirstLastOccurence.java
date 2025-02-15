import java.util.*;
public class FirstLastOccurence{
    public static int firstOccurrence(int[] arr, int target){
        int left = 0;
		int right = arr.length - 1;
		int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } 
			else if (arr[mid] < target) {
                left = mid + 1;
            } 
			else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
		int right = arr.length - 1;
		int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } 
			else if (arr[mid] < target) {
                left = mid + 1;
            }
			else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n = adi.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] =adi.nextInt();
        }
        int target = adi.nextInt();
        
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
        
        System.out.println(first);
        System.out.println(last);
    }
}
