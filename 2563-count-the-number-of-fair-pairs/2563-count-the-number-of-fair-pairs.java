import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        
        long upperPairs = 0;
        long lowerPairs = 0;
        int n = nums.length;

        // Step 1: Count pairs with sum <= upper
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < j && (long) nums[i] + nums[j] > upper) {
                j--;
            }
            upperPairs += (j - i);
            i++;
        }

        // Step 2: Count pairs with sum <= lower - 1
        i = 0; 
        j = n - 1;
        while (i < j) {
            while (i < j && (long) nums[i] + nums[j] > (lower - 1)) {
                j--;
            }
            lowerPairs += (j - i);
            i++;
        }

        return upperPairs - lowerPairs;
    }
}
