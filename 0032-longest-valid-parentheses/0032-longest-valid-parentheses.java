import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        // Push -1 as a base boundary for valid substrings starting at index 0
        st.push(-1); 
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                // Store the index of the opening bracket
                st.push(i);
            } else {
                // For ')', pop the last matching or boundary index
                st.pop();
                
                if (st.isEmpty()) {
                    // If empty, this ')' has no match. It becomes the new base boundary.
                    st.push(i);
                } else {
                    // Current index minus the index of the last unmatched element
                    maxLength = Math.max(maxLength, i - st.peek());
                }
            }
        }
        
        return maxLength;
    }
}
