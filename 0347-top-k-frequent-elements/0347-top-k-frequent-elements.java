import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Build the frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // 2. Put all unique keys into a list
        List<Integer> uniqueKeys = new ArrayList<>(map.keySet());
        
        // 3. Sort the keys based on their frequency (in descending order)
        uniqueKeys.sort((a, b) -> map.get(b) - map.get(a));
        
        // 4. Extract the top k frequent elements into the result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = uniqueKeys.get(i);
        }
        
        return result;
    }
}
