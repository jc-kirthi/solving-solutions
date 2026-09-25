import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

class Solution {
    public int thirdMax(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);
        
        Integer[] n = new Integer[set.size()];
        
        int i=0;
        for (int num : set) 
            n[i++] = num; 
        
        
        Arrays.sort(n, Collections.reverseOrder());
        
        
        if(n.length < 3)
            return n[0]; 
        else
            return n[2]; 
    }
}
