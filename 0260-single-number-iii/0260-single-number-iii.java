class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>r=new HashMap<>();
        int[] res=new int[2];
        for(int k:nums)
        r.put(k,r.getOrDefault(k,0)+1);
int i=0;
        for(int b:r.keySet()){
         if(r.get(b)==1)
         res[i++]=b;
    }
          return res;
    }
   
}