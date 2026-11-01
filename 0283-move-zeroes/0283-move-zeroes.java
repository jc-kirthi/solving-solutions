class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==0){
                int p=i;
                while(p<nums.length-1){
                     int j=p+1;
                    
                        int temp=nums[p];
                        nums[p]=nums[j];
                        nums[j]=temp;
                    
                    p++;
                }
            }
        }
    }
}