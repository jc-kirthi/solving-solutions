class Solution {
    public int minStartValue(int[] nums) {
        int s=0;
        int min=0;
       for(int i=0;i<nums.length;i++){
       s+=nums[i];
       min=Math.min(s,min);
    }
       return 1-min;
    }
}