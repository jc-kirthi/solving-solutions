class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> r=new HashMap<>();
        for(int k:nums)
        if(k%2==0)
            r.put(k,r.getOrDefault(k,0)+1);

        int max=0;
        int ans=-1;

        for(int b:r.keySet()){
            if(r.get(b)>max || (r.get(b)== max && b < ans) ){
            max=r.get(b);
            ans=b;}
        }    
        return ans;
    }
}