import java.util.*;
public class SubArrayZeroSum{
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer,List<Integer>>sumMap = new HashMap<>();
        int sum = 0;
        
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);
        
        for (int i = 0; i < arr.length;i++) {
            sum +=arr[i];
            if(sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        
        if (subarrays.isEmpty()) {
            System.out.println("No subarrays");
        } 
		else {
            for (int subarray[] : subarrays) {
                System.out.println("Start: "+ subarray[0] + ", End: "+subarray[1]);
            }
        }
    }
}
