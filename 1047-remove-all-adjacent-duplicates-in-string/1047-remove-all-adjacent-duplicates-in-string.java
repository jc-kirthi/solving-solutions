class Solution {
    public String removeDuplicates(String s) {
       int i=0;
       Stack<Character> st=new Stack<>();
       while(i<s.length()){
        char c=s.charAt(i);
        if(!st.isEmpty() && c==st.peek())
        st.pop();
        else
        st.add(c);
        i++;
       } 
      StringBuilder result = new StringBuilder();
       for (char c : st) {
           result.append(c);
       }
       
       return result.toString();
    }
}