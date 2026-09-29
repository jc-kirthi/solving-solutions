class Solution {
    public int smallestIndex(int[] nums) {
        //int sum=0;
        int r,n,q;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            n=nums[i];
            // if(n/10==0){
            //     if(i==nums[i])
            //     return i;
            // }
            // else{
                while(n!=0){
r=n%10;
sum+=r;
n=n/10;
                }
            
            if(sum==i)
            return i;
        }
        
        return -1;
    }
}