class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i : nums) 
            m.put(i, m.getOrDefault(i, 0) + 1);
    
        List<Integer> keys = new ArrayList<>(m.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        int[] n = new int[nums.length];
        int in = 0;

        for (int i = 1; i <= nums.length; i++) 
        {
            for (int k : keys) 
            {
                if (m.get(k) == i) 
                {
                    int j = 0;
                    while (j < i) 
                    {
                        n[in] = k; 
                        in++;      
                        j++;
                    }
                }
            }
        }

        return n;
    }
}
