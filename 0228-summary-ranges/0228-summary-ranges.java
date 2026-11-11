import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int start = nums[i];
            
            // Advance `i` as long as numbers are consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            
            // Format the range
            if (start == nums[i]) {
                ans.add(String.valueOf(start));
            } else {
                ans.add(start + "->" + nums[i]);
            }
            
            i++;
        }

        return ans;
    }
}
