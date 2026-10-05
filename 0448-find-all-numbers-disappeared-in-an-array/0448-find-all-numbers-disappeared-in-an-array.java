class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> r=new HashSet<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            r.add(nums[i]);

        for(int i=1;i<=nums.length;i++){
            if(!r.contains(i))
            res.add(i);
        }   
        return res; 
    }
}