class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] k = new int[2];
        for (int i = 0; i < nums.length; i++)
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        int i = 0;
        for (int j : m.keySet()) {
            if (m.get(j) == 2)
                k[i++] = j;
        }
        return k;
    }
}