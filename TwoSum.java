import java.util.*;
public class TwoSum{
    public static int[] findTwoSum(int nums[],int target) {
        Map<Integer,Integer> numMap= new HashMap<>();
        
        for (int i =0;i<nums.length;i++) {
            int complement =target-nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i],i);
        }
        
        return new int[]{};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
      
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        
        int result[]= findTwoSum(nums,target);
        if(result.length==2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        else {
            System.out.println("No valid");
        }

    }
}
