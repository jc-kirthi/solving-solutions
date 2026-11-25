class Solution {
    private String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if (k > s2.length())
            return false;
        String sortedS1 = sortString(s1);
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < k; i++) {
            st.append(s2.charAt(i));
        }

        if (sortedS1.equals(sortString(st.toString())))
            return true;

        for (int j = k; j < s2.length(); j++) {
            st.append(s2.charAt(j));
            st.deleteCharAt(0);
            if (sortedS1.equals(sortString(st.toString())))
                return true;

        }
        return false;
    }
}