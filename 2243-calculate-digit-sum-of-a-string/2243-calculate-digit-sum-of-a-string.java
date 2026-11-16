class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder st = new StringBuilder();
            int j = 0;
            while (j < s.length()) {
                int i = 0;
                int sum = 0;
                while (i < k && j < s.length()) {
                    sum += s.charAt(j) - '0';
                    j++;
                    i++;
                }
                st.append(sum);
            }
            s = st.toString();
        }
        return s;
    }
}
