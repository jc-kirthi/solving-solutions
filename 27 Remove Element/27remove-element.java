class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0; //points to next position for valid element
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]!=val){
            nums[k]=nums[i]; //move non-val element to front
            k++;
        }
       } 
       return k;
    }
}