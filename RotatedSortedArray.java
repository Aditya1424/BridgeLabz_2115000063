import java.util.*;
public class RotatedSortedArray{
	
    public static int findPoint(int[] arr) {
        int left =0; 
		int right = arr.length - 1;
        while (left< right) {
            int mid = left+(right-left)/ 2;
            if (arr[mid] >arr[right]) {
                left = mid+1;
            } 
			else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        int n = adi.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =adi.nextInt();
        }     
        int index = findPoint(arr);
        System.out.println(index);
    }
}
