import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Maps remainder -> earliest index where this remainder occurred
        Map<Integer, Integer> remainderMap = new HashMap<>();
        
        // Base case: handles valid subarrays starting from index 0
        remainderMap.put(0, -1);
        
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int remainder = runningSum % k;
            
            if (remainderMap.containsKey(remainder)) {
                // Ensure the subarray length is at least 2
                if (i - remainderMap.get(remainder) >= 2) {
                    return true;
                }
            } else {
                // Only store the FIRST occurrence to maximize subarray length
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }
}
