import java.util.*;

public class SearchAlgorithms{
    public static int firstMissingPositive(int arr[]) {
        int n = arr.length;
        boolean present[] =new boolean[n+1];
        
        for (int num :arr) {
            if (num >0 && num<= n) {
                present[num]= true;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n+1;
    }

    public static int binarySearch(int arr[], int target) {
        int left = 0;
        int right =arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int n = adi.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = adi.nextInt();
        }
        
        int missing =firstMissingPositive(arr);
        System.out.println(missing);
        Arrays.sort(arr);
      
        int target = adi.nextInt();
        
        int index =binarySearch(arr, target);
        System.out.println(index);
    }
}
