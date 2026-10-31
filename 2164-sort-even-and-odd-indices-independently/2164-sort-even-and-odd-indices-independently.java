class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        
        // Nested loops (Bubble Sort logic) to ensure full sorting
        for (int i = 0; i < n; i++) {
            // Fix 1: Limit bounds to 'n - 2' to prevent ArrayIndexOutOfBoundsException
            for (int j = 0; j < n - 2; j++) {
                
                if (j % 2 == 0) {
                    // Even indices: Non-decreasing (Ascending) order
                    if (nums[j] > nums[j + 2]) {
                        int t = nums[j];
                        nums[j] = nums[j + 2];
                        nums[j + 2] = t;
                    }
                } else {
                    // Odd indices: Non-increasing (Descending) order
                    // Fix 2: Changed '>' to '<' to sort odd indices downwards
                    if (nums[j] < nums[j + 2]) {
                        int t = nums[j];
                        nums[j] = nums[j + 2];
                        nums[j + 2] = t;
                    }
                }
                
            }
        }
        return nums;
    }
}
