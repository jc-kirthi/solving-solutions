class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            st.append(s.charAt(i));
        }

        int i = 0;
        while (i < st.length()) {
            char current = st.charAt(i);

            if (st.indexOf(String.valueOf(current)) < i) {
                st.deleteCharAt(i);
                continue;
            }

            if (i > 0 && st.charAt(i - 1) > current && st.indexOf(String.valueOf(st.charAt(i - 1)), i + 1) != -1) {
                st.deleteCharAt(i - 1);
                i--;
            } else {
                i++;
            }
        }

        return st.toString();
    }
}
