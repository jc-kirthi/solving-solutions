class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st=new Stack<>();
        Queue<Character>q=new LinkedList<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==')'){
                while(!st.isEmpty() && st.peek()!='(')
                {
                    q.add(st.pop());
                }
            
            if(!st.isEmpty() &&st.peek()=='('){
                st.pop();
                while(!q.isEmpty()){
                    st.push(q.remove());
                }
            }
        }
            else
            st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}