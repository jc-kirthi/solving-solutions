class Solution {
    public boolean checkIfPangram(String sentence) {
        int seen = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                seen |= 1 << (ch - 'a');
            }
        }
        return seen == (1 << 26) - 1;
    }
}
