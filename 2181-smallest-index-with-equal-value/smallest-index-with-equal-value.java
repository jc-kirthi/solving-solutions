class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.println(i%10);
            if(i%10==nums[i])
            return i;
        }
        return -1;
    }
}