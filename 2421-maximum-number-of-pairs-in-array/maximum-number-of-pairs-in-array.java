class Solution {
    public int[] numberOfPairs(int[] nums) {

        
        int[] an=new int[2];
        HashMap<Integer,Integer> m=new HashMap<>();
    
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);

       for (int count : m.values()) {
            an[0] += count / 2;       // Every 2 identical numbers form 1 pair
            an[1] += count % 2;   // The remainder (0 or 1) is a leftover
        }

    
    return an;
    }
}