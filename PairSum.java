import java.util.*;
public class PairSum{
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();      
        for (int num : arr) {
            if(seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }       
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] =scanner.nextInt();
        }
		
        int target = scanner.nextInt();
        
        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair exists");
        }
		else {
            System.out.println("No pair");
        }
        
    }
}
