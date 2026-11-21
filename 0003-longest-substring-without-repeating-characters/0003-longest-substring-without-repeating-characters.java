class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        StringBuilder st = new StringBuilder();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            int dupIndex = st.indexOf(String.valueOf(c));
            
            if (dupIndex != -1) //if present
                st.delete(0, dupIndex + 1);
            
            st.append(c);
            max = Math.max(max, st.length());
        }

        return max;
    }
}
