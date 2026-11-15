class Solution {
    public int check(int l,List<Integer> nums){
        int sum = 0;
        for (int i = 0; i < l; i++)
            sum += nums.get(i);
        int min = Integer.MAX_VALUE;
        if (sum > 0)
            min = sum;
        for (int j = l; j < nums.size(); j++) 
        {
            sum += nums.get(j) - nums.get(j - l);
            if (sum > 0)
                min = Math.min(sum, min);
        }

        return min;
    }
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
         int ans = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) 
            ans = Math.min(ans, check(i, nums));
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}