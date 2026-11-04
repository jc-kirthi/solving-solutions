class Solution {
    public int minLength(String s) {
        StringBuilder st = new StringBuilder();
        int i = 0;
        
        // Loop through every character one by one
        while (i < s.length()) {
            char c1 = s.charAt(i);
            
            // Look BACKWARD at the end of your StringBuilder
            if (st.length() > 0 && 
               ((st.charAt(st.length() - 1) == 'A' && c1 == 'B') || 
                (st.charAt(st.length() - 1) == 'C' && c1 == 'D'))) {
                // If it matches, delete the 'A' or 'C' from the builder instead of adding 'B' or 'D'
                st.deleteCharAt(st.length() - 1); 
            } else {
                st.append(c1);
            }
            i++;
        }
        
        return st.length();
    }
}
