class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1;
        int left = 0;
        
        // 1. Sliding window for strictly increasing
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] <= nums[right - 1]) {
                left = right; // Reset window start
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        // 2. Sliding window for strictly decreasing
        left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] >= nums[right - 1]) {
                left = right; // Reset window start
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
