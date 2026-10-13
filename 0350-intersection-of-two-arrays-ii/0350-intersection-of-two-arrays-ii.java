import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> r = new ArrayList<>();
    
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    r.add(nums1[i]); 
                    nums2[j] = -1;  
                   break;           
                }
            }
        }
        
        int[] res = new int[r.size()];
       
        for (int i = 0; i < r.size(); i++) {
            res[i] = r.get(i);
        }
        
        return res; 
    }
}
