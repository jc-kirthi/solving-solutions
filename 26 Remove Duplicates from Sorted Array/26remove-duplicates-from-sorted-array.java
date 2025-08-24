class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; //1st element

        for (int j = 1; j < nums.length; j++) //loop starts from 2nd element
        { 
            //if(nums[j] == nums[i])----> duplicate- do nothing
            
            if (nums[j] != nums[i]) //uniue element
            {
                i++;              
                nums[i] = nums[j]; // array updated
            }
        }

        return i + 1; // number of unique elements
    }
}
