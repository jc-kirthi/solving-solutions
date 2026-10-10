class Solution {
    public int[] numberOfPairs(int[] nums) {

        
        int[] an=new int[2];
        HashMap<Integer,Integer> m=new HashMap<>();
    
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);

       for (int count : m.values()) {
            an[0] += count / 2;       
            an[1] += count % 2;   
        }
    return an;
    }
}