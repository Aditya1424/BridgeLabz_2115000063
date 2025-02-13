import java.util.*;
public class LongestSequence{
    public static int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        for (int num:nums) {
            numMap.put(num, true);
        }
        
        int longestStreak = 0;
        
        for (int num : nums) {
            if (!numMap.containsKey(num-1)) {
                int currentNum =num;
                int currentStreak= 1;
                
                while (numMap.containsKey(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] =scanner.nextInt();
        }
        
        int longestSequence =longestConsecutive(nums);
        System.out.println(longestSequence);
    }
}
