class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int m = Integer.MIN_VALUE;
        int[] res = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 1. Check if the pair sums up to the target
                if (nums[i] + nums[j] == target) {
                    int p = nums[i] * nums[j];
                    
                    // 2. Check if it beats the maximum product found so far
                    if (p > m) {
                        // 3. Enforce the problem's strict constraint: nums[res[0]] > nums[res[1]]
                        if (nums[i] > nums[j]) {
                            m = p; // Only update max product if it's a completely valid pair
                            res[0] = i;
                            res[1] = j;
                        } else if (nums[j] > nums[i]) {
                            m = p; // Only update max product if it's a completely valid pair
                            res[0] = j;
                            res[1] = i;
                        }
                        // If nums[i] == nums[j], we skip it because it violates nums[i] > nums[j]
                    }
                }
            }
        }
        return res;
    }
}
