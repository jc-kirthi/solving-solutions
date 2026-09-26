class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          if(nums[i]/10==0)
          sum1+=nums[i];
          else{
            while(nums[i]!=0){
            n=nums[i]%10;
            sum1+=n;
            nums[i]/=10;
          }
          }
        }
        
return Math.abs(sum-sum1);
    }
}