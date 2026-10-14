class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int remainingPapers = n - i;
            if (citations[i] >= remainingPapers) {
                return remainingPapers;
            }
        }
        
        return 0;
    }
}