import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, i - l + 1);
        }
        
        return maxLen;
    }
}
