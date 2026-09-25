class Solution {
    public int firstUniqueEven(int[] nums) {
      LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
      for(int i=0;i<nums.length;i++)
      if(nums[i]%2==0)
     
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

      for(int num:map.keySet()){
        if(map.get(num)==1)
        return num;
      }  
      return -1;
    }
}