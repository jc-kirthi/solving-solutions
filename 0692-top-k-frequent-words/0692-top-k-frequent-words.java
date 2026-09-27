class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      HashMap<String,Integer> map=new HashMap<>();
      for(String st:words)
     map.put(st,map.getOrDefault(st,0)+1);
    
    List<String> uniqueKeys = new ArrayList<>(map.keySet());
       uniqueKeys.sort((a, b) -> {
            int freqCompare = map.get(b).compareTo(map.get(a));
            if (freqCompare == 0) {
                return a.compareTo(b);
            }
            return freqCompare;
        });

      ArrayList<String>r=new ArrayList<>();

      for(int i=0;i<k;i++)
      r.add(uniqueKeys.get(i)); 

       return r; 
    }
   
}