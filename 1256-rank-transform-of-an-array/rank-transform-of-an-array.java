class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,Integer>r=new TreeMap<>();
        for (int n : arr) 
            r.put(n, 0); 
        
         int rank = 1;
        for (int key : r.keySet()) 
            r.put(key, rank++);

        for(int i=0;i<arr.length;i++)
        arr[i]=r.get(arr[i]);

        return arr;
    }
}